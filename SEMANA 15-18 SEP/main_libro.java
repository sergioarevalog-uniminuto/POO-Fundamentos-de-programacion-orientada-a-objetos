
package sesion1.encapsulamiento;


public class Sesion1Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro ();
        libro1.setTitulo("El Quijote de la Mancha");
        libro1.setAutor("Miguel De Servantes Saavedra");
        libro1.setGenero("Novela");
        libro1.setNumPaginas(600);
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getGenero()); 
        System.out.println(libro1.getNumPaginas());
        
        System.out.println("\nDETALLE DEL LIBRO");
        System.out.println(libro1.verDetalle());
        
        System.out.println("\nLibro prestado a: ");
        System.out.println(libro1.prestar("Sergio"));
        
        System.out.println("\nLibro Prestado y Devuelto");
        System.out.println(libro1.prestarYDevolver("Sergio"));
    }
    
}
