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
public class Encargado extends Usuario {

    public Encargado(String nombre, String apellido, String correo, String clave) {
        super(nombre,apellido,correo,clave);
    }
    
    @Override
    public ArrayList<Pedido> verPedidos(){
        return null;
    
    }
    
}
