package ejercicioempleado;

import java.util.Date;

public class Operario extends Empleado{

    public Operario() {
    }

    public Operario(String nombre, String apellido, Date fechaNac, Date fechaIngreso, Long dni, String categoria) {
        super(nombre, apellido, fechaNac, fechaIngreso, dni, categoria);
    }
    
}
