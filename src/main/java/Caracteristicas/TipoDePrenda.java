package Caracteristicas;

public class TipoDePrenda {
    public static TipoDePrenda zapato(){
        return new TipoDePrenda(Categoria.CALZADO);
    }
    public static TipoDePrenda chomba(){
        return new TipoDePrenda(Categoria.PARTE_SUP);
    }
    private static TipoDePrenda panuelo(){
        return new TipoDePrenda(Categoria.ACCESORIO);
    }
    private static TipoDePrenda remera(){
        return new TipoDePrenda(Categoria.PARTE_SUP);
    }
    public static TipoDePrenda pantalon(){
        return new TipoDePrenda(Categoria.PARTE_INF);
    }
    public static TipoDePrenda camisa() { return new TipoDePrenda(Categoria.PARTE_SUP);}

    private Categoria categoria;

    public TipoDePrenda(Categoria categoria){
        this.categoria = categoria;
    }



    public Categoria getCategoria() {
        return categoria;
    }
}