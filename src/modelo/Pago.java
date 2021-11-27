package modelo;

import java.util.Date;

/**
 * Proyecto Alumnos DUOC - Finanzas
 *
 * @author Rodrigo Vásquez, Franco Navarrete, Cristian Ubilla
 */
public class Pago {

    private String estado_matricula, estado_mensualidad, forma_pago_mensualidad, forma_pago_matricula, mes_a_pagar;
    private int valor_matricula, valor_mensualidad;
    private Date fecha_pago;

    public Pago() {
    }

    public Pago(String estado_matricula, String estado_mensualidad, String forma_pago_mensualidad, String forma_pago_matricula, String mes_a_pagar, int valor_matricula, int valor_mensualidad, Date fecha_pago) {
        this.estado_matricula = estado_matricula;
        this.estado_mensualidad = estado_mensualidad;
        this.forma_pago_mensualidad = forma_pago_mensualidad;
        this.forma_pago_matricula = forma_pago_matricula;
        this.mes_a_pagar = mes_a_pagar;
        this.valor_matricula = valor_matricula;
        this.valor_mensualidad = valor_mensualidad;
        this.fecha_pago = fecha_pago;
    }

    public String getEstado_matricula() {
        return estado_matricula;
    }

    public void setEstado_matricula(String estado_matricula) {
        this.estado_matricula = estado_matricula;
    }

    public String getEstado_mensualidad() {
        return estado_mensualidad;
    }

    public void setEstado_mensualidad(String estado_mensualidad) {
        this.estado_mensualidad = estado_mensualidad;
    }

    public String getForma_pago_mensualidad() {
        return forma_pago_mensualidad;
    }

    public void setForma_pago_mensualidad(String forma_pago_mensualidad) {
        this.forma_pago_mensualidad = forma_pago_mensualidad;
    }

    public String getForma_pago_matricula() {
        return forma_pago_matricula;
    }

    public void setForma_pago_matricula(String forma_pago_matricula) {
        this.forma_pago_matricula = forma_pago_matricula;
    }

    public String getMes_a_pagar() {
        return mes_a_pagar;
    }

    public void setMes_a_pagar(String mes_a_pagar) {
        this.mes_a_pagar = mes_a_pagar;
    }

    public int getValor_matricula() {
        return valor_matricula;
    }

    public void setValor_matricula(int valor_matricula) {
        this.valor_matricula = valor_matricula;
    }

    public int getValor_mensualidad() {
        return valor_mensualidad;
    }

    public void setValor_mensualidad(int valor_mensualidad) {
        this.valor_mensualidad = valor_mensualidad;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }


    
    
    
    
    public int calcularDescuento() {

        Estudiante estudiante = new Estudiante();

        // if (estudiante.getNem() >= 4.0 & estudiante.getNem() <=7.0){       validacion
        if (estudiante.getNem() >= 6.0 & estudiante.getNem() <= 7.0) {
            int descuento_matricula = (int) (valor_matricula * 0.3);
            this.valor_matricula = (valor_matricula - descuento_matricula);
        }
        return valor_matricula;

    }
    
//    public void verificarEstado(){
//        
//        if (this.estado_matricula.g)
//    }
    
    
    
    
    
}

