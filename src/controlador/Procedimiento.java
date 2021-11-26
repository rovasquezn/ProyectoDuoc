
package controlador;

import db_conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import modelo.Estudiante;

/**
 * Proyecto Alumnos DUOC - Finanzas
 * @author Rodrigo Vásquez, Franco Navarrete, Cristian Ubilla
 */
public class Procedimiento {
    
    
    
    public boolean ingresarEstudiante (Estudiante estudiante) {

        try {

            Conexion conect = new Conexion();
            Connection con = conect.obtenerConexion();

            String query = "INSERT INTO estudiante(rut, nombre, apmaterno, appaterno, gratuidad, edad, id, nem)VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, estudiante.getRut());
            stmt.setString(2, estudiante.getNombre());
            stmt.setString(3, estudiante.getApmaterno());
            stmt.setString(4, estudiante.getAppaterno());
            stmt.setString(5, estudiante.getGratuidad());
            stmt.setInt(6, estudiante.getEdad());
             stmt.setInt(7, estudiante.getId());
            stmt.setDouble(8, estudiante.getNem());
            
         

            stmt.executeUpdate();
            stmt.close();
            con.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al agregar Datos del estudiante - Clase Procedimiento" + e.getMessage());
            return false;
        }
    }
    
    
    
    
    public boolean actualizarEstudiante (Estudiante estudiante) {

        try {

            Conexion conect = new Conexion();
            Connection con = conect.obtenerConexion();

            String query = "UPDATE estudiante set rut=?, nombre=?, apmaterno=?, appaterno=?, gratuidad=?, edad=?, id=?, nem=?,  WHERE id =?";
            PreparedStatement stmt = con.prepareStatement(query);
           
            stmt.setString(1, estudiante.getRut());
            stmt.setString(2, estudiante.getNombre());
            stmt.setString(3, estudiante.getApmaterno());
            stmt.setString(4, estudiante.getAppaterno());
            stmt.setString(5, estudiante.getGratuidad());
            stmt.setInt(6, estudiante.getEdad());
            stmt.setInt(7, estudiante.getId());
            stmt.setDouble(8, estudiante.getNem());
   
            stmt.executeUpdate();
            stmt.close();
            con.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al actualizar los datos del estudiante - Clase Procedimiento" + e.getMessage());
            return false;
        }

    }
    
     public boolean eliminarEstudiante (int id) {

        try {

           Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();

            String query = "DELETE FROM estudiante WHERE id=?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);

            stmt.executeUpdate();
            stmt.close();
            con.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al eliminar el estudiante - Clase Prodecimiento" + e.getMessage());
            return false;
        }
    }

     public Estudiante buscarEstudiantePorId(int id) {

        Estudiante estudiante = new Estudiante();
       
        try {
            Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();
           
            String query = "SELECT rut, nombre, apmaterno, appaterno, gratuidadedad, edad, id, nem,  FROM estudiante WHERE id=?";
            
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);

            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {
                
                estudiante.setRut(resultado.getString("rut"));
                estudiante.setNombre(resultado.getString("nombre"));
                estudiante.setApmaterno(resultado.getString("apmaterno"));
                 estudiante.setAppaterno(resultado.getString("appaterno"));
                estudiante.setGratuidad(resultado.getString("gratuidad"));
                estudiante.setEdad(resultado.getInt("edad"));
                 estudiante.setId(resultado.getInt("id"));
                estudiante.setNem(resultado.getDouble("nem"));
                
               
  
                
            }
            resultado.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al buscar al estudiante por ID " + e.getMessage());
        }
        return estudiante;
    }
    
     
     
     
     
      public boolean buscarEstudiantePorRut(String rut) {

        Estudiante estudiante = new Estudiante();
      

        try {
            Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();
           
            String query = "SELECT rut FROM estudiante WHERE rut=?";
            
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, rut);

            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {
                return true;
//                 JOptionPane.showMessageDialog(this, "El RUT no puede estar vacío", "Validación", 1);
               // estudiante.setRut(resultado.getString("rut"));
               
           
                 
                  
              
   
            }
            resultado.close();
            stmt.close();
            con.close();
            

        } catch (SQLException e) {
            System.out.println("Error SQL al buscar al estudiante por rut " + e.getMessage());
        }
        
        return false;
    }
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     public List <Estudiante> buscarTodos() {

        List <Estudiante> listaEstudiante = new ArrayList<>();
        try {
           Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();

            String query = "SELECT rut, nombre, apmaterno, appaterno, gratuidad, edad, id, nem,  FROM estudiante order by appaterno";
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                
                Estudiante estudiante = new Estudiante();
                
                estudiante.setRut(resultado.getString("rut"));
                 estudiante.setNombre(resultado.getString("nombre"));
                estudiante.setApmaterno(resultado.getString("apmaterno"));
                estudiante.setAppaterno(resultado.getString("appaterno"));
                estudiante.setGratuidad(resultado.getString("gratuidad"));
                 estudiante.setEdad(resultado.getInt("edad"));
                 estudiante.setId(resultado.getInt("id"));
                estudiante.setNem(resultado.getDouble("nem"));
                
    
                listaEstudiante.add(estudiante);
            }
            resultado.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al buscar estudiantes " + e.getMessage());
        }
        return listaEstudiante;
    }
     
     
     
}




