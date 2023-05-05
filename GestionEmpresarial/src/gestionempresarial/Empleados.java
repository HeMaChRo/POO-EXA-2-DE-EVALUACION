/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionempresarial;


public abstract class Empleados {
    private String Id;
    private String Nombre;
    private double Salario;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public Empleados() {
        this.Id = "______";
        this.Nombre = "______";
        this.Salario = 0;
    }

    public Empleados(String Id, String Nombre, double Salario) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Salario = Salario;
    }
    
    
    public abstract double calcularSalario();
    
}
