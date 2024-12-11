public class EmpleadoTemporario extends Empleado {
    private String nombre;
    private String genero;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }


    // por el pull up method se modifico este codigo para que el codigo sea mas sencillo
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
