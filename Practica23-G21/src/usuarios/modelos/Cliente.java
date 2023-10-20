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
public class Cliente extends Usuario {
//    private String nombre;
//    private String apellido;
//    private String correo;
//    private String clave;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre, String apellido, String correo, String clave) {
    super(nombre, apellido, correo, clave);    

    }
    
//    public String verClave() {
//        return clave;
//    }
//
//    public void asignarClave(String clave) {
//        this.clave = clave;
//    }
//
//    public String verNombre() {
//        return nombre;
//    }
//
//    public void asignarNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String verApellido() {
//        return apellido;
//    }
//
//    public void asignarApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//    public String verCorreo() {
//        return correo;
//    }
//
//    public void asignarCorreo(String correo) {
//        this.correo = correo;
//    } 
    
    public void agregarPedido(Pedido p) {
        pedidos.add(p);
    }
    
    
    public void mostrar() {
        super.mostrar();
//        System.out.println("Usuario: " + nombre + "\t" + apellido);
//        System.out.println("Clave: " + clave);
//        System.out.println("Correo: " + correo);
        if (!(pedidos == null || pedidos.isEmpty())) {
            for (Pedido p: pedidos) {
                p.mostrarPedido();
            
                }
            }
        }
        }
    
