package domain.Armario;

import Usuarios.Usuario;
import domain.Prendas.PrendaSugerida;

import java.util.ArrayList;
import java.util.List;

public class ArmarioCompartido extends Armario {

  List<Usuario> usuariosCompartidos = new ArrayList<>();
  List<PrendaSugerida> sugerencias = new ArrayList<>();

  public ArmarioCompartido(Usuario duenio, List<Usuario> users) {
    super();
    usuariosCompartidos = users;
  }

  public void agregarSugerencia(PrendaSugerida sugerencia) {
    sugerencias.add(sugerencia);
  }


}
