package Modelo;
public class Perfiles {
    //Atributos
    private int pf_codigo;
    private String pf_nombre;
    //Constructores
    public Perfiles() {
        this.pf_codigo=0;
        this.pf_nombre="";
    }
    //Constructor parametrizado
    public Perfiles(int pf_codigo, String pf_nombre) {
        this.pf_codigo = pf_codigo;
        this.pf_nombre = pf_nombre;
    }
    
    
    public Perfiles(String pf_nombre) {
        this.pf_nombre = pf_nombre;
    }
    
    //Get y Set

    public int getPf_codigo() {
        return pf_codigo;
    }

    public void setPf_codigo(int pf_codigo) {
        this.pf_codigo = pf_codigo;
    }

    public String getPf_nombre() {
        return pf_nombre;
    }

    public void setPf_nombre(String pf_nombre) {
        this.pf_nombre = pf_nombre;
    }
    
}
