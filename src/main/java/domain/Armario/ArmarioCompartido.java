package domain.Armario;

import Usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ArmarioCompartido extends Armario {

  List<Usuario> usuariosCompartidos = new ArrayList<>();

  public ArmarioCompartido(Usuario duenio, List<Usuario> users) {
    super();
    usuariosCompartidos = users;
  }
}
