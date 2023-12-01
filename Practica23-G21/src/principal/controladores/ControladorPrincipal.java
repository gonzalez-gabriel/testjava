/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;


import interfaces.IGestorProductos;
import interfaces.IGestorUsuarios;
import java.util.ArrayList;
import productos.modelos.Producto;
import java.util.List;
import javax.swing.UIManager;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.GestorProductos;
import usuarios.modelos.GestorUsuarios;
import usuarios.modelos.Usuario;
import usuarios.vistas.VentanaAMUsuario;

/**
 *
 * @author root
 */
public class ControladorPrincipalTP7  {
    public static void main(String[] args) {
        
//        GestorProductos gp = GestorProductos.crear();
//        System.out.println(gp.crearProducto(1,"Papafrita" , 10, Categoria.ENTRADA, Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(2,"Milanga" , 20, Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(3,"Helado gridito" , 30, Categoria.POSTRE, Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(4,"Choriflan" , 40, Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE));
  
        
       
//        IGestorUsuarios gu = GestorUsuarios.instanciar();
        IGestorProductos gp = GestorProductos.instanciar();
        System.out.println(gp.crearProducto(2,"Choriflan" , 40, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(1));
//        IGestorPedidos gped = GestorPedidos.instanciar();
//        System.out.println(gu.crearUsuario("mail1@hotmail.com", "A", "Z", Perfil.CLIENTE, "clave1", "clave1"));
//        System.out.println(gu.crearUsuario("mail2@hotmail.com", "B", "H", Perfil.CLIENTE, "clave2", "clave2"));
//        System.out.println(gu.crearUsuario("mail3@hotmail.com", "A", "Y", Perfil.CLIENTE, "clave3", "clave3"));
//        System.out.println(gu.crearUsuario("mail4@hotmail.com", "C", "J", Perfil.CLIENTE, "clave4", "clave4"));
//        
////        System.out.println(gu.verUsuarios());
////        System.out.println(gu.buscarUsuarios(""));
////          System.out.println(gu.existeEsteUsuario(gu.verUsuarios().get(0)));
//
//        System.out.println(gp.crearProducto(1,"" , 20, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(2,"Choriflan" , 40, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(3,"Milanesa dulce" , 10, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(4,"Helado gridito" , 30, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(5,"Milanesa napolitana" , 50, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
//        System.out.println(gp.crearProducto(6,"Choripan" , 60, Categoria.ENTRADA, productos.modelos.Estado.DISPONIBLE));
//        System.out.println(gp.verProductosPorCategoria(Categoria.ENTRADA));
//        ArrayList<ProductoDelPedido> pdps1 = new ArrayList<>();
//        pdps1.add(new ProductoDelPedido(gp.menu().get(0),1));
//        ArrayList<ProductoDelPedido> pdps2 = new ArrayList<>();
//        pdps2.add(new ProductoDelPedido(gp.menu().get(1),2));
//        ArrayList<ProductoDelPedido> pdps3 = new ArrayList<>();
//        pdps3.add(new ProductoDelPedido(gp.menu().get(2),3));
//        System.out.println(gped.crearPedido(3, LocalDate.now(), LocalTime.now(),pdps1, (Cliente)gu.verUsuarios().get(0)));
//        System.out.println(gped.crearPedido(1, LocalDate.now(), LocalTime.now(),pdps2, (Cliente)gu.verUsuarios().get(0)));
//        System.out.println(gped.crearPedido(2, LocalDate.now(), LocalTime.now(),pdps3, (Cliente)gu.verUsuarios().get(0)));
//        System.out.println(gped.verPedidos());
//        System.out.println(gu.verUsuarios());
//        System.out.println(gu.borrarUsuario(gu.verUsuarios().get(1)));
        
        System.out.println(gp.existeEsteProducto(unProducto1));
        Producto unProducto10 = new Producto(10, "Producto10", Categoria.ENTRADA, Estado.DISPONIBLE, 10.0f);
        //producto inexistente
        System.out.println(gp.existeEsteProducto(unProducto10));
               
        List<Producto> productosBuscados = gp.verProductosPorCategoria(Categoria.POSTRE);
        System.out.println("Productos filtrados");
        System.out.println("===================");
        for(Producto p : productosBuscados) {
            if (p.verPrecio() > 0) { //para no mostrar los 3 productos con precio negativo
                p.mostrar();
                System.out.println();
            }
        }
        System.out.println();
        
        productosBuscados = gp.buscarProductos("Producto");
        System.out.println("Productos buscados");
        System.out.println("==================");
        for(Producto p : productosBuscados) {
            if (p.verPrecio() > 0) { //para no mostrar los 3 productos con precio negativo
                p.mostrar();
                System.out.println();
            }
        }
        System.out.println();
      
        System.out.println(gp.modificarProducto(unProducto1, 100, "Producto11", 10.0f, Categoria.PLATO_PRINCIPAL, Estado.NO_DISPONIBLE));
        //se le cambia la descripción, precio, categoría y estado
        //el código, por más que se lo pasa, no se modifica
        productosBuscados = gp.buscarProductos("Producto11");
        System.out.println("Productos buscados");
        System.out.println("==================");
        for(Producto p : productosBuscados) {
            if (p.verPrecio() > 0) { //para no mostrar los 3 productos con precio negativo
                p.mostrar();
                System.out.println();
            }
        }
        System.out.println();
        System.out.println(gp.modificarProducto(unProducto2, 1, "Producto2Modif", 10.0f, Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE));        
        //sí se puede
        
        System.out.println(gp.borrarProducto(unProducto1));
        //sí se puede
        
        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : gp.menu()) {
            if (p.verPrecio() > 0) { //para no mostrar los 3 productos con precio negativo
                p.mostrar();
                System.out.println();
            }
        }
        System.out.println();
        
        establecerLookAndFeel("Nimbus"); 
        VentanaAMUsuario ventanaAUsuario = new VentanaAMUsuario(null);
              
        System.out.println("USUARIOS");
        System.out.println("=====");
        usuarios=gu.verUsuarios();
        for(Usuario u : usuarios) {
            u.mostrar();
            System.out.println();
        }

    } 
    
    public static void establecerLookAndFeel(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (Exception e) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } 
            catch (Exception e2) {
            }
        }
    }
}
