/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author JULIO
 */
public class VentanaDespedida extends javax.swing.JFrame {

    /**
     * Creates new form Ventanaespedida
     */
    public VentanaDespedida() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jBNo = new javax.swing.JButton();
        jBSi = new javax.swing.JButton();
        jLPregunta = new javax.swing.JLabel();
        jPpregunta = new javax.swing.JPanel();
        jLFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBNo.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jBNo.setText("NO");
        jBNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNoActionPerformed(evt);
            }
        });
        getContentPane().add(jBNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jBSi.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jBSi.setText("SI");
        jBSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiActionPerformed(evt);
            }
        });
        getContentPane().add(jBSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLPregunta.setBackground(new java.awt.Color(153, 255, 255));
        jLPregunta.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLPregunta.setText("?? DESEA REGISTRAR NUEVAMENTE ?");
        getContentPane().add(jLPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 59));

        jPpregunta.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPpreguntaLayout = new javax.swing.GroupLayout(jPpregunta);
        jPpregunta.setLayout(jPpreguntaLayout);
        jPpreguntaLayout.setHorizontalGroup(
            jPpreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPpreguntaLayout.setVerticalGroup(
            jPpreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPpregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 560, 50));

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono1.jpg"))); // NOI18N
        getContentPane().add(jLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 435));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNoActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jBNoActionPerformed

    private void jBSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiActionPerformed
            
        VentanaRegistroRepartidores H =new VentanaRegistroRepartidores();
            H.setVisible(true);
            this.setVisible(false);

    }//GEN-LAST:event_jBSiActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBNo;
    private javax.swing.JButton jBSi;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLPregunta;
    private javax.swing.JPanel jPpregunta;
    // End of variables declaration//GEN-END:variables
}
