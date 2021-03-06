package domain.Prendas;


import domain.Caracteristicas.Material;
import domain.Caracteristicas.TipoDePrenda;
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
    return prendaNueva;
  }
}
