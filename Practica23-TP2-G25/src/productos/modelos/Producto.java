/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author L & U
 */
public class Producto {

    private int codigo;
    private String descripcion;
    private Categoria categoria;
    private Estado estado;
    private float precio;

    /*Constructor*/
    public Producto(int codigo, String descripcion, Categoria categoria, Estado estado, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
    }

    /*Getters y Setters*/
    public int verCodigo() {
        return codigo;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public Float verPrecio() {
        return precio;
    }

    public Categoria verCategoria() {
        return categoria;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void asignarPrecio(Float precio) {
        this.precio = precio;
    }

    public void asignarCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    /*Equals y Hashcode*/
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codigo;
        hash = 17 * hash + Objects.hashCode(this.descripcion);
        hash = 17 * hash + Float.floatToIntBits(this.precio);
        hash = 17 * hash + Objects.hashCode(this.categoria);
        hash = 17 * hash + Objects.hashCode(this.estado);
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
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Float.floatToIntBits(this.precio) != Float.floatToIntBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (this.categoria != other.categoria) {
            return false;
        }
        return this.estado == other.estado;
    }

    /*Metodo Mostrar*/
    public void mostrar() {
        System.out.println(" -Codigo de producto: " + codigo + "\n -Descripcion: " + descripcion + "\n -Estado del pedido: " + estado + "\n -Categoria: " + categoria + "\n -Precio: " + precio);
        System.out.println("\n---------------------------------------------------------------");
    }

    /*Metodo ToString*/
    @Override
    public String toString() {
        return "\n[ " + " -Codigo de producto: " + codigo + "\n -Descripcion: " + descripcion + "\n -Estado del pedido: " + estado + "\n -Categoria: " + categoria + "\n -Precio: " + precio + " ]";
    }
}
