/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Encargado {
    int clave;
    String nombre;
    String apellido;
    String correo;
    
    void mostrar() {
        System.out.println("Usuario: " + nombre + apellido);
        System.out.println("Clave: " + clave);
        System.out.println("Correo: " + correo);
    }
}
