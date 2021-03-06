/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author JULIO
 */
public class VentanaRegistroRepartidores extends javax.swing.JFrame {

    DefaultTableModel HMP =new DefaultTableModel();
   

    /**
     * Creates new form VentanaConsulta
     */
    public VentanaRegistroRepartidores() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTableRepartidores.setModel(HMP);
        HMP.addColumn("FechaDeVisita");
        HMP.addColumn("HoraDelVisita");
        HMP.addColumn("NombreCompletosR");
        HMP.addColumn("NoCarnet");
        HMP.addColumn("ID");
        HMP.addColumn("Telefono");
        HMP.addColumn("NombreCompletosD ");
        HMP.addColumn("NoDePaquetes");
        HMP.addColumn("Tipo ");
        HMP.addColumn("ValorDeclarado ");
        HMP.addColumn("EstadoDePaquete ");
        HMP.addColumn("Observaciones ");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPConsuolta = new javax.swing.JPanel();
        jLFechaDeVisita = new javax.swing.JLabel();
        jLHoraDeVisita = new javax.swing.JLabel();
        jTextFieldFechaDeViisita = new javax.swing.JTextField();
        jTextFieldNombreCompleto = new javax.swing.JTextField();
        jLTipo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldHoraDeVisita = new javax.swing.JTextField();
        jTextFieldDatosDestinatario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNoCarnet = new javax.swing.JTextField();
        jLID = new javax.swing.JLabel();
        jLNombreCompletoD = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNombreCompletoD = new javax.swing.JTextField();
        jLTelefonoD = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLNoDePaquetes = new javax.swing.JLabel();
        jTextFieldDatosRepartidor = new javax.swing.JTextField();
        jTextFieldNoDePaquetes = new javax.swing.JTextField();
        jTextFieldDatosPaquete = new javax.swing.JTextField();
        jLObservaciones = new javax.swing.JLabel();
        jLValorDeclarado = new javax.swing.JLabel();
        jLEstadoDePaquete = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jTextFieldValorDeclarado = new javax.swing.JTextField();
        jTextFieldEstadoDePaquete = new javax.swing.JTextField();
        jTextFieldObservacion = new javax.swing.JTextField();
        jLConsultas = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        jPTablaRepartidores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRepartidores = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();
        jBSiguiente = new javax.swing.JButton();
        jLFormatoDeReapartidores = new javax.swing.JLabel();
        jNuevo = new javax.swing.JButton();
        jLFondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPConsuolta.setBackground(new java.awt.Color(204, 204, 255));

        jLFechaDeVisita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLFechaDeVisita.setText("Fecha De Visita:");

        jLHoraDeVisita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLHoraDeVisita.setText("Hora De Visita:");

        jTextFieldFechaDeViisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaDeViisitaActionPerformed(evt);
            }
        });

        jTextFieldNombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCompletoActionPerformed(evt);
            }
        });

        jLTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTipo.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre Completo:");

        jTextFieldDatosDestinatario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDatosDestinatario.setText("DATOS DE DESTINATARIO");
        jTextFieldDatosDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDatosDestinatarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("No Carnet:");

        jLID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLID.setText("ID:");

        jLNombreCompletoD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNombreCompletoD.setText("Nombre Completo:");

        jLTelefonoD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTelefonoD.setText("Telefono:");

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });

        jLNoDePaquetes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNoDePaquetes.setText("No De Paquetes:");

        jTextFieldDatosRepartidor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDatosRepartidor.setText("DATOS DEL REPARTIDOR");
        jTextFieldDatosRepartidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDatosRepartidorActionPerformed(evt);
            }
        });

        jTextFieldDatosPaquete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDatosPaquete.setText("DATOS DEL PAQUETE");
        jTextFieldDatosPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDatosPaqueteActionPerformed(evt);
            }
        });

        jLObservaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObservaciones.setText("Observaciones:");

        jLValorDeclarado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLValorDeclarado.setText("Valor Declarado:");

        jLEstadoDePaquete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLEstadoDePaquete.setText("Estado De Paquete:");

        jTextFieldEstadoDePaquete.setText(" ");

        javax.swing.GroupLayout jPConsuoltaLayout = new javax.swing.GroupLayout(jPConsuolta);
        jPConsuolta.setLayout(jPConsuoltaLayout);
        jPConsuoltaLayout.setHorizontalGroup(
            jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsuoltaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPConsuoltaLayout.createSequentialGroup()
                            .addComponent(jLFechaDeVisita)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldFechaDeViisita, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(jLHoraDeVisita)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldHoraDeVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPConsuoltaLayout.createSequentialGroup()
                            .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNoCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNombreCompleto))))
                    .addComponent(jTextFieldDatosRepartidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDatosPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDatosDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPConsuoltaLayout.createSequentialGroup()
                        .addComponent(jLID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLTelefonoD)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsuoltaLayout.createSequentialGroup()
                        .addComponent(jLNombreCompletoD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombreCompletoD, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPConsuoltaLayout.createSequentialGroup()
                        .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPConsuoltaLayout.createSequentialGroup()
                                .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNoDePaquetes)
                                    .addComponent(jLTipo))
                                .addGap(18, 18, 18)
                                .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNoDePaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTipo)))
                            .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPConsuoltaLayout.createSequentialGroup()
                                    .addComponent(jLEstadoDePaquete)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldEstadoDePaquete))
                                .addGroup(jPConsuoltaLayout.createSequentialGroup()
                                    .addComponent(jLValorDeclarado)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldValorDeclarado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(84, 84, 84)
                        .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLObservaciones)
                            .addComponent(jTextFieldObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPConsuoltaLayout.setVerticalGroup(
            jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPConsuoltaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFechaDeVisita)
                    .addComponent(jTextFieldFechaDeViisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLHoraDeVisita)
                    .addComponent(jTextFieldHoraDeVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jTextFieldDatosRepartidor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNoCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDatosDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefonoD)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreCompletoD)
                    .addComponent(jTextFieldNombreCompletoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDatosPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPConsuoltaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNoDePaquetes)
                            .addComponent(jTextFieldNoDePaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTipo)
                            .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLValorDeclarado)
                            .addComponent(jTextFieldValorDeclarado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPConsuoltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEstadoDePaquete)
                            .addComponent(jTextFieldEstadoDePaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPConsuoltaLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLObservaciones)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPConsuolta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 710, 570));

        jLConsultas.setFont(new java.awt.Font("Orbitron", 1, 64)); // NOI18N
        jLConsultas.setForeground(new java.awt.Color(255, 255, 255));
        jLConsultas.setText("DELIVERY - UPAR");
        getContentPane().add(jLConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 720, 60));

        jBEliminar.setBackground(new java.awt.Color(255, 204, 255));
        jBEliminar.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, -1, 30));

        jTableRepartidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableRepartidores);

        javax.swing.GroupLayout jPTablaRepartidoresLayout = new javax.swing.GroupLayout(jPTablaRepartidores);
        jPTablaRepartidores.setLayout(jPTablaRepartidoresLayout);
        jPTablaRepartidoresLayout.setHorizontalGroup(
            jPTablaRepartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        jPTablaRepartidoresLayout.setVerticalGroup(
            jPTablaRepartidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPTablaRepartidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 610, 360));

        jBGuardar.setBackground(new java.awt.Color(255, 153, 255));
        jBGuardar.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 600, -1, 30));

        jBSiguiente.setBackground(new java.awt.Color(255, 153, 255));
        jBSiguiente.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jBSiguiente.setText("SIGUIENTE");
        jBSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jBSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 720, 160, 30));

        jLFormatoDeReapartidores.setFont(new java.awt.Font("Orbitron", 1, 36)); // NOI18N
        jLFormatoDeReapartidores.setForeground(new java.awt.Color(255, 153, 255));
        jLFormatoDeReapartidores.setText("FORMATO DE REPARTIDORES");
        getContentPane().add(jLFormatoDeReapartidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 700, -1));

        jNuevo.setBackground(new java.awt.Color(255, 153, 255));
        jNuevo.setFont(new java.awt.Font("Orbitron", 1, 18)); // NOI18N
        jNuevo.setText("CANCELAR");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 600, -1, -1));

        jLFondo1.setBackground(new java.awt.Color(0, 51, 255));
        jLFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo456.jpg"))); // NOI18N
        getContentPane().add(jLFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1600, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = jTableRepartidores.getSelectedRow ();
        if (fila>=0){
            HMP.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null,"Seleccionar FIla, Por favor ");
        }       
        

    }//GEN-LAST:event_jBEliminarActionPerformed
     
