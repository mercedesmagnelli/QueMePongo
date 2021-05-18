package Sastre;

import Caracteristicas.Color;
import Caracteristicas.Material;
import Caracteristicas.TipoDeMaterial;
import Caracteristicas.TipoDePrenda;
import Prendas.Borrador;
import Prendas.Prenda;

public class SastreJohnston extends Sastre{

  public Prenda fabricarParteSuperior(){
    Borrador borrador = new Borrador (TipoDePrenda.camisa());
    borrador.setMaterial(new Material (TipoDeMaterial.SEDA, new Color(255, 255, 255)));
    return borrador.crearPrenda();
  }

  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(TipoDePrenda.pantalon());
    borrador.setMaterial(new Material (TipoDeMaterial.ACETATO, new Color(0, 0, 0)));
    return borrador.crearPrenda();
  }

  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(TipoDePrenda.zapato());
    borrador.setMaterial(new Material (TipoDeMaterial.CUERINA, new Color(0, 0, 0)));
    return borrador.crearPrenda();
  }
}
