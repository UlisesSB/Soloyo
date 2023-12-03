/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.List;

/**
 *
 * @author L & U
 */
public class Encargado extends Usuario{
    GestorUsuarios gu = new GestorUsuarios();
    
    /*Constructor*/ 
    public Encargado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }  
    
    
    /*Metodo verPedidos*/
   
    public List verPedidos() {
        return gu.verUsuarios();
    }    
}
