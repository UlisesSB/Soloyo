/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import pedido.modelos.Pedido;

/**
 *
 * @author L & U
 */
public abstract class Usuario {
    private String correo;
    private String clave;
    private String apellido;
    private String nombre;
    
    
    /*Metodo Mostrar*/
     //String correo, String clave, String apellido, String nombre
    public void mostrar(){
    System.out.println(" -Nombre: " + nombre + "\n -Apellido: " + apellido + "\n -Correo: " + correo + "\n -Clave: " + clave);
    System.out.println("\n---------------------------------------------------------------");
    }
    
    
    /*Metodo VerPedidos*/
    public abstract List<Pedido> verPedidos();
 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.correo);
        return hash;
    }

    /*Metodo equals y hashcode*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { 
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.correo, other.correo);
    }

    /*Constructor*/
    public Usuario(String correo, String clave, String apellido, String nombre) {
        this.correo = correo;
        this.clave = clave;
        this.apellido = apellido;
        this.nombre = nombre;
    }
   
    
    /*Getters y Setters*/
    public String verCorreo() {
        return correo;
    }
    public void asignarCorreo(String correo) {
        this.correo = correo;
    }
    public String verClave() {
        return clave;
    }
    public void asignarClave(String clave) {
        this.clave = clave;
    }
    public String verApellido() {
        return apellido;
    }
    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }
    public String verNombre() {
        return nombre;
    }
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
}
