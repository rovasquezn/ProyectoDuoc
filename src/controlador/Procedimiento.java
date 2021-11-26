
package controlador;

import db_conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

            String query = "INSERT INTO estudiante(id, rut, dv, nombre, appaterno, apmaterno, edad, nem, gratuidad)VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, estudiante.getId());
            stmt.setInt(2, estudiante.getRut());
            stmt.setString(3, estudiante.getDv());
            stmt.setString(4, estudiante.getNombre());
            stmt.setString(5, estudiante.getAppaterno());
            stmt.setString(6, estudiante.getApmaterno());
            stmt.setInt(7, estudiante.getEdad());
            stmt.setDouble(8, estudiante.getNem());
            stmt.setString(9, estudiante.getGratuidad());
          

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

            String query = "UPDATE estudiante set id=?, rut=?, dv=?, nombre=?, appaterno=?, apmaterno=?, edad=?, nem=?, gratuidad=? WHERE id =?";
            PreparedStatement stmt = con.prepareStatement(query);
           
            stmt.setInt(1, estudiante.getId());
            stmt.setInt(2, estudiante.getRut());
            stmt.setString(3, estudiante.getDv());
            stmt.setString(4, estudiante.getNombre());
            stmt.setString(5, estudiante.getAppaterno());
            stmt.setString(6, estudiante.getApmaterno());
            stmt.setInt(7, estudiante.getEdad());
            stmt.setDouble(8, estudiante.getNem());
            stmt.setString(9, estudiante.getGratuidad());

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
           
            String query = "SELECT id, rut, dv, nombre, appaterno, apmaterno, edad, nem, gratuidad FROM estudiante WHERE id=?";
            
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);

            ResultSet resultado = stmt.executeQuery();

            if (resultado.next()) {
                
                estudiante.setId(resultado.getInt("id"));
                estudiante.setRut(resultado.getInt("rut"));
                estudiante.setDv(resultado.getString("dv"));
                
                estudiante.setNombre(resultado.getString("nombre"));
                estudiante.setAppaterno(resultado.getString("appaterno"));
                estudiante.setApmaterno(resultado.getString("apmaterno"));
                estudiante.setEdad(resultado.getInt("edad"));
                estudiante.setNem(resultado.getDouble("nem"));
                estudiante.setGratuidad(resultado.getString("gratuidad"));

            }
            resultado.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al buscar al estudiante por ID " + e.getMessage());
        }
        return estudiante;
    }
    
     
     
     public List <Estudiante> buscarTodos() {

        List <Estudiante> listaEstudiante = new ArrayList<>();
        try {
           Conexion conect = new Conexion();
           Connection con = conect.obtenerConexion();

            String query = "SELECT id, rut, dv, nombre, appaterno, apmaterno, edad, nem, gratuidad FROM estudiante order by appaterno";
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                
                Estudiante estudiante = new Estudiante();
                estudiante.setId(resultado.getInt("id"));
                estudiante.setRut(resultado.getInt("rut"));
                estudiante.setDv(resultado.getString("dv"));
                estudiante.setNombre(resultado.getString("nombre"));
                estudiante.setAppaterno(resultado.getString("appaterno"));
                estudiante.setApmaterno(resultado.getString("apmaterno"));
                estudiante.setEdad(resultado.getInt("edad"));
                estudiante.setNem(resultado.getDouble("nem"));
                estudiante.setGratuidad(resultado.getString("gratuidad"));
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




