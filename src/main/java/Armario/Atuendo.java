package Armario;

import APICLima.Clima;
import Caracteristicas.Categoria;
import Armario.Armario;
import Prendas.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Atuendo {
  Optional<Prenda> superior;
  Optional<Prenda> inferior;
  Optional<Prenda> accesorio;
  Optional<Prenda> calzado;

  Atuendo(){
    generarSugerenciaDeAtuendo();
  }

  public void generarSugerenciaDeAtuendo() {
     superior = unaQueCumple(Categoria.PARTE_SUP);
     inferior =  unaQueCumple(Categoria.PARTE_INF);
     accesorio =  unaQueCumple(Categoria.ACCESORIO);
     calzado =  unaQueCumple(Categoria.CALZADO);
  }

  public Optional<Prenda> unaQueCumple(Categoria unaCat) {
    return obtenerListaDeCategoria(unaCat).stream().filter(prenda -> prenda.temperaturaAceptable(Clima.instance().getTemperatura())).collect(Collectors.toList()).stream().findAny();
  }

  public List<Prenda> obtenerListaDeCategoria(Categoria categoria){
    return Armario.instance().getPrendas().stream().filter(prenda -> prenda.getCategoria().equals(categoria)).collect(Collectors.toList());
  }



}

