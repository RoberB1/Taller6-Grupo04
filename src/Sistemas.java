public class Sistemas extends Empleado {
    private double salarioBase;
    double getDepartamentoSalario(){
        return salarioBase+=super.calcularSalario();
    }
    
    
}
