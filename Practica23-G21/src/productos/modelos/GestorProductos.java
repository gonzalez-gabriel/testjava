/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class GestorProductos {
    private ArrayList <Producto> productos = new ArrayList<>();
    private static GestorProductos gestor;
    
    public static final String EXITO_CREADO = "Producto creado/modificado exitosamente";
    public static final String EXITO_MODIFICADO = "Producto modificado exitosamente";
    public static final String ERROR_CODIGO = "El código del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripción del producto es incorrecta";

    public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
    public static final String ERROR_CATEGORIA = "La categoría del producto es incorrecta";

    public static final String ERROR_ESTADO = "El estado es incorrecto";
    public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese código";

    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";

    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    
    
    
    private GestorProductos(){
    
    }
    
    public static GestorProductos crear(){
        if(gestor == null){
            gestor = new GestorProductos();
        }
        
        return gestor;
    
    }
    
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        
        String validez = validarDatos(codigo,descripcion,precio,categoria,estado);
        
        if (validez.equals(VALIDACION_EXITO)) {
            Producto p = new Producto(codigo,descripcion, categoria,estado,precio);
            if (this.productos.contains(p)) {
                p = null;
                return PRODUCTOS_DUPLICADOS;               
            }
            else {
                this.productos.add(p);
                return EXITO_CREADO;
            }            
        }
        else {
            return validez;
        }
    }
    
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado){
        
        if (!this.productos.isEmpty() && this.productos.contains(productoAModificar)) {   
            
            String validez = validarDatos(codigo,descripcion,precio,categoria,estado);
            
            if (validez.equals(VALIDACION_EXITO)) {
     
            
                int i = this.productos.indexOf(productoAModificar);
                productoAModificar.AsignarCodigo(codigo);
                productoAModificar.asignarDescripcion(descripcion);
                productoAModificar.asignarPrecio(precio);
                productoAModificar.asignarCategoria(categoria);
                productoAModificar.asignarEstado(estado);
                this.productos.set(i, productoAModificar);

                return EXITO_CREADO;
            
            }
            
            else {
                return validez;
            }
        
        }
        
        else {
            return PRODUCTO_INEXISTENTE;
        }
        
        /*if(precio <= 0){
            return ERROR_PRECIO;
        }
        
        if(categoria == null){
            return ERROR_CATEGORIA;
        }
        
        if(estado == null){
            return ERROR_ESTADO;
        }
        
        productoAModificar.AsignarCodigo(codigo);
        productoAModificar.asignarCategoria(categoria);
        productoAModificar.asignarDescripcion(descripcion);
        productoAModificar.asignarEstado(estado);
        productoAModificar.asignarPrecio(precio);
        return EXITO_CREADO;
        */
        
    }

    public ArrayList<Producto> menu(){
        return this.productos;
    }
   
    
    public ArrayList<Producto> buscarProductos(String descripcion){
        ArrayList<Producto> descripcionBuscada = new ArrayList<>();
        for(Producto p: productos){ 
            if (p.verDescripcion().equals(descripcion) || p.verDescripcion().startsWith(descripcion)) {
                descripcionBuscada.add(p);
            }
        }
        return descripcionBuscada;
    }
  
    public boolean existeEsteProducto (Producto producto){
        
        return this.productos.contains(producto);
        
    }
    
    public String validarDatos (int codigo, String descripcion, float precio, Categoria categoria, Estado estado) {
        
        if(codigo < 0){
            return ERROR_CODIGO;
        }

        if(descripcion == null || descripcion.isBlank()){
            return ERROR_DESCRIPCION;
        }

        if(precio <= 0){
            return ERROR_PRECIO;
        }

        if(categoria == null){
            return ERROR_CATEGORIA;
        }

        if(estado == null){
            return ERROR_ESTADO;
        }
        
        return VALIDACION_EXITO;
    } 
  
    public ArrayList <Producto> verProductosPorCategoria(Categoria categoria){
        
    ArrayList<Producto> categoriaBuscada = new ArrayList<>();
        for(Producto p: productos){ 
            if (p.verCategoria() == categoria) {
                categoriaBuscada.add(p);
            }
        }
        return categoriaBuscada;
    }
  
    public Producto obtenerProducto(Integer codigo){
        
        for(Producto p: productos){
            if(p.verCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    
}
