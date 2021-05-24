package domain;

import APICLima.ProveedorClima;
import domain.Armario.Armario;
import domain.Armario.AtuendoSugerido;
import domain.Caracteristicas.Categoria;
import domain.Prendas.Prenda;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AsesorDeImagen {

  ProveedorClima unProveedor;
  Armario unArmario;

  public AsesorDeImagen(ProveedorClima unProveedor) {
    this.unProveedor = unProveedor;
  }
  public double getTemperatura(){
    return unProveedor.getTemperatura();
  }

  public void generarSugerenciaAtuendo() {

    new AtuendoSugerido(this.sugerirPrendaSuperior(),
      this.sugerirPrendaInferior(),
      this.sugerirAccesorio(),
      this.sugerirCalzado());
  }

  public Optional<Prenda> unaQueCumple(Categoria unaCat) {
    return obtenerListaDeCategoria(unaCat).stream().filter(prenda -> prenda.temperaturaAceptable(unProveedor.getTemperatura())).collect(Collectors.toList()).stream().findAny();
  }

  public List<Prenda> obtenerListaDeCategoria(Categoria categoria) {
    return unArmario.getPrendas().stream().filter(prenda -> prenda.getCategoria().equals(categoria)).collect(Collectors.toList());

  }
    private Optional<Prenda> sugerirCalzado () {
      return this.unaQueCumple(Categoria.CALZADO);
    }
    private Optional<Prenda> sugerirAccesorio () {
      return this.unaQueCumple(Categoria.ACCESORIO);}

    private Optional<Prenda> sugerirPrendaInferior () {
      return this.unaQueCumple(Categoria.PARTE_INF);}


    private Optional<Prenda> sugerirPrendaSuperior () {
      return this.unaQueCumple(Categoria.PARTE_SUP);}


    }
