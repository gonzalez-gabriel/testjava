/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;
import interfaces.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import pedidos.modelos.Pedido;
import pedidos.modelos.GestorPedidos;
import pedidos.modelos.ProductoDelPedido;

/**
 *
 * @author gabri
 */
public class GestorProductos implements IGestorProductos {
    
    private static GestorProductos gestor;
    private ArrayList <Producto> productos = new ArrayList<>();  
    
    
    private GestorProductos(){
        this.leerArchivo();
    }
    
    public static GestorProductos instanciar(){
        if(gestor == null){
            gestor = new GestorProductos();
        }
        
        return gestor;
    
    }
    
    @Override
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
    
    @Override
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

    @Override
    public ArrayList<Producto> menu(){
        Comparator <Producto> catYDescComp = (Producto p1, Producto p2) -> {
                if(!p1.verCategoria().equals(p2.verCategoria())){
                return p1.verCategoria().compareTo(p2.verCategoria());
                }
                else{
        
                return p1.verDescripcion().compareTo(p2.verDescripcion());
                }
        };
        Collections.sort(productos,catYDescComp);
        return this.productos;
    }
   
    
    @Override
    public ArrayList<Producto> buscarProductos(String descripcion){
        if (descripcion.isBlank() || descripcion.isEmpty()) {
            return null;
        }
        ArrayList<Producto> descripcionBuscada = new ArrayList<>();
        for(Producto p: productos){ 
            if (p.verDescripcion().equals(descripcion) || p.verDescripcion().startsWith(descripcion)) {
                descripcionBuscada.add(p);
            }
        }
        Comparator <Producto> catYDescComp = (Producto p1, Producto p2) -> {
                if(!p1.verCategoria().equals(p2.verCategoria())){
                return p1.verCategoria().compareTo(p2.verCategoria());
                }
                else{
                return p1.verDescripcion().compareTo(p2.verDescripcion());
                }
        };
        Collections.sort(descripcionBuscada,catYDescComp);
        return descripcionBuscada;
    }
  
    @Override
    public boolean existeEsteProducto (Producto producto){
        
        return this.productos.contains(producto);
        
    }
    
    @Override
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
  
    @Override
    public ArrayList <Producto> verProductosPorCategoria(Categoria categoria){
        
    ArrayList<Producto> categoriaBuscada = new ArrayList<>();
        for(Producto p: productos){ 
            if (p.verCategoria() == categoria) {
                categoriaBuscada.add(p);
            }
        }
        Comparator <Producto> descComp = (Producto p1, Producto p2) -> p1.verDescripcion().compareTo(p2.verDescripcion());
        Collections.sort(categoriaBuscada,descComp);
        return categoriaBuscada;
    }
  
    @Override
    public Producto obtenerProducto(Integer codigo){
        
        for(Producto p: productos){
            if(p.verCodigo() == codigo){
                return p;
            }
        }
        return null;
    }
    
    @Override
    public String borrarProducto(Producto producto) {
        GestorProductos gp = GestorProductos.instanciar();
        if (gp.menu().isEmpty()) {
            return ERROR_BORRADO;
        }
        GestorPedidos gped = GestorPedidos.instanciar();
        for (Pedido p : gped.verPedidos()) {
            for (ProductoDelPedido pdp : p.verPdp()) {
                if(producto.equals(pdp.verProducto())) {
                    return ERROR_BORRADO;
                }
            }
        }
        this.productos.remove(producto);
        return EXITO_BORRADO;
    }
    
    private void leerArchivo() {
        BufferedReader br = null;
        File file = new File("./Productos.txt");
        
        if (file.exists()) {
            try {
                FileReader fr = new FileReader(file);
                br = new BufferedReader(fr);
                while(br.readLine() != null) {
                    String[] vector = br.readLine().split(",");
                    int codigo = parseInt(vector[0]);
                    String descripcion = vector[1];
                    float precio = parseFloat(vector[2]);
                    Categoria categoria = Categoria.valueOf(vector[3]);
                    Estado estado = Estado.valueOf(vector[4]);                           
                    Producto p = new Producto(codigo,descripcion,categoria,estado,precio);
                    this.productos.add(p);
                }
            }
            catch (IOException ioe) {
                System.out.println("No se pudo leer el archivo.");
            }
            finally {
                if (br != null) {
                    try {
                        br.close();
                    }
                    catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }
        }
    }
    
}
