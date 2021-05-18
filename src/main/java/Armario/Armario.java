package Armario;

import Prendas.Borrador;
import Prendas.Prenda;

import java.util.List;

public class Armario {

  private static final Armario INSTANCE = new Armario();

  private List<Prenda> prendas;
  private Borrador ultimoBorradorPrenda;

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public static Armario instance(){
    return INSTANCE;
  }

  public void cargarPrenda(Prenda unaPrenda){
    prendas.add(unaPrenda);
  }

  public void guardarUltimoBorradorPrenda(Borrador unBorradorPrenda){
    this.ultimoBorradorPrenda = ultimoBorradorPrenda;
  }




}
