
package modelo;

/**
 * Proyecto Alumnos DUOC - Finanzas
 * @author Rodrigo Vásquez, Franco Navarrete, Cristian Ubilla
 */
public class Estudiante {
    
    private String rut,nombre, apmaterno, appaterno, gratuidad;
    private int edad, id;
    private double nem;

    public Estudiante() {
    }

    public Estudiante(String rut, String nombre, String apmaterno, String appaterno, String gratuidad, int edad, int id, double nem) {
        this.rut = rut;
        this.nombre = nombre;
        this.apmaterno = apmaterno;
        this.appaterno = appaterno;
        this.gratuidad = gratuidad;
        this.edad = edad;
        this.id = id;
        this.nem = nem;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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