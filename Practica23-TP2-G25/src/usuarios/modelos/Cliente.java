/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import java.util.List;
import pedido.modelos.Pedido;

/**
 *
 * @author L & U
 */
public class Cliente extends Usuario {

    private ArrayList <Pedido> pedidos = new ArrayList<>(); 
    
 
    /*Metodo verPedidos*/
    @Override
    public List<Pedido> verPedidos() {
        return this.pedidos;
    }
   
    
   /*Constructor*/ 
    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }

    
    /*Metodo agregarPedidos*/
    public void agregarPedido(Pedido pedido) {
        if(pedido != null ){
            if (!this.pedidos.contains(pedido)) {
                this.pedidos.add(pedido);
            }
            else{
                this.pedidos.remove(pedido);
                this.pedidos.add(pedido);
            }
        }
    }
    
     
    /*Metodo cancelarPedidos*/
    public void cancelarPedido(Pedido pedido){
        if(pedido != null && this.pedidos.contains(pedido)){
            this.pedidos.remove(pedido);
        }
    }
}
