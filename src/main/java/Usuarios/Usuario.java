package Usuarios;

import domain.Armario.Armario;
import domain.Armario.ArmarioCompartido;
import domain.Prendas.Accion;
import domain.Prendas.Prenda;
import domain.Prendas.SugerenciaPrenda;
import exceptions.ArmarioInaccesibleException;
import exceptions.DomainExceptionArmario;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Armario> misArmario;
  List<ArmarioCompartido> misArmarioCompartidos;
  List<ArmarioCompartido> otrosArmarioCompartidos;

  public Usuario() {
    this.misArmario = new ArrayList<Armario>();
    this.misArmarioCompartidos = new ArrayList<ArmarioCompartido>();
    this.otrosArmarioCompartidos = new ArrayList<ArmarioCompartido>();
  }

  public void crearArmarioPropio(){
    misArmario.add(new Armario());
  }

  public void crearArmarioCompartidos(List<Usuario> usuariosACompartir){
    ArmarioCompartido unGuardarropaNuevo = new ArmarioCompartido();
    misArmarioCompartidos.add(unGuardarropaNuevo);
    usuariosACompartir.stream().forEach(usuario->usuario.agregarGuardarropaCompartido(unGuardarropaNuevo));
  }

  public void agregarGuardarropaCompartido(ArmarioCompartido unGuardarrodaCompartido){
    otrosArmarioCompartidos.add(unGuardarrodaCompartido);
  }

  public void compartirGuardarropaCon(Usuario usuario, ArmarioCompartido miArmarioCompartido){
    controlarArmarioCompartidoPropio(miArmarioCompartido);
    usuario.agregarGuardarropaCompartido(miArmarioCompartido);
  }

  public void hacerSugerenciaPrendaAgregarEnArmario(Prenda unaPrenda, ArmarioCompartido unArmarioComp){
    controlarArmarioCompartidoConUsuario(unArmarioComp);
    unArmarioComp.agregarSugerenciaAgregar(unaPrenda);
  }

  public void hacerSugerenciaPrendaQuitarEnArmario(Prenda unaPrenda, ArmarioCompartido unArmarioComp){
    controlarArmarioCompartidoConUsuario(unArmarioComp);
    unArmarioComp.agregarSugerenciaQuitar(unaPrenda);
  }

  public List<SugerenciaPrenda> verSugerenciasDeArmario(ArmarioCompartido miArmarioComp){
    this.controlarArmarioCompartidoPropio(miArmarioComp);
    return miArmarioComp.getSugerencias();
  }

  public void aceptarSugerencia(ArmarioCompartido miGuardarropaComp, SugerenciaPrenda unaSugerencia){
    this.controlarArmarioCompartidoPropio(miGuardarropaComp);
    unaSugerencia.aceptarSugerencia(miGuardarropaComp);
  }

  public void rechazarSugerencia(ArmarioCompartido miGuardarropaComp, SugerenciaPrenda unaSugerencia){
    this.controlarArmarioCompartidoPropio(miGuardarropaComp);
    unaSugerencia.rechazarSugerencia(miGuardarropaComp);
  }

  public void deshacerSugerencia(ArmarioCompartido miGuardarropaComp, SugerenciaPrenda unaSugerencia){
    this.controlarArmarioCompartidoPropio(miGuardarropaComp);
    unaSugerencia.deshacerSugerencia(miGuardarropaComp);
  }

  public void controlarArmarioCompartidoPropio(ArmarioCompartido miGuardarropaComp){
    if(!misArmarioCompartidos.contains(miGuardarropaComp)) throw new DomainExceptionArmario("Usuario no es propietario del guardarropas compartido");
  }

  public void controlarArmarioCompartidoConUsuario(ArmarioCompartido unArmarioComp){
    if(!otrosArmarioCompartidos.contains(unArmarioComp)) throw new DomainExceptionArmario("Usuario no tiene acceso a este guardarropas");
  }

}

