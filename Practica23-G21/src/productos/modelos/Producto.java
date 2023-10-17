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
    private int codigo;
//    private String nombre;
    private String descripcion;
    private float precio;
    private Estado estado;
    private Categoria categoria;

    public Producto( int codigo, String descripcion, Categoria categoria, Estado estado,  float precio) {
//        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precio = precio;
    }

//    public String verNombre() {
//        return nombre;
//    }
//
//    public void asignarNombre(String nombre) {
//        this.nombre = nombre;
//    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float verPrecio() {
        return precio;
    }

    public void asignarPrecio(float precio) {
        this.precio = precio;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = estado;
    }

    public Categoria verCategoria() {
        return categoria;
    }

    public void asignarCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
    
    
    public void mostrar() {
//        System.out.println("Producto: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
        System.out.println("Categoria: " + categoria);
        System.out.println("Estado:" + estado);
        
    }
}
