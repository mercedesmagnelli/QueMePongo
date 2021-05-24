package domain.Armario;

import APICLima.ProveedorClima;
import domain.Caracteristicas.Categoria;
import domain.Prendas.Prenda;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AtuendoSugerido {
  Optional<Prenda> superior;
  Optional<Prenda> inferior;
  Optional<Prenda> accesorio;
  Optional<Prenda> calzado;


  public AtuendoSugerido(Optional<Prenda> superior, Optional<Prenda> inferior, Optional<Prenda> accesorio, Optional<Prenda> calzado) {
    this.superior = superior;
    this.inferior = inferior;
    this.accesorio = accesorio;
    this.calzado = calzado;
    }

  /*public void generarSugerenciaDeAtuendo(Prenda sup, Prenda inf, Prenda acc, Prenda calzado) {
     superior = unaQueCumple(Categoria.PARTE_SUP);
     inferior =  unaQueCumple(Categoria.PARTE_INF);
     accesorio =  unaQueCumple(Categoria.ACCESORIO);
     calzado =  unaQueCumple(Categoria.CALZADO);
  }

  public Optional<Prenda> unaQueCumple(Categoria unaCat) {
    return obtenerListaDeCategoria(unaCat).stream().filter(prenda -> prenda.temperaturaAceptable(ProveedorClima.instance().getTemperatura())).collect(Collectors.toList()).stream().findAny();
  }

  public List<Prenda> obtenerListaDeCategoria(Categoria categoria){
    return Armario.instance().getPrendas().stream().filter(prenda -> prenda.getCategoria().equals(categoria)).collect(Collectors.toList());
  }


*/
}

