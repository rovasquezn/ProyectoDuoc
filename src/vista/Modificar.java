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
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jbtn_actualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlb_edad = new javax.swing.JLabel();
        jtxt_edad = new javax.swing.JTextField();
        jbtn_volver = new javax.swing.JButton();
        jtxt_rut = new javax.swing.JTextField();
        jtxt_gratuidad = new javax.swing.JTextField();
        jtxt_valor_matricula = new javax.swing.JTextField();
        jlb_nem = new javax.swing.JLabel();
        jlb_rut = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtn_buscar = new javax.swing.JButton();
        jlb_gratuidad = new javax.swing.JLabel();
        jtxt_id = new javax.swing.JTextField();
        jtxt_estado_matricula = new javax.swing.JTextField();
        jlb_id = new javax.swing.JLabel();
        jbtn_limpiar = new javax.swing.JButton();
        jlb_valor_matricula = new javax.swing.JLabel();
        jlb_estado_matricula = new javax.swing.JLabel();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_nem = new javax.swing.JTextField();
        jlb_nombre = new javax.swing.JLabel();
        jtxt_fecha_pago = new javax.swing.JTextField();
        jlb_appaterno = new javax.swing.JLabel();
        jlb_fecha_pago = new javax.swing.JLabel();
        jlb_apmaterno = new javax.swing.JLabel();
        jtxt_valor_matricula_pagar = new javax.swing.JTextField();
        jlb_carrera = new javax.swing.JLabel();
        jlb_fecha_pago1 = new javax.swing.JLabel();
        jlb_sede = new javax.swing.JLabel();
        jtxt_appaterno = new javax.swing.JTextField();
        jtxt_apmaterno = new javax.swing.JTextField();
        jtxt_sede = new javax.swing.JTextField();
        jtxt_carrera = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 754, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 204));
        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 310, 10));

        jbtn_actualizar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/cheque.png"))); // NOI18N
        jbtn_actualizar.setText("Modificar Datos");
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/logo2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        jlb_edad.setForeground(new java.awt.Color(0, 0, 0));
        jlb_edad.setText("Edad");
        jPanel1.add(jlb_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 46, 21));

        jtxt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_edadActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 60, -1));

        jbtn_volver.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_volver.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/volver (2).png"))); // NOI18N
        jbtn_volver.setText("Volver");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, -1));

        jtxt_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rutActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 119, -1));
        jPanel1.add(jtxt_gratuidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 171, -1));

        jtxt_valor_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_valor_matriculaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_valor_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 131, -1));

        jlb_nem.setForeground(new java.awt.Color(0, 0, 0));
        jlb_nem.setText("N.E.M");
        jPanel1.add(jlb_nem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, -1, -1));

        jlb_rut.setForeground(new java.awt.Color(0, 0, 0));
        jlb_rut.setText("R.U.T");
        jPanel1.add(jlb_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modificar Datos Estudiante");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jbtn_buscar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons8-búsqueda-de-propiedad-48.png"))); // NOI18N
        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 136, 41));

        jlb_gratuidad.setForeground(new java.awt.Color(0, 0, 0));
        jlb_gratuidad.setText("Gratuidad");
        jPanel1.add(jlb_gratuidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 75, -1));

        jtxt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 91, -1));

        jtxt_estado_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_estado_matriculaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_estado_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 137, -1));

        jlb_id.setForeground(new java.awt.Color(0, 0, 0));
        jlb_id.setText("Ingrese ID");
        jPanel1.add(jlb_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 75, 21));

        jbtn_limpiar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/limpieza-de-datos.png"))); // NOI18N
        jbtn_limpiar.setText("Limpiar");
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, -1, -1));

        jlb_valor_matricula.setForeground(new java.awt.Color(0, 0, 0));
        jlb_valor_matricula.setText("Valor Matricula");
        jPanel1.add(jlb_valor_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jlb_estado_matricula.setForeground(new java.awt.Color(0, 0, 0));
        jlb_estado_matricula.setText("Estado Matricula");
        jPanel1.add(jlb_estado_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, 22));

        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 286, -1));
        jPanel1.add(jtxt_nem, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 70, -1));

        jlb_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jlb_nombre.setText("Nombre");
        jPanel1.add(jlb_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 61, 21));
        jPanel1.add(jtxt_fecha_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 171, -1));

        jlb_appaterno.setForeground(new java.awt.Color(0, 0, 0));
        jlb_appaterno.setText("Apellido Paterno");
        jPanel1.add(jlb_appaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 121, 21));

        jlb_fecha_pago.setForeground(new java.awt.Color(0, 0, 0));
        jlb_fecha_pago.setText("Fecha Pago");
        jPanel1.add(jlb_fecha_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jlb_apmaterno.setForeground(new java.awt.Color(0, 0, 0));
        jlb_apmaterno.setText("Apellido Materno");
        jPanel1.add(jlb_apmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 124, 21));
        jPanel1.add(jtxt_valor_matricula_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 137, -1));

        jlb_carrera.setForeground(new java.awt.Color(0, 0, 0));
        jlb_carrera.setText("Carrera");
        jPanel1.add(jlb_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 59, 21));

        jlb_fecha_pago1.setForeground(new java.awt.Color(0, 0, 0));
        jlb_fecha_pago1.setText("Total Matricula");
        jPanel1.add(jlb_fecha_pago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jlb_sede.setForeground(new java.awt.Color(0, 0, 0));
        jlb_sede.setText("Sede");
        jPanel1.add(jlb_sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 44, 21));

        jtxt_appaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_appaternoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_appaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 287, -1));

        jtxt_apmaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_apmaternoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_apmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 240, -1));

        jtxt_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_sedeActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 350, -1));

        jtxt_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_carreraActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 290, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
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

    
    public void limpiarDatos(){
        this.jtxt_id.setText(null);
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
        
    }
          
    
    
    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed
    limpiarDatos();
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
    
    
    
     int opcion = JOptionPane.showConfirmDialog(this, "Está seguro que desea modificar los datos del Estudiandte?", "Actualizar", 0);

            if (opcion == 0) {
                proc.actualizarEstudiante(estudiante);
    JOptionPane.showMessageDialog(null, "Los datos del Estudiante han sido modificados con éxito", "Actualizar", 2);
    
            } else {
                JOptionPane.showMessageDialog(this, "Datos del estudiante no han sido modificados", "Actualizar", 2);
            }
    
    
    limpiarDatos();
    
   
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

    private void jtxt_valor_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_valor_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_valor_matriculaActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_volverActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JButton jbtn_volver;
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
