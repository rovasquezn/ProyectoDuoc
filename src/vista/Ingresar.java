/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Procedimiento;
import controlador.Validar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Estudiante;

/**
 *
 * @author rodrigo
 */
public class Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
    public Ingresar() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxt_rut = new javax.swing.JTextField();
        jbtn_verificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jrdb_tiene = new javax.swing.JRadioButton();
        jrdb_no_tiene = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_appaterno = new javax.swing.JTextField();
        jtxt_apmaterno = new javax.swing.JTextField();
        jtxt_edad = new javax.swing.JTextField();
        jtxt_nem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbtn_ingresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtxt_dv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/rodrigo/Documents/DUOCUC2021/2DO SEMESTRE/DISEÑO DE SOFTWARE DE ESCRITORIO/EJERCICIOS JAVA/BD_Proyecto/src/vista/logo2.png")); // NOI18N

        jLabel2.setText("Ingreso de datos");

        jLabel4.setText("Ingrese RUN");

        jtxt_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rutActionPerformed(evt);
            }
        });

        jbtn_verificar.setText("Verificar");
        jbtn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_verificarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel5.setText("Apellido Paterno");

        jLabel6.setText("Apellido Materno");

        jLabel7.setText("Edad");

        jLabel8.setText("Gratuidad");

        buttonGroup1.add(jrdb_tiene);
        jrdb_tiene.setText("Tiene");

        buttonGroup1.add(jrdb_no_tiene);
        jrdb_no_tiene.setText("No Tiene");

        jLabel9.setText("Nota Enseñanza Media (NEM)");

        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });

        jLabel10.setText("Ej: 11111111-1");

        jbtn_ingresar.setText("Ingresar Datos");
        jbtn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ingresarActionPerformed(evt);
            }
        });

        jLabel11.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtxt_appaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addComponent(jtxt_nombre)
                                .addComponent(jtxt_apmaterno)
                                .addComponent(jtxt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(360, 360, 360))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(18, 18, 18)
                                    .addComponent(jtxt_nem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(126, 126, 126)
                                    .addComponent(jrdb_tiene)
                                    .addGap(41, 41, 41)
                                    .addComponent(jrdb_no_tiene)))
                            .addGap(80, 80, 80)
                            .addComponent(jbtn_ingresar)
                            .addGap(96, 96, 96)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(652, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxt_rut))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(72, 72, 72)
                                    .addComponent(jbtn_verificar)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_verificar)
                    .addComponent(jLabel11)
                    .addComponent(jtxt_dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxt_appaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtxt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jrdb_tiene)
                            .addComponent(jrdb_no_tiene))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtxt_nem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_ingresar)))
                    .addComponent(jtxt_apmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_nombreActionPerformed

    private void jtxt_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_rutActionPerformed


    }//GEN-LAST:event_jtxt_rutActionPerformed

    private void jbtn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_verificarActionPerformed

