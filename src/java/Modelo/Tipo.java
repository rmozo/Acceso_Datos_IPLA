package Modelo;

public class Tipo extends Categorias{
//Atributos
    private int tipo_codigo;
    private String tipo_nombre;

//Constructores
    public Tipo() {
    }

      public Tipo(int tipo_codigo, String tipo_nombre) {
           this.tipo_codigo = tipo_codigo;
           this.tipo_nombre = tipo_nombre;
       }

    public Tipo(int tipo_codigo, int cat_codigo) {
        super(cat_codigo);
        this.tipo_codigo = tipo_codigo;
    }

         
    
    
//Getter & Setter
    public int getTipo_codigo() {
        return tipo_codigo;
    }

    public void setTipo_codigo(int tipo_codigo) {
        this.tipo_codigo = tipo_codigo;
    }

    public String getTipo_nombre() {
        return tipo_nombre;
    }

    public void setTipo_nombre(String tipo_nombre) {
        this.tipo_nombre = tipo_nombre;
    }
    
}
