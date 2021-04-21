package Prendas;

public class Prenda {

    Tipo tipoPrenda = null;
    Categoria categoriaPrenda = null;
    Color colorPrimario = null;
    Color colorSecundario = null;
    Material material = null;

    public void setTipoPrenda(Tipo tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public void setCategoriaPrenda(Categoria categoriaPrenda) {
        this.categoriaPrenda = categoriaPrenda;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
     }

    //public void verificarCondicionesDeCarga() throws Exception {

        //noTieneValor(tipoPrenda, "Falta definir el tipo de la prenda");
        //noTieneValor(colorPrimario, "Falta definir el color primario");
        //noTieneValor(materia, "Falta definir el material");
        //noTieneValor(categoria, "Falta definir la categoria");
        //verificarCategoriasSonConsistentes();}

    //acá en noTieneValor debería buscar una forma de hacerlo lo más polimorfico posible y abstracto para
    // poder pasar cualquier tipo de objeto y poder fijarme si es un objeto nulo al que apunta
    // pero no sé como hacerlo

    //Dado mi desconocimiento en como resolverlo, lo voy a hacer como se me ocurre que es medio feo y
    //me hace acordar a procedural

    public void verificarCondicionesDeCarga() throws Exception {
    this.verificarQueNoEstenNulos();
    this.verificarCategoriasSonConsistentes();
}
    private void verificarQueNoEstenNulos() throws Exception {

        if(tipoPrenda == null) {
            throw new Exception("Falta el tipo de prenda");
        }
        if(colorPrimario == null) {
            throw new Exception("Falta color primario");
        }
        if(material == null) {
            throw new Exception("Falta el material");
        }
        if(categoriaPrenda == null) {
            throw new Exception("Falta la categoria");
        }

    }



    public void verificarCategoriasSonConsistentes() throws Exception {

        if(tipoPrenda.getCategoria() != categoriaPrenda) {
            throw new Exception("La categoría ingresada es inconsistente");
        }

    }


}
