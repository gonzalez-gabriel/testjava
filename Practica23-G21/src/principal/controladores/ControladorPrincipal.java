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
        
        GestorProductos gp = GestorProductos.crear();
        System.out.println(gp.crearProducto(1,"Papa frita chango" , 10, Categoria.ENTRADA, Estado.DISPONIBLE));
        Producto p1 = gp.menu().get(0);
        System.out.println(gp.modificarProducto(p1, 100, "MCDonalds", 12, Categoria.ENTRADA, Estado.DISPONIBLE));
        System.out.println(gp.buscarProductos("MCDonalds"));
        
        
}
}