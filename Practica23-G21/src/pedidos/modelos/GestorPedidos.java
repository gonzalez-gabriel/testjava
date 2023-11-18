/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;

/**
 *
 * @author gabri
 */
public class GestorPedidos {
    private ArrayList <Pedido> pedidos = new ArrayList<>();
    private static GestorPedidos gestor;
    
    
    private GestorPedidos(){
      
    }
    
    public static final String EXITO = "Pedido creado/modificado/cancelado con éxito";
    public static final String ERROR_NUMERO = "El numero del pedido es invalido";
    public static final String ERROR_FECHA = "La fecha del pedido es incorrecta";
    public static final String ERROR_HORA = "La hora del pedido es incorrecta";
    public static final String ERROR_PRODUCTOS_DEL_PEDIDO = "El pedido no tiene productos";
    public static final String ERROR_CLIENTE = "El pedido no tiene un cliente";
    public static final String ERROR_ESTADO = "El pedido no tiene un estado";
    public static final String ERROR_CANCELAR = "No se puede cancelar el pedido en este estado";
    public static final String PEDIDOS_DUPLICADOS = "Ya existe un pedido con ese número";
    public static final String PEDIDO_INEXISTENTE = "No existe el pedido especificado";
    public static final String VALIDACION_EXITO = "El pedido tiene los datos correctos";
    
    
    public static GestorPedidos crear(){
        if(gestor == null){
            gestor= new GestorPedidos();
        }
        
        return gestor;
    }
    
    public String crearPedido(int numero, LocalDate fecha, LocalTime hora, ArrayList<ProductoDelPedido> productosDelPedido, Cliente cliente){
        
        String validez = validarDatos(numero,fecha,hora,productosDelPedido,cliente);
        
        if (validez.equals(VALIDACION_EXITO)) {
            Pedido p = new Pedido(numero,LocalDateTime.of(fecha, hora),productosDelPedido,cliente);
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
    
    public ArrayList<Pedido> verPedidos(){
        return this.pedidos;
    }
    
    public boolean hayPedidosConEsteCliente(Cliente cliente){
        for (Pedido p: pedidos) {
            if (p.verUnCliente().equals(cliente)) {
                return true;
            } 
        }
        return false;
    }
    
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
    
    public boolean existeEstePedido(Pedido pedido){
        return this.pedidos.contains(pedido);
    }
    
    public Pedido obtenerPedido(Integer numero){
        for (Pedido p : this.pedidos) {
            if (p.verNumero() == numero) {
                return p;
            }
        }
        return null;
    }
    
    public String validarDatos (int numero, LocalDate fecha, LocalTime hora, ArrayList<ProductoDelPedido> productosDelPedido, Cliente cliente) {
        
        if (numero <= 0) {
            return ERROR_NUMERO;
        }
        
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
