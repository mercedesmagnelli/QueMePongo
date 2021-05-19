package APICLima;


import exceptions.MuchasConsultasException;

import java.util.List;
import java.util.Map;

public class Clima {
  //la haría un singleton así podría ser conocida en varios lugares

  APIClima unaAPIClima;
  private static final Clima INSTANCE = new Clima();

  public static Clima instance() {
    return INSTANCE;
  }

  public Map<String, Object> climaSegunAPISeleccionada() {
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
