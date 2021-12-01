
package controlador;

import db_conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

import modelo.Estudiante;

/**
 * Proyecto Alumnos DUOC - Finanzas
 * @author Rodrigo Vásquez, Franco Navarrete, Cristian Ubilla
 */
public class Procedimiento {
    
    
    
    public boolean ingresarEstudiante (Estudiante estudiante) {
         Date date;
        try {

            Conexion conect = new Conexion();
            Connection con = conect.obtenerConexion();
            
           date = estudiante.getFecha_pago_matricula();

            String query = "INSERT INTO estudiante(rut, nombre, apmaterno, appaterno, gratuidad, edad, id, nem, estado_matricula, valor_matricula, valor_matricula_pagar, fecha_pago_matricula, nombre_carrera, nombre_sede)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, estudiante.getRut());
            stmt.setString(2, estudiante.getNombre());
            stmt.setString(3, estudiante.getApmaterno());
            stmt.setString(4, estudiante.getAppaterno());
            stmt.setString(5, estudiante.getGratuidad());
            stmt.setInt(6, estudiante.getEdad());
            stmt.setInt(7, estudiante.getId());
            stmt.setDouble(8, estudiante.getNem());
            stmt.setString(9, estudiante.getEstado_matricula());
            stmt.setInt(10, estudiante.getValor_matricula());
            stmt.setInt(11, estudiante.getValor_matricula_pagar());
            stmt.setDate(12, new java.sql.Date(date.getTime()));
            stmt.setString(13, estudiante.getNombre_carrera());
            stmt.setString(14, estudiante.getNombre_sede());
          

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
        Date  date;
        try {

            Conexion conect = new Conexion();
            Connection con = conect.obtenerConexion();
            
            date = estudiante.getFecha_pago_matricula();

            String query = "UPDATE estudiante set rut=?, nombre=?, apmaterno=?, appaterno=?, gratuidad=?, edad=?, nem=?, estado_matricula=?, valor_matricula=?, valor_matricula_pagar=?, fecha_pago_matricula=?, nombre_carrera=?, nombre_sede=?   WHERE id =?";
            PreparedStatement stmt = con.prepareStatement(query);
           
            stmt.setString(1, estudiante.getRut());
            stmt.setString(2, estudiante.getNombre());
            stmt.setString(3, estudiante.getApmaterno());
            stmt.setString(4, estudiante.getAppaterno());
            stmt.setString(5, estudiante.getGratuidad());
            stmt.setInt(6, estudiante.getEdad());
            stmt.setDouble(7, estudiante.getNem());
            stmt.setString(8, estudiante.getEstado_matricula());
            stmt.setInt(9, estudiante.getValor_matricula());
            stmt.setInt(10, estudiante.getValor_matricula_pagar());
            stmt.setDate(11, new java.sql.Date(date.getTime()));
            stmt.setString(12, estudiante.getNombre_carrera());
            stmt.setString(13, estudiante.getNombre_sede());
            stmt.setInt(14, estudiante.getId());
            

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
            System.out.println("Error en SQL al eliminar el estudiante - Clase Procedimiento" + e.getMessage());
            return false;
        }
    }

      public boolean eliminarEstudiantePorRut (String rut) {

        try {

           Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();

            String query = "DELETE FROM estudiante WHERE rut=?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, rut);

            stmt.executeUpdate();
            stmt.close();
            con.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al eliminar el estudiante - Clase Procedimiento" + e.getMessage());
            return false;
        }
    }
     
      public Estudiante buscarEstudiantePorId(int id) {

        Estudiante estudiante = new Estudiante();
       
        try {
            Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();
           
            String query = "SELECT rut, nombre, apmaterno, appaterno, gratuidad, edad, id, nem, estado_matricula, valor_matricula, valor_matricula_pagar, fecha_pago_matricula, nombre_carrera, nombre_sede FROM estudiante WHERE id=?";
            
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
                estudiante.setEstado_matricula(resultado.getString("estado_matricula"));
                estudiante.setValor_matricula(resultado.getInt("valor_matricula"));
                estudiante.setValor_matricula_pagar(resultado.getInt("valor_matricula_pagar"));
                estudiante.setFecha_pago_matricula(resultado.getDate("fecha_pago_matricula"));
                estudiante.setNombre_carrera(resultado.getString("nombre_carrera"));
                estudiante.setNombre_sede(resultado.getString("nombre_sede"));
    
              
            }
            resultado.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al buscar al estudiante por ID " + e.getMessage());
        }
        return estudiante;
    }
    
     
      public boolean buscarEstudiantePorRutBandera(String rut) {

        Estudiante estudiante = new Estudiante();
        try {
            Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();
            String query = "SELECT rut FROM estudiante WHERE rut=?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, rut);
            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {
               estudiante.setRut(resultado.getString("rut"));
                return true;  
            }
            resultado.close();
            stmt.close();
            con.close();
            } catch (SQLException e) {
            
            System.out.println("Error SQL al buscar al estudiante por rut " + e.getMessage());
        }
        
        return false;
    }
     
     
     public boolean buscarEstudiantePorIdBandera(int id) {

        Estudiante estudiante = new Estudiante();
        try {
            Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();
            String query = "SELECT id FROM estudiante WHERE id=?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {
               estudiante.setId(resultado.getInt("id"));
                return true;  
            }
            resultado.close();
            stmt.close();
            con.close();
            } catch (SQLException e) {
            
            System.out.println("Error SQL al buscar al estudiante por ID " + e.getMessage());
        }
        
