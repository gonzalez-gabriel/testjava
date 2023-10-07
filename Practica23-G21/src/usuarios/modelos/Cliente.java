/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;
import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 *
 * @author estudiante
 */
public class Cliente {
    private String clave;
    private String nombre;
    private String apellido;
    private String correo;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public Cliente(String clave, String nombre, String apellido, String correo) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }

    public String verCorreo() {
        return correo;
    }

    public void asignarCorreo(String correo) {
        this.correo = correo;
    } 
    
    public void agregarPedido(Pedido p) {
        pedidos.add(p);
    }
    
    
    public void mostrar() {
        System.out.println("Usuario: " + nombre + apellido);
        System.out.println("Clave: " + clave);
        System.out.println("Correo: " + correo);
        for (Pedido p: pedidos) {
            p.mostrarPedido();
        }
    }
}
