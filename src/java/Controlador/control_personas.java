package Controlador;

import Modelo.Perfiles;
import Modelo.Personas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class control_personas extends Personas{
    //Objeto a control conexion
    control_conexion con;
    public control_personas() {
        con=new control_conexion();
    }
    //Verificar usuario
    public void verificar(){
        try {
            con.conectar();
            PreparedStatement datos=
                    con.estado().prepareStatement(""
            + "SELECT per_nombres, per_apellidos, "
            + "pf_nombre FROM perfiles, personas "
            + "WHERE per_rut='"+this.getRut()+"' AND "
            + "per_password='"+this.getPassword()+"' AND "
            + "personas.pf_codigo=perfiles.pf_codigo");
            ResultSet res=datos.executeQuery();
            if(res.next()){
                this.setNombres(res.getString("per_nombres"));
                this.setApellidos(res.getString("per_apellidos"));
                this.setPf_nombre(res.getString("pf_nombre"));
            }
            
            con.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(control_personas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Listar datos de Personas
    public ArrayList<Personas> listar() throws Exception{
        ArrayList<Personas> lista=new ArrayList<>();
        con.conectar();    
        PreparedStatement datos=
        con.estado().prepareStatement("SELECT *,pf_nombre "
        + "FROM personas, perfiles WHERE "
        + "personas.pf_codigo=perfiles.pf_codigo");
        ResultSet res=datos.executeQuery();
        while(res.next())
            lista.add(new Personas(
                    res.getString("per_rut"),
                    res.getString("per_password"),
                    res.getString("per_nombres"),
                    res.getString("per_apellidos"),
                    res.getString("pf_nombre")));
        
        con.cerrar();        
        return lista;
    }
 //Eliminar Personas
    public void eliminar_personas() throws Exception{
    con.conectar();
    PreparedStatement datos=con.estado().prepareStatement(""
    + "DELETE FROM personas WHERE per_rut='"+this.getRut()+"'");
    datos.execute();
    con.cerrar();
    }
//Insertar personas
    public void insertar_personas() throws Exception{
    con.conectar();
    PreparedStatement datos=con.estado().prepareStatement(""
    + "INSERT INTO personas VALUES('"+this.getRut()+"',"
    + "'"+this.getPassword()+"','"+this.getNombres()+"',"
    + "'"+this.getApellidos()+"','"+this.getPf_codigo()+"')");
    datos.execute();
    con.cerrar();
    }
    //modificar personas
    public void modificar_personas() throws Exception{
    con.conectar();
    PreparedStatement datos=con.estado().prepareStatement(""
    + "UPDATE personas SET("
    + "per_password='"+this.getPassword()+"',"
    + "per_nombres='"+this.getNombres()+"',"
    + "per_apellidos='"+this.getApellidos()+"',"
    + "pf_codigo='"+this.getPf_codigo()+"') WHERE "
    + "per_rut='"+this.getRut()+"'");
    datos.execute();
    con.cerrar();
    }
    //buscar personas
    public void buscar_personas() throws Exception{
    con.conectar();
    PreparedStatement datos=con.estado().prepareStatement(""
    + "SELECT * FROM personas WHERE "
    + "per_rut='"+this.getRut()+"'");
    ResultSet res=datos.executeQuery();
    if(res.next()){
        this.setRut(res.getString("per_rut"));
        this.setPassword(res.getString("per_password"));
        this.setNombres(res.getString("per_nombres"));
        this.setApellidos(res.getString("per_apellidos"));
        this.setPf_codigo(res.getInt("pf_codigo"));
    }
    con.cerrar();
    }
    //Método para listar perfiles
    public ArrayList<Perfiles> 
            lista_perfiles() throws Exception{
    ArrayList<Perfiles> lista=new ArrayList<>();
        con.conectar();
            PreparedStatement datos=
                    con.estado().prepareStatement(""
                    + "SELECT * FROM perfiles");
            ResultSet res=datos.executeQuery();
            while(res.next())
                lista.add(new Perfiles(
                        res.getInt("pf_codigo"),
                        res.getString("pf_nombre")));
        con.cerrar();
    return lista;
    }
}
