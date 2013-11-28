package Controlador;

import Modelo.Categorias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class control_categorias extends Categorias{
    //Instancia a control_conexion
    control_conexion con=new control_conexion();
    
    //Método para buscar categorias
    public String buscar_categorias(int buscar)throws Exception{
        ArrayList<Categorias> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT cat_nombre "
                + "FROM categorias WHERE cat_codigo LIKE '" +buscar+ "'");
        ResultSet res=datos.executeQuery();
        con.cerrar();
        res.next();
        return res.getString("cat_nombre");
    }
    
    //Método para editar categorias
    public void editar_categorias(String v1, String v2)throws Exception{
       con.conectar();
        PreparedStatement datos=con.estado().prepareStatement("UPDATE categorias "
                + "SET cat_nombre='"+v2+"' WHERE cat_codigo='"+v1+"'");
        datos.execute();
        con.cerrar();
    }
    
    public ArrayList listar_categorias(String buscar)throws Exception{
        ArrayList<Categorias> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT * "
                + "FROM categorias WHERE cat_nombre LIKE '%" + buscar + "%'");
        ResultSet res=datos.executeQuery();
        while(res.next())
            lista.add(new Categorias(
                    res.getInt("cat_codigo"),
                    res.getString("cat_nombre")));
        return lista;
    }
    
    //Metodo para AGREGAR
    public void agregar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("INSERT INTO "
                    + " categorias(cat_nombre) VALUES ('"+this.getCat_nombre()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Eliminar
    public void eliminar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("DELETE FROM categorias WHERE "
                    + "cat_codigo='"+this.getCat_codigo()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
    
    
}   
