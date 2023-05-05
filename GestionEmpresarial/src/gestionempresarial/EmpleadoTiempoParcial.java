/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionempresarial;

/**
 *
 * @author Hector Chavira
 */
public class EmpleadoTiempoParcial extends Empleados {
    private double pagoPorHora;
    private int horasTrabajadas;

    public EmpleadoTiempoParcial() {
        super();
        this.pagoPorHora = 0;
        this.horasTrabajadas = 0;
    }
    
    public EmpleadoTiempoParcial(double pagoPorHora, int horasTrabajadas, String Id, String Nombre, double Salario) {
        super(Id, Nombre, Salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
    @Override
    public double calcularSalario() {
        double resu;
        resu = horasTrabajadas * pagoPorHora;
        return resu;
    }
    
}
