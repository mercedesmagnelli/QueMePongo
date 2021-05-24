package domain.Prendas;


import domain.Caracteristicas.*;
public class Prenda {

  TipoDePrenda tipoPrenda;
  Material material;

  public Prenda(TipoDePrenda tipoPrenda, Material material) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
  }

  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

  public boolean temperaturaAceptable(double unaTemp) {
    return tipoPrenda.temperaturaAceptable(unaTemp);
  }
}
