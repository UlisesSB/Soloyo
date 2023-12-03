/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

import interfaces.IGestorUsuarios;
import static interfaces.IGestorUsuarios.ERROR_APELLIDO;
import static interfaces.IGestorUsuarios.ERROR_CLAVES;
import static interfaces.IGestorUsuarios.ERROR_CORREO;
import static interfaces.IGestorUsuarios.ERROR_NOMBRE;
import static interfaces.IGestorUsuarios.ERROR_PERFIL;
import static interfaces.IGestorUsuarios.USUARIOS_DUPLICADOS;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author L & U
 */
public class GestorUsuarios implements IGestorUsuarios {

    ArrayList<Usuario> listaUsuarios = new ArrayList();

    /*Patron Singleton*/
    private static GestorUsuarios gestor;

    GestorUsuarios() {
    }

    public static GestorUsuarios instanciar() {
        if (gestor == null) {
            gestor = new GestorUsuarios();
        }
        return gestor;
    }

    /*Metodo validarUsuario*/
    private String validarUsuario(String correo, String apellido, String nombre, String clave, String claveRepetida) {
        if (correo == null || !correo.contains("@")) {
            return ERROR_CORREO;
        } else if (apellido == null || apellido.equals("")) {
            return ERROR_APELLIDO;
        } else if (nombre == null || nombre.equals("") ) {
            return ERROR_NOMBRE;
        } else if (clave == null || clave.equals("")) {
            return ERROR_CLAVES;
        } else if (clave.equals("") || claveRepetida == null || !claveRepetida.equals(clave)) {
            return ERROR_CLAVES;
        } else {
            return VALIDACION_EXITO;
        }
    }

    /*Metodo crearUsuario*/
    @Override
    public String crearUsuario(String correo, String apellido, String nombre, Perfil perfil, String clave, String claveRepetida) {
        Usuario usuario = new Cliente(correo, apellido, nombre, clave);

        if (perfil == Perfil.CLIENTE || perfil == Perfil.EMPLEADO || perfil == Perfil.ENCARGADO) {
            if (this.validarUsuario(correo, apellido, nombre, clave, claveRepetida).equals(VALIDACION_EXITO)) {
                if (this.listaUsuarios.contains(usuario)) {
                    return USUARIOS_DUPLICADOS;
                } else {
                    this.listaUsuarios.add(usuario);
                }
            }
        } else {
            return ERROR_PERFIL;
        }
        return VALIDACION_EXITO;
    }

    /*Metodo verUsuario*/
    @Override
    public List<Usuario> verUsuarios() {

        Comparator<Usuario> compApe = (Usuario u1, Usuario u2) -> u1.verApellido().compareToIgnoreCase(u2.verApellido());
        Comparator<Usuario> compNom = (Usuario u1, Usuario u2) -> u1.verNombre().compareToIgnoreCase(u2.verNombre());

        listaUsuarios.sort(compApe);
        listaUsuarios.sort(compNom);

        return listaUsuarios;
    }

    /*Metodo buscarUsuario*/
    @Override
    public List<Usuario> buscarUsuarios(String apellido) {

        int contador = 0;
        int index = 0;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).verApellido().contains(apellido)) {
                GestorUsuarios gp = GestorUsuarios.instanciar();
                gp.verUsuarios();

                contador++;
                index = i;
            }
        }
        if (contador == 0) {
            return null;
        } else {
            return (List<Usuario>) listaUsuarios.get(index);
        }
    }

    /*Metodo existeUsuario*/
    @Override
    public boolean existeEsteUsuario(Usuario usuario) {
        if (!this.listaUsuarios.contains(usuario)) {
            return false;
        } else {
            return true;
        }
    }

    /*Metodo obtenerUsuario*/
    @Override
    public Usuario obtenerUsuario(String correo) {
        int contador = 0;
        int index = 0;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).verCorreo().equals(correo)) {
                contador++;
                index = i;
            }
        }
        if (contador == 0) {
            return null;
        } else {
            return listaUsuarios.get(index);
        }
    }

    /*Metodo borrarUsuario*/
    @Override
    public String borrarUsuario(Usuario usuario) {
        if (!this.existeEsteUsuario(usuario)) {
            return ERROR_PERMISOS;
        } else {
            if (usuario.verPedidos() != null) {
                this.listaUsuarios.remove(usuario);
            }
        }
        return EXITO;
    }
}
