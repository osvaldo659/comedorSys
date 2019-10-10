/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comedorsys;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ezequias Cuellar
 */
public class Principal extends javax.swing.JFrame {

    PanelMenu panelmenus;
    PanelHistoricos panelhistoricos;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        //System.out.println("Hello World!"); // Display the string.
        initComponents();
        setSize(1125,480);
        
        panelmenus = new PanelMenu();
        panelmenus.setBounds(360,0,1125,550);
        add(panelmenus);
        
        panelhistoricos = new PanelHistoricos();
        panelhistoricos.setBounds(360,0,1300,550);
        add(panelhistoricos);
        panelhistoricos.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        imagenPortada = new javax.swing.JLabel();
        btnMenu = new java.awt.Button();
        btnHistoricos = new java.awt.Button();
        btnSalir = new java.awt.Button();
        btnMercaderia = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setBackground(new java.awt.Color(28, 62, 74));

        titulo.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(239, 235, 206));
        titulo.setText("Comedor Escolar");

        imagenPortada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comedorsys/diagramas.png"))); // NOI18N

        btnMenu.setBackground(new java.awt.Color(239, 235, 206));
        btnMenu.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        btnMenu.setLabel("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnHistoricos.setBackground(new java.awt.Color(239, 235, 206));
        btnHistoricos.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        btnHistoricos.setLabel("HISTORICOS");
        btnHistoricos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(239, 235, 206));
        btnSalir.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        btnSalir.setLabel("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnMercaderia.setBackground(new java.awt.Color(239, 235, 206));
        btnMercaderia.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        btnMercaderia.setLabel("MERCADERIA");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHistoricos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(imagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(titulo))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addComponent(btnMercaderia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo)
                .addGap(26, 26, 26)
                .addComponent(imagenPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(btnHistoricos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMercaderia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        setSize(1125,480);
        panelhistoricos.setVisible(false);
        panelmenus.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnHistoricosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricosActionPerformed
        // TODO add your handling code here:
        setSize(1125,480);
        panelhistoricos.setVisible(true);
        panelmenus.setVisible(false);
        revalidate();
        repaint();
        
        try { //valida y verifica que la libreria este instalada
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelMenu.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        String ip="localhost"; //colocar la direccion de la base de dato
        String bd="bdcomedor"; //nombre de la basee de datos
        String login="root"; //usuario de la base de datos
        String password=""; //contraseña de la base de datos
        String url= "jdbc:mysql://"+ip+"/"+bd+"?useTimezone=true&serverTimezone=UTC";
        String consulf;
        
        
        try {
            //CREA LA CONXION CON LA BASE DE DATOS
            Connection conexion = DriverManager.getConnection(url, login, password);
            if(conexion!=null){System.out.println("Connecting database ["+conexion+"] OK");}
            Statement stat = conexion.createStatement(); //Permite hacer registro y consultas
            
            consulf = "SELECT * FROM frecuencias";
            ResultSet rs = stat.executeQuery(consulf);
            ArrayList<Integer> histogramaCanal = new ArrayList<Integer>();
            ArrayList<String> nombres = new ArrayList<String>();
            while (rs.next()) //Corre cada registro de la consulta hasta fin (false)
            {
                //System.out.println("Plato="+rs.getObject("platos")+
                // ", Frecuencia="+rs.getObject("contador"));
                histogramaCanal.add(Integer.parseInt(rs.getString("contador")));
                nombres.add(rs.getString("platos"));
            }
            rs.close();
        
        //int[] ret = {1,2,5,10};
        int[] ret = new int[histogramaCanal.size()];
        for (int m=0; m < ret.length; m++)
                    {
                        ret[m] = histogramaCanal.get(m).intValue();
                    }
            DibujarGrafico ObjDibujaHisto=new DibujarGrafico();
            //Color color = new color();
            ObjDibujaHisto.crearHistograma(ret, panelhistoricos.getjPanel1(), Color.red, nombres);          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHistoricosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private java.awt.Button btnHistoricos;
    private java.awt.Button btnMenu;
    private java.awt.Button btnMercaderia;
    private java.awt.Button btnSalir;
    private javax.swing.JLabel imagenPortada;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
