public class Contabilidad extends Empleado {    
    private double salarioBase;
    double getDepartamentoSalario(){
        
        return salarioBase+=super.calcularSalario();
    }
}
