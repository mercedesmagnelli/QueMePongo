package domain.Armario;

import Usuarios.Usuario;
import domain.Prendas.Borrador;
import domain.Prendas.Prenda;
import exceptions.DomainExceptionArmario;

import java.util.List;

public class Armario {

  private List<Prenda> prendas;
  private Borrador ultimoBorradorPrenda;

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void cargarPrenda(Prenda unaPrenda){
    prendas.add(unaPrenda);
  }

  public void guardarUltimoBorradorPrenda(Prenda unaPrenda){
    if(!prendas.contains(unaPrenda)) throw new DomainExceptionArmario("Esta prenda no esta en el guardarropas");
    this.ultimoBorradorPrenda = ultimoBorradorPrenda;
  }

  public void quitarPrenda(Prenda prendaSugerida) {
    prendas.remove(prendaSugerida);
  }
}
