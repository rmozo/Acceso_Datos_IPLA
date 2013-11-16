package Controlador;

import Modelo.Proveedores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class control_proveedores extends Proveedores{
    //Instancia a control_conexion
    control_conexion con=new control_conexion();
    
    //Método para buscar proveedores
    public String buscar_proveedores(int buscar)throws Exception{
        ArrayList<Proveedores> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT prov_nombre "
                + "FROM proveedores WHERE prov_codigo LIKE '" +buscar+ "'");
        ResultSet res=datos.executeQuery();
        con.cerrar();
        res.next();
        return res.getString("prov_nombre");
    }
    
    //Método para editar categorias
    public void editar_proveedores(String v1, String v2)throws Exception{
        ArrayList<Proveedores> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("UPDATE proveedores "
                + "SET prov_nombre='"+v2+"' WHERE prov_codigo='"+v1+"'");
        datos.executeQuery();
        con.cerrar();
    }
    
    public ArrayList listar_proveedores(String buscar)throws Exception{
        ArrayList<Proveedores> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT * "
                + "FROM proveedores WHERE prov_nombre LIKE '%" + buscar + "%'");
        ResultSet res=datos.executeQuery();
        while(res.next())
            lista.add(new Proveedores(
                    res.getInt("prov_codigo"),
                    res.getString("prov_nombre")));
        return lista;
    }
    
    //Metodo para AGREGAR
    public void agregar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("INSERT INTO "
                    + "proveedores(prov_codigo,prov_razon_social,prov_nombre,"
                    + "prov_direccion,com_codigo,prov_telefono1,prov_telefono2,"
                    + "prov_email,prov_web) VALUES('"+this.getProv_codigo()+"',"
                    + "'"+this.getProv_razon_social()+"','"+this.getProv_nombre()+"',"
                    + "'"+this.getProv_direccion()+"','"+this.getCom_codigo()+"',"
                    + "'"+this.getProv_telefono1()+"','"+this.getProv_telefono2()+"',"
                    + "'"+this.getProv_email()+"','"+this.getProv_web()+"')");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Eliminar
    public void eliminar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("DELETE FROM proveedores WHERE "
                    + "prov_codigo='"+this.getProv_codigo()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Modificar
    public void modificar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("UPDATE proveedores "
                    + "SET prov_nombre='"+this.getProv_nombre()+"' "
                    + "WHERE prov_codigo='"+this.getProv_codigo()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
}
