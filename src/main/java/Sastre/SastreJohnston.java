package Sastre;

import Caracteristicas.Color;
import Caracteristicas.Material;
import Caracteristicas.TipoDeMaterial;
import Caracteristicas.TipoDePrenda;
import Prendas.Borrador;
import Prendas.Prenda;

public class SastreJohnston extends Sastre{

  public Prenda fabricarParteSuperior(){
    TipoDePrenda camisaJohnston = TipoDePrenda.camisa();
    Borrador borrador = new Borrador(camisaJohnston);
    Material materialesCamisaJS = new Material (TipoDeMaterial.SEDA, new Color(255, 255, 255));
    borrador.setMaterial(materialesCamisaJS);
    return borrador.crearPrenda();
  }

  public Prenda fabricarParteInferior() {
    TipoDePrenda pantalonJS = TipoDePrenda.pantalon();
    Borrador borrador = new Borrador(pantalonJS);
    Material materialesPantalonJS = new Material (TipoDeMaterial.ACETATO, new Color(0, 0, 0));
    borrador.setMaterial(materialesPantalonJS);
    return borrador.crearPrenda();
  }

  public Prenda fabricarCalzado() {
    TipoDePrenda zapatosJS = TipoDePrenda.zapato();
    Borrador borrador = new Borrador(zapatosJS);
    Material materialesZapatosJS = new Material (TipoDeMaterial.CUERINA, new Color(0, 0, 0));
    borrador.setMaterial(materialesZapatosJS);
    return borrador.crearPrenda();
  }
}
