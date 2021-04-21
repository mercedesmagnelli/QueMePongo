package Atuendo;

import Prendas.Prenda;

import java.util.List;
import java.util.ArrayList;

public class Atuendo {

    List<Prenda> prendas = new ArrayList<Prenda>();

    public void cargarPrenda (Prenda unaPrenda) throws Exception{
        unaPrenda.verificarCondicionesDeCarga();
        prendas.add(unaPrenda);
    }
    }

