package domain.Sastre;
import domain.Caracteristicas.Color;
import domain.Caracteristicas.Material;
import domain.Caracteristicas.TipoDeMaterial;
import domain.Caracteristicas.TipoDePrenda;
import domain.Prendas.Borrador;
import domain.Prendas.Prenda;


public class SastreSanJuan extends Sastre{
  public Prenda fabricarParteSuperior(){
    Borrador borrador = new Borrador(TipoDePrenda.chomba());
    borrador.setMaterial(new Material (TipoDeMaterial.PIQUE, new Color(0, 255, 0)));
    return borrador.crearPrenda();
}

 public Prenda fabricarParteInferior() {
   Borrador borrador = new Borrador(TipoDePrenda.pantalon());
   borrador.setMaterial(new Material (TipoDeMaterial.ACETATO, new Color(150, 152, 154)));
   return borrador.crearPrenda();
  }

  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(TipoDePrenda.zapato());
    borrador.setMaterial(new Material (TipoDeMaterial.CUERINA, new Color(255, 255, 255)));
    return borrador.crearPrenda();
  }
}
