package Modelo;
public class Categorias{
//Atributos
    private int cat_codigo;
    private String cat_nombre;
    
    
//Constructores
    public Categorias() {
    }

    public Categorias(int cat_codigo) {
        this.cat_codigo = cat_codigo;
    }
    
    public Categorias(int cat_codigo, String cat_nombre) {
        this.cat_codigo = cat_codigo;
        this.cat_nombre = cat_nombre;
    }

    
    //Getter y Setter
    public int getCat_codigo() {
        return cat_codigo;
    }

    public void setCat_codigo(int cat_codigo) {
        this.cat_codigo = cat_codigo;
    }

    public String getCat_nombre() {
        return cat_nombre;
    }

    public void setCat_nombre(String cat_nombre) {
        this.cat_nombre = cat_nombre;
    }
    
    
}
