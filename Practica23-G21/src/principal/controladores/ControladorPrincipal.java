/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import pedidos.modelos.*;
import productos.modelos.*;
import usuarios.modelos.Cliente;
import usuarios.modelos.GestorUsuarios;
import usuarios.modelos.Perfil;


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
        GestorProductos gp = GestorProductos.crear();
        GestorPedidos gped = GestorPedidos.crear();
//        System.out.println(gu.crearUsuario("mail1@hotmail.com", "A", "Z", Perfil.CLIENTE, "clave1", "clave1"));
//        System.out.println(gu.crearUsuario("mail2@hotmail.com", "B", "H", Perfil.CLIENTE, "clave2", "clave2"));
//        System.out.println(gu.crearUsuario("mail3@hotmail.com", "A", "Y", Perfil.CLIENTE, "clave3", "clave3"));
//        System.out.println(gu.crearUsuario("mail4@hotmail.com", "C", "J", Perfil.CLIENTE, "clave4", "clave4"));
        
//        System.out.println(gu.verUsuarios());
//        System.out.println(gu.buscarUsuarios(""));
//          System.out.println(gu.existeEsteUsuario(gu.verUsuarios().get(0)));

        System.out.println(gp.crearProducto(1,"Milanga" , 20, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(2,"Choriflan" , 40, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(3,"Milanesa dulce" , 10, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(4,"Helado gridito" , 30, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(5,"Milanesa napolitana" , 50, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(6,"Choripan" , 60, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.verProductosPorCategoria(Categoria.ENTRADA));
//        ArrayList<ProductoDelPedido> pdps = new ArrayList<>();
//        pdps.add(new ProductoDelPedido(gp.menu().get(0),1));
//        System.out.println(gped.crearPedido(1, LocalDate.now(), LocalTime.now(),pdps, (Cliente)gu.verUsuarios().get(0)));
//        System.out.println(gped.verPedidos());
//        System.out.println(gu.verUsuarios());
//        System.out.println(gu.borrarUsuario(gu.verUsuarios().get(1)));
        
        
        
        
    }
}
