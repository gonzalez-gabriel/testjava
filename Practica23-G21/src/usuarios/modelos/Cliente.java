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
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre, String apellido, String correo, String clave) {
        super(nombre,apellido,correo,clave);
    } 
    
    public void agregarPedido(Pedido p) {
        pedidos.add(p);
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        if (!(pedidos == null || pedidos.isEmpty())) {
            for (Pedido p: pedidos) {
                p.mostrarPedido();
            
                }
            }
        }
}
    
