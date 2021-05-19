package APICLima;


import exceptions.MuchasConsultasException;

import java.util.List;
import java.util.Map;

public class Clima {
  //la haría un singleton así podría ser conocida en varios lugares

  APIClima unaAPIClima;
  int cantidadMaximaConsultas;
  int consultasHechas=0;
  private static final Clima INSTANCE = new Clima();

  public static Clima instance() {
    return INSTANCE;
  }

  public Map<String, Object> climaSegunAPISeleccionada() {
    this.controlarCantidadMaximaDeConsultas();
    return unaAPIClima.getWeather("Buenos Aires, Argentina").get(0);
  }

  public void controlarCantidadMaximaDeConsultas() {
    consultasHechas+=1;
    if (consultasHechas > cantidadMaximaConsultas) {
      throw new MuchasConsultasException("Ya hiciste muchas consultas");
    }
  }
  public double getTemperatura(){
   return  climaSegunAPISeleccionada().get("Temperature").get("Value");
  }

  public void configurarAPI(APIClima unaAPI, int cantCons){
    this.setUnaAPIClima(unaAPI);
    cantidadMaximaConsultas = cantCons;
  }

  public void setUnaAPIClima(APIClima unaAPIClima) {
    this.unaAPIClima = unaAPIClima;
  }
}
