/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nivelacion;

/**
 *
 * @author sergi
 */

public class MainLibro {

    public static void main(String[] args) {

        Libro obj1 = new Libro();

        obj1.setTitulo("El Principito");
        obj1.setAutor("Antoine de Saint-Exupery");
        obj1.setPrecio(50000);
        obj1.setEjemplares(10);

        Libro obj2 = new Libro("Cien años de soledad",
                "Gabriel Garcia Marquez", 80000, 5);
        
        System.out.println("Titulo: " + obj1.getTitulo());
        System.out.println("Autor: " + obj1.getAutor());
        System.out.println("Precio: " + obj1.getPrecio());
        System.out.println("Ejemplares: " + obj1.getEjemplares());

        // Mostrar detalles del primer libro
        System.out.println("\n===== DETALLE LIBRO 1 =====");
        System.out.println(obj1.verDetalle());

        // Mostrar detalles del segundo libro
        System.out.println("\n===== DETALLE LIBRO 2 =====");
        System.out.println(obj2.verDetalle());

        // Probar sobrecarga de metodos
        System.out.println("\n===== DESCUENTOS =====");

        // Descuento con entero
        System.out.println("Descuento 10%: "
                + obj1.calcularDescuento(10));

        // Descuento con decimal
        System.out.println("Descuento 12.5%: "
                + obj1.calcularDescuento(12.5));

        // Calcular precio final
        System.out.println("\n===== PRECIO FINAL =====");
        System.out.println("Precio final con 10%: "
                + obj1.calcularPrecioFinal(10));

        // Vender ejemplares
        System.out.println("\n===== VENTA DE EJEMPLARES =====");

        // Primera venta: hay suficientes
        System.out.println(obj1.venderEjemplares(3));

        // Segunda venta: no hay suficientes
        System.out.println(obj1.venderEjemplares(50));

        // Mostrar ejemplares restantes
        System.out.println("\nEjemplares restantes: "
                + obj1.getEjemplares());
    }
}
