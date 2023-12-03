/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido.modelos;

import interfaces.IGestorPedidos;
import static interfaces.IGestorPedidos.EXITO;
import static interfaces.IGestorPedidos.VALIDACION_EXITO;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import static usuarios.modelos.GestorUsuarios.USUARIOS_DUPLICADOS;

/**
 *
 * @author L & U
 */
public class GestorPedidos implements IGestorPedidos {

    private final List<Pedido> listaPedidos = new ArrayList();

    /*Patron Singleton*/
    private static GestorPedidos gestor;

    private GestorPedidos() {
    }

    public static GestorPedidos instanciar() {
        if (gestor == null) {
            gestor = new GestorPedidos();
        }
        return gestor;
    }

    /*Metodo validarPedido*/
    private String validarPedido(LocalDate fecha, LocalTime hora, List<ProductoDelPedido> pedidosProductos, Cliente cliente) {
        if (fecha == null) {
            return ERROR_FECHA;
        } else if (hora == null) {
            return ERROR_HORA;
        } else if (pedidosProductos.isEmpty()) {
            return ERROR_PRODUCTOS_DEL_PEDIDO;
        } else if (cliente == null) {
            return ERROR_CLIENTE;
        } else {
            return VALIDACION_EXITO;
        }
    }

    /*Metodo crearPedido*/
    @Override
    public String crearPedido(LocalDate fecha, LocalTime hora, List<ProductoDelPedido> productosDelPedido, Cliente cliente) {

        Pedido pedido = new Pedido(listaPedidos.size() + 1, fecha, hora, productosDelPedido, cliente);
        if (this.validarPedido(fecha, hora, productosDelPedido, cliente).equals(VALIDACION_EXITO)) {
            if (this.listaPedidos.contains(pedido)) {
                return USUARIOS_DUPLICADOS;
            } else {
                this.listaPedidos.add(pedido);
                cliente.agregarPedido(pedido);
            }
        }
        return EXITO;
    }

    /*Metodo cambiarEstado*/
    @Override
    public String cambiarEstado(Pedido pedidoAModificar) {
        if (pedidoAModificar == null) {
            return ERROR_ESTADO;
        } else if (pedidoAModificar.verEstado().equals(Estado.CREADO)) {
            pedidoAModificar.asignarEstado(Estado.PROCESANDO);
        } else if (pedidoAModificar.verEstado().equals(Estado.PROCESANDO)) {
            pedidoAModificar.asignarEstado(Estado.ENTREGADO);
        }

        return EXITO;
    }

    /*Metodo verPedidos*/
    @Override
    public List<Pedido> verPedidos() {
        Comparator<Pedido> cNumero = (Pedido p1, Pedido p2) -> p1.verNumero() - p2.verNumero();
        listaPedidos.sort(cNumero);
        
        return listaPedidos;
    }

 /*Metodo hayPedidosConEsteCliente*/
    public boolean hayPedidosConEsteCliente(Cliente cliente) {
        int contador = 0;
        for (Pedido ped : listaPedidos) {
            if (ped.verCliente().equals(cliente)) {
                contador++;
            }
        }
        if (contador == 0) {
            return false;
        } else {
            return true;
        }
    }


    /*Metodo hayPedidosConEsteProducto*/
    @Override
    public boolean hayPedidosConEsteProducto(Producto producto) {
        int contador = 0;
        for (Pedido ped : listaPedidos) {
            if (ped.verPedidosProductos().contains(producto)) {
                contador++;
            }
        }
        if (contador == 0) {
            return false;
        } else {
            return true;
        }
    }

    /*Metodo existePedido*/
    @Override
    public boolean existeEstePedido(Pedido pedido) {
        if (!this.listaPedidos.contains(pedido)) {
            return false;
        } else {
            return true;
        }
    }

    /*Metodo obtenerPedido*/
    @Override
    public Pedido obtenerPedido(Integer numero) {
        int contador = 0;
        int index = 0;
        for (int i = 0; i < listaPedidos.size(); i++) {
            if (listaPedidos.get(i).verNumero() == numero) {
                contador++;
                index = i;
            }
        }
        if (contador == 0) {
            return null;
        } else {
            return listaPedidos.get(index);
        }
    }

    /*Metodo cancelarPedido*/
    @Override
    public String cancelarPedido(Pedido pedido) {
        if (this.existeEstePedido(pedido)) {
            this.cancelarPedido(pedido);
            return EXITO;
        }
        return ERROR_CANCELAR;
    }

}
