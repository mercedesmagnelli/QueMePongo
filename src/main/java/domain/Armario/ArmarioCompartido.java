package domain.Armario;

import Usuarios.Usuario;
import domain.Prendas.*;
import exceptions.DomainExceptionArmario;
import exceptions.SugerenciaInexistenteException;

import java.util.ArrayList;
import java.util.List;

public class ArmarioCompartido extends Armario {

  private List<SugerenciaPrenda> sugerencias;

  public ArmarioCompartido() {
    super();
    sugerencias = new ArrayList<SugerenciaPrenda>();
  }

  public void agregarSugerenciaAgregar(Prenda unaPrenda){
    sugerencias.add(new SugerenciaPrendaAgregar(unaPrenda, EstadoSugerencia.ENPROCESO));
  }

  public void agregarSugerenciaQuitar(Prenda unaPrenda){
    sugerencias.add(new SugerenciaPrendaQuitar(unaPrenda, EstadoSugerencia.ENPROCESO));
  }

  public List<SugerenciaPrenda> getSugerencias(){
    return sugerencias;
  }


  public void controlarExistenciaSugerencia(SugerenciaPrenda unaSugerencia){
    if(!sugerencias.contains(unaSugerencia)) throw new DomainExceptionArmario("La sugerencia no existe en el guardarropas");
  }

}





