
package Visual;

import javax.swing.JOptionPane;
import static Visual.PacienteVisual.listPaciente;
import java.util.GregorianCalendar;

public class BusquedaPaciente extends javax.swing.JFrame {
    PacienteVisual pv=new PacienteVisual();

    public BusquedaPaciente() {
        initComponents();
        BotonTransparente();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBusquedaPaciente = new javax.swing.JLabel();
        jLabelIngresarCedula = new javax.swing.JLabel();
        jTextFieldIngresarCedula = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelBusquedaPaciente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelBusquedaPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBusquedaPaciente.setText("Busqueda de Paciente");
        getContentPane().add(jLabelBusquedaPaciente);
        jLabelBusquedaPaciente.setBounds(0, 60, 660, 29);

        jLabelIngresarCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelIngresarCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIngresarCedula.setText("Ingrese la cedula del Paciente:");
        getContentPane().add(jLabelIngresarCedula);
        jLabelIngresarCedula.setBounds(280, 177, 330, 30);
        getContentPane().add(jTextFieldIngresarCedula);
        jTextFieldIngresarCedula.setBounds(280, 220, 330, 30);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupita.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(280, 260, 150, 41);

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar);
        jButtonRegresar.setBounds(480, 260, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente (2).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 94, 250, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/internalframe.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 370);

        setSize(new java.awt.Dimension(660, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        Bienvenida bv=new Bienvenida();
        bv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if(pv.buscar_cedula(jTextFieldIngresarCedula.getText())!=-1){
            GregorianCalendar fechaA=null;
            if(listPaciente.get(pv.buscar_cedula(jTextFieldIngresarCedula.getText())).getHistClinica()!=null){
                fechaA=listPaciente.get(pv.buscar_cedula(jTextFieldIngresarCedula.getText())).getHistClinica().getFecha_apertura();
            }
            else{
                fechaA=new GregorianCalendar();
                
            }
            String cedula=listPaciente.get(pv.buscar_cedula(jTextFieldIngresarCedula.getText())).getCedula();
            String nombre=listPaciente.get(pv.buscar_cedula(jTextFieldIngresarCedula.getText())).getNombre();
            String tipSangre=listPaciente.get(pv.buscar_cedula(jTextFieldIngresarCedula.getText())).getGrupo_sanguineo();
            AtencionPaciente ap=new AtencionPaciente();
            JOptionPane.showMessageDialog(null, "Se encontro al Paciente");
            ap.setVisible(true);
            ap.jLabelCed.setText(cedula);
            ap.jLabelNom.setText(nombre);
            ap.jLabelTipSan.setText(tipSangre);
            ap.jLabelCedMedico.setText(Medicocedula.cedula);
            ap.jDateChooser1.setCalendar(fechaA);
            ap.mostrarAtencion();
            
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No se encotro al Paciente");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    private void BotonTransparente(){
            jButtonBuscar.setOpaque(false);
            jButtonBuscar.setContentAreaFilled(false);
            jButtonBuscar.setBorderPainted(false);
            jButtonRegresar.setOpaque(false);
            jButtonRegresar.setContentAreaFilled(false);
            jButtonRegresar.setBorderPainted(false);
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
            java.util.logging.Logger.getLogger(BusquedaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBusquedaPaciente;
    private javax.swing.JLabel jLabelIngresarCedula;
    private javax.swing.JTextField jTextFieldIngresarCedula;
    // End of variables declaration//GEN-END:variables
}
