package Modelo;

public class Marcas extends Medidas{
    //Atributos
    private int mar_codigo;
    private String mar_nombre;
    
    //Constructores
    public Marcas() {
    }

    public Marcas(int mar_codigo, String mar_nombre) {
        this.mar_codigo = mar_codigo;
        this.mar_nombre = mar_nombre;
    }

    public Marcas(int mar_codigo, String mar_nombre, int tipo_codigo, String tipo_nombre, int cat_codigo, String cat_nombre) {
        super(tipo_codigo, tipo_nombre, cat_codigo, cat_nombre);
        this.mar_codigo = mar_codigo;
        this.mar_nombre = mar_nombre;
    }

    
    
    //Getter & Setter
    public int getMar_codigo() {
        return mar_codigo;
    }

    public void setMar_codigo(int mar_codigo) {
        this.mar_codigo = mar_codigo;
    }

    public String getMar_nombre() {
        return mar_nombre;
    }

    public void setMar_nombre(String mar_nombre) {
        this.mar_nombre = mar_nombre;
    }
    
}
