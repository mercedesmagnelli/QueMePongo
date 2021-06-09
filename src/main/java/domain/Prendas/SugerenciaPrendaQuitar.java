package domain.Prendas;

import domain.Armario.ArmarioCompartido;

public class SugerenciaPrendaQuitar extends SugerenciaPrenda{
  public SugerenciaPrendaQuitar(Prenda prenda, EstadoSugerencia estadoAceptado) {
    super(prenda, estadoAceptado);
  }

  public void realizarAccionSugerida(ArmarioCompartido unGuardarropaComp){
    unGuardarropaComp.quitarPrenda(this.prenda);
  }

  public void deshacerAccionSugerida(ArmarioCompartido unGuardarropaComp){
    unGuardarropaComp.cargarPrenda(this.prenda);
  }
}
