package Modelo;
public class Personas extends Perfiles{
    //Atributos
    private String rut;
    private String password;
    private String nombres;
    private String apellidos;
    //Constructores
    public Personas() {
       this.rut="";
       this.password="";
       this.nombres="";
       this.apellidos="";
    }

    public Personas(String rut, String password, String nombres, String apellidos, String pf_nombre) {
        super(pf_nombre);
        this.rut = rut;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    //Get y Set
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
}
