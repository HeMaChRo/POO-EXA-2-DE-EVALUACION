
package gestionempresarial;


public class GestionEmpresarial {

    
    public static void main(String[] args) {
        
        System.out.println("Gestion empresarial: ");
        
        System.out.println("\nEmpleado a tiempo completo: ");
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("2235462", "Juan", 3500);
        System.out.println("Salario: "+empleado1.calcularSalario());
        
        System.out.println("\nEmpleado a tiempo parcial: ");
        EmpleadoTiempoParcial empleado2 = new EmpleadoTiempoParcial(300, 8, "52100", "Roberto Masias", 0);
        System.out.println("Salario: "+empleado2.calcularSalario());
        
        System.out.println("\nAdministrador: ");
        Administrador admin1 = new Administrador(0.30, "2235467845", "Gabriel", 4000);
        System.out.println("Bono: "+admin1.calcularBono());
        System.out.println("Salario: "+admin1.calcularSalario());
        
    }
    
}
