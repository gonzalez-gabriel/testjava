/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import usuarios.modelos.Cliente;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private Estado estado;
    private Cliente unCliente;
    private List<ProductoDelPedido> productosDelPedido = new ArrayList<>();

    public Pedido(int numero, LocalDateTime fechaYHora,List<ProductoDelPedido> pdp, Cliente unCliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.productosDelPedido = pdp;
        this.estado = Estado.CREANDO;
        this.unCliente = unCliente;
        
    }

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente verUnCliente() {
        return unCliente;
    }

    public void asignarUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }
    
    public LocalTime verHora() {
       return (fechaYHora.toLocalTime());
    }
    
    public void asignarHora(LocalTime unaHora) {
        this.fechaYHora = this.fechaYHora.withHour(unaHora.getHour());
        this.fechaYHora = this.fechaYHora.withMinute(unaHora.getMinute());
    }
    
    public LocalDate verFecha() {
       return (fechaYHora.toLocalDate());
    }
    
    public void asignarFecha(LocalDate unaFecha) {
        this.fechaYHora = this.fechaYHora.withDayOfMonth(unaFecha.getDayOfMonth());
        this.fechaYHora = this.fechaYHora.withMonth(unaFecha.getMonthValue());
        this.fechaYHora = this.fechaYHora.withYear(unaFecha.getYear());
    }

    public List<ProductoDelPedido> verPdp() {
        return this.productosDelPedido;
    }

    public void asignarPdp(List<ProductoDelPedido> pdp) {
        this.productosDelPedido = pdp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        return this.numero == other.numero;
    }

    @Override
    public String toString() {
        return "\nPedido: " + numero + "\nFecha: "  + fechaYHora.toLocalDate() + "\nHora: " + fechaYHora.toLocalTime() + "\nEstado: " + estado + "\nCliente: " + unCliente + "\nProductosDelPedido: " + productosDelPedido + "\n";
    }
    
    
   
    
    public void mostrar () {
        String patronFecha = "dd/MM/yyyy";
        String fechaFormateada = fechaYHora.format(DateTimeFormatter.ofPattern(patronFecha)); 
        if (fechaFormateada == null) {
            fechaFormateada = "ERROR";
        }
        System.out.println("Nro. " + numero);
        System.out.println("Fecha: " + fechaFormateada + "\tHora: " + fechaYHora.getHour()+":"+fechaYHora.getMinute());
        System.out.println("Cliente: " + unCliente.verNombre() + ", " + unCliente.verApellido());
        System.out.println("Estado: " + estado);
        System.out.println("\tProducto\tCantidad");
        System.out.println("\t========================");
        for (ProductoDelPedido pdp : productosDelPedido) {
            System.out.println("\t" + pdp.verProducto() + "\t" + pdp.verCantidad());
        }
    }
    
}
