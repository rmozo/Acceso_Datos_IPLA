package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class control_conexion {
   //Atributos de clase
    Connection con=null;
    private String usuario;
    private String password;
    private String url;
    //Constructor
    public control_conexion() {
        this.usuario="root";
        this.password="";
        this.url="jdbc:mysql://127.0.0.1/ventas_ipla_final";
    }
    //Método para conectar al servidor
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(
                    url,usuario,password);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(control_conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Método para cerrar
    public void cerrar(){
        con=null;
    }
    //Método para retornar estado del hilo
    public Connection estado(){
        return con;
    }
}
