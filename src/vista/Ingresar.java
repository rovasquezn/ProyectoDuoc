/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Procedimiento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Estudiante;

/**
 *
 * @author Rodrigo Vasquez, Cristian Ubilla, Franco Navarrete - Proyecto Duoc
 */
public class Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
    public Ingresar() {
        initComponents();

        jtxt_nombre.setEnabled(false);
        jtxt_apmaterno.setEnabled(false);
        jtxt_appaterno.setEnabled(false);
        jtxt_edad.setEnabled(false);
        jrdb_tiene.setEnabled(false);
        jrdb_no_tiene.setEnabled(false);
        jtxt_nem.setEnabled(false);
        jbtn_ingresar.setEnabled(false);
        jbtn_limpiar.setEnabled(false);
        jcbox_sedes.setSelectedIndex(-1);
        jcbox_sedes.setEnabled(false);
        jcbox_carreras.setSelectedIndex(-1);
        jcbox_carreras.setEnabled(false);
        jtxt_valor_matricula.setEnabled(false);
        jcbox_dia.setSelectedIndex(-1);
        jcbox_dia.setEnabled(false);
        jcbox_mes.setSelectedIndex(-1);
        jcbox_mes.setEnabled(false);
        jcbox_anio.setSelectedIndex(-1);
        jcbox_anio.setEnabled(false);
        jcbox_estado_matricula.setSelectedIndex(-1);
        jcbox_estado_matricula.setEnabled(false);
        jbtn_verificar_nem.setEnabled(false);
        jtxt_valor_matricula_pagar.setEnabled(false);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jbtn_ingresar = new javax.swing.JButton();
        jbtn_volver = new javax.swing.JButton();
        jbtn_limpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jcbox_sedes = new javax.swing.JComboBox<>();
        jcbox_carreras = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcbox_estado_matricula = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtxt_valor_matricula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbox_dia = new javax.swing.JComboBox<>();
        jrdb_tiene = new javax.swing.JRadioButton();
        jcbox_mes = new javax.swing.JComboBox<>();
        jrdb_no_tiene = new javax.swing.JRadioButton();
        jcbox_anio = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtxt_nombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jtxt_appaterno = new javax.swing.JTextField();
        jbtn_verificar_nem = new javax.swing.JButton();
        jtxt_apmaterno = new javax.swing.JTextField();
        jtxt_edad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxt_rut_1 = new javax.swing.JTextField();
        jbtn_verificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtxt_valor_matricula_pagar = new javax.swing.JTextField();
        jtxt_nem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_ingresar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/entrar.png"))); // NOI18N
        jbtn_ingresar.setText("Ingresar Datos");
        jbtn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        jbtn_volver.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_volver.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/volver (2).png"))); // NOI18N
        jbtn_volver.setText("Volver");
        jbtn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, -1, -1));

        jbtn_limpiar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/limpieza-de-datos.png"))); // NOI18N
        jbtn_limpiar.setText("Limpiar");
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        jLabel11.setText("Estado Matricula");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel12.setText("Valor Matr??cula $");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel15.setText("Fecha de Pago Matricula");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        jLabel16.setText("Sede");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel17.setText("Carrera");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        jcbox_sedes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Valpara??so", "Vi??a del Mar", "Region Metropolitana Alameda", "Region Metropolitana Antonio Varas", "Region Metropolitana Maip??", "Region Metropolitana Melipilla", "Region Metropolitana Plaza Vespucio", "Concepcion", "Villarrica", "Puerto Montt" }));
        jcbox_sedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbox_sedesActionPerformed(evt);
            }
        });
        jPanel1.add(jcbox_sedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 230, -1));

        jcbox_carreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenier??a en Conectividad y Redes", "Ingenier??a en Inform??tica", "Analista Programador Computacional", "T??cno en Construccion", "Ingenier??a en Prevenci??n de Riesgos", "T??cnico Top??grafo", "Animacion Digital", "Ingenier??a en Sonido", "T??cnico Audiovidual", "Publicidad", "Dise??o Gr??fico", "Dise??o de Ambientes", "T??cnico en Enfermer??a", "T??cnico en Qu??mica y Farmacia" }));
        jPanel1.add(jcbox_carreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 320, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel6.setText("Apellido Materno");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jcbox_estado_matricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagado", "Gratuidad" }));
        jcbox_estado_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbox_estado_matriculaActionPerformed(evt);
            }
        });
        jPanel1.add(jcbox_estado_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel7.setText("Edad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jtxt_valor_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_valor_matriculaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_valor_matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 86, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel8.setText("Gratuidad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jcbox_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(jcbox_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 53, -1));

        buttonGroup1.add(jrdb_tiene);
        jrdb_tiene.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jrdb_tiene.setText("Tiene");
        jrdb_tiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdb_tieneActionPerformed(evt);
            }
        });
        jPanel1.add(jrdb_tiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        jcbox_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(jcbox_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 53, -1));

        buttonGroup1.add(jrdb_no_tiene);
        jrdb_no_tiene.setText("No Tiene");
        jrdb_no_tiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdb_no_tieneActionPerformed(evt);
            }
        });
        jPanel1.add(jrdb_no_tiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        jcbox_anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022" }));
        jPanel1.add(jcbox_anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        jLabel9.setText("Nota Ense??anza Media (N.E.M)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 138, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 204));
        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 350, 10));

        jtxt_appaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_appaternoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_appaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 155, -1));

        jbtn_verificar_nem.setText("Verificar N.E.M");
        jbtn_verificar_nem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_verificar_nemActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_verificar_nem, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, -1, -1));
        jPanel1.add(jtxt_apmaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 154, -1));
        jPanel1.add(jtxt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 47, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/logo2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, 36));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Ingreso de datos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Ingrese R.U.T.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jtxt_rut_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rut_1ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_rut_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 116, -1));

        jbtn_verificar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_verificar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_verificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/verificado.png"))); // NOI18N
        jbtn_verificar.setText("Verificar");
        jbtn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_verificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 682, 10));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("Apellido Paterno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jLabel13.setText("Total Matricula $");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jtxt_valor_matricula_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_valor_matricula_pagarActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_valor_matricula_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 85, -1));

        jtxt_nem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nemActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_nem, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 44, -1));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Ej: 11111111-1");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 204));
        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 440, 10));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo.png"))); // NOI18N
        jLabel14.setText("ssss");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarDatos() {
        this.jtxt_rut_1.setText("");
        this.jtxt_nombre.setText("");
        this.jtxt_apmaterno.setText("");
        this.jtxt_appaterno.setText("");
        this.jtxt_edad.setText("");

        this.jtxt_nem.setText("");
        buttonGroup1.clearSelection();
        jcbox_sedes.setSelectedIndex(-1);
        jcbox_sedes.setEnabled(false);
        jcbox_carreras.setSelectedIndex(-1);
        jcbox_carreras.setEnabled(false);
        jtxt_valor_matricula.setEnabled(false);
        this.jtxt_valor_matricula.setText("");
        jcbox_dia.setSelectedIndex(-1);
        jcbox_dia.setEnabled(false);
        jcbox_mes.setSelectedIndex(-1);
        jcbox_mes.setEnabled(false);
        jcbox_anio.setSelectedIndex(-1);
        jcbox_anio.setEnabled(false);
        jcbox_estado_matricula.setSelectedIndex(-1);
        jcbox_estado_matricula.setEnabled(false);
         jtxt_valor_matricula_pagar.setEnabled(false);
        jtxt_valor_matricula_pagar.setEditable(false);
    }

    private void jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombreActionPerformed

    private void jtxt_rut_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_rut_1ActionPerformed

    }//GEN-LAST:event_jtxt_rut_1ActionPerformed

    private void jbtn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_verificarActionPerformed

        String rut;

        rut = this.jtxt_rut_1.getText();

        if (rut.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El RUT no puede estar vac??o", "Validaci??n", 1);
            this.jtxt_rut_1.requestFocus();
            return;
        } else {
            if(!this.jtxt_rut_1.getText().contains("-")){
                JOptionPane.showMessageDialog(this, "El RUT no es valido, Reintente.", "Validaci??n", 1);
                this.jtxt_rut_1.requestFocus();
                return;
            }

            boolean flag;
            Procedimiento proce = new Procedimiento();
            proce.buscarEstudiantePorRut(rut);
            flag = proce.buscarEstudiantePorRutBandera(rut);
            if (flag == true) {
                JOptionPane.showMessageDialog(this, "El estudiante ya fue ingresado anteriormente", "Validaci??n", 2);

            } else {
                JOptionPane.showMessageDialog(this, "El estudiante no existe, puede ingresar los datos", "Validaci??n", 1);
                jtxt_nombre.setEnabled(true);
                jtxt_apmaterno.setEnabled(true);
                jtxt_appaterno.setEnabled(true);
                jtxt_edad.setEnabled(true);
                jrdb_tiene.setEnabled(true);
                jrdb_no_tiene.setEnabled(true);
                jtxt_nem.setEnabled(true);
                jbtn_ingresar.setEnabled(false);
                jbtn_limpiar.setEnabled(true);

                jcbox_sedes.setSelectedIndex(-1);
                jcbox_sedes.setEnabled(true);
                jcbox_carreras.setSelectedIndex(-1);
                jcbox_carreras.setEnabled(true);
                jtxt_valor_matricula.setEnabled(true);
                jcbox_dia.setSelectedIndex(-1);
                jcbox_dia.setEnabled(true);
                jcbox_mes.setSelectedIndex(-1);
                jcbox_mes.setEnabled(true);
                jcbox_anio.setSelectedIndex(-1);
                jcbox_anio.setEnabled(true);
                jcbox_estado_matricula.setSelectedIndex(-1);
                jcbox_estado_matricula.setEnabled(true);
                 jbtn_verificar_nem.setEnabled(true);
                 jtxt_valor_matricula_pagar.setEnabled(true);
                jtxt_valor_matricula_pagar.setEditable(false);
                
                
                
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_verificarActionPerformed

    private void jbtn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ingresarActionPerformed

        String rut, nombre, apmaterno, appaterno, gratuidad = "";
        int edad, id;
        double nem;
        String estado_matricula;
        int valor_matricula, valor_matricula_pagar;
        Date fecha_pago_matricula;
        String nombre_carrera, nombre_sede, fechaCadena;

        rut = this.jtxt_rut_1.getText();

        nombre = this.jtxt_nombre.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nombre no puede estar vacio", "Validaci??n", 1);
            this.jtxt_nombre.requestFocus();
            return;
        }

        appaterno = this.jtxt_appaterno.getText();
        if (appaterno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Apellido Paterno no puede estar vacio", "Validaci??n", 1);
            this.jtxt_appaterno.requestFocus();
            return;
        }

        apmaterno = this.jtxt_apmaterno.getText();
        if (apmaterno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Apellido Materno no puede estar vacio", "Validaci??n", 1);
            this.jtxt_apmaterno.requestFocus();
            return;
        }

        if (this.jrdb_tiene.isSelected()) {
            gratuidad = "Tiene";

        }
        if (this.jrdb_no_tiene.isSelected()) {
            gratuidad = "No tiene";

        }

        try {
            edad = Integer.parseInt(this.jtxt_edad.getText());

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "La edad debe ser un numero", "Validaci??n", 1);
            this.jtxt_edad.requestFocus();
            return;
        }

        try {
            nem = Double.parseDouble(this.jtxt_nem.getText());
            
          
            if (nem< 4.0 || nem > 7.0 ){
                JOptionPane.showMessageDialog(this, "Nota debe ser entre 4.0 y 7.0", "Validaci??n", 1);
            this.jtxt_nem.requestFocus();
             
         }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "La nota debe ser un numero", "Validaci??n", 1);
            this.jtxt_nem.requestFocus();
            return;
        }

        
        
        
        
         nombre_sede = this.jcbox_sedes.getSelectedItem().toString();
 
        nombre_carrera = this.jcbox_carreras.getSelectedItem().toString();

        estado_matricula = this.jcbox_estado_matricula.getSelectedItem().toString();

        try {
            valor_matricula = Integer.parseInt(this.jtxt_valor_matricula.getText());

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El valor debe ser un numero", "Validaci??n", 1);
            this.jtxt_valor_matricula.requestFocus();

            return;

        }

        String dia = this.jcbox_dia.getSelectedItem().toString();
        String mes = this.jcbox_mes.getSelectedItem().toString();
        String anio = this.jcbox_anio.getSelectedItem().toString();

        fechaCadena = dia+"/"+mes+"/"+anio;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            fecha_pago_matricula = formato.parse(fechaCadena);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato dd/mm/aaaa", "Validaci??n", 1);
            this.jcbox_dia.requestFocus();
            return;
        }


        
        valor_matricula_pagar = Integer.parseInt(this.jtxt_valor_matricula_pagar.getText());
        
        
        Estudiante estudiante = new Estudiante(rut, nombre, apmaterno, appaterno, gratuidad, edad, 0, nem, estado_matricula, valor_matricula, valor_matricula_pagar, fecha_pago_matricula, nombre_carrera, nombre_sede);

        Procedimiento proce = new Procedimiento();

        if (proce.ingresarEstudiante(estudiante)) {

            int salida = JOptionPane.showConfirmDialog(null, "Datos agregados exitosamente, desea agregar otro estudiante?", "Informacion", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

            switch (salida) {
                case 0:
                    //0 es SI
                    jtxt_nombre.setEnabled(false);
                    jtxt_apmaterno.setEnabled(false);
                    jtxt_appaterno.setEnabled(false);
                    jtxt_edad.setEnabled(false);
                    jrdb_tiene.setEnabled(false);
                    jrdb_no_tiene.setEnabled(false);
                    jtxt_nem.setEnabled(false);
                    jbtn_ingresar.setEnabled(false);

                    jcbox_sedes.setSelectedIndex(-1);
                    jcbox_sedes.setEnabled(false);
                    jcbox_carreras.setSelectedIndex(-1);
                    jcbox_carreras.setEnabled(false);
                    jtxt_valor_matricula.setEnabled(false);
                    jcbox_dia.setSelectedIndex(-1);
                    jcbox_dia.setEnabled(false);
                    jcbox_mes.setSelectedIndex(-1);
                    jcbox_mes.setEnabled(false);
                    jcbox_anio.setSelectedIndex(-1);
                    jcbox_anio.setEnabled(false);
                    jcbox_estado_matricula.setSelectedIndex(-1);
                    jcbox_estado_matricula.setEnabled(false);
                    jtxt_valor_matricula_pagar.setEnabled(false);
                    jtxt_valor_matricula_pagar.setEditable(false);

                    limpiarDatos();

                    this.jtxt_rut_1.requestFocus();
                    break;
                case 1:
                    //1 es NO

                    dispose();
            }

        } else {
            JOptionPane.showMessageDialog(this, "No se agregaron los datos del estudiante", "Aviso", 1);
        }

    }//GEN-LAST:event_jbtn_ingresarActionPerformed

    private void jbtn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverActionPerformed
        dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_volverActionPerformed

    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed
        limpiarDatos();
        jtxt_nombre.setEnabled(false);
        jtxt_apmaterno.setEnabled(false);
        jtxt_appaterno.setEnabled(false);
        jtxt_edad.setEnabled(false);
        jrdb_tiene.setEnabled(false);
        jrdb_no_tiene.setEnabled(false);
        jtxt_nem.setEnabled(false);
        jbtn_ingresar.setEnabled(false);
        jbtn_limpiar.setEnabled(false);
        jcbox_sedes.setSelectedIndex(-1);
        jcbox_carreras.setSelectedIndex(-1);
        jtxt_valor_matricula.setEnabled(false);
        jcbox_dia.setSelectedIndex(-1);
        jcbox_mes.setSelectedIndex(-1);
        jcbox_anio.setSelectedIndex(-1);
        jcbox_estado_matricula.setSelectedIndex(-1);
        jtxt_valor_matricula_pagar.setEnabled(false);
         jbtn_verificar_nem.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_limpiarActionPerformed

    private void jtxt_appaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_appaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_appaternoActionPerformed

    private void jcbox_sedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbox_sedesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbox_sedesActionPerformed

    private void jtxt_valor_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_valor_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_valor_matriculaActionPerformed

    private void jtxt_nemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nemActionPerformed
    

        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtxt_nemActionPerformed

    private void jbtn_verificar_nemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_verificar_nemActionPerformed
     
        calcularDescuento();
        

