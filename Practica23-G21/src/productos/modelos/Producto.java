/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author estudiante
 */
public class Producto {
    public String nombre;
    public String descripcion;
    public float precio;
    public boolean estado;
    public String tipo;
    
    void mostrar() {
        System.out.println("Producto: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: \n");
        if(estado) {
            System.out.println("Disponible");
        }
        else {
            System.out.println("No disponible");
        }
    }
}
