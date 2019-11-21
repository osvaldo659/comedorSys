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
import javax.swing.table.TableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ezequias
 */
public class PListar extends javax.swing.JPanel {
    
    /**
     * Creates new form PListar
     */
    public PListar() {
        initComponents();
      
        
        try { //valida y verifica que la libreria este instalada
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PListar.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        /*
        rbFueraParq.setSelected(true);
        */
        
        
        TableColumnModel columnModel = tblMenus.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        //columnModel.getColumn(4).setPreferredWidth(70);
        //columnModel.getColumn(5).setPreferredWidth(70);
        //columnModel.getColumn(5).setPreferredWidth(100);
        
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
        jLabel2 = new javax.swing.JLabel();
        tfSemana = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenus = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(239, 235, 206));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(24, 102, 50));
        jLabel1.setText("Listado de Menus Cargados");

        jLabel2.setBackground(new java.awt.Color(24, 102, 50));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 21)); // NOI18N
        jLabel2.setText("Nro de Semana:");

        tfSemana.setFont(new java.awt.Font("Arial Black", 1, 21)); // NOI18N

        tblMenus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblMenus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semana", "Dia", "Menu", "Postre"
            }
        ));
        jScrollPane1.setViewportView(tblMenus);

        btnBuscar.setBackground(new java.awt.Color(28, 62, 74));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(254, 254, 254));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    String ip="localhost"; //colocar la direccion de la base de dato
        String bd="bdcomedor"; //nombre de la basee de datos
        String login="root"; //usuario de la base de datos
        String password="comedor"; //contraseña de la base de datos
        String url= "jdbc:mysql://"+ip+"/"+bd+"?useTimezone=true&serverTimezone=UTC";
    
    String consulta;
    String consulta1;
    //String tipoVehiculo = "otro", estado = "", fecha = "";  
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tblMenus.getModel();
        modelo.setRowCount(0);


        try {
            // TODO add your handling code here:
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, login, password);
            if(con!=null){System.out.println("Connecting PListar ["+con+"] OK");}
            Statement stat = con.createStatement();
            
            //consulta = "SELECT * FROM menusfila ";
            //consulta1 = "SELECT * FROM menusfila WHERE semana=" + tfSemana.getText();
            
            ResultSet rs;
            
                 if ( tfSemana.getText().isEmpty()) {
                    consulta = "SELECT * FROM menusfila ";
                    System.out.println(consulta);
                    rs = stat.executeQuery(consulta);
                    rs.first();
                } else {
                    consulta1 = "SELECT * FROM menusfila WHERE semana=" + tfSemana.getText(); 
                    System.out.println(consulta1);
                    rs = stat.executeQuery(consulta1);
                    rs.first();
                }
            
            //System.out.println(consulta);
            //ResultSet rs = stat.executeQuery(consulta);
            //rs.first();

            do {
        
                String[] fila = {rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                modelo.addRow(fila);
            } while (rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(PListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenus;
    private javax.swing.JTextField tfSemana;
    // End of variables declaration//GEN-END:variables
}
