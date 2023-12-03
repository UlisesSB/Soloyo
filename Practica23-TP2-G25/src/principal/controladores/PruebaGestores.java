/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;


import interfaces.IGestorPedidos;
import interfaces.IGestorProductos;
import interfaces.IGestorUsuarios;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import pedido.modelos.GestorPedidos;
import usuarios.modelos.Encargado;
import usuarios.modelos.Empleado;
import usuarios.modelos.Usuario;
import usuarios.modelos.Cliente;
import pedido.modelos.Pedido;
import pedido.modelos.ProductoDelPedido;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.GestorProductos;
import productos.modelos.Producto;
import usuarios.modelos.GestorUsuarios;
import usuarios.modelos.Perfil;


/**
 *
 * @author Carlos
 */
public class PruebaGestores {
    
    public static void main(String[] args) {
        
//        List<IGestorUsuarios> gestorUsuarios = new ArrayList<>();
//        List<IGestorProductos> gestorProductos = new ArrayList<>();
//        List<IGestorPedidos> gestorPedidos = new ArrayList<>();
//        List<Usuario> usuarios = new ArrayList<>();
//        
//        IGestorUsuarios gU = GestorUsuarios.instanciar();
//        IGestorProductos gP = GestorProductos.instanciar();
//        IGestorPedidos gPed = GestorPedidos.instanciar();
        
        
        //CONTROLO GESTOR USUARIOS - - - - - - - - - - - - - - - - - -
        
//        gU.crearUsuario("pedro@bar", "Aguilar", "nombre32", Perfil.CLIENTE, "clave = 123", "clave = 123");
//        
//        gU.crearUsuario("lucho@bar", "Galia", "nombre1", Perfil.CLIENTE, "clave = 1234", "clave = 1234");
//        
//        usuarios = gU.verUsuarios();
        
//        for(Usuario u : usuarios) { // realizo el control que el Apellido predomine antes que el nombre
//            if(u instanceof Cliente) { // y lo muestro
//                
//                u.mostrar();
//            }
//        }
        
        // CONTROLO GESTOR PEDIDOS - - - - - - - - - - - - - - - - - - - - -
        
//        Usuario unCliente1 = new Cliente("Mariano@gmail.com", "mar4321", "Cordoba", "Mariano");
//        Usuario unCliente2 = new Cliente("ramoS@gmail.com", "ram123", "Soria", "Ramon"); 
//        usuarios.add(unCliente2);
//        usuarios.add(unCliente1);
//        Producto unProducto1 = new Producto(1, "Milanesa con pure", Categoria.ENTRADA, Estado.DISPONIBLE, 1500.0f);        
//        Producto unProducto2 = new Producto(2, "Empanadas", Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE, 2000.0f);
//        List<ProductoDelPedido> pdp1 = new ArrayList<>();
//        pdp1.add(new ProductoDelPedido(unProducto1, 1));
//        pdp1.add(new ProductoDelPedido(unProducto2, 2));
//        
//        gPed.crearPedido(LocalDate.EPOCH, LocalTime.NOON, pdp1, (Cliente)usuarios.get(0));
//        gPed.crearPedido(LocalDate.EPOCH, LocalTime.NOON, pdp1, (Cliente)usuarios.get(1));
//        
//        
//        List<Pedido> listaPedidos = new ArrayList<>();
//        
//        
//        listaPedidos = gPed.verPedidos();
//        
//        for(Pedido p : listaPedidos) {
//            p.mostrar();
//        }
//        
//        
//        
//        
//        
//        
//        
//        
    }
}
