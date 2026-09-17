/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;


public class Empleado {
    private String nombre;
    private String cargo;
    private double salarioBase;
    private int anosExperiencia;

    public Empleado() {
    }

    public Empleado(String nombre, String cargo, double salarioBase, int anosExperiencia) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public String verDetalle(){
        return "Nombre del empleado: " + nombre + "\nEl cargo del empleado es: " + cargo + "\nEl salario base del empleado es: " + salarioBase + "\nLos años de experiencia son: " + anosExperiencia;    
    }
    
    public String trabajar(int horas){
        return "El trabajador: " + nombre + "trabajo durante: " + horas;
    }
    
    public String tomarDescanso(){
        return "El trabajador: " + nombre + "tomó un descanso.";
    }
    
    public String trabajarYDescansar(int horas){
        return "El trabajador: " + nombre + "trabajo durante : " + horas + "luego tomo un descanso."; 
    }
    
    public double calcularBono(float porcentaje){
        return salarioBase * porcentaje / 100;
    }
    
    public double calcularBono(int porcentaje){
        return salarioBase * porcentaje / 100;
    }
    
    public double calcularSalarioTotal(double bono, int diasTrabajados){
        double salarioPorDia;
        double salarioTrabajado;
        double salarioTotal;
        
        salarioPorDia = salarioBase / 30;
        salarioTrabajado = salarioPorDia * diasTrabajados;
        salarioTotal = salarioTrabajado + bono;
        
        return salarioTotal;
    }
}
