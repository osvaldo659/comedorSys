/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comedorsys;

/**
 *
 * @author waita
 */
public class menuABM extends javax.swing.JPanel {
    
    PanelMenu panelmenus;
    Baja baja;
    Modificacion modi;
    PListar listar;
    
    /**
     * Creates new form menuABM
     */
    public menuABM() {
        initComponents();
        setSize(1000,600);
        
        panelmenus = new PanelMenu();
        panelmenus.setBounds(0,0,1125,800);
        add(panelmenus);
        panelmenus.setVisible(false);
        
        baja = new Baja();
        baja.setBounds(0,0,1300,550);
        add(baja);
        baja.setVisible(false);
        
        modi = new Modificacion();
        modi.setBounds(0,0,1300,550);
        add(modi);
        modi.setVisible(false);
        
        listar = new PListar();
        listar.setBounds(0,0,1300,550);
        add(listar);
        listar.setVisible(false);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();

        setBackground(new java.awt.Color(239, 235, 206));

        btnCargar.setText("CARGAR MENU");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR MENU");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnListar.setText("LISTAR MENUS");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListar)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnModificar)
                    .addComponent(btnListar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        //setSize(1125,480);
        
        panelmenus.setVisible(true);
        baja.setVisible(false);
        modi.setVisible(false);
        listar.setVisible(false);
        //setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        //setSize(1125,480);
        
        panelmenus.setVisible(false);
        baja.setVisible(false);
        modi.setVisible(true);
        listar.setVisible(false);
        //setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        //setSize(1125,480);
        
        panelmenus.setVisible(false);
        baja.setVisible(false);
        modi.setVisible(false);
        listar.setVisible(true);
        //setVisible(false);
        revalidate();
        repaint();
       
    }//GEN-LAST:event_btnListarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    // End of variables declaration//GEN-END:variables
}
