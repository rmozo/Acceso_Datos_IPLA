package Controlador;

import Modelo.Tipo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class control_tipo extends Tipo{
    //Instancia a control_conexion
    control_conexion con=new control_conexion();
    
    //Método para buscar Tipos
    public String buscar_tipo(int buscar)throws Exception{
        ArrayList<Tipo> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT tipo_nombre "
                + "FROM tipo WHERE tipo_codigo LIKE '" +buscar+ "'");
        ResultSet res=datos.executeQuery();
        con.cerrar();
        res.next();
        return res.getString("tipo_nombre");
    }
    
    //Método para editar tipo
    public void editar_tipo(String v1, String v2)throws Exception{
        ArrayList<Tipo> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("UPDATE tipo "
                + "SET tipo_nombre='"+v2+"' WHERE tipo_codigo='"+v1+"'");
        datos.executeQuery();
        con.cerrar();
    }
    
    public ArrayList listar_tipo(String buscar)throws Exception{
        ArrayList<Tipo> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT * "
                + "FROM tipo WHERE tipo_nombre LIKE '%" + buscar + "%'");
        ResultSet res=datos.executeQuery();
        while(res.next())
            lista.add(new Tipo(
                    res.getInt("tipo_codigo"),
                    res.getString("tipo_nombre")));
        return lista;
    }
    
    //Metodo para AGREGAR
    public void agregar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("INSERT INTO "
                    + "tipo (tipo_nombre) VALUES('"+this.getTipo_nombre()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Eliminar
    public void eliminar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("DELETE FROM tipo WHERE "
                    + "tipo_codigo='"+this.getTipo_codigo()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Modificar
    public void modificar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("UPDATE tipo "
                    + "SET tipo_nombre='"+this.getTipo_nombre()+"' "
                    + "WHERE tipo_codigo='"+this.getTipo_codigo()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
}
