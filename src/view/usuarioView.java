package view;


import controller.UsuarioController;
import entity.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labingsw05
 */
public class usuarioView extends javax.swing.JFrame {

    private DefaultTableModel modeloTabla;
    private int idUsuario;
    private String nombreUsuario;
    public usuarioView() {
        
        initComponents();
        modeloTabla = (DefaultTableModel) tablaRol.getModel();
         UsuarioController controller = new UsuarioController();       
        
        controller.mostrarRegistros(modeloTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRol = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passUsuario = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN DE USUARIO");

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del usuario");

        txtNombreUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUsuario.setText("Inserte el nombre de usuario");
        txtNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreUsuarioMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtNombreUsuarioMouseReleased(evt);
            }
        });

        tablaRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRolMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRol);

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");

        passUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passUsuario.setText("jPasswordField1");
        passUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel3))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                            .addComponent(passUsuario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnMostrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUsuarioMousePressed
        txtNombreUsuario.setText("");
    }//GEN-LAST:event_txtNombreUsuarioMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
       UsuarioController controller = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setUser(this.txtNombreUsuario.getText());
        usuario.setPassword(String.valueOf(this.passUsuario.getPassword()));
        controller.insertarRegistro(usuario);
        controller.mostrarRegistros(modeloTabla);
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void tablaRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRolMouseClicked
      
      txtNombreUsuario.setText(tablaRol.getValueAt(tablaRol.getSelectedRow(), 1).toString());  
      idUsuario = Integer.parseInt(tablaRol.getValueAt(tablaRol.getSelectedRow(), 0).toString()); 
      UsuarioController controller = new UsuarioController();
        if (evt.getClickCount()==2) {
            Icon icono = new ImageIcon("/home/labingsw05/NetBeansProjects/Torneo/src/view/usuario2.png");
            Usuario usuario = controller.buscarRegistro(idUsuario);
            JOptionPane.showMessageDialog(null, usuario.getIdUsuario()+ " "+ usuario.getUser(), "resultado", JOptionPane.DEFAULT_OPTION, icono);
        }
   
       
    }//GEN-LAST:event_tablaRolMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        UsuarioController controller = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setId(idUsuario);
        controller.eliminarRegistro(usuario);
        controller.mostrarRegistros(modeloTabla);
        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        
        UsuarioController controller = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setUser(txtNombreUsuario.getText());
        controller.actualizarRegistro(usuario,idUsuario);
        controller.mostrarRegistros(modeloTabla);
        txtNombreUsuario.setText(" "); 
        
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void txtNombreUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreUsuarioMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioMouseReleased

    private void passUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passUsuarioMouseClicked
        passUsuario.setText("");
    }//GEN-LAST:event_passUsuarioMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        }catch(UnsupportedLookAndFeelException  e) {
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passUsuario;
    private javax.swing.JTable tablaRol;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
