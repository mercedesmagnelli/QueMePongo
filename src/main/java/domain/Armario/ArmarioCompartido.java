package domain.Armario;

import Usuarios.Usuario;
import domain.Prendas.Accion;
import domain.Prendas.PrendaSugerida;
import exceptions.SugerenciaInexistenteException;

import java.util.ArrayList;
import java.util.List;

public class ArmarioCompartido extends Armario {

  List<Usuario> usuariosCompartidos;
  List<PrendaSugerida> sugerencias = new ArrayList<>();

  public ArmarioCompartido(List<Usuario> users) {
    super();
    this.usuariosCompartidos = users;
  }

  public void agregarSugerencia(PrendaSugerida sugerencia) {
    sugerencias.add(sugerencia);
  }

  public void aceptarSugerencia(PrendaSugerida unaSugerencia) {
    unaSugerencia.aceptarSugerencia();
    this.tomarAccion(unaSugerencia);
  }
  public void rechazarSugerencia(PrendaSugerida unaSugerencia) {
    unaSugerencia.rechazarSugerencia();
    this.tomarAccion(unaSugerencia);

  }


  public void controlarSugerenciaExiste(PrendaSugerida unaSugerencia) {
    if(!sugerencias.contains(unaSugerencia)) {
      throw new SugerenciaInexistenteException("Nunca se hizo esa sugerencia");
    }
  }

  public void deshacerSugerencia(PrendaSugerida sugerencia) {
    sugerencia.deshacer();
    if(sugerencia.getUnaAccion().equals(Accion.AGREGAR)) {
      this.quitarPrenda(sugerencia.getPrendaSugerida());
   }else {
      this.cargarPrenda(sugerencia.getPrendaSugerida());
    }
  }
  public void tomarAccion(PrendaSugerida unaSugerencia) {
    if(unaSugerencia.getUnaAccion().equals(Accion.AGREGAR)){
      this.cargarPrenda(unaSugerencia.getPrendaSugerida());}
    else {
      this.quitarPrenda(unaSugerencia.getPrendaSugerida());
    }
  }

}





