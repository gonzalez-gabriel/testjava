/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import interfaces.IGestorPedidos;
import static interfaces.IGestorPedidos.ERROR_CLIENTE;
import static interfaces.IGestorPedidos.ERROR_FECHA;
import static interfaces.IGestorPedidos.ERROR_HORA;
import static interfaces.IGestorPedidos.ERROR_NUMERO;
import static interfaces.IGestorPedidos.ERROR_PRODUCTOS_DEL_PEDIDO;
import static interfaces.IGestorPedidos.PEDIDOS_DUPLICADOS;
import static interfaces.IGestorPedidos.PEDIDO_INEXISTENTE;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import java.util.List;

/**
 *
 * @author gabri
 */
public class GestorPedidos implements IGestorPedidos {
    private ArrayList <Pedido> pedidos = new ArrayList<>();
    private static GestorPedidos gestor;
    
    
    private GestorPedidos() {
      
    }
    
    
    public static GestorPedidos instanciar(){
        if(gestor == null){
            gestor= new GestorPedidos();
        }
        
        return gestor;
    }
    
    @Override
    public String crearPedido(LocalDate fecha, LocalTime hora, List<ProductoDelPedido> productosDelPedido, Cliente cliente){
        
        String validez = validarDatos(fecha,hora,productosDelPedido,cliente);
        
        if (validez.equals(VALIDACION_EXITO)) {
            Pedido p = new Pedido(pedidos.size()+1,LocalDateTime.of(fecha, hora),productosDelPedido,cliente);
            if (this.pedidos.contains(p)) {
                p = null;
                return PEDIDOS_DUPLICADOS;
            }
            else {
                this.pedidos.add(p);
                cliente.agregarPedido(p);
                return EXITO;
            }
        }
        else
            return validez;
        
    }
    
    @Override
    public String cambiarEstado(Pedido pedidoAModificar){
        if (!this.pedidos.contains(pedidoAModificar)) {
            return PEDIDO_INEXISTENTE;
        }
        if (pedidoAModificar.verEstado() == Estado.CREANDO) {
            pedidoAModificar.asignarEstado(Estado.PROCESANDO);
        }
        
        else if (pedidoAModificar.verEstado() == Estado.PROCESANDO) {
            pedidoAModificar.asignarEstado(Estado.ENTREGADO);
        }
        return EXITO;
    }
    
    @Override
    public ArrayList<Pedido> verPedidos(){
        Comparator <Pedido> numComp = (Pedido p1, Pedido p2) -> p1.verNumero() - p2.verNumero();
        Collections.sort(this.pedidos, numComp);
        return this.pedidos;
    }
    
    @Override
    public boolean hayPedidosConEsteCliente(Cliente cliente){
        for (Pedido p: pedidos) {
            if (p.verUnCliente().equals(cliente)) {
                return true;
            } 
        }
        return false;
    }
    
    @Override
    public boolean hayPedidosConEsteProducto(Producto producto){
        for (Pedido p : pedidos) {
            for (ProductoDelPedido pdp: p.verPdp()) {
                if (pdp.verProducto().equals(producto)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean existeEstePedido(Pedido pedido){
        return this.pedidos.contains(pedido);
    }
    
    @Override
    public Pedido obtenerPedido(Integer numero){
        for (Pedido p : this.pedidos) {
            if (p.verNumero() == numero) {
                return p;
            }
        }
        return null;
    }
    
    @Override
    public String cancelarPedido (Pedido pedido) {
        for (Pedido p : this.pedidos) {
            if (pedido.equals(p)) {
                p.verUnCliente().cancelarPedido(p);
            }
        }
        this.pedidos.remove(pedido);
        return EXITO;
    }
    
    @Override
    public String validarDatos (LocalDate fecha, LocalTime hora, List<ProductoDelPedido> productosDelPedido, Cliente cliente) {
        
        
        
        if (fecha == null) {
            return ERROR_FECHA;
        }
        
        if (hora == null) {
            return ERROR_HORA;
        }
        
        if (cliente == null) {
            return ERROR_CLIENTE;
        }
        
        if (productosDelPedido == null) {
            return ERROR_PRODUCTOS_DEL_PEDIDO;
        }
        
        return VALIDACION_EXITO;
    }
    
}
