package Armario;

import Prendas.Borrador;

import java.util.List;

public class Armario {

  private static final Armario INSTANCE = new Armario();

  private List<Prendas.Prenda> prendas;
  private Borrador ultimoBorradorPrenda;

  public List<Prendas.Prenda> getPrendas() {
    return prendas;
  }

  public static Armario instance(){
    return INSTANCE;
  }

  public void cargarPrenda(Prendas.Prenda unaPrenda){
    prendas.add(unaPrenda);
  }

  public void guardarUltimoBorradorPrenda(Borrador unBorradorPrenda){
    this.ultimoBorradorPrenda = ultimoBorradorPrenda;
  }
  public Atuendo conseguirAtuendoSugeridoSegunTemperatura(){
    return new Atuendo();
  }


}
