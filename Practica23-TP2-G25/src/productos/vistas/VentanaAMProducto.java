/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos.vistas;

import java.awt.Dialog;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.ModeloComboCategorias;
import productos.modelos.ModeloComboEstados;
import productos.modelos.Producto;

public class VentanaAMProducto extends JDialog {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    /**
     * Constructor
     * @param ventanaPadre ventana padre (VentanaUsuarios en este caso)
     */
    public VentanaAMProducto(Dialog ventanaPadre) {
        super(ventanaPadre, true);
        initComponents(); 
        this.configurarComboCategorias();
        this.configurarComboEstados();
    }
    
    /**
     * Configura el combo de categorias
     */
    private void configurarComboCategorias() {
        ModeloComboCategorias mcc = new ModeloComboCategorias();
        this.comboCategoria.setModel(mcc);
    }
    
    /**
     * Configura el combo de estados
     */
    private void configurarComboEstados() {
        ModeloComboEstados mce = new ModeloComboEstados();
        this.comboEstado.setModel(mce);
        
    }
    /**
     * Devuelve el campo txtCodigo
     * @return JTextField  - campo txtCodigo
     */
    public JTextField verCodigo() {
        return this.txtCodigo;
    } 

    /**
     * Devuelve el campo txtDescripcion
     * @return String  - campo txtDescripcion
     */    
    public JTextField verDescripcion() {
        return this.txtDescripcion;
    }
    
    /**
     * Devuelve el campo txtPrecio
     * @return JTextField  - campo txtPrecio
     */
    public JTextField verPrecio() {
        return this.txtPrecio;
    }
       
    /**
     * Devuelve el combo de categorías
     * @return JComboBox  - combo de categorías
     */    
    public JComboBox verCategoria() {
        return this.comboCategoria;
    }
    
    /**
     * Devuelve el combo de estados
     * @return JComboBox  - combo de estados
     */    
    public JComboBox verEstado() {
        return this.comboEstado;
    }
     
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descripción:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, -1, -1));

        txtDescripcion.setToolTipText("Apellidos del profesor");
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 34, 354, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, -1, 27));

        txtPrecio.setToolTipText("Nombres del profesor");
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 64, 354, -1));

        btnGuardar.setForeground(new java.awt.Color(0, 102, 51));
        btnGuardar.setMnemonic('G');
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guarda el profesor");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClic(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 221, -1, -1));

        btnCancelar.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar.setMnemonic('C');
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancela la operación");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClic(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 221, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        txtCodigo.setToolTipText("Documento del profesor");
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 6, 354, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoría");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, -1, -1));

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 101, 354, -1));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 135, 354, -1));

        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Made by L & U");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 234, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productos/vistas/FondoVentana(NoTocar).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 265));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClic
        this.dispose();
    }//GEN-LAST:event_btnCancelarClic

    private void btnGuardarClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClic
        int codigo = Integer.parseInt(this.txtCodigo.getText().trim());
        String descripcion = this.txtDescripcion.getText().trim();
        float precio = Float.parseFloat(this.txtPrecio.getText().trim());
        Categoria categoria = ((ModeloComboCategorias)this.comboCategoria.getModel()).obtenerCategoria();
        Estado estado = ((ModeloComboEstados)this.comboEstado.getModel()).obtenerEstado();
        Producto unProducto = new Producto(codigo, descripcion, categoria, estado, precio);
        if (!this.productos.contains(unProducto))
            this.productos.add(unProducto);
        
        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : this.productos) {
            p.mostrar();
            System.out.println();
        }
    }//GEN-LAST:event_btnGuardarClic

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
    }//GEN-LAST:event_comboCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}