// TODO add your handling code here:
    }//GEN-LAST:event_jbtn_verificar_nemActionPerformed

    private void jtxt_valor_matricula_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_valor_matricula_pagarActionPerformed
            // jtxt_total_matricula.setText();      
             

// TODO add your handling code here:
    }//GEN-LAST:event_jtxt_valor_matricula_pagarActionPerformed

    private void jcbox_estado_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbox_estado_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbox_estado_matriculaActionPerformed

    private void jrdb_tieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdb_tieneActionPerformed
     if (this.jrdb_tiene.isSelected()){
                    jbtn_verificar_nem.setEnabled(false);
                    jbtn_ingresar.setEnabled(true);
                    
                     jtxt_valor_matricula_pagar.setText(String.valueOf(0));
            
            JOptionPane.showMessageDialog(this, "El estudiante " + this.jtxt_nombre.getText() + " "+ this.jtxt_appaterno.getText() + " " + this.jtxt_apmaterno.getText() + "\n\n" + "No paga Matricula", "Aviso", 1);
                     
                    
                    
                }   // TODO add your handling code here:
    }//GEN-LAST:event_jrdb_tieneActionPerformed

    private void jrdb_no_tieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdb_no_tieneActionPerformed
       if (this.jrdb_no_tiene.isSelected()){
                    jbtn_verificar_nem.setEnabled(true);
                    
                } // TODO add your handling code here:
    }//GEN-LAST:event_jrdb_no_tieneActionPerformed

    private int calcularDescuento(){
   Double nem = Double.parseDouble(this.jtxt_nem.getText());
    int valor_matricula = Integer.parseInt(this.jtxt_valor_matricula.getText());
    int valor_matricula_pagar=0;
        if (nem>= 6.0 && nem <= 7.0 ){
            valor_matricula_pagar = (int) (valor_matricula-(valor_matricula*0.30));
         
              jtxt_valor_matricula_pagar.setText(String.valueOf(valor_matricula_pagar));
            
            JOptionPane.showMessageDialog(this, "Nota ingresada: " + Double.parseDouble(this.jtxt_nem.getText()) + "\n\n" + "Califica para descuento Matr??cula (30%)", "Aviso", 1);
            jbtn_ingresar.setEnabled(true);
            return valor_matricula_pagar;
   
        }
        else{
            if(nem < 4.0 || nem > 7.0 ){
             JOptionPane.showMessageDialog(this, "Nota no v??lida", "Aviso", 1); 
             this.jtxt_valor_matricula_pagar.setText("");
              this.jtxt_nem.requestFocus(); 
              return valor_matricula;
            }   
                
            else{       
                
             JOptionPane.showMessageDialog(this, "Nota ingresada: " + Double.parseDouble(this.jtxt_nem.getText()) + "\n\n" + "No califica para descuento Matr??cula (30%)", "Aviso", 1);
             jtxt_valor_matricula_pagar.setText(String.valueOf(valor_matricula));
                 jbtn_ingresar.setEnabled(true);
        return valor_matricula;
            }
           
        
        
        }
        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Ingresar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbtn_ingresar;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JButton jbtn_verificar;
    private javax.swing.JButton jbtn_verificar_nem;
    private javax.swing.JButton jbtn_volver;
    private javax.swing.JComboBox<String> jcbox_anio;
    private javax.swing.JComboBox<String> jcbox_carreras;
    private javax.swing.JComboBox<String> jcbox_dia;
    private javax.swing.JComboBox<String> jcbox_estado_matricula;
    private javax.swing.JComboBox<String> jcbox_mes;
    private javax.swing.JComboBox<String> jcbox_sedes;
    private javax.swing.JRadioButton jrdb_no_tiene;
    private javax.swing.JRadioButton jrdb_tiene;
    private javax.swing.JTextField jtxt_apmaterno;
    private javax.swing.JTextField jtxt_appaterno;
    private javax.swing.JTextField jtxt_edad;
    private javax.swing.JTextField jtxt_nem;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_rut_1;
    private javax.swing.JTextField jtxt_valor_matricula;
    private javax.swing.JTextField jtxt_valor_matricula_pagar;
    // End of variables declaration//GEN-END:variables
}
