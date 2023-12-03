/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;
import java.util.ArrayList;
import productos.modelos.*;

/**
 *
 * @author USUARIO
 */
public interface IGestorProductos { 
    public static final String EXITO_CREADO = "Producto creado/modificado exitosamente";
    public static final String EXITO_MODIFICADO = "Producto modificado exitosamente";
    public static final String ERROR_CODIGO = "El codigo del producto es incorrecto";
    public static final String ERROR_DESCRIPCION = "La descripcion del producto es incorrecta";
    public static final String ERROR_PRECIO = "El precio del producto es incorrecto";
    public static final String ERROR_CATEGORIA = "La categoria del producto es incorrecta";
    public static final String ERROR_ESTADO = "El estado es incorrecto";
    public static final String PRODUCTOS_DUPLICADOS = "Ya existe un producto con ese codigo";
    public static final String VALIDACION_EXITO = "Los datos del producto son correctos";
    public static final String PRODUCTO_INEXISTENTE = "No existe el producto especificado";
    public static final String ERROR_BORRADO = "Este producto no puede borrarse porque no existe o esta en un pedido";
    public static final String EXITO_BORRADO = "Producto borrado exitosamente";
    
    public String crearProducto(int codigo, String descripcion, float precio, Categoria categoria, Estado estado);
    public String modificarProducto(Producto productoAModificar, int codigo, String descripcion, float precio, Categoria categoria, Estado estado);   
    public ArrayList<Producto> menu();
    public ArrayList<Producto> buscarProductos(String descripcion);
    public String borrarProducto(Producto producto);
    public boolean existeEsteProducto(Producto producto);
    public ArrayList<Producto> verProductosPorCategoria(Categoria categoria);
    public Producto obtenerProducto(Integer codigo);
    public String validarDatos (int codigo, String descripcion, float precio, Categoria categoria, Estado estado);
}
