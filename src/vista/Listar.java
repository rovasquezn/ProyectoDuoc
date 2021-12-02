/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Procedimiento;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Estudiante;

/**
 *
 * @author Rodrigo Vasquez, Cristian Ubilla, Franco Navarrete - Proyecto Duoc
 */
public class Listar extends javax.swing.JFrame {

    /**
     * Creates new form Listar
     */
    public Listar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_datos_todos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jbtn_mostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbl_datos_todos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "R.U.T.", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "N.E.M.", "Gratuidad", "Carrera", "Sede", "Estado Matricula", "Fecha Pago", "Matricula", "Valor Pagado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_datos_todos);
        if (jtbl_datos_todos.getColumnModel().getColumnCount() > 0) {
            jtbl_datos_todos.getColumnModel().getColumn(0).setMinWidth(2);
            jtbl_datos_todos.getColumnModel().getColumn(0).setPreferredWidth(3);
            jtbl_datos_todos.getColumnModel().getColumn(1).setPreferredWidth(40);
            jtbl_datos_todos.getColumnModel().getColumn(5).setPreferredWidth(3);
            jtbl_datos_todos.getColumnModel().getColumn(6).setPreferredWidth(10);
            jtbl_datos_todos.getColumnModel().getColumn(7).setPreferredWidth(20);
            jtbl_datos_todos.getColumnModel().getColumn(10).setPreferredWidth(40);
            jtbl_datos_todos.getColumnModel().getColumn(11).setPreferredWidth(25);
            jtbl_datos_todos.getColumnModel().getColumn(12).setPreferredWidth(20);
            jtbl_datos_todos.getColumnModel().getColumn(13).setPreferredWidth(25);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1471, 248));

        jSeparator1.setBackground(new java.awt.Color(51, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 1175, 14));

        jbtn_mostrar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/bases-de-datos.png"))); // NOI18N
        jbtn_mostrar.setText("Mostrar Base de Datos");
        jbtn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/logo2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Listar todos los Datos.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/volver (2).png"))); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo_largo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1510, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_mostrarActionPerformed

        String rut, nombre, appaterno, apmaterno, gratuidad, estado_matricula, nombre_carrera, nombre_sede;
        int edad, id, valor_matricula, valor_matricula_pagar;
        double nem;
        Date fecha_pago_matricula;

        Procedimiento proce = new Procedimiento();

        DefaultTableModel tablaDatosTodos = (DefaultTableModel) this.jtbl_datos_todos.getModel();

        tablaDatosTodos.setRowCount(0);

        List<Estudiante> listaEstudiante = proce.buscarTodos();
        for (Estudiante estudiante : listaEstudiante) {

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

            //Datos obtenidos de la base de datos se agregan a tabla
            tablaDatosTodos.addRow(new Object[]{id, rut, nombre, appaterno, apmaterno, edad, nem, gratuidad, nombre_carrera, nombre_sede, estado_matricula, fecha_pago_matricula, valor_matricula, valor_matricula_pagar});
            // }

        }


    }//GEN-LAST:event_jbtn_mostrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
//            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Listar().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtn_mostrar;
    private javax.swing.JTable jtbl_datos_todos;
    // End of variables declaration//GEN-END:variables
}
