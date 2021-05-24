package APICLima;

import java.util.HashMap;
import java.util.Map;


public class ProveedorClimaAccuWeatherAPI implements ProveedorClima {

  AccuWeatherAPI miApi = new AccuWeatherAPI();

  public double getTemperatura(){
    HashMap<String, Object> temp = (HashMap<String, Object>) clima().get("Temperature");
    return  (double) temp.get("Value");
  }

  public Map<String, Object> clima() {
     return miApi.getWeather("Buenos Aires, Argentina").get(0);
  }








}
