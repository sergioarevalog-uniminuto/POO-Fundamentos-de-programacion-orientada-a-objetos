/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nivelacion;

/**
 *
 * @author sergi
 */

public class Libro {

    // Atributos privados
    private String titulo;
    private String autor;
    private double precio;
    private int ejemplares;

    public Libro() {
    }

    public Libro(String titulo, String autor, double precio, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.ejemplares = ejemplares;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter y Setter del precio
    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public String verDetalle() {
        return "Titulo: " + this.titulo
                + "\nAutor: " + this.autor
                + "\nPrecio: " + this.precio
                + "\nEjemplares: " + this.ejemplares;
    }

    public double calcularDescuento(int porcentaje) {
        return this.precio * porcentaje / 100.0;
    }

    public double calcularDescuento(double porcentaje) {
        return this.precio * porcentaje / 100.0;
    }

    public double calcularPrecioFinal(double porcentaje) {
        return this.precio - this.calcularDescuento(porcentaje);
    }

    public String venderEjemplares(int cantidad) {
        if (cantidad >= 0 && cantidad <= this.ejemplares) {
            this.ejemplares = this.ejemplares - cantidad;
            return "Operacion realizada. Quedan " + this.ejemplares;
        } else {
            return "No hay suficientes ejemplares";
        }
    }
}
