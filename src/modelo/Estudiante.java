
package modelo;

import java.util.Date;

/**
 * Proyecto Alumnos DUOC - Finanzas
 * @author Rodrigo Vásquez, Franco Navarrete, Cristian Ubilla
 */
public class Estudiante {
    
    private String rut,nombre, apmaterno, appaterno, gratuidad;
    private int edad, id;
    private double nem;
    private String estado_matricula;
    private int valor_matricula, valor_matricula_pagar;
    private Date fecha_pago_matricula;
    private String nombre_carrera, nombre_sede;

    public Estudiante() {
    }

    public Estudiante(String rut, String nombre, String apmaterno, String appaterno, String gratuidad, int edad, int id, double nem, String estado_matricula, int valor_matricula, int valor_matricula_pagar, Date fecha_pago_matricula, String nombre_carrera, String nombre_sede) {
        this.rut = rut;
        this.nombre = nombre;
        this.apmaterno = apmaterno;
        this.appaterno = appaterno;
        this.gratuidad = gratuidad;
        this.edad = edad;
        this.id = id;
        this.nem = nem;
        this.estado_matricula = estado_matricula;
        this.valor_matricula = valor_matricula;
        this.valor_matricula_pagar = valor_matricula_pagar;
        this.fecha_pago_matricula = fecha_pago_matricula;
        this.nombre_carrera = nombre_carrera;
        this.nombre_sede = nombre_sede;
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

    public String getEstado_matricula() {
        return estado_matricula;
    }

    public void setEstado_matricula(String estado_matricula) {
        this.estado_matricula = estado_matricula;
    }

    public int getValor_matricula() {
        return valor_matricula;
    }

    public void setValor_matricula(int valor_matricula) {
        this.valor_matricula = valor_matricula;
    }

    public int getValor_matricula_pagar() {
        return valor_matricula_pagar;
    }

    public void setValor_matricula_pagar(int valor_matricula_pagar) {
        this.valor_matricula_pagar = valor_matricula_pagar;
    }

    public Date getFecha_pago_matricula() {
        return fecha_pago_matricula;
    }

    public void setFecha_pago_matricula(Date fecha_pago_matricula) {
        this.fecha_pago_matricula = fecha_pago_matricula;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getNombre_sede() {
        return nombre_sede;
    }

    public void setNombre_sede(String nombre_sede) {
        this.nombre_sede = nombre_sede;
    }

   
    
}