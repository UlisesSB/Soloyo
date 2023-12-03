/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios.modelos;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author L & U
 */
public class ModeloComboPerfil extends DefaultComboBoxModel {
    
    /**
     * Constructor
    */
    public ModeloComboPerfil() { 
        for (Perfil perfil : Perfil.values()) {
            this.addElement(perfil); 
        }
    }
    
    /**
     * Devuelve la categoria seleccionada
     * @return Categoria  - categoría seleccionada
    */
    public Perfil obtenerPerfil() { 
        return (Perfil)this.getSelectedItem();
    }
    
    /**
     * Selecciona la Categoria especificada
     * @param categoria categoría
    */
    public void seleccionarPerfil(Perfil perfil) {
        this.setSelectedItem(perfil);
    }
}
