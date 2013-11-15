package Modelo;

public class Comunas extends Proveedores{

    //Atributos
    private int com_codigo;
    private String com_nombre;
    private int com_cod_area;

    //Constructores
    public Comunas() {
    }

    public Comunas(int com_codigo, String com_nombre, int com_cod_area) {
        this.com_codigo = com_codigo;
        this.com_nombre = com_nombre;
        this.com_cod_area = com_cod_area;
    }

    public Comunas(int prov_codigo, String prov_razon_social, String prov_nombre, String prov_direccion,int com_codigo, String prov_telefono1, String prov_telefono2, String prov_email, String prov_web) {
        super(prov_codigo, prov_razon_social, prov_nombre, prov_direccion, prov_telefono1, prov_telefono2, prov_email, prov_web);
        this.com_codigo = com_codigo;
    }

    
    //Getter & Setter
    public int getCom_codigo() {
        return com_codigo;
    }

    public void setCom_codigo(int com_codigo) {
        this.com_codigo = com_codigo;
    }

    public String getCom_nombre() {
        return com_nombre;
    }

    public void setCom_nombre(String com_nombre) {
        this.com_nombre = com_nombre;
    }

    public int getCom_cod_area() {
        return com_cod_area;
    }

    public void setCom_cod_area(int com_cod_area) {
        this.com_cod_area = com_cod_area;
    }
    
    
}
