
package gestionempresarial;


public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono{
    private double porcentajeDelBono;

    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }

    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
    }

    public Administrador() {
        super();
        this.porcentajeDelBono = 0;
    }

    public Administrador(double porcentajeDelBono, String Id, String Nombre, double Salario) {
        super(Id, Nombre, Salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }
    
    

    @Override
    public double calcularBono() {
        double bono;
        bono = porcentajeDelBono * getSalario();
        return bono;
    }

    @Override
    public double calcularSalario() {
        double sal;
        sal = calcularBono() + getSalario();
        return sal;
    }
    
    
    
}
