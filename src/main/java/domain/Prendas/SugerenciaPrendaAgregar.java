package domain.Prendas;

import domain.Armario.ArmarioCompartido;

public class SugerenciaPrendaAgregar extends SugerenciaPrenda {

  public SugerenciaPrendaAgregar(Prenda prenda, EstadoSugerencia estadoAceptado) {
    super(prenda, estadoAceptado);
  }

  public void realizarAccionSugerida(ArmarioCompartido armarioCompartido){
    armarioCompartido.cargarPrenda(this.prenda);
  }

  public void deshacerAccionSugerida(ArmarioCompartido armarioCompartido){
    armarioCompartido.quitarPrenda(this.prenda);
  }
}
