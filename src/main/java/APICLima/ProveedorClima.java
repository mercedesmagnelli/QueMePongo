package APICLima;


public interface ProveedorClima {

  double getTemperatura();
//este es el adapter
}
//la haría un singleton así podría ser conocida en varios lugares
  /*APIClima unaAPIClima;
  LocalDate ultimaConsulta;
  private static final ProveedorClima INSTANCE = new ProveedorClima();

  public static ProveedorClima instance() {
    return INSTANCE;
  }
  //aca tengo la duda de si el getWeather me setea ya la fecha, sino tndría que meter el chequeo ahi,
  //pero creería ue está hasta acá
  public Map<String, Object> climaSegunAPISeleccionada() {
    ultimaConsulta = LocalDate.now();
      unaAPIClima.controlarCantidadMaximaDeConsultas();
    return unaAPIClima.getWeather("Buenos Aires, Argentina").get(0);
  }




  public void setUnaAPIClima(APIClima unaAPIClima) {
    this.unaAPIClima = unaAPIClima;
  }
*/

