package Prendas;

import Armario.Armario;
import Caracteristicas.Color;
import Caracteristicas.Material;
import Caracteristicas.TipoDePrenda;
import java.util.Objects;


public class Borrador {

  TipoDePrenda tipoPrenda;
  Material material;

  public Borrador(TipoDePrenda tipoPrenda) {
    Objects.requireNonNull(tipoPrenda);
    this.tipoPrenda = tipoPrenda;
  }


  public void setMaterial(Material material) {
    Objects.requireNonNull(material);
    this.material = material;
  }


  public Prenda crearPrenda() {
    Prenda prendaNueva = new Prenda(tipoPrenda, material);
    Armario.instance().cargarPrenda(prendaNueva);
    return prendaNueva;
  }
}
