/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.PantallaPrincipal;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author LENOVO
 */
public class InicioAproAir extends javax.swing.JFrame {

    private Object txtUsuario;

    /**
     * Creates new form AccesoAproAir
     */
    public InicioAproAir() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel LbUsuario = new javax.swing.JLabel();
        javax.swing.JLabel LabImag = new javax.swing.JLabel();
        javax.swing.JLabel labelpassword = new javax.swing.JLabel();
        javax.swing.JTextField Txtus = new javax.swing.JTextField();
        javax.swing.JButton BtonEntrar = new javax.swing.JButton();
        javax.swing.JPasswordField Password = new javax.swing.JPasswordField();
        javax.swing.JLabel Labfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LbUsuario.setText("USUARIO :");
        getContentPane().add(LbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        LabImag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images (3).jpg"))); // NOI18N
        getContentPane().add(LabImag, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        labelpassword.setBackground(new java.awt.Color(51, 153, 255));
        labelpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelpassword.setForeground(new java.awt.Color(255, 255, 255));
        labelpassword.setText("PASSWORD :");
        getContentPane().add(labelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        Txtus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txtus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtusActionPerformed(evt);
            }
        });
        getContentPane().add(Txtus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 160, -1));

        BtonEntrar.setBackground(new java.awt.Color(0, 204, 204));
        BtonEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtonEntrar.setText("ENTRAR");
        BtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        Password.setText("jPasswordField1");
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, 20));

        Labfondo.setBackground(new java.awt.Color(102, 102, 255));
        Labfondo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Labfondo.setForeground(new java.awt.Color(255, 255, 255));
        Labfondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(Labfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 664, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void TxtusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtusActionPerformed
        
    }//GEN-LAST:event_TxtusActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        
    }//GEN-LAST:event_PasswordActionPerformed

    private void BtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonEntrarActionPerformed
        String user,clave;
        clave = Password.getText();
        user = txtUsuario.getText();
        if ( user.equalsIgnoreCase("administrador") && clave.equals("nays")){
          PantallaPrincipal  p = new PantallaPrincipal();
          p.setvisible(true);
          dispose();
          
        }
        else{
            JOptionPane.showMessageDialog(this, "usuario/ contraseña incorrecta" );
        }
        
    }//GEN-LAST:event_BtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(AccesoAproAir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoAproAir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoAproAir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoAproAir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioAproAir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
  private static class JTextField1 {

        private static Object getText() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JTextField1() {
        }
    }

        private void setvisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }