/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.controladores;
import java.util.ArrayList;
import productos.modelos.*;
import usuarios.modelos.*;


/**
 *
 * @author Mariana
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        /*
        Definir un ArrayList para cada una de las clases Cliente, 
        Empleado, Encargado y Producto  (realizar las importaciones correspondientes).*/
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        ArrayList<Encargado> listaEncargados = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        /*Instanciar 3 objetos de cada clase y guardarlos en su correspondiente ArrayList. */
        Empleado e1= new Empleado("clave1","Nombre1","Apellido1","empleado1@mail.com");
        Empleado e2= new Empleado("clave2","Nombre2","Apellido2","empleado2@mail.com");
        Empleado e3= new Empleado("clave3","Nombre3","Apellido3","empleado3@mail.com");
        
        //e1.apellido="Apellido1";
        //e1.nombre="Nombre1";
        //e1.correo="empleado1@mail.com";
        //e1.clave="clave1";
                     
        //e2.apellido="Apellido2";
        //e2.nombre="Nombre2";
        //e2.correo="empleado2@mail.com";
        //e2.clave="clave2";
        
        //e3.apellido="Apellido3";
        //e3.nombre="Nombre3";
        //e3.correo="empleado3@mail.com";
        //e3.clave="clave3";
        
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        
        System.out.println("#################### ");
        System.out.println("EMPLEADOS ");
        /*Recorrer cada ArrayList y mostrar su contenido por pantalla. */
        for (Empleado e: listaEmpleados)
            e.mostrar();
        
        /*Realizar algunas modificaciones a algunos de los objetos antes creados, */
        //e1.apellido="APELLIDOEmpleado1";
        e1.asignarApellido("APELLIDO CAMBIADO1");
        //listaEmpleados.get(1).nombre="NOMBRE";
        
        /*y volver a recorrer los ArrayLists verificando que se hicieron los cambios. */
         for (Empleado e: listaEmpleados)
            e.mostrar();
         
        System.out.println("#################### ");
        System.out.println("PRODUCTOS");
        Producto p1 = new Producto("..Milanesa con puré", 1, "Milanesa con puré", 1250.0f, Estado.DISPONIBLE, Categoria.PLATO_PRINCIPAL);
        Producto p2= new Producto("..Empanadas", 2, "Empanadas", 150.70f, Estado.DISPONIBLE, Categoria.PLATO_PRINCIPAL);
        Producto p3 = new Producto("..Flan con dulce", 3, "Flan con dulce", 850.0f, Estado.NO_DISPONIBLE, Categoria.POSTRE);
        
        /*p1.nombre = "..Milanesa con puré"
        p1.codigo=1;
        p1.descripcion="Milanesa con puré";
        p1.precio=1250.0f;
        p1.categoria="PLATO PRINCIPAL";
        p1.estado="DISPONIBLE";*/
        
        /*p2.codigo=2;
        p2.descripcion="Empanadas";
        p2.precio=150.70f;
        p2.categoria="PLATO PRINCIPAL";
        p2.estado="DISPONIBLE";*/
        
       /* p3.codigo=3;
        p3.descripcion="Flan con dulce";
        p3.precio=850.0f;
        p3.categoria="POSTRE";
        p3.estado="NO DISPONIBLE";*/
        
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        
        for (Producto p: listaProductos)
            p.mostrar();
         
        System.out.println("#################### ");
        System.out.println("ENCARGADOS");
        //implementar aqui
        
        Encargado en1 = new Encargado("Clave1","Nombre1","Apellido1","correo1@gmail.com");
        Encargado en2 = new Encargado("Clave2","Nombre2","Apellido2","correo2@gmail.com");
        Encargado en3 = new Encargado("Clave3","Nombre3","Apellido3","correo3@gmail.com");
        
        listaEncargados.add(en1);
        listaEncargados.add(en2);
        listaEncargados.add(en3);
        
        for(Encargado ee : listaEncargados){
            ee.mostrar();
        }
        
        
        System.out.println("#################### ");
        System.out.println("CLIENTES");
        //implementar aqui
        
        Cliente c1 = new Cliente("Clave1","Nombre1","Apellido1","Correo1@gmail");
        Cliente c2 = new Cliente("Clave2","Nombre2","Apellido2","Correo2@gmail");
        Cliente c3 = new Cliente("Clave3","Nombre3","Apellido3","Correo3@gmail");
        
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        
        for(Cliente c : listaClientes){
            c.mostrar();
        }
    }
}
