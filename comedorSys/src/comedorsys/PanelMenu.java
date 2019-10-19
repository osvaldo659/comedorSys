
package comedorsys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Ezequias
 */
public class PanelMenu extends javax.swing.JPanel {

    /**
     * Creates new form PanelMenu
     */
    public PanelMenu() {
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
        button1 = new java.awt.Button();
        lblunes = new java.awt.Label();
        lbmiercoles = new java.awt.Label();
        lbmartes = new java.awt.Label();
        lbviernes = new java.awt.Label();
        lbjueves = new java.awt.Label();
        label7 = new java.awt.Label();
        cLunes = new java.awt.TextField();
        cMartes = new java.awt.TextField();
        cMiercoles = new java.awt.TextField();
        cJueves = new java.awt.TextField();
        cViernes = new java.awt.TextField();
        pLunes = new java.awt.TextField();
        pMartes = new java.awt.TextField();
        pMiercoles = new java.awt.TextField();
        pJueves = new java.awt.TextField();
        pViernes = new java.awt.TextField();
        label8 = new java.awt.Label();

        setBackground(new java.awt.Color(239, 235, 206));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(24, 102, 50));
        jLabel1.setText("Ingreso Menu Semanal");

        button1.setBackground(new java.awt.Color(255, 51, 0));
        button1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Ingresar Menu");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        lblunes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        lblunes.setForeground(new java.awt.Color(24, 102, 50));
        lblunes.setText("LUNES");

        lbmiercoles.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        lbmiercoles.setForeground(new java.awt.Color(24, 102, 50));
        lbmiercoles.setText("MIERCOLES");

        lbmartes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        lbmartes.setForeground(new java.awt.Color(24, 102, 50));
        lbmartes.setText("MARTES");

        lbviernes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        lbviernes.setForeground(new java.awt.Color(24, 102, 50));
        lbviernes.setText("VIERNES");

        lbjueves.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        lbjueves.setForeground(new java.awt.Color(24, 102, 50));
        lbjueves.setText("JUEVES");

        label7.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        label7.setForeground(new java.awt.Color(24, 102, 50));
        label7.setText("  Plato Principal");

        cLunes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        cMartes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        cMiercoles.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        cJueves.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        cViernes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        pLunes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        pMartes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        pMiercoles.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        pJueves.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        pViernes.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N

