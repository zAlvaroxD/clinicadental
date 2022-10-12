package Visual;
import Entidades.HistoriaClinica;
import Entidades.Paciente;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacienteVisual extends javax.swing.JFrame {
   
    String cedula, nombre, apellido, edad, sexo, tipSangre, medicamentos;
    GregorianCalendar fechanacimiento=new GregorianCalendar(2000, 13, 11);
    
    
            
    public static ArrayList<Paciente> listPaciente =new ArrayList<>();
    public static HistoriaClinica historia =null;
    public static Paciente paciente =null;
    public PacienteVisual() {
        GregorianCalendar actual = new GregorianCalendar();
        
        initComponents();
        Paciente pac1=new Paciente("1758123077", "nelson", "hernandez", actual, "masculino", "A+");
        listPaciente.add(pac1);
        Paciente pac2=new Paciente("1750808204", "Dylan", "Flores", actual, "masculino", "O+");
        listPaciente.add(pac2);
        BotonTransparente();
        jTable1.addMouseListener(new MouseAdapter() {
            DefaultTableModel model=new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e){
                int i= jTable1.getSelectedRow();
                try{
                cedula=(jTable1.getValueAt(i, 0).toString());
                }catch(NullPointerException ex){
                     JOptionPane.showMessageDialog(rootPane, "La tabla esta vacia");
                }
            }
    });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCedula = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelTipoSangre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonlimpiar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonTerminarEdicion = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxTipoSangre = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabelFondo = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCedula.setText("Cedula: ");
        getContentPane().add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabelApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApellido.setText("Apellido:");
        getContentPane().add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSexo.setText("Sexo:");
        getContentPane().add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, 20));

        jLabelTipoSangre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTipoSangre.setText("Tipo de Sangre:");
        getContentPane().add(jLabelTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, 20));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 150, -1));

        jTextFieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCedulaActionPerformed(evt);
            }
        });
        jTextFieldCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 150, -1));

        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 150, -1));

        jButtonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jButtonGuardar.setToolTipText("Guardar");
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 50, 50));

        jButtonlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        jButtonlimpiar.setToolTipText("Limpiar lista");
        jButtonlimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 50, 50));

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButtonRegresar.setToolTipText("Regresar");
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 60, 50));

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarPaciente.png"))); // NOI18N
        jButtonEliminar.setToolTipText("Eliminar Paciente");
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 50, 50));

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 50, 50));

        jButtonTerminarEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terminarEdicion.png"))); // NOI18N
        jButtonTerminarEdicion.setToolTipText("Terminar Edicion");
        jButtonTerminarEdicion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonTerminarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminarEdicionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTerminarEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 50, 50));

        jComboBoxSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        jComboBoxSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "cedula", "nombre y apellido", "edad", "sexo", "tip.sangre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 810, 90));

        jComboBoxTipoSangre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A-", "A+", "B-", "B+", "O-", "O+", "AB-", "AB+" }));
        getContentPane().add(jComboBoxTipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 150, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Fecha Nacimiento:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 150, 20));

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente (2).png"))); // NOI18N
        jLabelImagen.setText(" ");
        getContentPane().add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 280));

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButtonSalir.setToolTipText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 70, 70));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 150, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/internalframe.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 440));

        setSize(new java.awt.Dimension(812, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCedulaActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
    
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        System.out.println("Paciente antes de guardar");
        for(int i=0;i<listPaciente.size();i++){
            System.out.println(""+listPaciente.get(i).toString());
        }
        if(!"".equals(jTextFieldCedula.getText())&&!"".equals(jTextFieldNombre.getText())&&!"".equals(jTextFieldApellido.getText())&&jDateChooser1.getCalendar()!=null){
            if( buscar_cedula(jTextFieldCedula.getText())!=-1){
                JOptionPane.showMessageDialog(null,"El paciente ya existe intente de nuevo");
            }
            else{
                paciente=new Paciente(jTextFieldCedula.getText(), jTextFieldNombre.getText(),jTextFieldApellido.getText(), (GregorianCalendar) jDateChooser1.getCalendar(), (String) jComboBoxSexo.getSelectedItem(), (String) jComboBoxTipoSangre.getSelectedItem());
                if(paciente.validadorDeCedula(jTextFieldCedula.getText())){
                    listPaciente.add(paciente);
                    JOptionPane.showMessageDialog(null,"El paciente se guardo con exito ");
                    mostrarPaciente();
                    limpiar();
                }
                else{
                    JOptionPane.showMessageDialog(null,"cedula incorrecta");
                    
                }
                
            }
        }else{
            JOptionPane.showMessageDialog(null,"Debe llenar todos los campos");
        }
        System.out.println("Paciente despues de guardar");
        for(int i=0;i<listPaciente.size();i++){
            System.out.println(""+listPaciente.get(i).toString());
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    
    private void jButtonlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlimpiarActionPerformed
        limpiar();
        
    }//GEN-LAST:event_jButtonlimpiarActionPerformed
    
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        for (int i = 0; i < listPaciente.size(); i++) {
            if( cedula.equals(listPaciente.get(i).getCedula())){
                listPaciente.remove(i);
            }
           mostrarPaciente();
            
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        limpiar();
        jTextFieldCedula.setText(listPaciente.get(jTable1.getSelectedRow()).getCedula());
        jTextFieldNombre.setText(listPaciente.get(jTable1.getSelectedRow()).getNombre());
        jTextFieldApellido.setText(listPaciente.get(jTable1.getSelectedRow()).getApellido());
        jDateChooser1.setCalendar(listPaciente.get(jTable1.getSelectedRow()).getFechanacimiento());
        jComboBoxSexo.setToolTipText(listPaciente.get(jTable1.getSelectedRow()).getSexo());
        jComboBoxTipoSangre.setToolTipText(listPaciente.get(jTable1.getSelectedRow()).getGrupo_sanguineo());
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonTerminarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminarEdicionActionPerformed
        for (int i = 0; i <listPaciente.size(); i++) {
            if(jTextFieldCedula.getText().equals(listPaciente.get(i).getCedula())){
                listPaciente.get(i).setCedula(jTextFieldCedula.getText());
                listPaciente.get(i).setApellido(jTextFieldApellido.getText());
                listPaciente.get(i).setFechanacimiento((GregorianCalendar) jDateChooser1.getCalendar());
                listPaciente.get(i).setNombre(jTextFieldNombre.getText());
                listPaciente.get(i).setGrupo_sanguineo((String) jComboBoxTipoSangre.getSelectedItem());
                listPaciente.get(i).setSexo((String) jComboBoxSexo.getSelectedItem());
            }
            
        }
        mostrarPaciente();
        limpiar();
        
    }//GEN-LAST:event_jButtonTerminarEdicionActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        PrincipalJFrame principal=new PrincipalJFrame();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char a=evt.getKeyChar();
        if(Character.isDigit(a)){
            getToolkit().beep();
            evt.consume();
            
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        char a=evt.getKeyChar();
        if(Character.isDigit(a)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jTextFieldCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCedulaKeyTyped
        char a=evt.getKeyChar();
        if(!Character.isDigit(a)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCedulaKeyTyped

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        int dialog=JOptionPane.YES_NO_OPTION;
        int result=JOptionPane.showConfirmDialog(null,"Desea salir del programa?","Salir",dialog);
        if(result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalirActionPerformed
    
                  /* METODOS ADICIONALES*/
    
    public void mostrarPaciente(){
            String matrix[][]=new String[listPaciente.size()][6];
            for (int i = 0; i < listPaciente.size(); i++) {
                matrix[i][0]=listPaciente.get(i).getCedula();
                matrix[i][1]=listPaciente.get(i).getNombre()+" "+listPaciente.get(i).getApellido();
                matrix[i][2]=Integer.toString(listPaciente.get(i).edad());
                matrix[i][3]=listPaciente.get(i).getSexo();
                matrix[i][4]=listPaciente.get(i).getGrupo_sanguineo();
                
            }
             jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
            new String [] {
                "cedula", "nombre y apellido", "edad", "sexo", "tipo de sangre"
            }
        ));
             
        }
    private void BotonTransparente(){
            jButtonGuardar.setOpaque(false);
            jButtonGuardar.setContentAreaFilled(false);
            jButtonGuardar.setBorderPainted(false);
            jButtonEditar.setOpaque(false);
            jButtonEditar.setContentAreaFilled(false);
            jButtonEditar.setBorderPainted(false);
            jButtonTerminarEdicion.setOpaque(false);
            jButtonTerminarEdicion.setContentAreaFilled(false);
            jButtonTerminarEdicion.setBorderPainted(false);
            jButtonlimpiar.setOpaque(false);
            jButtonlimpiar.setContentAreaFilled(false);
            jButtonlimpiar.setBorderPainted(false);
            jButtonEliminar.setOpaque(false);
            jButtonEliminar.setContentAreaFilled(false);
            jButtonEliminar.setBorderPainted(false);
            jButtonRegresar.setOpaque(false);
            jButtonRegresar.setContentAreaFilled(false);
            jButtonRegresar.setBorderPainted(false);
            jButtonSalir.setOpaque(false);
            jButtonSalir.setContentAreaFilled(false);
            jButtonSalir.setBorderPainted(false);
        }
    public void limpiar(){
        jTextFieldCedula.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jComboBoxTipoSangre.setToolTipText("");
        jComboBoxSexo.setToolTipText("");
        jDateChooser1.setCalendar(null);
        
                
    }
    
    public static int buscar_cedula(String numero) {
        String num="";
        for(int i=0;i<listPaciente.size();i++){
            num=listPaciente.get(i).getCedula();
            if(num.compareToIgnoreCase(numero)==0){
                return i;
            }
        }
        return -1;  
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
            java.util.logging.Logger.getLogger(PacienteVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonTerminarEdicion;
    private javax.swing.JButton jButtonlimpiar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxTipoSangre;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTipoSangre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

   
}
