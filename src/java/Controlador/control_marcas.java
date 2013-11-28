package Controlador;

import Controlador.control_conexion;
import Modelo.Marcas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class control_marcas extends Marcas{
    //Instancia a control_conexion
    control_conexion con=new control_conexion();
    
    //Método para buscar Marcas
    public String buscar_marcas(int buscar)throws Exception{
        ArrayList<Marcas> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT mar_nombre "
                + "FROM marcas WHERE mar_codigo LIKE '" +buscar+ "'");
        ResultSet res=datos.executeQuery();
        con.cerrar();
        res.next();
        return res.getString("mar_nombre");
    }
    
    //Método para editar marcas
    public void editar_marcas(String v1, String v2)throws Exception{
        ArrayList<Marcas> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("UPDATE marcas "
                + "SET mar_nombre='"+v2+"' WHERE mar_codigo='"+v1+"'");
        datos.executeQuery();
        con.cerrar();
    }
    
    public ArrayList listar_marcas(String buscar)throws Exception{
        ArrayList<Marcas> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT * "
                + "FROM marcas WHERE mar_nombre LIKE '%" + buscar + "%'");
        ResultSet res=datos.executeQuery();
        while(res.next())
            lista.add(new Marcas(
                    res.getInt("mar_codigo"),
                    res.getString("mar_nombre")));
        return lista;
    }
    
    //Metodo para AGREGAR
    public void agregar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("INSERT INTO "
                    + "marcas(mar_nombre) VALUES('"+this.getMar_nombre()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Eliminar
    public void eliminar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("DELETE FROM marcas WHERE "
                    + "mar_codigo='"+this.getMar_codigo()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Modificar
    public void modificar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("UPDATE marcas "
                    + "SET mar_nombre='"+this.getMar_nombre()+"' "
                    + "WHERE mar_codigo='"+this.getMar_codigo()+"'");
            datos.execute();//commit
        con.cerrar();
    }
}   
