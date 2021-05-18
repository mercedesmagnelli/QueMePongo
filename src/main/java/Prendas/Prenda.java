package Prendas;

import Caracteristicas.Categoria;
import Caracteristicas.Color;
import Caracteristicas.Material;
import Caracteristicas.TipoDePrenda;

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
