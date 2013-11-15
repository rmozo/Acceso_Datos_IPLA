package Controlador;

import Modelo.Productos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class control_productos extends Productos{
    //Instancia a control_conexion
    control_conexion con=new control_conexion();
    control_marcas mar=new control_marcas();
    control_categorias cat=new control_categorias();
    control_medidas tipo=new control_medidas();
    
    //Método para Listar productos
    public ArrayList listar_productos(String buscar)throws Exception{
        ArrayList<Productos> lista=new ArrayList<>();
        con.conectar();
        PreparedStatement datos=
          con.estado().prepareStatement("SELECT * "
                + "FROM productos WHERE pro_nombre LIKE '%" + buscar + "%'");
        ResultSet res=datos.executeQuery();
        while(res.next())
            lista.add(new Productos(
                    res.getInt("pro_codigo_interno"),
                    res.getInt("pro_codigo_barra"),
                    res.getString("pro_nombre"),
                    res.getString("pro_descripcion"),
                    res.getFloat("pro_precio_c"),
                    res.getFloat("pro_margen_utilidad_ma"),
                    res.getFloat("pro_margen_utilidad_me"),
                    res.getInt("pro_precio_venta_ma"),
                    res.getInt("pro_precio_venta_me"),
                    res.getInt("pro_stock_ma"),
                    res.getInt("pro_stock_me"),
                    res.getInt("mar_codigo"),
                    res.getInt("cat_codigo"),
                    res.getInt("tipo_codigo")));
        return lista;
    }
    
    //Metodo para AGREGAR
    public void agregar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("INSERT INTO "
                    + "productos(pro_nombre) VALUES('"+this.getPro_nombre()+"')");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Eliminar
    public void eliminar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("DELETE FROM productos WHERE "
                    + "pro_codigo_interno='"+this.getPro_codigo_interno()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
    //Metodo para Modificar
    public void modificar() throws Exception{
        con.conectar();
            PreparedStatement datos=con.estado().prepareStatement("UPDATE categorias "
                    + "SET pro_nombre='"+this.getPro_nombre()+"' "
                    + "WHERE pro_codigo_interno='"+this.getPro_codigo_interno()+"'");
            datos.execute();//commit
        con.cerrar();
    }
    
}
