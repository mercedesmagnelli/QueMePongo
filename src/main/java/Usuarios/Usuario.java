package Usuarios;

import domain.Armario.Armario;
import domain.Armario.ArmarioCompartido;
import domain.Prendas.Prenda;
import exceptions.prendaYaAgregadaException;

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


  //usuario tiene que tener la capacidad de mandarle a otro usuario un armario



  //usuario tiene que tener la capacidad de aceptar un armario de otro usuario



}