        label8.setAlignment(java.awt.Label.RIGHT);
        label8.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        label8.setForeground(new java.awt.Color(24, 102, 50));
        label8.setText(" Postre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbviernes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbjueves, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbmartes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblunes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbmiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cMiercoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(83, 83, 83)
                        .addComponent(lblunes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lbmartes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lbmiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lbjueves, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lbviernes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(cLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(pLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(pMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(82, 82, 82)
                                                    .addComponent(cMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(130, 130, 130)
                                            .addComponent(cMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(178, 178, 178)
                                    .addComponent(cJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(15, 15, 15)
                            .addComponent(cViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(226, 226, 226)
                            .addComponent(pViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

        //String fechaHora = "";
        String ip="localhost"; //colocar la direccion de la base de dato
        String bd="bdcomedor"; //nombre de la basee de datos
        String login="root"; //usuario de la base de datos
        String password=""; //contraseña de la base de datos
        String url= "jdbc:mysql://"+ip+"/"+bd+"?useTimezone=true&serverTimezone=UTC";
        String consulta;
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        try {
            //CREA LA CONEXION CON LA BASE DE DATOS
            Connection conexion = DriverManager.getConnection(url, login, password);
            if(conexion!=null){System.out.println("Connecting CARGA ["+conexion+"] OK");}
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //se coloca a formato de MySQL
            Calendar cal = Calendar.getInstance(); //Toma fecha actual
            Date date = cal.getTime(); //Toma la hora
            //fechaHora = dateFormat.format(date); //coloca la fecha en la forma de MySQL
            System.out.print(dateFormat.format(date)); //Imprime la hora, por las dudas
            
            Statement stat = conexion.createStatement(); //Permite hacer registro y consultas
            
            consulta = "SELECT COUNT(*) FROM menusfila";
            System.out.println(consulta);
            ResultSet w = stat.executeQuery(consulta);
            
            w.next();
            int semana = w.getInt(1)/5;
            System.out.println("numero de semanas: "+semana);
            
            //Secuencia SQL para insertar en menusfila
            if (cLunes.getText().isEmpty() || pLunes.getText().isEmpty() || 
                    cMartes.getText().isEmpty() || pMartes.getText().isEmpty() || 
                    cMiercoles.getText().isEmpty() || pMiercoles.getText().isEmpty() || 
                    cJueves.getText().isEmpty() || pJueves.getText().isEmpty() || 
                    cViernes.getText().isEmpty() || pViernes.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(this,"No se admiten cuadros vacios");
                    
            }else{
                 String lunes = "INSERT INTO menusfila (semana,dia,plato,postre) "
                    + "VALUES ('" + (semana+1) + "','" +lblunes.getText()+"',"
                    + "'" + cLunes.getText() + "',"
                    + "'" + pLunes.getText() + "')";
            String martes = "INSERT INTO menusfila (semana,dia,plato,postre) "
                    + "VALUES ('" + (semana+1) + "','" +lbmartes.getText()+"',"
                    + "'" + cMartes.getText() + "',"
                    + "'" + pMartes.getText() + "')"; 
            String miercoles = "INSERT INTO menusfila (semana,dia,plato,postre) "
                    + "VALUES ('" + (semana+1) + "','" +lbmiercoles.getText()+"',"
                    + "'" + cMiercoles.getText() + "',"
                    + "'" + pMiercoles.getText() + "')";
            String jueves = "INSERT INTO menusfila (semana,dia,plato,postre) "
                    + "VALUES ('" + (semana+1) + "','" +lbjueves.getText()+"',"
                    + "'" + cJueves.getText() + "',"
                    + "'" + pJueves.getText() + "')";
            String viernes = "INSERT INTO menusfila (semana,dia,plato,postre) "
                    + "VALUES ('" + (semana+1) + "','" +lblunes.getText()+"',"
                    + "'" + cViernes.getText() + "',"
                    + "'" + pViernes.getText() + "')";
            
            stat.executeUpdate(lunes);
            stat.executeUpdate(martes);
            stat.executeUpdate(miercoles);
            stat.executeUpdate(jueves);
            stat.executeUpdate(viernes);

            //Secuencia SQL para insertar en menuscol
            /*
            String sql = "INSERT INTO menuscol "
                    + "(fecha,"
                    + "clunes,plunes,"
                    + "cmartes,pmartes,"
                    + "cmiercoles,pmiercoles,"
                    + "cjueves,pjueves,"
                    + "cviernes,pviernes) "
                    + "VALUES ('" + fechaHora + "',"
                    + "'" + cLunes.getText() + "','" + pLunes.getText() + "',"
                    + "'" + cMartes.getText() + "','" + pMartes.getText() + "',"
                    + "'" + cMiercoles.getText() + "','" + pMiercoles.getText() + "',"
                    + "'" + cJueves.getText() + "','" + pJueves.getText() + "',"
                    + "'" + cViernes.getText() + "','" + pViernes.getText() + "')";
            stat.executeUpdate(sql);
            */
            
            JOptionPane.showMessageDialog(null, "El registro fue exitoso"); //mensaje en un panel
            }
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(PanelMenu.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_button1ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.TextField cJueves;
    private java.awt.TextField cLunes;
    private java.awt.TextField cMartes;
    private java.awt.TextField cMiercoles;
    private java.awt.TextField cViernes;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label lbjueves;
    private java.awt.Label lblunes;
    private java.awt.Label lbmartes;
    private java.awt.Label lbmiercoles;
    private java.awt.Label lbviernes;
    private java.awt.TextField pJueves;
    private java.awt.TextField pLunes;
    private java.awt.TextField pMartes;
    private java.awt.TextField pMiercoles;
    private java.awt.TextField pViernes;
    // End of variables declaration//GEN-END:variables
}
