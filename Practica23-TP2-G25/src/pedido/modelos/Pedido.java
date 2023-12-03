/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import usuarios.modelos.Cliente;

/**
 *
 * @author L & U
 */
public class Pedido {

    private int numero;
    private LocalDate fecha;
    private LocalTime hora;
    private Estado Estado;
    private List<ProductoDelPedido> pedidosProductos;
    private Cliente cliente;

    /*Metodo Mostrar*/
    public void mostrar() {
        String patron = "dd/MM/yyyy";
        System.out.println(" -Codigo de producto: " + numero + "\n -Fecha: " + fecha.format(DateTimeFormatter.ofPattern(patron)) + "\t\t Hora: " + hora.getHour() + ":" + hora.getMinute() + "\n -Estado del pedido: " + Estado);
        System.out.println(" -Cliente: " + cliente.verApellido() + ", " + cliente.verNombre());

        for (ProductoDelPedido pp : pedidosProductos) {
            pp.mostrar();
        }

        System.out.println("\n---------------------------------------------------------------");
    }


    /*Constructor*/
    public Pedido(int numero, LocalDate fecha, LocalTime hora, List<ProductoDelPedido> pedidosProductos, Cliente cliente) {
        this.numero = numero;
        this.fecha = fecha;
        this.hora = hora;
        this.pedidosProductos = pedidosProductos;
        this.cliente = cliente;
    }

    /*Getters y Setters*/
    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate verFecha() {
        return fecha;
    }

    public void asignarFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime verHora() {
        return hora;
    }

    public void asignarHora(LocalTime hora) {
        this.hora = hora;
    }

    public Estado verEstado() {
        return Estado;
    }

    public void asignarEstado(Estado Estado) {
        this.Estado = Estado;
    }

    public List<ProductoDelPedido> verPedidosProductos() {
        return pedidosProductos;
    }

    public void asignarPedidosProductos(List<ProductoDelPedido> pedidosProductos) {
        this.pedidosProductos = pedidosProductos;
    }

    public Cliente verCliente() {
        return cliente;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    /*Equals y Hashcode*/
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.numero;
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
        final Pedido other = (Pedido) obj;
        return this.numero == other.numero;
    }
}
