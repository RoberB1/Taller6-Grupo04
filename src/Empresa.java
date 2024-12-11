import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void despedirEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    //Extract Method : Simplifica el codigo demas
    public List<Empleado> obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas) {
        List<Empleado> empleadosPorTipo = new ArrayList<>();
//        for (Empleado empleado : empleados) {
//            if (empleado.getHorasTrabajadas()>horas) {
//                empleadosPorTipo.add(empleado);
//            }
//        }
        return Empleado.stream().filter(e -> e.getHorasTrabajadas() > horas).collect(Collectors.ToList());
    }

    // Más metodos
}

