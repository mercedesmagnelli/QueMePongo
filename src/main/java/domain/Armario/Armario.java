package domain.Armario;

import domain.Prendas.Borrador;
import domain.Prendas.Prenda;

import java.util.List;

public class Armario {

  private List<Prenda> prendas;
  private Borrador ultimoBorradorPrenda;

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void cargarPrenda(domain.Prendas.Prenda unaPrenda){
    prendas.add(unaPrenda);
  }

  public void guardarUltimoBorradorPrenda(Borrador unBorradorPrenda){
    this.ultimoBorradorPrenda = ultimoBorradorPrenda;
  }



}
