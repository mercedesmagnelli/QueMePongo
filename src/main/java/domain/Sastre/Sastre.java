package domain.Sastre;
import domain.Prendas.Prenda;
import domain.Prendas.Uniforme;

public abstract class Sastre {

 public void fabricarUniforme(){
    new Uniforme(
    this.fabricarParteSuperior(),
    this.fabricarParteInferior(),
    this.fabricarCalzado());
  }


  protected abstract Prenda fabricarParteSuperior();
  protected abstract Prenda fabricarParteInferior();
  protected abstract Prenda fabricarCalzado();


}
