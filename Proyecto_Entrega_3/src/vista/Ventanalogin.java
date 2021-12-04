/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author JULIO
 */
public class Ventanalogin extends javax.swing.JFrame {

    /**
     * Creates new form Ventanalogin
     */
    public Ventanalogin() {
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

        jBSalir = new javax.swing.JButton();
        jLUsuario = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jBIniciarSesion = new javax.swing.JButton();
        jLTituloEmpresa = new javax.swing.JLabel();
        jLTituloEmpresa2 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSalir.setBackground(new java.awt.Color(153, 255, 255));
        jBSalir.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 80, 40));

        jLUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLUsuario.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLUsuario.setText("Usuario:");
        getContentPane().add(jLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 80, 20));

        jLPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLPassword.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        jLPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLPassword.setText("Contraseña:");
        getContentPane().add(jLPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, -1));

        jBIniciarSesion.setBackground(new java.awt.Color(153, 255, 255));
        jBIniciarSesion.setFont(new java.awt.Font("Orbitron", 1, 14)); // NOI18N
        jBIniciarSesion.setText("Iniciar Sesion");
        jBIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jBIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, 40));

        jLTituloEmpresa.setFont(new java.awt.Font("Orbitron", 1, 48)); // NOI18N
        jLTituloEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloEmpresa.setText("DELIVERY");
        getContentPane().add(jLTituloEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 560, 70));

        jLTituloEmpresa2.setFont(new java.awt.Font("Orbitron", 1, 48)); // NOI18N
        jLTituloEmpresa2.setForeground(new java.awt.Color(255, 255, 255));
        jLTituloEmpresa2.setText("UPAR ");
        getContentPane().add(jLTituloEmpresa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 210, 30));
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 210, 30));

        jLFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo15.jpg"))); // NOI18N
        getContentPane().add(jLFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarSesionActionPerformed


        
    if(jPassword.getText().equals("456")&& jTUsuario.getText().equals("ms")){
        
            VentanaRegistroRepartidores H=new VentanaRegistroRepartidores();
            H.setVisible(true);
            this.setVisible(false);

        }if(jPassword.getText().equals("123")&& jTUsuario.getText().equals("sm")){

                VentanaRegistroDestinatario H=new VentanaRegistroDestinatario();
                H.setVisible(true);
                this.setVisible(false);
            
       
    }else{
            JOptionPane.showMessageDialog(this, "Datos Erroneos");
        }
            
        
    }//GEN-LAST:event_jBIniciarSesionActionPerformed

    private void jTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioActionPerformed


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
            java.util.logging.Logger.getLogger(Ventanalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanalogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanalogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIniciarSesion;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLFondo1;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLTituloEmpresa;
    private javax.swing.JLabel jLTituloEmpresa2;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}