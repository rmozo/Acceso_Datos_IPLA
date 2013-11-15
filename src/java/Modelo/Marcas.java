package Modelo;

public class Marcas extends Tipo{
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

    public Marcas(int mar_codigo, int tipo_codigo, int cat_codigo) {
        super(tipo_codigo, cat_codigo);
        this.mar_codigo = mar_codigo;
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
