/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.ClsCandidato;
import Controladores.CtlCandidato;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesar
 */
public class VistaGestorCandidato extends javax.swing.JFrame {

    
    JFrame menuPrincipal;
    CtlCandidato controladorCandidato;
    boolean respuesta;
    String tipoDocumento;
    String numeroDocumento;
    String nombre;
    String telefono;
    String correo;
    String partidoPolitico;
    String ciudad;
    String descripcion;
    String mensajeCampania;
    String propuestas;
    Pattern patron = Pattern
           
            .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
     /**
     * Creates new form VistaGestorCandidato
     */
    public VistaGestorCandidato(JFrame menuPrinc) {
        initComponents();
        this.menuPrincipal = menuPrinc;
        this.controladorCandidato = new CtlCandidato();
        this.ObtenerCandidatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        listaPartido = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        campoCiudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campoMensajeCampania = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tipoDocu = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        listaPropuesta = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCandidatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Número de cédula");

        jLabel3.setText("Nombre");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        jLabel11.setText("Correo");

        jLabel6.setText("Partido Politico");

        listaPartido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pacto Historico", "Liberal", "Conservador", "Centro Democratico" }));
        listaPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPartidoActionPerformed(evt);
            }
        });

        jLabel7.setText("Ciudad Origen");

        jLabel8.setText("Descripción");

        campoDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescripcionActionPerformed(evt);
            }
        });

        jLabel9.setText("Mensaje Campaña");

        campoMensajeCampania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMensajeCampaniaActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo Documento");

        tipoDocu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "CE", "PP" }));
        tipoDocu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDocuActionPerformed(evt);
            }
        });

        jLabel10.setText("Propuesta");

        listaPropuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Educacion Gratuita", "Impuestos a canasta familiar", "Viajes a la playa", "Mas presupuesto a Guerra" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCedula)
                            .addComponent(campoNombre)
                            .addComponent(tipoDocu, javax.swing.GroupLayout.Alignment.TRAILING, 0, 195, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoTelefono)
                            .addComponent(campoCorreo)
                            .addComponent(listaPartido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoCiudad)
                            .addComponent(campoDescripcion)
                            .addComponent(campoMensajeCampania)
                            .addComponent(listaPropuesta, 0, 195, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregar)))
                .addGap(41, 111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tipoDocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(botonAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(listaPartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoMensajeCampania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(listaPropuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("Formulario", jPanel1);

        tablaCandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Documento", "Tipo Documento", "Candidato", "Correo", "Telefono", "Propuesta", "Partido Politico", "Campaña", "Descripcion", "Ciudad Origen"
            }
        ));
        jScrollPane1.setViewportView(tablaCandidatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista", jPanel2);

        jLabel1.setText("Gestor candidato");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botonVolver))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(eliminar)
                        .addGap(77, 77, 77)
                        .addComponent(editar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        
        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
        
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
    
        if (this.tipoDocu.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(this, "Seleccione tipo documento");
        } else {
            tipoDocumento = this.tipoDocu.getSelectedItem().toString();
            if (this.campoCedula.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "El campo Numero de Documento no puede ser Vacio");
            } else {
                numeroDocumento = this.campoCedula.getText();
                if (this.campoNombre.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "El campo Nombre no puede ser Vacio");
                } else {
                    nombre = this.campoNombre.getText();
                    if (this.campoTelefono.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "El campo Telefono no puede ser Vacio");
                    } else {
                        telefono = this.campoTelefono.getText();
                        if (this.campoCorreo.getText().equals("")) {
                            JOptionPane.showMessageDialog(this, "El campo Correo no puede ser Vacio");
                        } else {
                            correo = this.campoCorreo.getText();
                            Matcher mather = patron.matcher(correo);
                            if (mather.find() == true) {
                                System.out.println("El email ingresado es válido.");
                                if (this.listaPartido.getSelectedItem().toString().equals("")) {
                                    JOptionPane.showMessageDialog(this, "El campo Partido Politico no puede ser Vacio");
                                } else {
                                    partidoPolitico = this.listaPartido.getSelectedItem().toString();
                                    if (this.campoCiudad.getText().equals("")) {
                                        JOptionPane.showMessageDialog(this, "El campo Ciudad de Origen no puede ser Vacio");
                                    } else {
                                        ciudad = this.campoCiudad.getText();
                                        if (this.campoDescripcion.getText().equals("")) {
                                            JOptionPane.showMessageDialog(this, "El campo Descripción no puede ser Vacio");
                                        } else {
                                            descripcion = this.campoDescripcion.getText();
                                            if (this.campoMensajeCampania.getText().equals("")) {
                                                JOptionPane.showMessageDialog(this, "El campo Mensaje Campaña no puede ser Vacio");
                                            } else {
                                                mensajeCampania = this.campoMensajeCampania.getText();
                                                if (this.listaPropuesta.getSelectedItem().equals("")) {
                                                    JOptionPane.showMessageDialog(this, "El campo Propuestas no puede ser Vacio");
                                                } else {
                                                    propuestas = this.listaPropuesta.getSelectedItem().toString();
                                                    ClsCandidato candidato = new ClsCandidato(numeroDocumento, tipoDocumento, nombre, telefono, correo, partidoPolitico, ciudad, descripcion, mensajeCampania, propuestas);
                                                    respuesta = this.controladorCandidato.agregarCandidato(candidato);
                                                    if (respuesta == true) {
                                                        JOptionPane.showMessageDialog(null, "Candidato Ingresado Correctamente a la BD");
                                                        
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "El Candidato no pudo ser agregado a la BD");
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("El email ingresado es inválido.");
                                JOptionPane.showMessageDialog(this, "Digite el correo con el formato: ejemplo@ejemplo.com");
                            }

                        }
                    }
                }
            }
        }
        
       // ClsCandidato candidato = new ClsCandidato(numeroCedula, nombre);
        
        //boolean respuesta = this.controladorCandidato.agregarCandidato(candidato);
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void listaPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPartidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPartidoActionPerformed

    private void campoDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescripcionActionPerformed

    private void campoMensajeCampaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMensajeCampaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMensajeCampaniaActionPerformed

    private void tipoDocuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDocuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDocuActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarActionPerformed

    public void ObtenerCandidatos(){
        LinkedList<ClsCandidato> listaCandidatos=this.controladorCandidato.ObtenerCandidatos();
        this.actualizarTabla(listaCandidatos);
    }
    private void actualizarTabla(LinkedList<ClsCandidato> candidatos){
        DefaultTableModel modelo = (DefaultTableModel) this.tablaCandidatos.getModel();
        modelo.setRowCount(0);
        
        for (ClsCandidato c : candidatos){
        
            Object[] fila = {c.getNumeroDocumento(),c.getTipoDocumento(),c.getNombre(),c.getCorreo(),c.getTelefono(),c.getPropuestas(),c.getPartidoPolitico(),c.getMensajeCampania(),c.getDescripcion(),c.getCiudadOrigen()};
            
            modelo.addRow(fila);
            
        
        }
        
        
    }
    
    
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
            java.util.logging.Logger.getLogger(VistaGestorCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGestorCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGestorCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGestorCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /editar* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGestorCandidato(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoMensajeCampania;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> listaPartido;
    private javax.swing.JComboBox<String> listaPropuesta;
    private javax.swing.JTable tablaCandidatos;
    private javax.swing.JComboBox<String> tipoDocu;
    // End of variables declaration//GEN-END:variables
}
