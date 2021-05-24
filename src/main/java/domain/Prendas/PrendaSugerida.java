package domain.Prendas;

public class PrendaSugerida {

  Prenda prendaSugerida;
  EstadoSugerencia estado = EstadoSugerencia.EN_EVALUACION;
  Accion unaAccion;

  public PrendaSugerida(Prenda prendaSugerida, Accion unaAccion) {
    this.prendaSugerida = prendaSugerida;
    this.unaAccion = unaAccion;
  }
}
