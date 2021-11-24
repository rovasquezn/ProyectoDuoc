
package modelo;

/**
 * Proyecto Alumnos DUOC - Finanzas
 * @author Rodrigo Vásquez, Franco Navarrete, Cristian Ubilla
 */
public class Estudiante {
    
    private String nombre, apmaterno, appaterno, gratuidad, rut;
    private int edad, id;
    private double nem;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apmaterno, String appaterno, String gratuidad, String rut, int edad, int id, double nem) {
        this.nombre = nombre;
        this.apmaterno = apmaterno;
        this.appaterno = appaterno;
        this.gratuidad = gratuidad;
        this.rut = rut;
        this.edad = edad;
        this.id = id;
        this.nem = nem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getGratuidad() {
        return gratuidad;
    }

    public void setGratuidad(String gratuidad) {
        this.gratuidad = gratuidad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNem() {
        return nem;
    }

    public void setNem(double nem) {
        this.nem = nem;
    }
    
    
        
   
}
