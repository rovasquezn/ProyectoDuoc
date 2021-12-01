package vista;
import modelo.Estudiante;
import controlador.Procedimiento;
import java.sql.PreparedStatement;
import db_conexion.Conexion;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Modificar extends javax.swing.JFrame {
    
Procedimiento proc = new Procedimiento();
    
    public Modificar() {
        initComponents();
        this.jtxt_id.setEditable(true);
        this.jtxt_appaterno.setEditable(false);
        this.jtxt_apmaterno.setEditable(false);
        this.jtxt_carrera.setEditable(false);
        this.jtxt_sede.setEditable(false);
        this.jtxt_edad.setEditable(false);
        this.jtxt_nombre.setEditable(false);
        this.jtxt_estado_matricula.setEditable(false);
        this.jtxt_fecha_pago.setEditable(false);
        this.jtxt_valor_matricula.setEditable(false);
        this.jtxt_valor_matricula_pagar.setEditable(false);
        this.jtxt_gratuidad.setEditable(false);
        this.jtxt_nem.setEditable(false);
        this.jtxt_rut.setEditable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jtxt_id = new javax.swing.JTextField();
        jlb_id = new javax.swing.JLabel();
        jbtn_limpiar = new javax.swing.JButton();
        jtxt_nombre = new javax.swing.JTextField();
        jlb_nombre = new javax.swing.JLabel();
        jlb_appaterno = new javax.swing.JLabel();
        jlb_apmaterno = new javax.swing.JLabel();
        jlb_carrera = new javax.swing.JLabel();
        jlb_sede = new javax.swing.JLabel();
        jtxt_appaterno = new javax.swing.JTextField();
        jtxt_apmaterno = new javax.swing.JTextField();
        jtxt_sede = new javax.swing.JTextField();
        jtxt_carrera = new javax.swing.JTextField();
        jbtn_actualizar = new javax.swing.JButton();
        jlb_edad = new javax.swing.JLabel();
        jtxt_edad = new javax.swing.JTextField();
        jtxt_rut = new javax.swing.JTextField();
        jtxt_gratuidad = new javax.swing.JTextField();
        jtxt_valor_matricula = new javax.swing.JTextField();
        jlb_nem = new javax.swing.JLabel();
        jlb_rut = new javax.swing.JLabel();
        jlb_gratuidad = new javax.swing.JLabel();
        jtxt_estado_matricula = new javax.swing.JTextField();
        jlb_valor_matricula = new javax.swing.JLabel();
        jlb_estado_matricula = new javax.swing.JLabel();
        jtxt_nem = new javax.swing.JTextField();
        jtxt_fecha_pago = new javax.swing.JTextField();
        jlb_fecha_pago = new javax.swing.JLabel();
        jtxt_valor_matricula_pagar = new javax.swing.JTextField();
        jlb_fecha_pago1 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        jtxt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idActionPerformed(evt);
            }
        });

        jlb_id.setText("ID");

        jbtn_limpiar.setText("Limpiar");
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });

        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });

        jlb_nombre.setText("Nombre");

        jlb_appaterno.setText("Primer Apellido");

        jlb_apmaterno.setText("Segundo Apellido");

        jlb_carrera.setText("Carrera");

        jlb_sede.setText("Sede");

        jtxt_appaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_appaternoActionPerformed(evt);
            }
        });

        jtxt_apmaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_apmaternoActionPerformed(evt);
            }
        });

        jtxt_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_sedeActionPerformed(evt);
            }
        });

        jtxt_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_carreraActionPerformed(evt);
            }
        });

        jbtn_actualizar.setText("Actualizar");
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });

        jlb_edad.setText("Edad");

        jtxt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_edadActionPerformed(evt);
            }
        });

        jtxt_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rutActionPerformed(evt);
            }
        });

        jlb_nem.setText("NEM");

        jlb_rut.setText("RUT");

        jlb_gratuidad.setText("Gratuidad");

        jtxt_estado_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_estado_matriculaActionPerformed(evt);
            }
        });

        jlb_valor_matricula.setText("Valor Matricula");

        jlb_estado_matricula.setText("Estado Matricula");

        jlb_fecha_pago.setText("Fecha Pago");

        jlb_fecha_pago1.setText("Total Matricula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbtn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jbtn_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_actualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlb_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlb_appaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxt_appaterno))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlb_apmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxt_apmaterno)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlb_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxt_edad))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtxt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_sede, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlb_rut))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_sede, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxt_nem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlb_nem))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlb_valor_matricula)
                                    .addComponent(jlb_gratuidad)
                                    .addComponent(jlb_estado_matricula)
                                    .addComponent(jlb_fecha_pago))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlb_fecha_pago1)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxt_fecha_pago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_valor_matricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_gratuidad, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_valor_matricula_pagar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxt_estado_matricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_buscar)
                    .addComponent(jbtn_actualizar)
                    .addComponent(jtxt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_gratuidad)
                    .addComponent(jtxt_gratuidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_appaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_appaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_valor_matricula)
                    .addComponent(jtxt_valor_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_apmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_apmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_estado_matricula)
                    .addComponent(jtxt_estado_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_fecha_pago)
                    .addComponent(jtxt_fecha_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_valor_matricula_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_fecha_pago1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_sede, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_rut)
                    .addComponent(jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlb_nem)
                    .addComponent(jtxt_nem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jbtn_limpiar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_idActionPerformed
        int id = Integer.parseInt(this.jtxt_id.getText());
        
        Estudiante estudiante = proc.buscarEstudiantePorId(id);
        
        String rut = estudiante.getRut();
        String nombre = estudiante.getNombre();
        String appaterno = estudiante.getAppaterno();
        String apmaterno = estudiante.getApmaterno();
        int edad = estudiante.getEdad();
        String gratuidad = estudiante.getGratuidad();
        double nem = estudiante.getNem();
        String carrera = estudiante.getNombre_carrera();
        String sede = estudiante.getNombre_sede();
        Date fecha_pago = estudiante.getFecha_pago_matricula();
        int valor_matricula = estudiante.getValor_matricula();
        int valor_matricula_pagar = estudiante.getValor_matricula_pagar();
        String estado_matricula = estudiante.getEstado_matricula();
        
        this.jtxt_nombre.setText(nombre);
        this.jtxt_appaterno.setText(appaterno);
        this.jtxt_apmaterno.setText(apmaterno);
        this.jtxt_edad.setText(String.valueOf(edad));
        this.jtxt_valor_matricula.setText(String.valueOf(valor_matricula));
        this.jtxt_valor_matricula_pagar.setText(String.valueOf(valor_matricula_pagar));
        this.jtxt_valor_matricula_pagar.setText(String.valueOf(valor_matricula_pagar));
        this.jtxt_gratuidad.setText(gratuidad);
        this.jtxt_carrera.setText(carrera);
        this.jtxt_nem.setText(String.valueOf(nem));
        this.jtxt_rut.setText(rut);
        this.jtxt_estado_matricula.setText(estado_matricula);
        this.jtxt_fecha_pago.setText("" + fecha_pago);
        this.jtxt_sede.setText(sede);
        
    }//GEN-LAST:event_jtxt_idActionPerformed

    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed
       this.jtxt_nombre.setText(null);
       this.jtxt_appaterno.setText(null);
       this.jtxt_apmaterno.setText(null);
       this.jtxt_sede.setText(null);
       this.jtxt_carrera.setText(null);
       this.jtxt_edad.setText(null);
       this.jtxt_estado_matricula.setText(null);
       this.jtxt_valor_matricula.setText(null);
       this.jtxt_valor_matricula_pagar.setText(null);
       this.jtxt_fecha_pago.setText(null);
       this.jtxt_gratuidad.setText(null);
       this.jtxt_rut.setText(null);
       this.jtxt_nem.setText(null);
    }//GEN-LAST:event_jbtn_limpiarActionPerformed

    private void jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreActionPerformed
        this.jtxt_nombre.requestFocus();
    }//GEN-LAST:event_jtxt_nombreActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        this.jtxt_id.setEditable(true);
        

        int id = Integer.parseInt(this.jtxt_id.getText());
        
        Estudiante estudiante = proc.buscarEstudiantePorId(id);
        
        String nombre = estudiante.getNombre();
        String appaterno = estudiante.getAppaterno();
        String apmaterno = estudiante.getApmaterno();
        int edad = estudiante.getEdad();
        String rut = estudiante.getRut();
        String gratuidad = estudiante.getGratuidad();
        double nem = estudiante.getNem();
        String carrera = estudiante.getNombre_carrera();
        String sede = estudiante.getNombre_sede();
        Date fecha_pago = estudiante.getFecha_pago_matricula();
        String estado_matricula = estudiante.getEstado_matricula();
        int valor_matricula = estudiante.getValor_matricula();
        int valor_matricula_pagar = estudiante.getValor_matricula_pagar();
        
        this.jtxt_nombre.setText(nombre);
        this.jtxt_appaterno.setText(appaterno);
        this.jtxt_apmaterno.setText(apmaterno);
        this.jtxt_edad.setText(String.valueOf(edad));
        this.jtxt_valor_matricula.setText(String.valueOf(valor_matricula));
        this.jtxt_valor_matricula_pagar.setText(String.valueOf(valor_matricula_pagar));
        this.jtxt_gratuidad.setText(gratuidad);
        this.jtxt_carrera.setText(carrera);
        this.jtxt_nem.setText(String.valueOf(nem));
        this.jtxt_rut.setText(rut);
        this.jtxt_estado_matricula.setText(estado_matricula);
        this.jtxt_fecha_pago.setText("" + fecha_pago);
        this.jtxt_sede.setText(sede);
        
        this.jtxt_appaterno.setEditable(true);
        this.jtxt_apmaterno.setEditable(true);
        this.jtxt_carrera.setEditable(true);
        this.jtxt_sede.setEditable(true);
        this.jtxt_edad.setEditable(true);
        this.jtxt_nombre.setEditable(true);
        this.jtxt_estado_matricula.setEditable(true);
        this.jtxt_fecha_pago.setEditable(true);
        this.jtxt_valor_matricula.setEditable(true);
        this.jtxt_valor_matricula_pagar.setEditable(true);
        this.jtxt_gratuidad.setEditable(true);
        this.jtxt_nem.setEditable(true);
        this.jtxt_rut.setEditable(true);
        
        
        
    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void jtxt_appaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_appaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_appaternoActionPerformed

    private void jtxt_apmaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_apmaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_apmaternoActionPerformed

    private void jtxt_sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_sedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_sedeActionPerformed

    private void jtxt_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_carreraActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed
        
    String rut, nombre, apmaterno, appaterno, gratuidad, nombre_carrera, nombre_sede, estado_matricula;
    int edad, id, valor_matricula, valor_matricula_pagar;
    double nem;
    
    Date fecha_pago_matricula = null;
    id = Integer.parseInt(this.jtxt_id.getText());
    nombre = this.jtxt_nombre.getText();
    appaterno = this.jtxt_appaterno.getText();
    apmaterno = this.jtxt_apmaterno.getText();
    edad = Integer.parseInt(this.jtxt_edad.getText());
    gratuidad = this.jtxt_gratuidad.getText();
    nem = Double.parseDouble(this.jtxt_nem.getText());
    rut = this.jtxt_rut.getText();
    nombre_carrera = this.jtxt_carrera.getText();
    nombre_sede = this.jtxt_sede.getText();
    estado_matricula = this.jtxt_estado_matricula.getText();
    valor_matricula = Integer.parseInt(this.jtxt_valor_matricula.getText());
    valor_matricula_pagar = Integer.parseInt(this.jtxt_valor_matricula_pagar.getText());
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    
    try{
    fecha_pago_matricula = formato.parse(this.jtxt_fecha_pago.getText());
    
    } catch (ParseException e) {
        System.out.println("Error al actualizar la fecha" + e.getMessage());
    }
    
    Estudiante estudiante = new Estudiante(rut, nombre, apmaterno, appaterno, gratuidad, edad, id, nem, estado_matricula, valor_matricula, valor_matricula_pagar, fecha_pago_matricula, nombre_carrera, nombre_sede);
    
    proc.actualizarEstudiante(estudiante);
    JOptionPane.showMessageDialog(null, "Datos Actualizados", "Aviso", 2);
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

    private void jtxt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_edadActionPerformed

    private void jtxt_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_rutActionPerformed

    private void jtxt_estado_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_estado_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_estado_matriculaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JLabel jlb_apmaterno;
    private javax.swing.JLabel jlb_appaterno;
    private javax.swing.JLabel jlb_carrera;
    private javax.swing.JLabel jlb_edad;
    private javax.swing.JLabel jlb_estado_matricula;
    private javax.swing.JLabel jlb_fecha_pago;
    private javax.swing.JLabel jlb_fecha_pago1;
    private javax.swing.JLabel jlb_gratuidad;
    private javax.swing.JLabel jlb_id;
    private javax.swing.JLabel jlb_nem;
    private javax.swing.JLabel jlb_nombre;
    private javax.swing.JLabel jlb_rut;
    private javax.swing.JLabel jlb_sede;
    private javax.swing.JLabel jlb_valor_matricula;
    private javax.swing.JTextField jtxt_apmaterno;
    private javax.swing.JTextField jtxt_appaterno;
    private javax.swing.JTextField jtxt_carrera;
    private javax.swing.JTextField jtxt_edad;
    private javax.swing.JTextField jtxt_estado_matricula;
    private javax.swing.JTextField jtxt_fecha_pago;
    private javax.swing.JTextField jtxt_gratuidad;
    private javax.swing.JTextField jtxt_id;
    private javax.swing.JTextField jtxt_nem;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_rut;
    private javax.swing.JTextField jtxt_sede;
    private javax.swing.JTextField jtxt_valor_matricula;
    private javax.swing.JTextField jtxt_valor_matricula_pagar;
    // End of variables declaration//GEN-END:variables
}
