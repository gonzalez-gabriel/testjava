/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author gabri
 */
public enum Estado {
    DISPONIBLE("DISPONIBLE"), NO_DISPONIBLE("NO DISPONIBLE");

    private String otraCadena;

    private Estado(String otraCadena) {
        this.otraCadena = otraCadena;
    }

    @Override
    public String toString() {
        return otraCadena;
    }
    
    
    
    
    
}
