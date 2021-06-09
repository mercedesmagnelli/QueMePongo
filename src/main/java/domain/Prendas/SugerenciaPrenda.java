package domain.Prendas;

import domain.Armario.ArmarioCompartido;
import exceptions.DomainExceptionSugerencia;

public abstract class SugerenciaPrenda {
  Prenda prenda;
  EstadoSugerencia estado;

  public SugerenciaPrenda(Prenda prenda, EstadoSugerencia estado) {
    this.prenda = prenda;
    this.estado = estado;
  }

  public void aceptarSugerencia(ArmarioCompartido unArmario){
  //unArmario.controlarExistenciaSugerencia(this);
    if(this.estado.equals(EstadoSugerencia.ACEPTADO)) throw new DomainExceptionSugerencia("La sugerencia ya ha sido aceptada");
    this.realizarAccionSugerida(unArmario);
  }

  public void rechazarSugerencia(ArmarioCompartido unArmario){
   unArmario.controlarExistenciaSugerencia(this);
    this.estado = EstadoSugerencia.RECHAZADO;
  }

  abstract public void realizarAccionSugerida(ArmarioCompartido unArmario);

  public void deshacerSugerencia(ArmarioCompartido unArmario){
    //unGuardarropaComp.controlarExistenciaSugerencia(this);
    if(!this.estado.equals(EstadoSugerencia.ACEPTADO)) throw new DomainExceptionSugerencia("La sugerencia no a sido aceptada");
    this.deshacerAccionSugerida(unArmario);
  }

  abstract void deshacerAccionSugerida(ArmarioCompartido unArmario);


}
