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
        ArrayList <Usuario> usuarios = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        Usuario unCliente1 = new Cliente("cliente1@bar.com","ClaveCliente1","ApellidoCliente1","NombreCliente1" );        
        Usuario unCliente2 = new Cliente("cliente2@bar.com","ClaveCliente2","ApellidoCliente2","NombreCliente2" );
        Usuario unCliente3 = new Cliente("cliente3@bar.com","ClaveCliente3","ApellidoCliente3","NombreCliente3" );
        
        if (!usuarios.contains(unCliente1)) {
            usuarios.add(unCliente1);
        }
        if (!usuarios.contains(unCliente2)) {
        usuarios.add(unCliente2);
        }
        if (!usuarios.contains(unCliente3)) {
        usuarios.add(unCliente3);      
        }
        
        Usuario unEmpleado1 = new Empleado("NombreEmpleado1", "ApellidoEmpleado1", "empleado1@bar.com", "ClaveEmpleado1");        
        Usuario unEmpleado2 = new Empleado("NombreEmpleado2", "ApellidoEmpleado2", "empleado2@bar.com", "ClaveEmpleado2");        
        Usuario unEmpleado3 = new Empleado("NombreEmpleado3", "ApellidoEmpleado3", "empleado3@bar.com", "ClaveEmpleado3");
        
        if (!usuarios.contains(unEmpleado1)) {
        usuarios.add(unEmpleado1);
        }
        if(!usuarios.contains(unEmpleado2)) {
        usuarios.add(unEmpleado2);
        }
        if(!usuarios.contains(unEmpleado3)) {
        usuarios.add(unEmpleado3);
        }
        
        Usuario unEncargado1 = new Encargado("NombreEncargado1", "ApellidoEncargado1", "encargado1@bar.com", "ClaveEncargado1");
        Usuario unEncargado2 = new Encargado("NombreEncargado2", "ApellidoEncargado2", "encargado2@bar.com", "ClaveEncargado2");
        Usuario unEncargado3 = new Encargado("NombreEncargado3", "ApellidoEncargado3", "encargado3@bar.com", "ClaveEncargado3");
        
        if (!usuarios.contains(unEncargado1)) {
        usuarios.add(unEncargado1);
        }
        if(!usuarios.contains(unEncargado2)) {
        usuarios.add(unEncargado2);
        }
        if(!usuarios.contains(unEncargado3)) {
        usuarios.add(unEncargado3);
        }
        
        
//        System.out.println("Clientes");
//        System.out.println("========");
//        
//        for (Usuario u : usuarios) {
//            if (u instanceof Cliente) {
//                u.mostrar();
//                System.out.println("\n");
//            }
//        }
//        
//        System.out.println("\n");
//        
//        System.out.println("Empleados");
//        System.out.println("========");
//        
//        for (Usuario u : usuarios) {
//            if (u instanceof Empleado) {
//                u.mostrar();
//                System.out.println("\n");
//            }
//        }
        
//        System.out.println("\n");
//        
//        System.out.println("Encargados");
//        System.out.println("========");
//        
//        for (Usuario u : usuarios) {
//            if (u instanceof Encargado) {
//                u.mostrar();
//                System.out.println("\n");
//            }
//        }
        
//        System.out.println("\n");
//        
//        System.out.println("Todos");
//        System.out.println("========");
//        
//        for (Usuario u : usuarios) {
//            u.mostrar();
//            System.out.println("\n");
//        }
        
        Producto unProducto1 = new Producto(1, "Producto1",Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);        
        Producto unProducto2 = new Producto(2, "Producto2", Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE,  2.0f );
        Producto unProducto3 = new Producto(3, "Producto3",Categoria.POSTRE, Estado.DISPONIBLE,3.0f);
        
        if(!productos.contains(unProducto1)){
        productos.add(unProducto1);
        }
        if(!productos.contains(unProducto2)){
        productos.add(unProducto2);
        }
        if(!productos.contains(unProducto3)){
        productos.add(unProducto3);
        }
        
//        System.out.println("Productos");
//        System.out.println("=========");
//        for(Producto p : productos) {
//            p.mostrar();
//            System.out.println();
//        }
//        System.out.println();
        
        ArrayList<ProductoDelPedido> pdp1 = new ArrayList<>();
        
        ProductoDelPedido unPdp1 = new ProductoDelPedido(unProducto1,1);
        
        if(!pdp1.contains(unPdp1)){
        pdp1.add(unPdp1);
        }
        
        ProductoDelPedido unPdp2 = new ProductoDelPedido(unProducto2,3);
        if(!pdp1.contains(unPdp2)){
        pdp1.add(unPdp2);
        }
        
        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(),pdp1, (Cliente)unCliente1);

        
        
        
        
        ArrayList<ProductoDelPedido> pdp2 = new ArrayList<>();
        ProductoDelPedido unPdp3 = new ProductoDelPedido( unProducto2, 10);
        if(!pdp2.contains(unPdp3)){
        pdp2.add(unPdp3);
        }
        
        ProductoDelPedido unPdp4 = new ProductoDelPedido(unProducto3, 30);
        if(!pdp2.contains(unPdp4)){
        pdp2.add(unPdp4);
        }
        Pedido unPedido2 = new Pedido(2, LocalDateTime.now(),pdp2, (Cliente)unCliente2);        
        
        ArrayList<ProductoDelPedido> pdp3 = new ArrayList<>();
        ProductoDelPedido unPdp5 = new ProductoDelPedido(unProducto3, 20);
        if(!pdp3.contains(unPdp5)){
        pdp3.add(unPdp5);
        }
        
        ProductoDelPedido unPdp6 = new ProductoDelPedido(unProducto2, 20);
        if(!pdp3.contains(unPdp6)){
        pdp3.add(unPdp6);
        }
        
        
        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(),pdp3,(Cliente)unCliente3);        
        
        
        if(!pedidos.contains(unPedido1)){
        pedidos.add(unPedido1);
        }
        if(!pedidos.contains(unPedido2)){
        pedidos.add(unPedido2);
        }
        if(!pedidos.contains(unPedido3)){
        pedidos.add(unPedido3);
        }
        
        //////////////////////////////////////////////////////////////////////////////////
        //AGREGADO DE PEDIDO AL CLIENTE
        
        
        ((Cliente)unCliente1).agregarPedido(unPedido1);
        
        for(Pedido p: unCliente1.verPedidos()){
            p.mostrar();
        }
        
        ((Cliente)unCliente1).cancelarPedido(unPedido1);
        
        if (unCliente1.verPedidos().isEmpty()) {
            System.out.println("Este cliente no tiene pedidos");
        }
        else {
            for(Pedido p: unCliente1.verPedidos()){
                p.mostrar(); 
            }
            
        }
            
        
        
        
        
        ////////////////////////////////////////////////////
        
//        System.out.println("Pedidos");
//        System.out.println("=======");
//        for(Pedido p : pedidos) {
//            p.mostrarPedido();
//            System.out.println();
//        }
//        System.out.println();
        
    }   
}
