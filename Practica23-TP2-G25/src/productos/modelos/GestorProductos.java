/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import interfaces.IGestorProductos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import pedido.modelos.GestorPedidos;

/**
 *
 * @author L & U
 */
public class GestorProductos implements IGestorProductos {

    public static final String TEXTO = "./Productos.txt";

    private List<Producto> listaProductos = new ArrayList();


    /*Patron Singleton*/
    private static GestorProductos gestor;

    private GestorProductos() {
    }

    public static GestorProductos instanciar() {
        if (gestor == null) {
            gestor = new GestorProductos();
        }
        return gestor;
    }

    /*Metodo validarProducto*/
    private String validarProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        if (codigo <= 0) {
            return ERROR_CODIGO;
        } else if (descripcion.equals("") || descripcion == null) {
            return ERROR_DESCRIPCION;
        } else if (precio <= 0) {
            return ERROR_PRECIO;
        } else if (categoria == null) {
            return ERROR_CATEGORIA;
        } else if (estado == null) {
            return ERROR_ESTADO;
        } else {
            return VALIDACION_EXITO;
        }
    }

    /*Metodo crearProducto*/
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        Producto producto = new Producto(codigo, descripcion, categoria, estado, precio);
        if (this.validarProducto(codigo, descripcion, precio, categoria, estado).equals(VALIDACION_EXITO)) {
            if (this.listaProductos.contains(producto)) {
                return PRODUCTOS_DUPLICADOS;
            } else {
                this.listaProductos.add(producto);
            }
        }
        return EXITO;
    }

//    private void leerArchivo() {
//        BufferedReader br = null;
//        File file = new File(TEXTO);
//
//        if (file.exists()) {
//            try {
//                FileReader fr = new FileReader(file);
//                br = new BufferedReader(fr);
//                String cadena;
//                System.out.println("hola");
//                while ((cadena = br.readLine()) != null) {
//                    String[] vector = cadena.split(";");
//                    String codigo = vector[0];
//                    String descripcion = vector[1];
//                    String categoria = vector[2];
//                    String estado = vector[3];
//                    String precio = vector[4];
//
//                    Producto prod = new Producto(codigo, descripcion, categoria, estado, precio);
//                    this.listaProductos.add(prod);
//                }
//            } catch (IOException ioe) {
//                System.out.println("No se pudo leer el archivo.");
//            } finally {
//                if (br != null) {
//                    try {
//                        br.close();
//                    } catch (IOException ioe) {
//                        ioe.printStackTrace();
//                    }
//                }
//            }
//        }
//    }

    private void guardarEnArchivo() {
        BufferedWriter bw = null;
        File file = new File(TEXTO);
        try {
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < this.listaProductos.size(); i++) {
                Producto producto = this.listaProductos.get(i);
                String cadena = producto.verCodigo()+ ";";
                cadena += producto.verDescripcion()+ ";";
                cadena += producto.verCategoria()+ ";";
                cadena += producto.verEstado()+ ";";
                cadena += producto.verPrecio()+ ";";
                
                bw.write(cadena);
                if (i < this.listaProductos.size() - 1) {
                    bw.newLine();
                }
            }
        } catch (IOException ioe) {
            System.out.println("Error al intentar encontrar el directorio");
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    
    
    
    
    /*Metodo modificarProducto*/
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria,
            Estado estado) {

        if (this.validarProducto(codigo, descripcion, precio, categoria, estado).equals(VALIDACION_EXITO)) {
            if (!this.listaProductos.contains(productoAModificar)) {
                return PRODUCTO_INEXISTENTE;
            } else {
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarCodigo(codigo);
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarDescripcion(descripcion);
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarPrecio(precio);
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarCategoria(categoria);
                listaProductos.get(listaProductos.indexOf(productoAModificar)).asignarEstado(estado);
            }
        }
        return EXITO;
    }

    /*Metodo Menu*/
    @Override
    public List<Producto> menu() {

        Comparator<Producto> comCat = (Producto p1, Producto p2) -> p1.verCategoria().compareTo(p2.verCategoria());
        Comparator<Producto> comDesc = (Producto p1, Producto p2) -> p1.verDescripcion().compareToIgnoreCase(p2.verDescripcion());

        listaProductos.sort(comCat);
        listaProductos.sort(comDesc);

        return listaProductos;
    }


    /*Metodo buscarProducto*/
    @Override
    public List<Producto> buscarProductos(String descripcion) {
        int contador = 0;
        int index = 0;
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).verDescripcion().contains(descripcion)) {
                GestorProductos gp = GestorProductos.instanciar();
                gp.menu();

                contador++;
                index = i;
            }
        }
        if (contador == 0) {
            return null;
        } else {
            return (List<Producto>) listaProductos.get(index);
        }
    }

    /*Metodo verProductosPorCategoria*/
    @Override
    public List<Producto> verProductosPorCategoria(Categoria categoria) {
        ArrayList<Producto> Coincidencias = new ArrayList();
        for (Producto prod : listaProductos) {
            if (prod.verCategoria().equals(categoria)) {
                Coincidencias.add(prod);
            }
            GestorProductos gp = GestorProductos.instanciar();
            gp.menu();
        }
        return Coincidencias;
    }

    /*Metodo existeProducto*/
    @Override
    public boolean existeEsteProducto(Producto producto) {
        if (!this.listaProductos.contains(producto)) {
            return false;
        } else {
            return true;
        }
    }

    /*Metodo obtenerProducto*/
    @Override
    public Producto obtenerProducto(Integer codigo) {
        int contador = 0;
        int index = 0;
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).verCodigo() == codigo) {
                contador++;
                index = i;
            }
        }
        if (contador == 0) {
            return null;
        } else {
            return listaProductos.get(index);
        }
    }

    /*Metodo borrarProducto*/
    @Override
    public String borrarProducto(Producto producto) {
        if (!this.existeEsteProducto(producto)) {
            return ERROR_PERMISOS;
        }
        if (!GestorPedidos.instanciar().hayPedidosConEsteProducto(producto)) {
            this.borrarProducto(producto);
        }
        return EXITO;
    }
}
