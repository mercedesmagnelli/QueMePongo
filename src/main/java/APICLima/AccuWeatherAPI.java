package APICLima;

import exceptions.MuchasConsultasException;

import java.util.*;

public final class AccuWeatherAPI implements APIClima {
  int cantidadMaximaConsultas;
  int consultasDiaras=0;
  public final List<Map<String, Object>> getWeather(String ciudad) {
    return Arrays.asList(new HashMap<String, Object>() {{
      put("DateTime", "2019-05-03T01:00:00-03:00");
      put("EpochDateTime", 1556856000);
      put("WeatherIcon", 33);
      put("IconPhrase", "Clear");
      put("IsDaylight", false);
      put("PrecipitationProbability", 0);
      put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
      put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
      put("Temperature", new HashMap<String, Object>() {{
        put("Value", 57);
        put("Unit", "F");
        put("UnitType", 18);
      }});
    }});
  }
  public void controlarCantidadMaximaDeConsultas() {
    consultasDiaras+=1;
    if (consultasDiaras > cantidadMaximaConsultas) {
      throw new MuchasConsultasException("Ya hiciste muchas consultas");
    }
  }
  public double calculoCostoConsultasAdicionales(){
    return this.costoDeConsultasAdicionales() * Math.max(0, (consultasDiaras - cantidadMaximaConsultas));
  }

  public double costoDeConsultasAdicionales() {
    return 0.05;
  }

}
