/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;

import java.util.Objects;
import productos.modelos.Producto;

/**
 *
 * @author L & U
 */
public class ProductoDelPedido {
    private Producto producto;
    private int cantidad;
    
    
    /*Metodo Mostrar*/
    public void mostrar(){
        System.out.println(" -Producto: " + producto.verDescripcion() + "\t Cantidad:" + this.cantidad);
    }

    
    /*Metodo equals y hashcode*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.producto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDelPedido other = (ProductoDelPedido) obj;
        return Objects.equals(this.producto, other.producto);
    }
    

    
    /*Getters y Setters*/
    public int verCantidad() {
        return cantidad;
    }
    public void asignarCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Producto verProducto() {
        return producto;
    }
    public void asignarProducto(Producto producto) {
        this.producto = producto;
    }

    
    /*Constructor*/
    public ProductoDelPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
}


