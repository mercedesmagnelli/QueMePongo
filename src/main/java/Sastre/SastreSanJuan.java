package Sastre;
import Caracteristicas.Color;
import Caracteristicas.Material;
import Caracteristicas.TipoDeMaterial;
import Caracteristicas.TipoDePrenda;
import Prendas.Borrador;
import Prendas.Prenda;


public class SastreSanJuan extends Sastre{
  public Prenda fabricarParteSuperior(){
    TipoDePrenda chombaSanJuan = TipoDePrenda.chomba();
    Borrador borrador = new Borrador(chombaSanJuan);
    Material materialesChombaSJ = new Material (TipoDeMaterial.PIQUE, new Color(0, 255, 0));
    borrador.setMaterial(materialesChombaSJ);
    return borrador.crearPrenda();
}

 public Prenda fabricarParteInferior() {
   TipoDePrenda pantalonSanJuan = TipoDePrenda.pantalon();
   Borrador borrador = new Borrador(pantalonSanJuan);
   Material materialesPantalonSJ = new Material (TipoDeMaterial.ACETATO, new Color(150, 152, 154));
   borrador.setMaterial(materialesPantalonSJ);
   return borrador.crearPrenda();
  }

  public Prenda fabricarCalzado() {
    TipoDePrenda zapatosSanJuan = TipoDePrenda.zapato();
    Borrador borrador = new Borrador(zapatosSanJuan);
    Material materialesZapatosSJ = new Material (TipoDeMaterial.CUERINA, new Color(255, 255, 255));
    borrador.setMaterial(materialesZapatosSJ);
    return borrador.crearPrenda();
  }
}
