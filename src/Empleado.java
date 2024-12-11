public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    //private double tarifaHora; variable no aplica a todos las subclases

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
//        this.tarifaHora = tarifaHora;
        this.departamento = departamento;
    }


    // para calcularSalario se puede aplicar extract method , replace Conditional with Polymorphism y Replace Nested conditional with guard clauses


    //Extract Method refactoring porque posee mas de 10 lineas de codigo lo que lo convierte en un codigo mas dificil de leer

    public double calcularSalario() {
        double salarioTotal = salarioBase;
        if(aplicaSalario()){
            salarioTotal = salarioTotal + calcularSalarioHorasExtra(50);
        }

    }

    private double calcularSalarioHorasExtra(double extra){
        if(horasTrabajadas > 40 ) return (horasTrabajadas - 40) * extra;
        return 0;
    }

    private boolean aplicaSalario(){
        if (salariobase <= 0) throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        if (horasTrabajadas < 0) throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        return true;
    }

  /*  public double calcularSalario() {
        double salarioTotal = salarioBase;
        if (salarioBase>0) {
            if (horasTrabajadas >= 0) {
                // Horas trabajadas normales = 40;
                if (horasTrabajadas > 40) {
                    salarioTotal += (horasTrabajadas - 40) * 50; // Pago de horas extra
                }
            }else {
                throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
            }
        } else {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        switch (departamento) {
            case "Sistemas":
                salarioTotal += 20;
                break;
            case "Contabilidad":
                salarioTotal += 10;
                break;
            default:
                break;
        }
        return salarioTotal;
    }*/


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

//    public double getTarifaHora() {
//        return tarifaHora;
//    }
//
//    public void setTarifaHora(double tarifaHora) {
//        this.tarifaHora = tarifaHora;
//    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Más metodos

    //Pull up method refactoring tech porque habia codigo duplicado en las clases hijas con este metodo

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getNombre());
        System.out.println("Salario: " + super.getSalarioBase());
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
    }
    
}
