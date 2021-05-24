package APICLima;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


public class ProveedorClimaAccuWeatherAPI implements ProveedorClima {

  AccuWeatherAPI miAPI;
  Duration tiempoValidezConsulta;
  Map<String, Object> ultimaConsulta;
  LocalDateTime proximaExpiracion;

  public ProveedorClimaAccuWeatherAPI() {
    miAPI = new AccuWeatherAPI();
    tiempoValidezConsulta = Duration.ofMinutes(150);
    proximaExpiracion = LocalDateTime.now();
    ultimaConsulta = new HashMap<String, Object>();
  }

  public double getTemperatura(){
    HashMap<String, Object> temp = (HashMap<String, Object>) clima().get("Temperature");
    return  (double) temp.get("Value");
  }

  public Map<String, Object> clima() {

    if (this.expiroUltimaConsulta()) {
      ultimaConsulta =  miAPI.getWeather("Buenos Aires, Argentina").get(0);
      proximaExpiracion = this.proximaExpiracion();
    }
      return ultimaConsulta;

  }

  public LocalDateTime proximaExpiracion(){
    return LocalDateTime.now().plus(this.tiempoValidezConsulta);
  }

  private boolean expiroUltimaConsulta() {
    return this.proximaExpiracion().isBefore(LocalDateTime.now());
  }

}
