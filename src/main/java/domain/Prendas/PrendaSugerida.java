package domain.Prendas;

public class PrendaSugerida {

  Prenda prendaSugerida;
  EstadoSugerencia estado = EstadoSugerencia.EN_EVALUACION;
  Accion unaAccion;

  public PrendaSugerida(Prenda prendaSugerida, Accion unaAccion) {
    this.prendaSugerida = prendaSugerida;
    this.unaAccion = unaAccion;
  }

  public void deshacer() {
    estado = EstadoSugerencia.EN_EVALUACION;
  }
  
  public void aceptarSugerencia() {
    this.cambiarEstado(EstadoSugerencia.ACEPTADA);
  }

  public void rechazarSugerencia() {
    this.cambiarEstado(EstadoSugerencia.RECHAZADA);
  }

  void cambiarEstado(EstadoSugerencia unEstado) {
    this.estado = unEstado;
  }

  public Prenda getPrendaSugerida() {
    return prendaSugerida;
  }

  public EstadoSugerencia getEstado() {
    return estado;
  }

  public Accion getUnaAccion() {
    return unaAccion;
  }
}
