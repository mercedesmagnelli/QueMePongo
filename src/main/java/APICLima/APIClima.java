package APICLima;

import java.util.List;
import java.util.Map;

public interface APIClima {
  //hago interfaz ya que puede ser que cambie porque el adm puede cambiar
  List<Map<String, Object>> getWeather(String ciudad);
  double costoDeConsultasAdicionales();

  void controlarCantidadMaximaDeConsultas();
}
