
package modelo;

/**
 * Proyecto Alumnos DUOC - Finanzas
 * @author Rodrigo Vásquez, Franco Navarrete, Cristian Ubilla
 */
public class Estudiante {
    
    private String nombre, apmaterno, appaterno, gratuidad;
    private int edad, id, rut;
    private double nem;
    private String dv;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apmaterno, String appaterno, String gratuidad, int edad, int id, int rut, double nem, String dv) {
        this.nombre = nombre;
        this.apmaterno = apmaterno;
        this.appaterno = appaterno;
        this.gratuidad = gratuidad;
        this.edad = edad;
        this.id = id;
        this.rut = rut;
        this.nem = nem;
        this.dv = dv;
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public double getNem() {
        return nem;
    }

    public void setNem(double nem) {
        this.nem = nem;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

   
   
}
