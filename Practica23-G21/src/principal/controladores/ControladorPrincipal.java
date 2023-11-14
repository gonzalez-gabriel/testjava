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
        System.out.println(gp.crearProducto(1,"Papafrita" , 10, Categoria.ENTRADA, Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(2,"Milanga" , 20, Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(3,"Helado gridito" , 30, Categoria.POSTRE, Estado.DISPONIBLE));
        System.out.println(gp.crearProducto(4,"Choriflan" , 40, Categoria.PLATOPRINCIPAL, Estado.DISPONIBLE));
  
    }
}