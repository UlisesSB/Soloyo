/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author L & U
 */
public enum Perfil {
     CLIENTE("CLIENTE"),
    EMPLEADO("EMPLEADO"), 
    ENCARGADO("ENCARGADO");
    
    private String valor;

    private Perfil(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "" + "" + valor ;
    }

    
}
