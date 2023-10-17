/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pedidos.modelos;

/**
 *
 * @author USUARIO
 */
public enum Estado {
    
    CREANDO("CREANDO"),SOLICITADO ("SOLICITADO"),PROCESANDO("PROCESANDO"),ENTREGADO("ENTREGADO");
    
    private String cadenaEstadoPedido;
    
    private Estado(String cadenaEstadoPedido) {
        this.cadenaEstadoPedido = cadenaEstadoPedido;
    }

    @Override
    public String toString() {
        return cadenaEstadoPedido ;
    }
    
    
}
