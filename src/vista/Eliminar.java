/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Procedimiento;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Estudiante;

/**
 *
 * @author Rodrigo Vasquez, Cristian Ubilla, Franco Navarrete - Proyecto Duoc
 */
public class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
        initComponents();
        jtxt_rut.setEnabled(false);
        jtxt_id.setEnabled(false);
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
        jPanel1 = new javax.swing.JPanel();
        jbt_volver = new javax.swing.JButton();
        jbtn_buscar = new javax.swing.JButton();
        jrb_id = new javax.swing.JRadioButton();
        jrb_rut = new javax.swing.JRadioButton();
        jtxt_id = new javax.swing.JTextField();
        jtxt_rut = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_datos = new javax.swing.JTable();
        jbtn_eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbt_volver.setBackground(new java.awt.Color(51, 51, 51));
        jbt_volver.setForeground(new java.awt.Color(255, 255, 255));
        jbt_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/volver (2).png"))); // NOI18N
        jbt_volver.setText("Volver");
        jbt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volverActionPerformed(evt);
            }
        });
        jPanel1.add(jbt_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, -1, -1));

        jbtn_buscar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icons8-búsqueda-de-propiedad-48.png"))); // NOI18N
        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, -1, -1));

        buttonGroup1.add(jrb_id);
        jrb_id.setText("Buscar por ID");
        jrb_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_idActionPerformed(evt);
            }
        });
        jPanel1.add(jrb_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        buttonGroup1.add(jrb_rut);
        jrb_rut.setText("Buscar por R.U.T.");
        jrb_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_rutActionPerformed(evt);
            }
        });
        jPanel1.add(jrb_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, -1));
        jPanel1.add(jtxt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 180, -1));

        jtxt_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rutActionPerformed(evt);
            }
        });
        jPanel1.add(jtxt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 160, -1));

        jtbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "R.U.T", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "N.E.M", "Gratuidad", "Carrera", "Sede", "Estado Matricula", "Fecha Pago", "Matricula", "Valor Pagado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_datos);
        if (jtbl_datos.getColumnModel().getColumnCount() > 0) {
            jtbl_datos.getColumnModel().getColumn(5).setResizable(false);
            jtbl_datos.getColumnModel().getColumn(10).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 1450, 100));

        jbtn_eliminar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/eliminar.png"))); // NOI18N
        jbtn_eliminar.setText("Eliminar");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Eliminar Estudiante");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/logo2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo_largo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1472, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_rutActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        
        String rut, nombre, appaterno, apmaterno, gratuidad, estado_matricula, nombre_carrera, nombre_sede;
                    int edad, id, valor_matricula, valor_matricula_pagar;
                    double nem;
                    Date fecha_pago_matricula;
       
                    
                    Procedimiento proce = new Procedimiento();
        if (this.jrb_rut.isSelected()) {
           
            rut = this.jtxt_rut.getText();
            if (rut.isEmpty()) {

                JOptionPane.showMessageDialog(this, "El RUT no puede estar vacío", "Validación", 1);
                this.jtxt_rut.requestFocus();
                return;
            } else {
                 if(!this.jtxt_rut.getText().contains("-")){
                JOptionPane.showMessageDialog(this, "El RUT no es valido, Reintente.", "Validación", 1);
                this.jtxt_rut.requestFocus();
                return;
            }

                //si el estudiante no existe
                boolean flag;
                // Procedimiento proce = new Procedimiento();
                proce.buscarEstudiantePorRut(rut);
                flag = proce.buscarEstudiantePorRutBandera(rut);
                if (flag == false) {
                    JOptionPane.showMessageDialog(this, "El estudiante no existe en la base de datos", "Validación", 1);
                    this.jtxt_rut.setText("");
                    this.jtxt_rut.requestFocus();
                } //si el estudiante exixte
                else {
                    

                    DefaultTableModel tablaDatos = (DefaultTableModel) this.jtbl_datos.getModel();
                        
                    //Objeto
                    Estudiante estudiante = proce.buscarEstudiantePorRut(rut);

                    id = estudiante.getId();
                    rut = estudiante.getRut();
                    nombre = estudiante.getNombre();
                    appaterno = estudiante.getAppaterno();
                    apmaterno = estudiante.getApmaterno();
                    edad = estudiante.getEdad();
                    nem = estudiante.getNem();
                    gratuidad = estudiante.getGratuidad();
                    nombre_carrera = estudiante.getNombre_carrera();
                    nombre_sede = estudiante.getNombre_sede();
                    estado_matricula = estudiante.getEstado_matricula();
                    fecha_pago_matricula = estudiante.getFecha_pago_matricula();
                    valor_matricula = estudiante.getValor_matricula();
                    valor_matricula_pagar = estudiante.getValor_matricula_pagar();

                    tablaDatos.addRow(new Object[]{id, rut, nombre, appaterno, apmaterno, edad, nem, gratuidad, nombre_carrera, nombre_sede, estado_matricula, fecha_pago_matricula, valor_matricula, valor_matricula_pagar});
                    jbtn_buscar.setEnabled(false);
                   // jtxt_rut.setText("");
                }
            }
        }

        if (this.jrb_id.isSelected()) {

            

            try {
                id = Integer.parseInt(this.jtxt_id.getText());

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(this, "El id debe ser un numero", "Validación", 1);
                this.jtxt_id.setText("");
                this.jtxt_id.requestFocus();
                return;
            }

            //si el estudiante no existe
            boolean flag;
            //  Procedimiento proce = new Procedimiento();
            proce.buscarEstudiantePorId(id);
            flag = proce.buscarEstudiantePorIdBandera(id);
            if (flag == false) {
                JOptionPane.showMessageDialog(this, "El estudiante no existe en la base de datos", "Validación", 1);
                this.jtxt_id.setText("");
                this.jtxt_id.requestFocus();
            } //si el estudiante exixte
            else {
             

                Procedimiento proce2 = new Procedimiento();
                DefaultTableModel tablaDatos = (DefaultTableModel) this.jtbl_datos.getModel();

                //Objeto
                Estudiante estudiante = proce2.buscarEstudiantePorId(id);

                id = estudiante.getId();
                rut = estudiante.getRut();
                nombre = estudiante.getNombre();
                appaterno = estudiante.getAppaterno();
                apmaterno = estudiante.getApmaterno();
                edad = estudiante.getEdad();
                nem = estudiante.getNem();
                gratuidad = estudiante.getGratuidad();
                nombre_carrera = estudiante.getNombre_carrera();
                nombre_sede = estudiante.getNombre_sede();
                estado_matricula = estudiante.getEstado_matricula();
                fecha_pago_matricula = estudiante.getFecha_pago_matricula();
                valor_matricula = estudiante.getValor_matricula();
                valor_matricula_pagar = estudiante.getValor_matricula_pagar();

                tablaDatos.addRow(new Object[]{id, rut, nombre, appaterno, apmaterno, edad, nem, gratuidad, nombre_carrera, nombre_sede, estado_matricula, fecha_pago_matricula, valor_matricula, valor_matricula_pagar});                                                 //  rut, nombre, apmaterno, appaterno, gratuidad, edad, id, nem, estado_matricula, valor_matricula, valor_matricula_pagar, fecha_pago_matricula, nombre_carrera, nombre_sede FROM estudiante
                jbtn_buscar.setEnabled(false);
               // jtxt_id.setText("");

            }
        }

