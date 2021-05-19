package APICLima;


import exceptions.MuchasConsultasException;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Clima {
  //la haría un singleton así podría ser conocida en varios lugares

  APIClima unaAPIClima;
  LocalDate ultimaConsulta;
  private static final Clima INSTANCE = new Clima();

  public static Clima instance() {
    return INSTANCE;
  }
  //aca tengo la duda de si el getWeather me setea ya la fecha, sino tndría que meter el chequeo ahi,
  //pero creería ue está hasta acá
  public Map<String, Object> climaSegunAPISeleccionada() {
    ultimaConsulta = LocalDate.now();
      unaAPIClima.controlarCantidadMaximaDeConsultas();
    return unaAPIClima.getWeather("Buenos Aires, Argentina").get(0);
  }


  public double getTemperatura(){
   return  climaSegunAPISeleccionada().get("Temperature").get("Value");
  }


  public void setUnaAPIClima(APIClima unaAPIClima) {
    this.unaAPIClima = unaAPIClima;
  }


}
