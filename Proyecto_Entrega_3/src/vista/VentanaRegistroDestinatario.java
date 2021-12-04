/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author JULIO
 */
public class VentanaRegistroDestinatario extends javax.swing.JFrame {

    DefaultTableModel HMP =new DefaultTableModel();
    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistroDestinatario() {
        initComponents();
        this.setLocationRelativeTo(null);
                
        TablaDestinatario.setModel(HMP);
        HMP.addColumn("No Paquete");
        HMP.addColumn("Fecha Ingreso");
        HMP.addColumn("Nombres Completos");
        HMP.addColumn("Calle/Carrera");
        HMP.addColumn("No de Vivienda");
        HMP.addColumn("Coigo Postal ");
        HMP.addColumn("Telefono ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPDatosDelDestinatario = new javax.swing.JPanel();
        jLDatosDelDestinatario = new javax.swing.JLabel();
        jLNombreCompletos = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jLCalleCarrera = new javax.swing.JLabel();
        jLCodigoPostal = new javax.swing.JLabel();
        jLNodevivienda = new javax.swing.JLabel();
        jTextFieldNombreCompleto = new javax.swing.JTextField();
        jTextFieldCalleCarrera = new javax.swing.JTextField();
        jTTelefono = new javax.swing.JTextField();
        jTextFieldCodigoPostal = new javax.swing.JTextField();
        jTextFieldNodevivienda = new javax.swing.JTextField();
        jLNoPaquete = new javax.swing.JLabel();
        jLFechaDeIngreso = new javax.swing.JLabel();
        jTextFieldNoPaquete = new javax.swing.JTextField();
        jTextFieldFechaDeIngreso = new javax.swing.JTextField();
        jLTiituloEmpresa = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jLFormatoR = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jCbEstadoInicial = new javax.swing.JComboBox<>();
        jBAtras = new javax.swing.JButton();
        jPTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDestinatario = new javax.swing.JTable();
        jBEliminar = new javax.swing.JButton();
        jLFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPDatosDelDestinatario.setBackground(new java.awt.Color(204, 255, 255));

        jLDatosDelDestinatario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLDatosDelDestinatario.setText("DATOS DEL DESTINATARIO");

        jLNombreCompletos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNombreCompletos.setText("Nombre Completo:");

        jLDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLDireccion.setText("Direccion");

        jLTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLTelefono.setText("Telefono:");

        jLCalleCarrera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLCalleCarrera.setText("Calle/Carrera:");

        jLCodigoPostal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLCodigoPostal.setText("Codigo Postal:");

        jLNodevivienda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLNodevivienda.setText("No de vivienda:");

        jTextFieldNombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCompletoActionPerformed(evt);
            }
        });

        jTextFieldCalleCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCalleCarreraActionPerformed(evt);
            }
        });

        jTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTelefonoActionPerformed(evt);
            }
        });

        jTextFieldCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoPostalActionPerformed(evt);
            }
        });

        jTextFieldNodevivienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNodeviviendaActionPerformed(evt);
            }
        });

        jLNoPaquete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNoPaquete.setText("No Paquete");

        jLFechaDeIngreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLFechaDeIngreso.setText("Fecha De Ingreso:");

        javax.swing.GroupLayout jPDatosDelDestinatarioLayout = new javax.swing.GroupLayout(jPDatosDelDestinatario);
        jPDatosDelDestinatario.setLayout(jPDatosDelDestinatarioLayout);
        jPDatosDelDestinatarioLayout.setHorizontalGroup(
            jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosDelDestinatarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosDelDestinatarioLayout.createSequentialGroup()
                        .addComponent(jLNoPaquete)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLFechaDeIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFechaDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosDelDestinatarioLayout.createSequentialGroup()
                        .addComponent(jLNombreCompletos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDatosDelDestinatarioLayout.createSequentialGroup()
                            .addComponent(jLCodigoPostal)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLTelefono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTTelefono))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDatosDelDestinatarioLayout.createSequentialGroup()
                            .addComponent(jLDireccion)
                            .addGap(52, 52, 52)
                            .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLCalleCarrera)
                                .addComponent(jLNodevivienda))
                            .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPDatosDelDestinatarioLayout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jTextFieldCalleCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPDatosDelDestinatarioLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldNodevivienda))))))
                .addGap(33, 33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosDelDestinatarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLDatosDelDestinatario)
                .addGap(210, 210, 210))
        );
        jPDatosDelDestinatarioLayout.setVerticalGroup(
            jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosDelDestinatarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLDatosDelDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNoPaquete)
                    .addComponent(jTextFieldNoPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLFechaDeIngreso)
                    .addComponent(jTextFieldFechaDeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreCompletos)
                    .addComponent(jTextFieldNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosDelDestinatarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCalleCarrera)
                            .addComponent(jTextFieldCalleCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNodevivienda)
                            .addComponent(jTextFieldNodevivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(jPDatosDelDestinatarioLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPDatosDelDestinatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCodigoPostal)
                            .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPDatosDelDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 600, 310));

        jLTiituloEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        jLTiituloEmpresa.setFont(new java.awt.Font("Orbitron", 1, 64)); // NOI18N
        jLTiituloEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLTiituloEmpresa.setText("DELIVERY - UPAR");
        getContentPane().add(jLTiituloEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 730, 60));

        jBGuardar.setBackground(new java.awt.Color(0, 255, 204));
        jBGuardar.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, 40));

        jLFormatoR.setFont(new java.awt.Font("Orbitron", 1, 36)); // NOI18N
        jLFormatoR.setForeground(new java.awt.Color(102, 255, 255));
        jLFormatoR.setText("Formato de paqueteria");
        getContentPane().add(jLFormatoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 540, 40));

        jBCancelar.setBackground(new java.awt.Color(51, 255, 204));
        jBCancelar.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jBCancelar.setText("CANCELAR");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 160, 40));

        jCbEstadoInicial.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jCbEstadoInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingresado", "Repartido", "Entregado", "En Bodega" }));
        jCbEstadoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbEstadoInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jCbEstadoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, 170, 40));

        jBAtras.setBackground(new java.awt.Color(153, 255, 255));
        jBAtras.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jBAtras.setText("SIGUIENTE");
        jBAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jBAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 630, -1, 40));

        TablaDestinatario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDestinatario);

        javax.swing.GroupLayout jPTablaLayout = new javax.swing.GroupLayout(jPTabla);
        jPTabla.setLayout(jPTablaLayout);
        jPTablaLayout.setHorizontalGroup(
            jPTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        jPTablaLayout.setVerticalGroup(
            jPTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        getContentPane().add(jPTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 640, 310));

        jBEliminar.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 140, 40));

        jLFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo456.jpg"))); // NOI18N
        getContentPane().add(jLFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

void ArchivarDatos() throws FileNotFoundException{
     FileOutputStream hp=new FileOutputStream("RegistroDeliveryUpar.txt",true);
     DataOutputStream ph=new DataOutputStream(hp);
 
     try {
        String NoPaquete,FechaIngreso,NombresCompletos,CalleCarrera,NodeVivienda,CoigoPostal,Telefono;
//                NombresCompletosR,CalleCarreraR,NodeViviendaR,Pais,Ciudad,TelefonoR,
//                Tipo,Largo,Ancho,Alto,Pesokg,Descripcion,ValorDeclarado,
//                FechaLimite,Observaciones;
        
        NoPaquete=jTextFieldNoPaquete.getText();
        FechaIngreso=jTextFieldFechaDeIngreso.getText();
        NombresCompletos=jTextFieldNombreCompleto.getText();
        CalleCarrera=jTextFieldCalleCarrera.getText();
        NodeVivienda=jTextFieldNodevivienda.getText();
        CoigoPostal=jTextFieldCodigoPostal.getText();
        Telefono=jTTelefono.getText();
//        NombresCompletosR=jTextFieldNombreCompletosR.getText();
//        CalleCarreraR=jTextFieldCalleCarreraR.getText();
//        NodeViviendaR=jTextFieldNodeviviendaR.getText();
//        Pais=jTextFieldPaisR.getText();
//        Ciudad=jTextFieldCiudadR.getText();
//        TelefonoR=jTextFieldTelefonoR.getText();
//        Tipo=jTextFieldTipo.getText();
//        Alto=jTextFieldAlto.getText();
//        Largo=jTextFieldLargo.getText();
//        Ancho=jTextFieldAncho.getText();
//        Pesokg=jTextFieldPesop.getText();
//        Descripcion=jTextFieldDescripcion.getText();
//        ValorDeclarado=jTextFieldValorDeclarado.getText();
//        FechaLimite=jTextFieldFechaLimiteEntrega.getText();
//        Observaciones=jTextFieldObservacionesA.getText();

        
        ph.writeUTF(NoPaquete);
        ph.writeUTF(FechaIngreso);
        ph.writeUTF(NombresCompletos);
        ph.writeUTF(CalleCarrera);
        ph.writeUTF(NodeVivienda);
        ph.writeUTF(CoigoPostal);
        ph.writeUTF(Telefono);
//        ph.writeUTF(NombresCompletosR);
//        ph.writeUTF(CalleCarreraR);
//        ph.writeUTF(NodeViviendaR);
//        ph.writeUTF(Pais);
//        ph.writeUTF(Ciudad);
//        ph.writeUTF(TelefonoR);
//        ph.writeUTF(Tipo);
//        ph.writeUTF(Alto);
//        ph.writeUTF(Largo);
//        ph.writeUTF(Ancho);
//        ph.writeUTF(Pesokg);
//        ph.writeUTF(Descripcion);
//        ph.writeUTF(ValorDeclarado);
//        ph.writeUTF(FechaLimite);
//        ph.writeUTF(Observaciones);

        } catch (Exception k) {
        }
}    
    
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        
        try{ ArchivarDatos();    
            } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaRegistroDestinatario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        HMP.addRow(new Object[]{
        jTextFieldNoPaquete.getText(),jTextFieldFechaDeIngreso.getText(),jTextFieldNombreCompleto.getText(),jTextFieldCalleCarrera.getText(),jTextFieldNodevivienda.getText(),jTextFieldCodigoPostal.getText(), jTTelefono.getText()});

        
        jTextFieldNoPaquete.setText("");
        jTextFieldFechaDeIngreso.setText("");
        jTextFieldNombreCompleto.setText("");
        jTextFieldCalleCarrera.setText("");
        jTextFieldNodevivienda.setText("");
        jTextFieldCodigoPostal.setText("");
        jTTelefono.setText("");

        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTextFieldNombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreCompletoActionPerformed

    private void jTextFieldCalleCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCalleCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCalleCarreraActionPerformed

    private void jTextFieldNodeviviendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNodeviviendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNodeviviendaActionPerformed

    private void jTextFieldCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoPostalActionPerformed

    private void jTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTTelefonoActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
 
        jTextFieldNoPaquete.setText("");
        jTextFieldFechaDeIngreso.setText("");
        jTextFieldNombreCompleto.setText("");
        jTextFieldCalleCarrera.setText("");
        jTextFieldNodevivienda.setText("");
        jTextFieldCodigoPostal.setText("");
        jTTelefono.setText("");

    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jCbEstadoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbEstadoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbEstadoInicialActionPerformed

    private void jBAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtrasActionPerformed

            VentanaRegistroRemitente H =new VentanaRegistroRemitente();
            H.setVisible(true);
            this.setVisible(false);
        


    }//GEN-LAST:event_jBAtrasActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = TablaDestinatario.getSelectedRow ();
        if (fila>=0){
            HMP.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccionar FIla, Por favor ");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDestinatario;
    private javax.swing.JButton jBAtras;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<String> jCbEstadoInicial;
    private javax.swing.JLabel jLCalleCarrera;
    private javax.swing.JLabel jLCodigoPostal;
    private javax.swing.JLabel jLDatosDelDestinatario;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLFechaDeIngreso;
    private javax.swing.JLabel jLFondo1;
    private javax.swing.JLabel jLFormatoR;
    private javax.swing.JLabel jLNoPaquete;
    private javax.swing.JLabel jLNodevivienda;
    private javax.swing.JLabel jLNombreCompletos;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLTiituloEmpresa;
    private javax.swing.JPanel jPDatosDelDestinatario;
    private javax.swing.JPanel jPTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTextField jTextFieldCalleCarrera;
    private javax.swing.JTextField jTextFieldCodigoPostal;
    private javax.swing.JTextField jTextFieldFechaDeIngreso;
    private javax.swing.JTextField jTextFieldNoPaquete;
    private javax.swing.JTextField jTextFieldNodevivienda;
    private javax.swing.JTextField jTextFieldNombreCompleto;
    // End of variables declaration//GEN-END:variables
}
