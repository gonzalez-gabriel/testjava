/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author gabri
 */
public class ModeloComboPerfiles extends DefaultComboBoxModel {
    
    /**
     * Constructor
    */
    public ModeloComboPerfiles() { 
        for (Perfil perfil : Perfil.values()) {
            this.addElement(perfil); 
        }
    }
    
    /**
     * Devuelve el estado seleccionado
     * @return Estado  - estado seleccionado
    */
    public Perfil obtenerPerfil() { 
        return (Perfil)this.getSelectedItem();
    }
    
    /**
     * Selecciona el Estado especificado
     * @param estado estado
    */
    public void seleccionarPerfil(Perfil perfil) {
        this.setSelectedItem(perfil);
    }
    
}
