
package proyectomatematicas;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class numeros1 extends javax.swing.JFrame {

    
      public  Clip clip;
    public String ruta="/sonido/";
    
    
    public numeros1() {
        initComponents();
              setLocationRelativeTo(null);
    }

     public void sonido(String archivo){
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta+archivo+".wav")));
            clip.start();
            
        }catch(LineUnavailableException | UnsupportedAudioFileException | IOException e){
            
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
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
        jLabel22 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 720));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 140, 46, 58);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 440, 46, 58);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 220, 46, 58);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 320, 46, 58);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 440, 46, 58);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 160, 28, 24);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 240, 28, 24);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(270, 70, 28, 24);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 460, 28, 24);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 340, 28, 24);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(580, 170, 46, 58);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(560, 80, 46, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(570, 240, 46, 58);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(590, 380, 46, 58);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(670, 160, 28, 24);

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(670, 270, 28, 24);

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(670, 70, 28, 24);

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(670, 480, 28, 24);

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\igual1.png")); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(670, 370, 28, 24);

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel31);
        jLabel31.setBounds(140, 50, 46, 58);

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel32);
        jLabel32.setBounds(110, 140, 46, 58);

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel33);
        jLabel33.setBounds(170, 220, 46, 58);

        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel34);
        jLabel34.setBounds(90, 220, 46, 58);

        jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel35);
        jLabel35.setBounds(70, 320, 46, 58);

        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel36);
        jLabel36.setBounds(150, 320, 46, 58);

        jLabel37.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel37);
        jLabel37.setBounds(190, 320, 46, 58);

        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel38);
        jLabel38.setBounds(130, 440, 46, 58);

        jLabel39.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel39);
        jLabel39.setBounds(50, 440, 46, 58);

        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel40);
        jLabel40.setBounds(170, 440, 46, 58);

        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel41);
        jLabel41.setBounds(520, 80, 46, 50);

        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel42);
        jLabel42.setBounds(520, 40, 46, 58);

        jLabel43.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel43);
        jLabel43.setBounds(550, 40, 46, 58);

        jLabel45.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel45);
        jLabel45.setBounds(480, 80, 46, 50);

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel44);
        jLabel44.setBounds(480, 40, 46, 58);

        jLabel46.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel46);
        jLabel46.setBounds(560, 80, 46, 60);

        jLabel47.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel47);
        jLabel47.setBounds(520, 80, 46, 50);

        jLabel48.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel48);
        jLabel48.setBounds(520, 40, 46, 58);

        jLabel49.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel49);
        jLabel49.setBounds(550, 40, 46, 58);

        jLabel50.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel50);
        jLabel50.setBounds(480, 40, 46, 58);

        jLabel51.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel51);
        jLabel51.setBounds(480, 80, 46, 50);

        jLabel53.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel53);
        jLabel53.setBounds(500, 170, 46, 50);

        jLabel56.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel56);
        jLabel56.setBounds(480, 130, 46, 58);

        jLabel54.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel54);
        jLabel54.setBounds(520, 130, 46, 58);

        jLabel55.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel55);
        jLabel55.setBounds(550, 130, 46, 58);

        jLabel57.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel57);
        jLabel57.setBounds(460, 170, 46, 50);

        jLabel59.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel59);
        jLabel59.setBounds(500, 170, 46, 50);

        jLabel58.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel58);
        jLabel58.setBounds(540, 170, 46, 60);

        jLabel60.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel60);
        jLabel60.setBounds(520, 130, 46, 58);

        jLabel61.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel61);
        jLabel61.setBounds(550, 130, 46, 58);

        jLabel62.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel62);
        jLabel62.setBounds(480, 130, 46, 58);

        jLabel63.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel63);
        jLabel63.setBounds(460, 170, 46, 50);

        jLabel52.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel52);
        jLabel52.setBounds(580, 280, 46, 58);

        jLabel64.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel64);
        jLabel64.setBounds(500, 280, 46, 50);

        jLabel68.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel68);
        jLabel68.setBounds(460, 280, 46, 50);

        jLabel65.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel65);
        jLabel65.setBounds(460, 240, 46, 58);

        jLabel66.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel66);
        jLabel66.setBounds(500, 240, 46, 58);

        jLabel69.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel69);
        jLabel69.setBounds(500, 280, 46, 50);

        jLabel67.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel67);
        jLabel67.setBounds(530, 240, 46, 58);

        jLabel70.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel70);
        jLabel70.setBounds(540, 280, 46, 60);

        jLabel71.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel71);
        jLabel71.setBounds(500, 240, 46, 58);

        jLabel72.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel72);
        jLabel72.setBounds(530, 240, 46, 58);

        jLabel73.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel73);
        jLabel73.setBounds(460, 240, 46, 58);

        jLabel74.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel74);
        jLabel74.setBounds(460, 280, 46, 50);

        jLabel76.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel76);
        jLabel76.setBounds(560, 380, 46, 58);

        jLabel75.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel75);
        jLabel75.setBounds(570, 340, 46, 58);

        jLabel77.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel77);
        jLabel77.setBounds(480, 380, 46, 50);

        jLabel78.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel78);
        jLabel78.setBounds(440, 380, 46, 50);

        jLabel79.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel79);
        jLabel79.setBounds(460, 340, 46, 58);

        jLabel80.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel80);
        jLabel80.setBounds(500, 340, 46, 58);

        jLabel81.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel81);
        jLabel81.setBounds(480, 380, 46, 50);

        jLabel82.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel82);
        jLabel82.setBounds(530, 340, 46, 58);

        jLabel83.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel83);
        jLabel83.setBounds(520, 380, 46, 60);

        jLabel84.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel84);
        jLabel84.setBounds(500, 340, 46, 58);

        jLabel85.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel85);
        jLabel85.setBounds(530, 340, 46, 58);

        jLabel86.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel86);
        jLabel86.setBounds(460, 340, 46, 58);

        jLabel87.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel87);
        jLabel87.setBounds(440, 380, 46, 50);

        jLabel91.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel91);
        jLabel91.setBounds(430, 440, 46, 58);

        jLabel89.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel89);
        jLabel89.setBounds(470, 440, 46, 58);

        jLabel94.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel94);
        jLabel94.setBounds(470, 480, 46, 58);

        jLabel90.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel90);
        jLabel90.setBounds(510, 440, 46, 58);

        jLabel93.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel93);
        jLabel93.setBounds(590, 480, 46, 58);

        jLabel95.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel95);
        jLabel95.setBounds(510, 480, 46, 58);

        jLabel88.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel88);
        jLabel88.setBounds(590, 440, 46, 58);

        jLabel96.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel96);
        jLabel96.setBounds(430, 480, 46, 58);

        jLabel97.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel97);
        jLabel97.setBounds(550, 480, 46, 58);

        jLabel92.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\manzana1.png")); // NOI18N
        getContentPane().add(jLabel92);
        jLabel92.setBounds(550, 440, 46, 58);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Siguiente");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(710, 570, 60, 14);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\10n.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 460, 110, 70);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\1n.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 40, 50, 80);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\2n.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 140, 60, 70);

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\3n.png")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 230, 60, 70);

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\4n.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(330, 320, 60, 70);

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\5n.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(330, 440, 60, 70);

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\6n.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(740, 50, 60, 70);

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\7n.png")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(740, 140, 60, 70);

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\8n.png")); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(740, 240, 60, 70);

        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\9n.png")); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(740, 340, 60, 70);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Atras");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(40, 570, 40, 14);

        jButton11.setBackground(new java.awt.Color(255, 255, 153));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\sigi.png")); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(20, 570, 110, 100);

        jButton12.setBackground(new java.awt.Color(255, 255, 153));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\juan1\\Downloads\\sigi.png")); // NOI18N
        jButton12.setPreferredSize(new java.awt.Dimension(850, 750));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(702, 568, 112, 99);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sonido("1"); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         sonido("2");        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        sonido("3"); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         sonido("4"); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       sonido("5"); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       sonido("6"); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        sonido("7"); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        sonido("8"); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       sonido("9"); 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sonido("10"); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ventanaadmin ingreso = new ventanaadmin();
        ingreso.setVisible(true);
        ingreso.pack();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        numeros ingreso = new numeros();
        ingreso.setVisible(true);
        ingreso.pack();
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(numeros1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(numeros1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(numeros1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(numeros1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new numeros1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    // End of variables declaration//GEN-END:variables
}