        return false;
    } 
      
      
 
     
      public Estudiante buscarEstudiantePorRut(String rut) {

        Estudiante estudiante = new Estudiante();
        

        try {
            Conexion conect = new Conexion();
            try (Connection con = conect.obtenerConexion()) {
                String query = "SELECT rut, nombre, apmaterno, appaterno, gratuidad, edad, id, nem, estado_matricula, valor_matricula, valor_matricula_pagar, fecha_pago_matricula, nombre_carrera, nombre_sede FROM estudiante WHERE rut=?";
                
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, rut);
                
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
                estudiante.setEstado_matricula(resultado.getString("estado_matricula"));
                
                estudiante.setValor_matricula(resultado.getInt("valor_matricula"));
                estudiante.setValor_matricula_pagar(resultado.getInt("valor_matricula_pagar"));
                estudiante.setFecha_pago_matricula(resultado.getDate("fecha_pago_matricula"));
                estudiante.setNombre_carrera(resultado.getString("nombre_carrera"));
                estudiante.setNombre_sede(resultado.getString("nombre_sede"));

                }
                resultado.close();
                stmt.close();
            }
            

        } catch (SQLException e) {
            
            System.out.println("Error SQL al buscar al estudiante por rut " + e.getMessage());
        }
        
        return estudiante;
    }
    
 

     public List <Estudiante> buscarTodos() {

        List <Estudiante> listaEstudiante = new ArrayList<>();
        try {
           Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();

            String query = "SELECT rut, nombre, apmaterno, appaterno, gratuidad, edad, id, nem, estado_matricula, valor_matricula, valor_matricula_pagar, fecha_pago_matricula, nombre_carrera, nombre_sede  FROM estudiante";
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
                 estudiante.setEstado_matricula(resultado.getString("estado_matricula"));
                estudiante.setValor_matricula(resultado.getInt("valor_matricula"));
                estudiante.setValor_matricula_pagar(resultado.getInt("valor_matricula_pagar"));
                estudiante.setFecha_pago_matricula(resultado.getDate("fecha_pago_matricula"));
                estudiante.setNombre_carrera(resultado.getString("nombre_carrera"));
                estudiante.setNombre_sede(resultado.getString("nombre_sede"));
               
    
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




