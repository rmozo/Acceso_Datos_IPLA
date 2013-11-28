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
    
    
    //Método para Listar categorias
    public ArrayList listar_proveedores(String buscar)throws Exception{
        ArrayList<Proveedores> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT * "
                + "FROM proveedores WHERE prov_nombre LIKE '%" + buscar + "%'");
        ResultSet res=datos.executeQuery();
        while(res.next())
            lista.add(new Proveedores(
                   res.getString ("prov_codigo") ,
                   res.getString ("prov_razon_social") ,
                   res.getString ("prov_nombre"),
                   res.getString ("prov_direccion"),
                   res.getInt("com_codigo"),
                   res.getString ("prov_telefono1"),
                   res.getString ("prov_telefono2"),
                   res.getString ("prov_email"),
                   res.getString ("prov_web")));
        return lista;
    }

    //Metodo para AGREGAR
    public void agregar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("INSERT INTO "
                    + "proveedores (prov_razon_social, prov_nombre, "
                    + "prov_direccion, com_codigo, prov_telefono1, "
                    + "prov_telefono2, prov_email, prov_web) "
                    + "VALUES('"+this.getProv_razon_social()+"', "
                    + "'"+this.getProv_nombre()+"', '"+this.getProv_direccion()+"', "
                    + "'"+this.getCom_codigo()+"', '"+this.getProv_telefono1()+"', "
                    + "'"+this.getProv_telefono2()+"', '"+this.getProv_email()+"', "
                    + "'"+this.getProv_web()+"')");
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
    public void editar_proveedores(String v1,String v2,String v3,String v4,String v5,String v6,String v7,String v8, String v9) throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("UPDATE proveedores "
                    + "SET prov_razon_social='"+v2+"' "
                    + "prov_nombre='"+v3+"' "
                    + "prov_direccion='"+v4+"' "
                    + "com_codigo='"+v5+"' "
                    + "prov_telefono1='"+v6+"' "
                    + "prov_telefono2='"+v7+"' "
                    + "prov_email='"+v8+"' "
                    + "prov_web='"+v9+"' "
                    + "WHERE prov_codigo='"+v1+"' ");
            datos.execute();//commit
        con.cerrar();
    }

    
}
