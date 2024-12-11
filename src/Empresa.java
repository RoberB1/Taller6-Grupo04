import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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

    //Extract Method
    public List<Empleado> obtenerEmpleadosPorHorasTrabajadasaPartirDe(int horas) {
        List<Empleado> empleadosPorTipo = new ArrayList<>();
//        for (Empleado empleado : empleados) {
//            if (empleado.getHorasTrabajadas()>horas) {
//                empleadosPorTipo.add(empleado);
//            }
//        }
        //Uso de stream y collectors
        return Empleado.stream().filter(e -> e.getHorasTrabajadas() > horas).collect(Collectors.toList());
    }

    // Más metodos
}

