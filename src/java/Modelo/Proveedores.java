package Modelo;

public class Proveedores {
    private int prov_codigo;
    private String prov_razon_social;
    private String prov_nombre;
    private String prov_direccion;
    private String prov_telefono1;
    private String prov_telefono2;
    private String prov_email;
    private String prov_web;
    
    //Constructores
    public Proveedores() {
    }

    public Proveedores(int prov_codigo, String prov_razon_social, String prov_nombre, String prov_direccion, String prov_telefono1, String prov_telefono2, String prov_email, String prov_web) {
        this.prov_codigo = prov_codigo;
        this.prov_razon_social = prov_razon_social;
        this.prov_nombre = prov_nombre;
        this.prov_direccion = prov_direccion;
        this.prov_telefono1 = prov_telefono1;
        this.prov_telefono2 = prov_telefono2;
        this.prov_email = prov_email;
        this.prov_web = prov_web;
    }
    
    //Getter & Setter
    public int getProv_codigo() {
        return prov_codigo;
    }

    public void setProv_codigo(int prov_codigo) {
        this.prov_codigo = prov_codigo;
    }

    public String getProv_razon_social() {
        return prov_razon_social;
    }

    public void setProv_razon_social(String prov_razon_social) {
        this.prov_razon_social = prov_razon_social;
    }

    public String getProv_nombre() {
        return prov_nombre;
    }

    public void setProv_nombre(String prov_nombre) {
        this.prov_nombre = prov_nombre;
    }

    public String getProv_direccion() {
        return prov_direccion;
    }

    public void setProv_direccion(String prov_direccion) {
        this.prov_direccion = prov_direccion;
    }

    public String getProv_telefono1() {
        return prov_telefono1;
    }

    public void setProv_telefono1(String prov_telefono1) {
        this.prov_telefono1 = prov_telefono1;
    }

    public String getProv_telefono2() {
        return prov_telefono2;
    }

    public void setProv_telefono2(String prov_telefono2) {
        this.prov_telefono2 = prov_telefono2;
    }

    public String getProv_email() {
        return prov_email;
    }

    public void setProv_email(String prov_email) {
        this.prov_email = prov_email;
    }

    public String getProv_web() {
        return prov_web;
    }

    public void setProv_web(String prov_web) {
        this.prov_web = prov_web;
    }
    
    
}
