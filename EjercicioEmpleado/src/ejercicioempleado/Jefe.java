package ejercicioempleado;

import java.util.Date;

public class Jefe extends Empleado{

    public Jefe(String nombre, String apellido, Date fechaNac, Date fechaIngreso, Long dni, String categoria) {
        super(nombre, apellido, fechaNac, fechaIngreso, dni, categoria);
    }

    public Jefe() {
    }

    @Override
    public Double calcularSalario() {
        return (super.getHsTrabajadas()*super.getValorHora())*1.15;
    }
    
    
}
