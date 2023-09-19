/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Cliente {
    private int clave;
    private String nombre;
    private String apellido;
    private String correo;
    
    public Cliente(int clave, String nombre, String apellido, String correo) {
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public int verClave() {
        return clave;
    }

    public void asignarClave(int clave) {
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
    
    
    
    public void mostrar() {
        System.out.println("Usuario: " + nombre + apellido);
        System.out.println("Clave: " + clave);
        System.out.println("Correo: " + correo);
    }
}
