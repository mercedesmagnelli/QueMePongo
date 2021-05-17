package Caracteristicas;

public class Material {

  TipoDeMaterial tipoMaterial;
  Trama trama = Trama.LISA;
  Color colorPrimario;
  Color colorSecundario;


  public Material(TipoDeMaterial tipoMaterial, Color colorPrimario) {
    this.tipoMaterial = tipoMaterial;
    this.colorPrimario = colorPrimario;
  }

  public Material(TipoDeMaterial tipoMaterial, Trama unaTrama, Color colorPrimario) {
    this.trama = unaTrama;
    this.tipoMaterial = tipoMaterial;
    this.colorPrimario = colorPrimario;

  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }


}
