/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import java.time.LocalDateTime;
import productos.modelos.Producto;
import usuarios.modelos.Encargado;
import usuarios.modelos.Empleado;
import usuarios.modelos.Cliente;
import java.util.ArrayList;
import pedidos.modelos.Pedido;
import pedidos.modelos.ProductoDelPedido;
import productos.modelos.Categoria;
import productos.modelos.Estado;


/**
 *
 * @author root
 */
public class ControladorPrincipal  {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        Cliente unCliente1 = new Cliente("NombreCliente1", "ApellidoCliente1", "cliente1@bar.com", "ClaveCliente1");        
        Cliente unCliente2 = new Cliente("NombreCliente2", "ApellidoCliente2", "cliente2@bar.com", "ClaveCliente2");
        Cliente unCliente3 = new Cliente("NombreCliente3", "ApellidoCliente3", "cliente3@bar.com", "ClaveCliente3");
        
        clientes.add(unCliente1);
        clientes.add(unCliente2);
        clientes.add(unCliente3);
        
        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : clientes) {
            c.mostrar();
            System.out.println();
        }
        System.out.println();        
        
        Empleado unEmpleado1 = new Empleado("NombreEmpleado1", "ApellidoEmpleado1", "empleado1@bar.com", "ClaveEmpleado1");        
        Empleado unEmpleado2 = new Empleado("NombreEmpleado2", "ApellidoEmpleado2", "empleado2@bar.com", "ClaveEmpleado2");        
        Empleado unEmpleado3 = new Empleado("NombreEmpleado3", "ApellidoEmpleado3", "empleado3@bar.com", "ClaveEmpleado3");
                
        empleados.add(unEmpleado1);
        empleados.add(unEmpleado2);
        empleados.add(unEmpleado3);
        
        System.out.println("Empleados");
        System.out.println("=========");
        for(Empleado e : empleados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();
        
        Encargado unEncargado1 = new Encargado("NombreEncargado1", "ApellidoEncargado1", "encargado1@bar.com", "ClaveEncargado1");
        Encargado unEncargado2 = new Encargado("NombreEncargado2", "ApellidoEncargado2", "encargado2@bar.com", "ClaveEncargado2");
        Encargado unEncargado3 = new Encargado("NombreEncargado3", "ApellidoEncargado3", "encargado3@bar.com", "ClaveEncargado3");
        
        encargados.add(unEncargado1);
        encargados.add(unEncargado2);
        encargados.add(unEncargado3);
        
        System.out.println("Encargados");
        System.out.println("==========");
        for(Encargado e : encargados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();
        
        Producto unProducto1 = new Producto(1, "Producto1",Categoria.ENTRADA, Estado.DISPONIBLE, 1.0f);        
        Producto unProducto2 = new Producto(1, "Producto2", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE,  2.0f );
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
        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : productos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        
        
        unCliente1.asignarCorreo("cliente10@bar.com");
        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : clientes) {
            c.mostrar();
            System.out.println();
        }
        System.out.println();
        
        System.out.println(unProducto1);
        
        ArrayList<ProductoDelPedido> pdp1 = new ArrayList<>();
        
        ProductoDelPedido unPdp1 = new ProductoDelPedido(1,unProducto1);
        
        if(!pdp1.contains(unPdp1)){
        pdp1.add(unPdp1);
        }
        
        ProductoDelPedido unPdp2 = new ProductoDelPedido(3,unProducto1);
        if(!pdp1.contains(unPdp2)){
        pdp1.add(unPdp2);
        }
        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), unCliente1, pdp1);        
        
        ArrayList<ProductoDelPedido> pdp2 = new ArrayList<>();
        ProductoDelPedido unPdp3 = new ProductoDelPedido(10, unProducto2);
        if(!pdp2.contains(unPdp3)){
        pdp2.add(unPdp3);
        }
        
        ProductoDelPedido unPdp4 = new ProductoDelPedido(30,unProducto3);
        if(!pdp2.contains(unPdp4)){
        pdp2.add(unPdp4);
        }
        Pedido unPedido2 = new Pedido(1, LocalDateTime.now(), unCliente2, pdp2);        
        
        ArrayList<ProductoDelPedido> pdp3 = new ArrayList<>();
        ProductoDelPedido unPdp5 = new ProductoDelPedido(20,unProducto3);
        if(!pdp3.contains(unPdp5)){
        pdp3.add(unPdp5);
        }
        
        ProductoDelPedido unPdp6 = new ProductoDelPedido(20,unProducto2);
        if(!pdp3.contains(unPdp6)){
        pdp3.add(unPdp6);
        }
        
        
        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(),unCliente3, pdp3);        
        
        
        if(!pedidos.contains(unPedido1)){
        pedidos.add(unPedido1);
        }
        if(!pedidos.contains(unPedido2)){
        pedidos.add(unPedido2);
        }
        if(!pedidos.contains(unPedido3)){
        pedidos.add(unPedido3);
        }
        
        System.out.println("Pedidos");
        System.out.println("=======");
        for(Pedido p : pedidos) {
            p.mostrarPedido();
            System.out.println();
        }
        System.out.println();
        
    }   
}
