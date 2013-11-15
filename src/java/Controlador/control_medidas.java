package Controlador;

import Modelo.Medidas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class control_medidas extends Medidas{
    //Instancia a control_conexion
    control_conexion con=new control_conexion();
    //Método para Listar categorias
    public ArrayList listar_medidas(String buscar)throws Exception{
        ArrayList<Medidas> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT * "
                + "FROM medidas WHERE tipo_nombre LIKE '%" + buscar + "%'");
        ResultSet res=datos.executeQuery();
        while(res.next())
            lista.add(new Medidas(
                    res.getInt("tipo_codigo"),
                    res.getString("tipo_nombre")));
        return lista;
    }
    //Metodo para AGREGAR
    public void agregar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("INSERT INTO "
                    + "medidas(tipo_nombre) VALUES('"+this.getTipo_nombre()+"')");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Eliminar
    public void eliminar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("DELETE FROM medidas WHERE "
                    + "tipo_codigo='"+this.getTipo_codigo()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Modificar
    public void modificar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("UPDATE medidas "
                    + "SET tipo_nombre='"+this.getTipo_nombre()+"' "
                    + "WHERE tipo_codigo='"+this.getTipo_codigo()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
}