//        Validar valida = new Validar ();
//        boolean flag;
//        int rut;
//        
//        do {
//                          rut = this.jtxt_rut.getText();
////                        System.out.println("Ingrese rut: ");
////                        rut = teclado.nextInt();
////                        System.out.println("Ingrese dv: ");
//                        this.jtxt_dv.getText();
//                        dv = teclado.next().charAt(0);
//                        flag = valida.validarRut(rut, dv);
//
//                        if (flag == false) {
//                            System.out.println("Rut no válido, intente nuevamente");
//                        }
//
//                    } while (flag == false);
        int rut;
        String dv;

        try {
            rut = Integer.parseInt(this.jtxt_rut.getText());

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El rut debe ser un numero", "Validación", 1);
            this.jtxt_rut.requestFocus();
            return;
        }

        dv = this.jtxt_dv.getText();

        if (dv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Dígito Verificador no puede estar vacío", "Validación", 1);
            this.jtxt_dv.requestFocus();
            return;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_verificarActionPerformed

    private void jbtn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ingresarActionPerformed

        String dv,nombre, appaterno, apmaterno, gratuidad="";
        int rut, edad;
        double nem;
        
         rut = Integer.parseInt(this.jtxt_rut.getText());
         
         
         
         
         
         
         dv = this.jtxt_dv.getText();
         

        nombre = this.jtxt_nombre.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nombre no puede estar vacio", "Validación", 1);
            this.jtxt_nombre.requestFocus();
            return;
        }

        appaterno = this.jtxt_appaterno.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Apellido Paterno no puede estar vacio", "Validación", 1);
            this.jtxt_appaterno.requestFocus();
            return;
        }

        apmaterno = this.jtxt_apmaterno.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Apellido Materno no puede estar vacio", "Validación", 1);
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

            JOptionPane.showMessageDialog(this, "La edad debe ser un numero", "Validación", 1);
            this.jtxt_edad.requestFocus();
            return;
        }

        try {
            nem = Double.parseDouble(this.jtxt_nem.getText());

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "La nota debe ser un numero", "Validación", 1);
            this.jtxt_nem.requestFocus();
            return;
        }

        
        Estudiante estudiante = new Estudiante(nombre, apmaterno, appaterno, gratuidad, edad, edad, rut, nem, dv);
       
        
        Procedimiento proce = new Procedimiento();
        
        if (proce.ingresarEstudiante(estudiante)) {
            JOptionPane.showMessageDialog(this, "Se agregaron los datos del estudiante", "Aviso",1);
            
        }
        else{
            JOptionPane.showMessageDialog(this, "No se agregaron los datos del estudiante", "Aviso",1);
        } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //if (this.jrdb_cta_cte.isSelected() || this.jrdb_cta_ahorro.isSelected()) {
        //String titulo,autor,dia,mes,ano,fechaStr;
//        Date fecha;
//        int precio;
//        boolean disponible;
//        
//        titulo = this.jtxt_titulo.getText();
//        if (titulo.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Ingrese título", "Validación",1);
//            this.jtxt_titulo.requestFocus();
//            return;
//        }
//        
//        autor = this.jtxt_autor.getText();
//        if (autor.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Ingrese autor", "Validación",1);
//            this.jtxt_autor.requestFocus();
//            return;
//        }
//        
//        dia = this.jtxt_dia.getText();
//        mes = this.jtxt_mes.getText();
//        ano = this.jtxt_ano.getText();
//        
//        if (dia.isEmpty() || mes.isEmpty() || ano.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Ingrese fecha", "Validación",1);
//            this.jtxt_dia.requestFocus();
//            return;
//        }
//        
//        fechaStr = dia+"/"+mes+"/"+ano;
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        
//        try {
//            fecha = formato.parse(fechaStr);
//        } catch (ParseException e) {
//            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato dd/mm/aaaa", "Validación",1);
//            this.jtxt_dia.requestFocus();
//            return;
//        }
//        
//        try {
//            precio = Integer.parseInt(this.jtxt_precio.getText());
//        } catch (NumberFormatException e) {
//            
//            JOptionPane.showMessageDialog(this, "El precio debe ser numérico", "Validación",1);
//            this.jtxt_precio.requestFocus();
//            return;
//        }
//        
//        disponible = this.jchk_disponible.isSelected();
//        
//        Libro libro = new Libro(0, titulo, autor, fecha, precio, disponible);
//        
//        Registro reg = new Registro();
//        
//        if (reg.agregar(libro)) {
//            JOptionPane.showMessageDialog(this, "Se agrego el libro", "Aviso",1);
//            
//        }
//        else{
//            JOptionPane.showMessageDialog(this, "No se agrego el libro", "Aviso",1);
//        }

    }//GEN-LAST:event_jbtn_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtn_ingresar;
    private javax.swing.JButton jbtn_verificar;
    private javax.swing.JRadioButton jrdb_no_tiene;
    private javax.swing.JRadioButton jrdb_tiene;
    private javax.swing.JTextField jtxt_apmaterno;
    private javax.swing.JTextField jtxt_appaterno;
    private javax.swing.JTextField jtxt_dv;
    private javax.swing.JTextField jtxt_edad;
    private javax.swing.JTextField jtxt_nem;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_rut;
    // End of variables declaration//GEN-END:variables
}
