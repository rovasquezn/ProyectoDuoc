package db_conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author rodrigo
 */
public class Conexion {

public Connection obtenerConexion() {

    Connection connection = null;
    
    try {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/duoc","root","");
      
        System.out.println("Conexion Exitosa");
        
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Error de clase Conexion " + e.getMessage());
    }
    
    return connection;

       
    
}  
    
//    public static void main(String[] args) {
//        Conexion con = new Conexion();
//        con.obtenerConexion();
//    }



    
}

