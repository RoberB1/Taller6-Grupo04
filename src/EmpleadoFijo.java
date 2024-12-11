public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }


    // Se modifico por la refactorizacion de pull up method
    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
