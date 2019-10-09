
package comedorsys;

/*
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import static com.itextpdf.kernel.pdf.PdfName.Font;
import static com.itextpdf.kernel.pdf.PdfName.FontFamily;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import com.sun.javafx.geom.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import sun.text.normalizer.RangeValueIterator.Element;
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
            Class.forName("com.mysql.jdbc.Driver");
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
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
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
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Registrar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(24, 102, 50));
        label2.setText("Lunes");

        label3.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(24, 102, 50));
        label3.setText("Miercoles");

        label4.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(24, 102, 50));
        label4.setText("Martes");

        label5.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        label5.setForeground(new java.awt.Color(24, 102, 50));
        label5.setText("Viernes");

        label6.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(24, 102, 50));
        label6.setText("Jueves");

        label7.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        label7.setForeground(new java.awt.Color(24, 102, 50));
        label7.setText("Plato Principal");

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
        label8.setText("Postre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addGap(159, 159, 159)
                        .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(cLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
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
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(cLunes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(pLunes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(24, 24, 24)
                                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(pMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(82, 82, 82)
                                                .addComponent(cMartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(cMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(cJueves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(pViernes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

     String fechaHora = "";
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        try {
             //ABAJO SE DEBE COLOCAR LA DIRECCION DE LA BASE DE DATO Y EL NOMBRE
            //Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.2.104/bdcomedor", "root", "comedor");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bdcomedor", "root", "");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //se coloca a formato de MySQL
            Calendar cal = Calendar.getInstance(); //Toma fecha actual
            Date date = cal.getTime(); //Toma la hora
            fechaHora = dateFormat.format(date); //coloca la fecha en la forma de MySQL
            System.out.print(dateFormat.format(date)); //Imprime la hora, por las dudas
            Statement stat = conexion.createStatement(); //Permite hacer registro y consultas
            
            //Secuencia SQL para insertar
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
            JOptionPane.showMessageDialog(null, "El registro fue exitoso"); //mensaje en un panel
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
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.TextField pJueves;
    private java.awt.TextField pLunes;
    private java.awt.TextField pMartes;
    private java.awt.TextField pMiercoles;
    private java.awt.TextField pViernes;
    // End of variables declaration//GEN-END:variables
}
