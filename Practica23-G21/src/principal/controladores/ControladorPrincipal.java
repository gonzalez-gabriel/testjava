/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import interfaces.IGestorPedidos;
import interfaces.IGestorProductos;
import interfaces.IGestorUsuarios;
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
  
        
       
        IGestorUsuarios gu = GestorUsuarios.instanciar();
        IGestorProductos gp = GestorProductos.instanciar();
        IGestorPedidos gped = GestorPedidos.instanciar();
        System.out.println(gu.crearUsuario("mail1@hotmail.com", "A", "Z", Perfil.CLIENTE, "clave1", "clave1"));
        System.out.println(gu.crearUsuario("mail2@hotmail.com", "B", "H", Perfil.CLIENTE, "clave2", "clave2"));
        System.out.println(gu.crearUsuario("mail3@hotmail.com", "A", "Y", Perfil.CLIENTE, "clave3", "clave3"));
        System.out.println(gu.crearUsuario("mail4@hotmail.com", "C", "J", Perfil.CLIENTE, "clave4", "clave4"));
        
//        System.out.println(gu.verUsuarios());
//        System.out.println(gu.buscarUsuarios(""));
//          System.out.println(gu.existeEsteUsuario(gu.verUsuarios().get(0)));

        System.out.println(gp.crearProducto(1,"" , 20, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(2,"Choriflan" , 40, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(3,"Milanesa dulce" , 10, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(4,"Helado gridito" , 30, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(5,"Milanesa napolitana" , 50, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(6,"Choripan" , 60, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
        System.out.println(gp.verProductosPorCategoria(Categoria.ENTRADA));
        ArrayList<ProductoDelPedido> pdps1 = new ArrayList<>();
        pdps1.add(new ProductoDelPedido(gp.menu().get(0),1));
        ArrayList<ProductoDelPedido> pdps2 = new ArrayList<>();
        pdps2.add(new ProductoDelPedido(gp.menu().get(1),2));
        ArrayList<ProductoDelPedido> pdps3 = new ArrayList<>();
        pdps3.add(new ProductoDelPedido(gp.menu().get(2),3));
        System.out.println(gped.crearPedido(3, LocalDate.now(), LocalTime.now(),pdps1, (Cliente)gu.verUsuarios().get(0)));
        System.out.println(gped.crearPedido(1, LocalDate.now(), LocalTime.now(),pdps2, (Cliente)gu.verUsuarios().get(0)));
        System.out.println(gped.crearPedido(2, LocalDate.now(), LocalTime.now(),pdps3, (Cliente)gu.verUsuarios().get(0)));
        System.out.println(gped.verPedidos());
//        System.out.println(gu.verUsuarios());
//        System.out.println(gu.borrarUsuario(gu.verUsuarios().get(1)));
        
        
        
        
    }
}
