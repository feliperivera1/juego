/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatematicas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author juan1
 */
public class resta extends javax.swing.JFrame {

    JLabel[] lbl1, lbl2;
    int niveles = 3, bien, mal, suma = 0, resta = 0;
    String a, b = null;
    public String ruta;
    Timer tim;
    
   
    public resta() {
    
          
          initComponents();
        setLocationRelativeTo(null);
        ruta = System.getProperty("user.dir") + "/sonido/";
        
        tim = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                niveles--;
                if ("".equals(jLabel9.getText())) {
                    mal++;
                } else {
                    if (Integer.parseInt(jLabel9.getText()) != resta) {
                        mal++;
                    } else {
                        bien++;
                    }
                }
                for (JLabel lbl11 : lbl1) {
                    remove(lbl11);
                }
                for (JLabel lbl21 : lbl2) {
                    remove(lbl21);
                }
                jLabel9.setText("");
                if (niveles == 0) {
                    JOptionPane.showMessageDialog(null, "Correctas: " + bien + "\n" + "Incorrectas: " + mal);
                    tim.stop();
                } else {
                    crearresta();
                }
            }
        });
        crearresta();
        tim.start();
    }

    public void crearresta() {

        a = numeros();
        jLabel2.setIcon(new ImageIcon(ruta+ a + "su1.png"));
        System.err.println(ruta+ a + "su1.png");
        jLabel6.setIcon(new ImageIcon(ruta+"restaa.jpg"));
        b = numeros();
        jLabel7.setIcon(new ImageIcon(ruta + b + "su1.png"));
        jLabel8.setIcon(new ImageIcon(ruta + "igual1.png"));
        resta = Integer.parseInt(a) - Integer.parseInt(b);
        lbl1 = new JLabel[Integer.parseInt(a)];
        lbl2 = new JLabel[Integer.parseInt(b)];
        remove(jLabel1);
        int x = 200, j = 0;
        for (int i = 0; i < lbl1.length; i++) {
            lbl1[i] = new JLabel();
            lbl1[i].setIcon(new ImageIcon(ruta + "manzana1.png"));
            if (i >= 5) {
                lbl1[i].setBounds(x + (45 * j), 130, 40, 40);
                j++;
            } else {
                lbl1[i].setBounds(x + 45 * i, 60, 40, 40);
            }

            add(lbl1[i]);
        }
        x = 530;
        j = 0;
        for (int i = 0; i < lbl2.length; i++) {
            lbl2[i] = new JLabel();
            lbl2[i].setIcon(new ImageIcon(ruta + "manzana1.png"));
            if (i >= 5) {
                lbl2[i].setBounds(x + (45 * j), 130, 40, 40);
                j++;
            } else {
                lbl2[i].setBounds(x + 45 * i, 60, 40, 40);
            }

            add(lbl2[i]);
            System.out.println(lbl2[i].getBounds());
        }
        add(jLabel1);
        repaint();

    }
          
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(990, 720));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 540, 70, 120);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 540, 70, 120);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(310, 540, 70, 120);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton4.setText("0");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 540, 70, 120);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton5.setText("4");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(410, 540, 70, 120);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton6.setText("5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(510, 540, 70, 120);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(710, 540, 70, 120);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(810, 540, 70, 120);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton9.setText("6");
        jButton9.setToolTipText("");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(610, 540, 70, 120);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jButton10.setText("9");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(900, 540, 70, 120);

        jButton11.setText("Atras");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(20, 440, 79, 23);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 360, 140, 160);

        jLabel6.setRequestFocusEnabled(false);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 350, 160, 160);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 350, 150, 160);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 360, 100, 140);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 140)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(530, 350, 340, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\tablero1.png")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(972, 750));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 0, 670, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String numeros() {
        int n = (int) (Math.random() * 10);

        return String.valueOf(n);
    } 


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //  jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "1");
        // validar((JButton) evt.getSource());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         //   jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         //  jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       // jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "0");
        // validar((JButton) evt.getSource());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         //    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "4");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       //    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "5");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //    jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         //  jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       //   jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "6");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       //  jLabel9.setFont(new java.awt.Font("Tahoma", 0, 46));
        jLabel9.setText(jLabel9.getText() + "9");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        ventanaadmin ingreso = new ventanaadmin();
        ingreso.setVisible(true);
            tim.stop();
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(resta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
