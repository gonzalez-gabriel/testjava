/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package productos.modelos;

/**
 *
 * @author gabri
 */
public enum Categoria {
    ENTRADA("ENTRADA"), PLATO_PRINCIPAL("PLATO PRINCIPAL"), POSTRE("POSTRE");

  private String unaCadena;

    private Categoria(String unaCadena) {
        this.unaCadena = unaCadena;
    }

    @Override
    public String toString() {
        return  unaCadena ;
    }

    
  
  
}

