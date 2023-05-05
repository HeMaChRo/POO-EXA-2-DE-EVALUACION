
package gestionempresarial;


public class EmpleadoTiempoCompleto extends Empleados{

    public EmpleadoTiempoCompleto() {
        super();
    }

    public EmpleadoTiempoCompleto(String Id, String Nombre, double Salario) {
        super(Id, Nombre, Salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }
    
    
    
    
}
