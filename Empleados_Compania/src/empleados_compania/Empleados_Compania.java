
package empleados_compania;


public class Empleados_Compania {

    
    public static void main(String[] args) {
        
        Manufactura obj1 = new Manufactura(14, "Mario", "Alberto", 41, 40);
        System.out.println(obj1.CalcularSalario());
    }

}



class Manufactura extends Empleado {

    private double Horasdelasemana;

    public Manufactura(double Horasdelasemana, String Nombre, String Apellido, double Edad, double Salario) {
        Nombre = "";
        Apellido = "";
        Edad = 0;
        Salario = 0;
        this.Horasdelasemana = 0;
    }

    public Manufactura() {
        super();       
    }

    public double getHorasdelasemana() {
        return Horasdelasemana;
    }

    public void setHorasdelasemana(double Horasdelasemana) {
        this.Horasdelasemana = Horasdelasemana;
    }

    @Override
    public double CalcularSalario() {
        return getSalario() * Horasdelasemana;

    }
}

class Apoyo extends Empleado {

    private double Horasdelasemana;

    public Apoyo(double Horasdelasemana, String Nombre, String Apellido, double Edad, double Salario) {
        Nombre = "";
        Apellido = "";
        Edad = 0;
        Salario = 40;
        this.Horasdelasemana = 0;
    }

    public Apoyo() {
        super();
    }

    public double getHorasdelasemana() {
        return Horasdelasemana;
    }

    public void setHorasdelasemana(double Horasdelasemana) {
        this.Horasdelasemana = Horasdelasemana;
    }

    @Override
    public double CalcularSalario() {
        double SalarioSemanal = getSalario() * Horasdelasemana;
        double Compensacion = SalarioSemanal * 0.5;
        return getSalario();

    }
}

class Jefe extends Empleado {

    private double Horasdelasemana;

    public Jefe(double Horasdelasemana, String Nombre, String Apellido, double Edad, double Salario) {
        Nombre = "";
        Apellido = "";
        Edad = 0;
        Salario = 0;
        this.Horasdelasemana = 0;
    }

    public Jefe() {
        super();
    }

    public double getHorasdelasemana() {
        return Horasdelasemana;
    }

    public void setHorasdelasemana(double Horasdelasemana) {
        this.Horasdelasemana = Horasdelasemana;
    }

    @Override
    public double CalcularSalario() {
        return getSalario();

    }

}

