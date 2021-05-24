package Usuarios;

import domain.Armario.Armario;
import domain.Armario.ArmarioCompartido;
import domain.Prendas.Accion;
import domain.Prendas.Prenda;
import domain.Prendas.PrendaSugerida;
import exceptions.ArmarioInaccesibleException;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

  List<Armario> misArmarios = new ArrayList<Armario>();
  List<ArmarioCompartido> armariosCompartidosConOtros = new ArrayList<ArmarioCompartido>();
  List<ArmarioCompartido> armariosCompartidosConmigo = new ArrayList<ArmarioCompartido>();

  public void crearArmarioPropio() {
    misArmarios.add(new Armario());
  }

  public void crearGuardarropaCompartido(List<Usuario> listaUsuarios) {
    ArmarioCompartido comp = new ArmarioCompartido(this, listaUsuarios);
    armariosCompartidosConOtros.add(comp);
    listaUsuarios.forEach(user -> user.agregarArmario(comp));
  }

  private void agregarArmario(ArmarioCompartido comp) {
    armariosCompartidosConOtros.add(comp);
  }

  public void recomendacionPrendaAOtroUsuario(Usuario recomendado, Prenda sugerencia, ArmarioCompartido compartido, Accion unaAccion){
   this.controlArmarioAccesible(compartido);
   recomendado.controlArmarioAccesible(compartido);
   compartido.agregarSugerencia(new PrendaSugerida(sugerencia, unaAccion));
  }

  public void controlArmarioAccesible(ArmarioCompartido compartido) {
    if (!this.getArmariosCompartidosConmigo().contains(compartido)) {
      throw new ArmarioInaccesibleException("No se puede acceder a lo requerido");
    }
  }


  public List<ArmarioCompartido> getArmariosCompartidosConOtros() {
    return armariosCompartidosConOtros;
  }

  public List<ArmarioCompartido> getArmariosCompartidosConmigo() {
    return armariosCompartidosConmigo;
  }
}
