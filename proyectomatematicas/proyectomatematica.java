
package proyectomatematicas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.JButton;
import javax.swing.JLabel;


public class proyectomatematica extends javax.swing.JFrame {
    
       public String ruta;
   
    public proyectomatematica() {
        
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
       
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        entrar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.green);
        setForeground(new java.awt.Color(51, 255, 51));
        setPreferredSize(new java.awt.Dimension(990, 720));
        getContentPane().setLayout(null);

        entrar.setBackground(new java.awt.Color(255, 255, 255));
        entrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        entrar.setForeground(new java.awt.Color(51, 51, 0));
        entrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\fruta.jpg")); // NOI18N
        entrar.setActionCommand("Jugar");
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        entrar.setLabel("Jugar");
        entrar.setMaximumSize(new java.awt.Dimension(145, 71));
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(240, 440, 160, 70);
        entrar.getAccessibleContext().setAccessibleName("jugar");

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\fruta2.jpg")); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(490, 440, 160, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Documents\\NetBeansProjects\\proyectomatematicas\\src\\sonido\\granja.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1050, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
          JOptionPane.showMessageDialog(null, "Bienvenido");      
        ventanaadmin ingreso = new ventanaadmin();
                    ingreso.setVisible(true);
                    ingreso.pack();   
                    
    }//GEN-LAST:event_entrarActionPerformed

    public  void imagenes (){
         // ruta = System.getProperty("user.dir") + "/src/sonido/";
        //jLabel2.setIcon(new ImageIcon(ruta + "granja.jpg"));
      
    }
    
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
     System.exit(0);       
    }//GEN-LAST:event_salirActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proyectomatematica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proyectomatematica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
