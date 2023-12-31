/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package usuarios.vistas;

import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import usuarios.modelos.GestorUsuarios;
import usuarios.modelos.Perfil;
import usuarios.modelos.Usuario;
import usuarios.modelos.ModeloComboPerfil;

/**
 *
 * @author ulise
 */
public class VentanaAMUsuario extends JDialog {

    private List<Usuario> usuarios = new ArrayList<>();
    GestorUsuarios gu = GestorUsuarios.instanciar();

    /**
     * Creates new form NewJDialog
     */
    public VentanaAMUsuario(Dialog ventanaPadre) {
        super(ventanaPadre, true);
        initComponents();
        this.configurarComboPerfil();
    }

    private void configurarComboPerfil() {
        ModeloComboPerfil mcp = new ModeloComboPerfil();
        this.PerfilBox.setModel(mcp);
    }

    public JTextField verCorreo() {
        return this.CorreoCompletar;
    }
    public JTextField verApellido() {
        return this.ApellidoCompletar;
    }
    public JTextField verNombre() {
        return this.NombreCompletar;
    }
    public JTextField verClave() {
        return this.ClaveCompletar;
    }
    public JTextField verClaveRepetida() {
        return this.ClaveRepCompletar;
    }
    public JComboBox verCategoria() {
        return this.PerfilBox;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CorreoTitulo = new javax.swing.JLabel();
        ApellidoTitulo = new javax.swing.JLabel();
        NombreTitulo = new javax.swing.JLabel();
        ClaveTitulo = new javax.swing.JLabel();
        ClaveRepTitulo = new javax.swing.JLabel();
        PerfilTitulo = new javax.swing.JLabel();
        PerfilBox = new javax.swing.JComboBox<>();
        ApellidoCompletar = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        CorreoCompletar = new javax.swing.JTextField();
        NombreCompletar = new javax.swing.JTextField();
        MadeBy = new javax.swing.JLabel();
        ClaveRepCompletar = new javax.swing.JTextField();
        ClaveCompletar = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CorreoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        CorreoTitulo.setText("Correo");
        getContentPane().add(CorreoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, -1, -1));

        ApellidoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        ApellidoTitulo.setText("Apellido");
        getContentPane().add(ApellidoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 54, -1, -1));

        NombreTitulo.setForeground(new java.awt.Color(255, 255, 255));
        NombreTitulo.setText("Nombre");
        getContentPane().add(NombreTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, -1, -1));

        ClaveTitulo.setForeground(new java.awt.Color(255, 255, 255));
        ClaveTitulo.setText("Clave");
        getContentPane().add(ClaveTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 134, -1, -1));

        ClaveRepTitulo.setForeground(new java.awt.Color(255, 255, 255));
        ClaveRepTitulo.setText("ClaveRepetida");
        getContentPane().add(ClaveRepTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 174, -1, -1));

        PerfilTitulo.setForeground(new java.awt.Color(255, 255, 255));
        PerfilTitulo.setText("Perfil");
        getContentPane().add(PerfilTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 214, -1, -1));

        PerfilBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(PerfilBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 211, 291, -1));
        getContentPane().add(ApellidoCompletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 51, 291, -1));

        BtnGuardar.setForeground(new java.awt.Color(0, 204, 0));
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        BtnCancelar.setForeground(new java.awt.Color(204, 0, 0));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));
        getContentPane().add(CorreoCompletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 11, 291, -1));
        getContentPane().add(NombreCompletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 91, 291, -1));

        MadeBy.setForeground(new java.awt.Color(0, 153, 204));
        MadeBy.setText("Made by L & U");
        getContentPane().add(MadeBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        getContentPane().add(ClaveRepCompletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 171, 291, -1));
        getContentPane().add(ClaveCompletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 131, 291, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuarios/vistas/FondoVentana2(NoTocar).png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        String correo = this.CorreoCompletar.getText().trim();
        String apellido = this.ApellidoCompletar.getText().trim();
        String nombre = this.NombreCompletar.getText().trim();
        String clave = this.ClaveCompletar.getText().trim();
        String claveRepetida = this.ClaveRepCompletar.getText().trim();
        Perfil perfil = ((ModeloComboPerfil) this.PerfilBox.getModel()).obtenerPerfil();

        gu.crearUsuario(correo, apellido, nombre, perfil, clave, claveRepetida);
        
        System.out.println("Usuarios");
        System.out.println("=========");
        for (Usuario mostrarUsuarios : this.gu.verUsuarios()) {
            mostrarUsuarios.mostrar();
            System.out.println();
        }
        
        /*Limpiar*/
        CorreoCompletar.setText("");
        ApellidoCompletar.setText("");
        NombreCompletar.setText("");
        ClaveCompletar.setText("");
        ClaveRepCompletar.setText("");
    }//GEN-LAST:event_BtnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAMUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAMUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAMUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAMUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaAMUsuario dialog = new VentanaAMUsuario(null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoCompletar;
    private javax.swing.JLabel ApellidoTitulo;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTextField ClaveCompletar;
    private javax.swing.JTextField ClaveRepCompletar;
    private javax.swing.JLabel ClaveRepTitulo;
    private javax.swing.JLabel ClaveTitulo;
    private javax.swing.JTextField CorreoCompletar;
    private javax.swing.JLabel CorreoTitulo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel MadeBy;
    private javax.swing.JTextField NombreCompletar;
    private javax.swing.JLabel NombreTitulo;
    private javax.swing.JComboBox<String> PerfilBox;
    private javax.swing.JLabel PerfilTitulo;
    // End of variables declaration//GEN-END:variables
}
