/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comedorsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author waita
 */
public class Baja extends javax.swing.JPanel {

    /**
     * Creates new form Baja
     */
    public Baja() {
        initComponents();
        try { //valida y verifica que la libreria este instalada
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelMenu.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 21)); // NOI18N
        jLabel1.setText("Baja Menus");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel2.setText("SEMANA");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 21)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("SEMANA");
    }// </editor-fold>//GEN-END:initComponents
     String fechaHora = "";
    String ip="192.168.2.108"; //colocar la direccion de la base de dato
        String bd="bdcomedor"; //nombre de la basee de datos
        String login="root"; //usuario de la base de datos
        String password="comedor"; //contraseña de la base de datos
     String url= "jdbc:mysql://"+ip+"/"+bd+"?useTimezone=true&serverTimezone=UTC";
     String borrado;   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        try {
            Connection conexion = DriverManager.getConnection(url, login, password);
            if(conexion!=null){System.out.println("Connecting BAJA ["+conexion+"] OK");}
            Statement stat = conexion.createStatement(); //Permite hacer registro y consultas
            
            if (jTextField1.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado nada para eliminar");
            } else{
                borrado = "DELETE from menusfila where semana = '" + jTextField1.getText() + "'";
                stat.execute(borrado);
                JOptionPane.showMessageDialog(null, "Borrado correcto"); //mensaje en un panel
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
