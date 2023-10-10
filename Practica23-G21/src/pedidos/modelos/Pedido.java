/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;
import java.time.*;
import java.time.format.DateTimeFormatter;
import usuarios.modelos.Cliente;

/**
 *
 * @author USUARIO
 */
public class Pedido {
    int numero;
    LocalDateTime fechaYHora;
    Estado estado;
    Cliente unCliente;

    public Pedido(int numero, LocalDateTime fechaYHora, Estado estado, Cliente unCliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.estado = estado;
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
   
    
    public void mostrarPedido () {
        String patronFecha = "dd/MM/yyyy";
        String fechaFormateada = fechaYHora.format(DateTimeFormatter.ofPattern(patronFecha)); 
        
        System.out.println("Nro. " + numero);
        System.out.println("Fecha: " + fechaFormateada + "\tHora: " + fechaYHora.getHour()+":"+fechaYHora.getMinute());
        System.out.println("Cliente: " + unCliente.verNombre() + " " + unCliente.verApellido());
        System.out.println("Estado: " + estado);
    }
    
}
