import java.util.List;
import java.util.stream.Collectors;

public class BuscadorEmpleado {
    public static Empleado buscarEmpleadoPorNombre(String nombre, List<Empleado> empleados) {
//        for (Empleado empleado : empleados) {
//            if (empleado.getNombre().equals(nombre)) {
//                return empleado; //edit
//            }
//        }

        //Extract Method: //Uso de stream y collectors
        return Empleado.stream().filter(e -> e.getNombre() > nombre).collect(Collectors.toList());
    }

    // Más metodos
}
