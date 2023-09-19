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
    private String nombre;
    private String descripcion;
    private float precio;
    private boolean estado;
    private String tipo;

    public Producto(String nombre, String descripcion, float precio, boolean estado, String tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
        this.tipo = tipo;
    }
    
    public void mostrar() {
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
