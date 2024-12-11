public class EmpleadoPorHoras extends Empleado {
    private String genero;
    private double tarifaHora; //PushDownFieldEmpl

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
    }

    // Se modifico por la refactorizacion de pull up method eliminando el metodo porque hace lo mismo que en la clase padre

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * super.getTarifaHora();
        return salario;
    }

    // Más metodos
}