//         TODO add your handling code here:
    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed

        if (this.jrb_rut.isSelected()) {

            this.jtxt_id.setEnabled(false);
            String rut;

            rut = this.jtxt_rut.getText();

            Procedimiento proce = new Procedimiento();

            int opcion = JOptionPane.showConfirmDialog(this, "Seguro que deseas eliminar al estudiandte?", "Eliminar", 0);

            if (opcion == 0) {
                proce.eliminarEstudiantePorRut(rut);
                JOptionPane.showMessageDialog(this, "Estudiante Eliminado", "Eliminar", 1);
                
                limpiarTablaDatos();
                
                this.jtxt_rut.setText("");
                
     
                
            } else {
                JOptionPane.showMessageDialog(this, "Estudiante no Eliminado", "Eliminar", 2);
            }
        }
        if (this.jrb_id.isSelected()) {

            this.jtxt_rut.setEnabled(false);

            int id;
            Procedimiento proce = new Procedimiento();
            id = Integer.parseInt(this.jtxt_id.getText());

            int opcion = JOptionPane.showConfirmDialog(this, "Seguro que deseas eliminar al estudiandte?", "Eliminar", 0);

            if (opcion == 0) {
                proce.eliminarEstudiantePorId(id);
                JOptionPane.showMessageDialog(this, "Estudiante Eliminado", "Eliminar", 1);
                
                limpiarTablaDatos();
                this.jtxt_id.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Estudiante no Eliminado", "Eliminar", 2);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    
           //Limpia la tala 
   public void limpiarTablaDatos() {
        DefaultTableModel temp = (DefaultTableModel) jtbl_datos.getModel();
        int filas = jtbl_datos.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
   }
    
    
    
    
    
    private void jbt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volverActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_volverActionPerformed

    private void jrb_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_idActionPerformed
        if (this.jrb_id.isSelected()) {
            jtxt_id.setEnabled(true);
            jtxt_rut.setEnabled(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jrb_idActionPerformed
    }
    private void jrb_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_rutActionPerformed
        if (this.jrb_rut.isSelected()) {
            jtxt_rut.setEnabled(true);
            jtxt_id.setEnabled(false);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jrb_rutActionPerformed

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
//            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Eliminar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_volver;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JRadioButton jrb_id;
    private javax.swing.JRadioButton jrb_rut;
    private javax.swing.JTable jtbl_datos;
    private javax.swing.JTextField jtxt_id;
    private javax.swing.JTextField jtxt_rut;
    // End of variables declaration//GEN-END:variables
}
