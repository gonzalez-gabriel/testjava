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
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo,clave,apellido,nombre);
    } 
    
    public void agregarPedido(Pedido p) {
        if (pedidos.isEmpty() || !pedidos.contains(p)) {
        pedidos.add(p);
        }
        else {
            for(Pedido aux : pedidos) {
                if (aux.equals(p)) {
                    pedidos.remove(aux);
                    pedidos.add(p);
                }
            }
        }
    }

    public void cancelarPedido(Pedido p) {
        for(Pedido aux : pedidos) {
                if (aux.equals(p)) {
                    pedidos.remove(aux);
                }
        }
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        if (!(pedidos == null || pedidos.isEmpty())) {
            for (Pedido p: pedidos) {
                p.mostrar();
            
                }
            }
        }
    
   
    
    @Override
    public ArrayList<Pedido> verPedidos() {
        return pedidos;
    }
}
    
