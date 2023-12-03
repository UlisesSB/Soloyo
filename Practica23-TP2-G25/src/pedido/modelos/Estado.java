/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedido.modelos;

/**
 *
 * @author L & U
 */
public enum Estado {
    CREADO("CREADO"),
    PROCESANDO("PROCESANDO"),
    ENTREGADO("ENTREGADO");

    private String valor;

    
    /*Constructor*/
    private Estado(String valor) {
        this.valor = valor;
    }
    
    
    /*Metodo ToString*/
    @Override
    public String toString() {
        return valor;
    }
   

}
