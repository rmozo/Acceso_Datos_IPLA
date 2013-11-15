package Modelo;

import java.util.logging.Logger;

public class Medidas extends Categorias{
//Atributos
    private int tipo_codigo;
    private String tipo_nombre;

//Constructores
    public Medidas() {
    }

    public Medidas(int tipo_codigo, String tipo_nombre, int cat_codigo, String cat_nombre) {
        super(cat_codigo, cat_nombre);
        this.tipo_codigo = tipo_codigo;
        this.tipo_nombre = tipo_nombre;
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
