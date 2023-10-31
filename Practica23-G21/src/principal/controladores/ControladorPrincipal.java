/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
import usuarios.modelos.*;
import pedidos.modelos.Pedido;
import pedidos.modelos.ProductoDelPedido;
import productos.modelos.*;


/**
 *
 * @author root
 */
public class ControladorPrincipal  {
    public static void main(String[] args) {
//        ArrayList <Usuario> usuarios = new ArrayList<>();
//        ArrayList<Producto> productos = new ArrayList<>();
//        ArrayList<Pedido> pedidos = new ArrayList<>();
//        
//        Usuario unCliente1 = new Cliente("cliente1@bar.com","ClaveCliente1","ApellidoCliente1","NombreCliente1" );        
//        Usuario unCliente2 = new Cliente("cliente2@bar.com","ClaveCliente2","ApellidoCliente2","NombreCliente2" );
//        Usuario unCliente3 = new Cliente("cliente3@bar.com","ClaveCliente3","ApellidoCliente3","NombreCliente3" );
//        
//        if (!usuarios.contains(unCliente1)) {
//            usuarios.add(unCliente1);
//        }
//        if (!usuarios.contains(unCliente2)) {
//        usuarios.add(unCliente2);
//        }
//        if (!usuarios.contains(unCliente3)) {
//        usuarios.add(unCliente3);      
//        }
//        
//        Usuario unEmpleado1 = new Empleado("NombreEmpleado1", "ApellidoEmpleado1", "empleado1@bar.com", "ClaveEmpleado1");        
//        Usuario unEmpleado2 = new Empleado("NombreEmpleado2", "ApellidoEmpleado2", "empleado2@bar.com", "ClaveEmpleado2");        
//        Usuario unEmpleado3 = new Empleado("NombreEmpleado3", "ApellidoEmpleado3", "empleado3@bar.com", "ClaveEmpleado3");
//        
//        if (!usuarios.contains(unEmpleado1)) {
//        usuarios.add(unEmpleado1);
//        }
//        if(!usuarios.contains(unEmpleado2)) {
//        usuarios.add(unEmpleado2);
//        }
//        if(!usuarios.contains(unEmpleado3)) {
//        usuarios.add(unEmpleado3);
//        }
//        
//        Usuario unEncargado1 = new Encargado("NombreEncargado1", "ApellidoEncargado1", "encargado1@bar.com", "ClaveEncargado1");
//        Usuario unEncargado2 = new Encargado("NombreEncargado2", "ApellidoEncargado2", "encargado2@bar.com", "ClaveEncargado2");
//        Usuario unEncargado3 = new Encargado("NombreEncargado3", "ApellidoEncargado3", "encargado3@bar.com", "ClaveEncargado3");
//        
//        if (!usuarios.contains(unEncargado1)) {
//        usuarios.add(unEncargado1);
//        }
//        if(!usuarios.contains(unEncargado2)) {
//        usuarios.add(unEncargado2);
//        }
//        if(!usuarios.contains(unEncargado3)) {
//        usuarios.add(unEncargado3);
//        }
//        
//        
////        System.out.println("Clientes");
////        System.out.println("========");
////        
////        for (Usuario u : usuarios) {
////            if (u instanceof Cliente) {
////                u.mostrar();
////                System.out.println("\n");
////            }
////        }
////        
////        System.out.println("\n");
////        
////        System.out.println("Empleados");
////        System.out.println("========");
////        
////        for (Usuario u : usuarios) {
////            if (u instanceof Empleado) {
////                u.mostrar();
////                System.out.println("\n");
////            }
////        }
//        
////        System.out.println("\n");
////        
////        System.out.println("Encargados");
////        System.out.println("========");
////        
////        for (Usuario u : usuarios) {
////            if (u instanceof Encargado) {
////                u.mostrar();
////                System.out.println("\n");
////            }
////        }
//        
////        System.out.println("\n");
////        
////        System.out.println("Todos");
////        System.out.println("========");
////        
////        for (Usuario u : usuarios) {
////            u.mostrar();
////            System.out.println("\n");
////        }
//        
//        Producto unProducto1 = new Producto(1, "Producto1",Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);        
//        Producto unProducto2 = new Producto(2, "Producto2", Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE,  2.0f );
//        Producto unProducto3 = new Producto(3, "Producto3",Categoria.POSTRE, Estado.DISPONIBLE,3.0f);
//        
//        if(!productos.contains(unProducto1)){
//        productos.add(unProducto1);
//        }
//        if(!productos.contains(unProducto2)){
//        productos.add(unProducto2);
//        }
//        if(!productos.contains(unProducto3)){
//        productos.add(unProducto3);
//        }
//        
////        System.out.println("Productos");
////        System.out.println("=========");
////        for(Producto p : productos) {
////            p.mostrar();
////            System.out.println();
////        }
////        System.out.println();
//        
//        ArrayList<ProductoDelPedido> pdp1 = new ArrayList<>();
//        
//        ProductoDelPedido unPdp1 = new ProductoDelPedido(unProducto1,1);
//        
//        if(!pdp1.contains(unPdp1)){
//        pdp1.add(unPdp1);
//        }
//        
//        ProductoDelPedido unPdp2 = new ProductoDelPedido(unProducto2,3);
//        if(!pdp1.contains(unPdp2)){
//        pdp1.add(unPdp2);
//        }
//        
//        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(),pdp1, (Cliente)unCliente1);
//
//        
//        
//        
//        
//        ArrayList<ProductoDelPedido> pdp2 = new ArrayList<>();
//        ProductoDelPedido unPdp3 = new ProductoDelPedido( unProducto2, 10);
//        if(!pdp2.contains(unPdp3)){
//        pdp2.add(unPdp3);
//        }
//        
//        ProductoDelPedido unPdp4 = new ProductoDelPedido(unProducto3, 30);
//        if(!pdp2.contains(unPdp4)){
//        pdp2.add(unPdp4);
//        }
//        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(),pdp2, (Cliente)unCliente2);        
//        
//        ArrayList<ProductoDelPedido> pdp3 = new ArrayList<>();
//        ProductoDelPedido unPdp5 = new ProductoDelPedido(unProducto3, 20);
//        if(!pdp3.contains(unPdp5)){
//        pdp3.add(unPdp5);
//        }
//        
//        ProductoDelPedido unPdp6 = new ProductoDelPedido(unProducto2, 20);
//        if(!pdp3.contains(unPdp6)){
//        pdp3.add(unPdp6);
//        }
//        
//        
//        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(),pdp3,(Cliente)unCliente3);        
//        
//        
//        if(!pedidos.contains(unPedido1)){
//        pedidos.add(unPedido1);
//        }
//        if(!pedidos.contains(unPedido2)){
//        pedidos.add(unPedido2);
//        }
//        if(!pedidos.contains(unPedido3)){
//        pedidos.add(unPedido3);
//        }
//        
//        //////////////////////////////////////////////////////////////////////////////////
//        //AGREGADO DE PEDIDO AL CLIENTE
//        
//        
//        ((Cliente)unCliente1).agregarPedido(unPedido1);
//        
//        for(Pedido p: unCliente1.verPedidos()){
//            p.mostrar();
//        }
//        
//        ((Cliente)unCliente1).cancelarPedido(unPedido1);
//        
//        if (unCliente1.verPedidos().isEmpty()) {
//            System.out.println("Este cliente no tiene pedidos");
//        }
//        else {
//            for(Pedido p: unCliente1.verPedidos()){
//                p.mostrar(); 
//            }
//            
//        }
//            
//        
//        
//        
//        
//        ////////////////////////////////////////////////////
//        
////        System.out.println("Pedidos");
////        System.out.println("=======");
////        for(Pedido p : pedidos) {
////            p.mostrarPedido();
////            System.out.println();
////        }
////        System.out.println();
//        
//    }   
//}



//////////////////////////MAIN PROVISTO///////////////////////////////////////////////////
//**************************************************************************************
//****************************************************************************************

//ArrayList<Producto> listaProductos = new ArrayList<>();
//        ArrayList<Pedido> listaPedidos = new ArrayList<>();
//        ArrayList<Cliente> listaClientes = new ArrayList<>();
//        
//        
//        System.out.println("#################### ");
//        System.out.println("PRODUCTOS");
//        Producto p1 = new  Producto(1, "Producto 1", Categoria.ENTRADA ,Estado.DISPONIBLE, 200.0f);        
//        Producto p2 = new  Producto(2, "Producto 2", Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE, 1950.0f);        
//        Producto p3 = new  Producto(3, "Producto 3",Categoria.POSTRE, Estado.NO_DISPONIBLE, 580.0f);        
//        Producto p4 = new  Producto(4, "Producto 4",Categoria.POSTRE, Estado.NO_DISPONIBLE, 580.0f);        
//        Producto p5 = new  Producto(3, "Producto 5",Categoria.POSTRE, Estado.NO_DISPONIBLE, 7580.0f);         
//        //no debe agregar a p5
//        
//        if (!listaProductos.contains(p1))
//            listaProductos.add(p1);
//        if (!listaProductos.contains(p2))
//            listaProductos.add(p2);
//        if (!listaProductos.contains(p3))
//            listaProductos.add(p3);
//        if (!listaProductos.contains(p4))
//            listaProductos.add(p4);
//        if (!listaProductos.contains(p5))
//            listaProductos.add(p5);
//        
//        for (Producto p: listaProductos)
//            p.mostrar();
//        
//        System.out.println("#################### ");
//        System.out.println("CLIENTES");
//        Cliente cliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
//        Cliente cliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
//        Cliente cliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//        
//        listaClientes.add(cliente1);
//        listaClientes.add(cliente2);
//        listaClientes.add(cliente3);
//        
//        for (Cliente e: listaClientes)
//            e.mostrar();
//        
//        
//        System.out.println("#################### ");
//        System.out.println("PEDIDOS");
//               
//        ArrayList<ProductoDelPedido> listapdp1 = new ArrayList<>();
//        ProductoDelPedido pdp1 = new ProductoDelPedido(listaProductos.get(0), 1);
//        ProductoDelPedido pdp2 = new ProductoDelPedido(listaProductos.get(1), 2);        
//        if (!listapdp1.contains(pdp1))
//            listapdp1.add(pdp1);
//        if (!listapdp1.contains(pdp2))
//            listapdp1.add(pdp2);
//        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), listapdp1, cliente1);        
//        
//        ArrayList<ProductoDelPedido> productosDelPedido2 = new ArrayList<>();
//        ProductoDelPedido pdp3 = new ProductoDelPedido(listaProductos.get(2), 10);
//        ProductoDelPedido pdp4 = new ProductoDelPedido(listaProductos.get(0), 20);
//        ProductoDelPedido pdp5 = new ProductoDelPedido(listaProductos.get(2), 30);
//        //producto repetido        
//        if (!productosDelPedido2.contains(pdp3))
//            productosDelPedido2.add(pdp3);
//        if (!productosDelPedido2.contains(pdp4))
//            productosDelPedido2.add(pdp4);
//        if (!productosDelPedido2.contains(pdp5))
//            productosDelPedido2.add(pdp5);
//        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), productosDelPedido2, cliente2);        
//        
//        ArrayList<ProductoDelPedido> productosDelPedido3 = new ArrayList<>();
//        ProductoDelPedido pdp6 = new ProductoDelPedido(listaProductos.get(1), 100);
//        ProductoDelPedido pdp7 = new ProductoDelPedido(listaProductos.get(2), 200);
//        if (!productosDelPedido3.contains(pdp6))
//            productosDelPedido3.add(pdp6);
//        if (!productosDelPedido3.contains(pdp7))
//            productosDelPedido3.add(pdp7);
//        Pedido unPedido3 = new Pedido(2, LocalDateTime.now(), productosDelPedido3, cliente3);        
//        //pedido repetido
//
//        if(!listaPedidos.contains(unPedido1))
//            listaPedidos.add(unPedido1);
//        if(!listaPedidos.contains(unPedido2))
//            listaPedidos.add(unPedido2);
//        if(!listaPedidos.contains(unPedido3))
//            listaPedidos.add(unPedido3);
//        
//        System.out.println("Pedidos");
//        System.out.println("=======");
//        for(Pedido p : listaPedidos) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();        
//    
    /*
     FIN Primera parte - comparación de objetos
    */
    /*
    INICIO Segunda parte - herencia
//    */
//        ArrayList<Usuario> usuarios = new ArrayList<>();
//        
//        Usuario unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
//        Usuario unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
//        Usuario unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//        Usuario unCliente4 = new Cliente("cliente3@bar.com", "claveCliente4", "ApellidoCliente4", "NombreCliente4"); 
//        //unCliente4 repetido con unCliente3
//        
//        if (!usuarios.contains(unCliente1))
//            usuarios.add(unCliente1);
//        if (!usuarios.contains(unCliente2))
//            usuarios.add(unCliente2);
//        if (!usuarios.contains(unCliente3))
//            usuarios.add(unCliente3);
//        if (!usuarios.contains(unCliente4))
//            usuarios.add(unCliente4);
//        
//        System.out.println("Clientes");
//        System.out.println("========");
//        for(Usuario c : usuarios) {
//            if (c instanceof Cliente) {
//                c.mostrar();
//                System.out.println();
//            }
//        }
//        System.out.println();        
//                
//        Usuario unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
//        Usuario unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
//        Usuario unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
//        Usuario unEmpleado4 = new Empleado("empleado3@bar.com", "claveEmpleado4", "ApellidoEmpleado4", "NombreEmpleado4");
//        //empleado repetido
//        
//        if (!usuarios.contains(unEmpleado1))
//            usuarios.add(unEmpleado1);
//        if (!usuarios.contains(unEmpleado2))
//            usuarios.add(unEmpleado2);
//        if (!usuarios.contains(unEmpleado3))
//            usuarios.add(unEmpleado3);
//        if (!usuarios.contains(unEmpleado4))
//            usuarios.add(unEmpleado4);
//        
//        System.out.println("Empleados");
//        System.out.println("=========");
//        for(Usuario e : usuarios) {
//            if (e instanceof Empleado) {
//                e.mostrar();
//                System.out.println();
//            }
//        }
//        System.out.println();
//
//        Usuario unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
//        Usuario unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
//        Usuario unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
//        Usuario unEncargado4 = new Encargado("encargado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        //encargado repetido
//
//        if(!usuarios.contains(unEncargado1))
//            usuarios.add(unEncargado1);
//        if(!usuarios.contains(unEncargado2))
//            usuarios.add(unEncargado2);
//        if(!usuarios.contains(unEncargado3))
//            usuarios.add(unEncargado3);
//        if(!usuarios.contains(unEncargado4))
//            usuarios.add(unEncargado4);
//        
//        System.out.println("Encargados");
//        System.out.println("==========");
//        for(Usuario e : usuarios) {
//            if (e instanceof Encargado) {
//                e.mostrar();
//                System.out.println();
//            }
//        }
//        System.out.println();   
//        
//        Usuario unEncargado5 = new Encargado("cliente1@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        if(!usuarios.contains(unEncargado5))
//            usuarios.add(unEncargado5);
//        //mismo correo que un cliente, no debe agregarse
//        
//        Usuario unCliente5 = new Encargado("empleado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        if(!usuarios.contains(unCliente5))
//            usuarios.add(unCliente5);
//        //mismo correo que un empleado, no debe agregarse
//        
//        System.out.println("Todos");
//        System.out.println("=====");
//        for(Usuario u : usuarios) {
//            u.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//    
    
    /*
    FIN Segunda parte - herencia
    */
    /*
    INICIO Tercera parte - herencia
    */
    
//        ArrayList<Usuario> usuarios = new ArrayList<>();
//        ArrayList<Producto> listaProductos = new ArrayList<>();
//        ArrayList<Pedido> listaPedidos = new ArrayList<>();
//        
//        Usuario unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "ApellidoCliente1", "NombreCliente1");        
//        Usuario unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "ApellidoCliente2", "NombreCliente2");       
//        Usuario unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "ApellidoCliente3", "NombreCliente3");
//        Usuario unCliente4 = new Cliente("cliente3@bar.com", "claveCliente4", "ApellidoCliente4", "NombreCliente4"); 
//        //cliente repetido
//        
//        if (!usuarios.contains(unCliente1))
//            usuarios.add(unCliente1);
//        if (!usuarios.contains(unCliente2))
//            usuarios.add(unCliente2);
//        if (!usuarios.contains(unCliente3))
//            usuarios.add(unCliente3);
//        if (!usuarios.contains(unCliente4))
//            usuarios.add(unCliente4);
//                        
//        Usuario unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
//        Usuario unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
//        Usuario unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
//        Usuario unEmpleado4 = new Empleado("empleado3@bar.com", "claveEmpleado4", "ApellidoEmpleado4", "NombreEmpleado4");
//        //empleado repetido
//        
//        if (!usuarios.contains(unEmpleado1))
//            usuarios.add(unEmpleado1);
//        if (!usuarios.contains(unEmpleado2))
//            usuarios.add(unEmpleado2);
//        if (!usuarios.contains(unEmpleado3))
//            usuarios.add(unEmpleado3);
//        if (!usuarios.contains(unEmpleado4))
//            usuarios.add(unEmpleado4);
//        
//        Usuario unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "ApellidoEncargado1", "NombreEncargado1");
//        Usuario unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "ApellidoEncargado2", "NombreEncargado2");
//        Usuario unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "ApellidoEncargado3", "NombreEncargado3");
//        Usuario unEncargado4 = new Encargado("encargado3@bar.com", "claveEncargado4", "ApellidoEncargado4", "NombreEncargado4");
//        //encargado repetido
//
//        if(!usuarios.contains(unEncargado1))
//            usuarios.add(unEncargado1);
//        if(!usuarios.contains(unEncargado2))
//            usuarios.add(unEncargado2);
//        if(!usuarios.contains(unEncargado3))
//            usuarios.add(unEncargado3);
//        if(!usuarios.contains(unEncargado4))
//            usuarios.add(unEncargado4);
//
//        Producto unProducto1 = new Producto(1, "Producto1", Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);        
//        Producto unProducto2 = new Producto(2, "Producto2", Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE, 2.0f);
//        Producto unProducto3 = new Producto(3, "Producto3", Categoria.POSTRE, Estado.DISPONIBLE, 3.0f);
//        Producto unProducto4 = new Producto(3, "Producto4", Categoria.POSTRE, Estado.DISPONIBLE, 4.0f);
//        //producto repetido
//        
//        if(!listaProductos.contains(unProducto1))
//            listaProductos.add(unProducto1);
//        if(!listaProductos.contains(unProducto2))
//            listaProductos.add(unProducto2);
//        if(!listaProductos.contains(unProducto3))
//            listaProductos.add(unProducto3);
//        if(!listaProductos.contains(unProducto4))
//            listaProductos.add(unProducto4);
//        
//        ArrayList<ProductoDelPedido> listapdp1 = new ArrayList<>();
//        ProductoDelPedido pdp1 = new ProductoDelPedido(listaProductos.get(0), 1);
//        ProductoDelPedido pdp2 = new ProductoDelPedido(listaProductos.get(1), 2);        
//        if (!listapdp1.contains(pdp1))
//            listapdp1.add(pdp1);
//        if (!listapdp1.contains(pdp2))
//            listapdp1.add(pdp2);
//        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), listapdp1, (Cliente)usuarios.get(0));        
//        
//        ArrayList<ProductoDelPedido> productosDelPedido2 = new ArrayList<>();
//        ProductoDelPedido pdp3 = new ProductoDelPedido(listaProductos.get(2), 10);
//        ProductoDelPedido pdp4 = new ProductoDelPedido(listaProductos.get(0), 20);
//        ProductoDelPedido pdp5 = new ProductoDelPedido(listaProductos.get(2), 30);
//        //producto repetido        
//        if (!productosDelPedido2.contains(pdp3))
//            productosDelPedido2.add(pdp3);
//        if (!productosDelPedido2.contains(pdp4))
//            productosDelPedido2.add(pdp4);
//        if (!productosDelPedido2.contains(pdp5))
//            productosDelPedido2.add(pdp5);
//        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(), productosDelPedido2, (Cliente)usuarios.get(1));        
//        
//        ArrayList<ProductoDelPedido> productosDelPedido3 = new ArrayList<>();
//        ProductoDelPedido pdp6 = new ProductoDelPedido(listaProductos.get(1), 100);
//        ProductoDelPedido pdp7 = new ProductoDelPedido(listaProductos.get(2), 200);
//        if (!productosDelPedido3.contains(pdp6))
//            productosDelPedido3.add(pdp6);
//        if (!productosDelPedido3.contains(pdp7))
//            productosDelPedido3.add(pdp7);
//        Pedido unPedido3 = new Pedido(2, LocalDateTime.now(), productosDelPedido3, (Cliente)usuarios.get(2));        
//        //pedido repetido
//
//        if(!listaPedidos.contains(unPedido1))
//            listaPedidos.add(unPedido1);
//        if(!listaPedidos.contains(unPedido2))
//            listaPedidos.add(unPedido2);
//        if(!listaPedidos.contains(unPedido3))
//            listaPedidos.add(unPedido3);
//        
//        System.out.println("Pedidos");
//        System.out.println("=======");
//        for(Pedido p : listaPedidos) {
//            p.mostrar();
//            System.out.println();
//        }
//        
//        ((Cliente)unCliente1).agregarPedido(unPedido1);
//        ((Cliente)unCliente1).agregarPedido(unPedido1);
//        //pedido repetido
//        
//        System.out.println("Pedidos de " + unCliente1.verApellido() + ", " + unCliente1.verNombre());
//        for(Pedido p : unCliente1.verPedidos()) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
//        
//        ((Cliente)unCliente1).cancelarPedido(unPedido1);
//        System.out.println("Pedidos de " + unCliente1.verApellido() + ", " + unCliente1.verNombre());
//        for(Pedido p : unCliente1.verPedidos()) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
    
    /*
    FIN Tercera parte - herencia
    */
    }
  }