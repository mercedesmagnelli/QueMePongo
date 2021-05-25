package domain.Armario;

import Usuarios.Usuario;
import domain.Prendas.Borrador;
import domain.Prendas.Prenda;

import java.util.List;

public class Armario {

  private Usuario duenio;
  private List<Prenda> prendas;
  private Borrador ultimoBorradorPrenda;

  public List<Prenda> getPrendas() {
    return prendas;
  }


  public void cargarPrenda(Prenda unaPrenda){
    prendas.add(unaPrenda);
  }

  public void guardarUltimoBorradorPrenda(Borrador unBorradorPrenda){
    this.ultimoBorradorPrenda = ultimoBorradorPrenda;
  }


  protected void quitarPrenda(Prenda prendaSugerida) {
    prendas.remove(prendaSugerida);
  }
}
