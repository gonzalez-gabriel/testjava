/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import pedidos.modelos.*;
import productos.modelos.*;


/**
 *
 * @author root
 */
public class ControladorPrincipal  {
    public static void main(String[] args) {
        
//        GestorProductos gp = GestorProductos.crear();
//        System.out.println(gp.crearProducto(1,"Papafrita" , 10, Categoria.ENTRADA, Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(2,"Milanga" , 20, Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(3,"Helado gridito" , 30, Categoria.POSTRE, Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(4,"Choriflan" , 40, Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE));
  
        
        
        GestorUsuarios gu = GestorUsuarios.crear();
        System.out.println(gu.crearUsuario("mail1@hotmail.com", "Apellido1", "nombre1", "clave1", "clave1", Perfil.CLIENTE));
        System.out.println(gu.crearUsuario("mail2@hotmail.com", "Apellido2", "nombre2", "clave2", "clave2", Perfil.ENCARGADO));
//        System.out.println(gu.crearUsuario("mail3@hotmail.com", "Apellido3", "nombre3", "clave3", "clave3", Perfil.EMPLEADO));
//        System.out.println(gu.verUsuarios());
//        System.out.println(gu.buscarUsuarios(""));
//          System.out.println(gu.existeEsteUsuario(gu.verUsuarios().get(0)));
            System.out.println(gu.obtenerUsuario("mail1@hotmail.com"));
        GestorProductos gp = GestorProductos.crear();
        GestorPedidos gped = GestorPedidos.crear();
        System.out.println(gp.crearProducto(1,"Papafrita" , 10, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(2,"Milanga" , 20, Categoria.PLATOPRINCIPAL, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(3,"Helado gridito" , 30, Categoria.POSTRE, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(4,"Choriflan" , 40, Categoria.PLATOPRINCIPAL, productos.modelos.Estado.DISPONIBLE));
    }
}