void ArchivarDatos() throws FileNotFoundException{    
     
     FileOutputStream hp=new FileOutputStream("RegistroDeliveryUparReparto.txt",true);
     DataOutputStream ph=new DataOutputStream(hp);
 
     try {
        String FechaDeVisita,HoraDeVisita,NombreCompletoD,NoCarnet,ID,Telefono,NombreCompletoR,NoDePaquetes,Tipo,ValorDeclarado,EstadoDePaquete,Observaciones;
        

        FechaDeVisita=jTextFieldFechaDeViisita.getText();
        HoraDeVisita=jTextFieldHoraDeVisita.getText();
        NombreCompletoD=jTextFieldNombreCompleto.getText();
        NoCarnet=jTextFieldNoCarnet.getText();
        ID=jTextFieldID.getText();
        Telefono=jTextFieldTelefono.getText();
        NombreCompletoR=jTextFieldNombreCompletoD.getText();
        NoDePaquetes=jTextFieldNoDePaquetes.getText();
        Tipo=jTextFieldTipo.getText();
        ValorDeclarado=jTextFieldValorDeclarado.getText();
        EstadoDePaquete=jTextFieldEstadoDePaquete.getText();
        Observaciones=jTextFieldObservacion.getText();
        

        ph.writeUTF(FechaDeVisita);
        ph.writeUTF(HoraDeVisita);
        ph.writeUTF(NombreCompletoD);
        ph.writeUTF(NoCarnet);
        ph.writeUTF(ID);
        ph.writeUTF(Telefono);
        ph.writeUTF(NombreCompletoR);
        ph.writeUTF(NoDePaquetes);
        ph.writeUTF(Tipo);
        ph.writeUTF(ValorDeclarado);
        ph.writeUTF(EstadoDePaquete);
        ph.writeUTF(Observaciones);

        } catch (Exception k) {
        }
}
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        try{ ArchivarDatos();    
            } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaRegistroRemitente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        HMP.addRow(new Object[]{
            jTextFieldFechaDeViisita.getText(), jTextFieldHoraDeVisita.getText(),jTextFieldNombreCompleto.getText(),jTextFieldNoCarnet.getText(),jTextFieldID.getText(),
            jTextFieldTelefono.getText(),jTextFieldNombreCompletoD.getText(), jTextFieldNoDePaquetes.getText(),jTextFieldTipo.getText(),jTextFieldValorDeclarado.getText(),
            jTextFieldEstadoDePaquete.getText(),jTextFieldObservacion.getText()
        });

        
        jTextFieldFechaDeViisita.setText("");
        jTextFieldHoraDeVisita.setText("");
        jTextFieldNombreCompleto.setText("");
        jTextFieldNoCarnet.setText("");
        jTextFieldID.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldNombreCompletoD.setText("");
        jTextFieldNoDePaquetes.setText("");
        jTextFieldTipo.setText("");
        jTextFieldValorDeclarado.setText("");
        jTextFieldEstadoDePaquete.setText("");
        jTextFieldObservacion.setText("");
        
    
        
    }                                         

    private void jTextFieldFechaDeEntregaActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteActionPerformed

            
        VentanaDespedida H =new VentanaDespedida();
            H.setVisible(true);
            this.setVisible(false);

    }//GEN-LAST:event_jBSiguienteActionPerformed

    private void jTextFieldFechaDeViisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaDeViisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaDeViisitaActionPerformed

    private void jTextFieldDatosDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDatosDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDatosDestinatarioActionPerformed

    private void jTextFieldDatosPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDatosPaqueteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDatosPaqueteActionPerformed

    private void jTextFieldDatosRepartidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDatosRepartidorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDatosRepartidorActionPerformed

    private void jTextFieldNombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreCompletoActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        jTextFieldFechaDeViisita.setText("");
        jTextFieldHoraDeVisita.setText("");
        jTextFieldNombreCompleto.setText("");
        jTextFieldNoCarnet.setText("");
        jTextFieldID.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldNombreCompletoD.setText("");
        jTextFieldNoDePaquetes.setText("");
        jTextFieldTipo.setText("");
        jTextFieldValorDeclarado.setText("");
        jTextFieldEstadoDePaquete.setText("");
        jTextFieldObservacion.setText("");
        
    
    }//GEN-LAST:event_jNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JLabel jLConsultas;
    private javax.swing.JLabel jLEstadoDePaquete;
    private javax.swing.JLabel jLFechaDeVisita;
    private javax.swing.JLabel jLFondo1;
    private javax.swing.JLabel jLFormatoDeReapartidores;
    private javax.swing.JLabel jLHoraDeVisita;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLNoDePaquetes;
    private javax.swing.JLabel jLNombreCompletoD;
    private javax.swing.JLabel jLObservaciones;
    private javax.swing.JLabel jLTelefonoD;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLValorDeclarado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jNuevo;
    private javax.swing.JPanel jPConsuolta;
    private javax.swing.JPanel jPTablaRepartidores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRepartidores;
    private javax.swing.JTextField jTextFieldDatosDestinatario;
    private javax.swing.JTextField jTextFieldDatosPaquete;
    private javax.swing.JTextField jTextFieldDatosRepartidor;
    private javax.swing.JTextField jTextFieldEstadoDePaquete;
    private javax.swing.JTextField jTextFieldFechaDeViisita;
    private javax.swing.JTextField jTextFieldHoraDeVisita;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNoCarnet;
    private javax.swing.JTextField jTextFieldNoDePaquetes;
    private javax.swing.JTextField jTextFieldNombreCompleto;
    private javax.swing.JTextField jTextFieldNombreCompletoD;
    private javax.swing.JTextField jTextFieldObservacion;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldValorDeclarado;
    // End of variables declaration//GEN-END:variables
}
