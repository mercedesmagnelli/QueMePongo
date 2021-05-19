package Usuario;

import APICLima.APIClima;
import APICLima.Clima;

public class Administrador {

  public void cambiarServicioObtencionClima(APIClima unaAPI) {
   Clima.instance().setUnaAPIClima(unaAPI);
  }

}
