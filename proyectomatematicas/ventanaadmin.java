
package proyectomatematicas;

public class ventanaadmin extends javax.swing.JFrame {

    public ventanaadmin() {
        initComponents();
        setLocationRelativeTo(null);
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 663));
        setPreferredSize(new java.awt.Dimension(990, 720));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(151, 151, 24));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\sumaaa.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 230, 140, 140);

        jButton2.setBackground(new java.awt.Color(151, 151, 24));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\restaa.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 230, 140, 140);

        jButton3.setBackground(new java.awt.Color(151, 151, 24));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\multiplicacion1.png")); // NOI18N
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 230, 140, 140);

        jButton4.setBackground(new java.awt.Color(151, 151, 24));
        jButton4.setFont(new java.awt.Font("Verdana", 2, 24)); // NOI18N
        jButton4.setText("Numeros ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(370, 400, 160, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\Fondo-cumple-numeros.jpg")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(990, 720));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, 0, 1020, 700);

        jMenu1.setLabel("Archivo");

        jMenuItem1.setActionCommand("Cerrar Seccion");
        jMenuItem1.setLabel("Cerrar Seccion");
        jMenu1.add(jMenuItem1);
        jMenuItem1.getAccessibleContext().setAccessibleDescription("");

        jMenuBar1.add(jMenu1);

        jMenu2.setLabel("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        numeros1 ingreso = new numeros1();
                    ingreso.setVisible(true);
                    ingreso.pack();    
                       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           suma ingreso = new suma();
                    ingreso.setVisible(true);
                    ingreso.pack();         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resta ingreso = new resta();
        ingreso.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
