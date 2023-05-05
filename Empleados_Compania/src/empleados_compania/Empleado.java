
package empleados_compania;


public abstract class Empleado implements Capturando {

    private String Nombre;
    private String Apellido;
    private double Edad;
    double Salario;

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getApellido() {
        return Apellido;
    }

    @Override
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public double getEdad() {
        return Edad;
    }

    @Override
    public void setEdad(double Edad) {
        this.Edad = Edad;
    }

    @Override
    public double getSalario() {
        return Salario;
    }

    @Override
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public abstract double CalcularSalario();
   
}
