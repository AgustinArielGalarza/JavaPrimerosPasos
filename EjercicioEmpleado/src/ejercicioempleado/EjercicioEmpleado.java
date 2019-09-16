package ejercicioempleado;

import java.util.Scanner;

public class EjercicioEmpleado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de empleado que ingresará ('J' si es jefe u 'O' si es empleado):");
        String tipoEmpleado = sc.nextLine();
        if (tipoEmpleado.equalsIgnoreCase("J")) {
            mostrarJefe(sc);
        }else if(tipoEmpleado.equalsIgnoreCase("O")){
            mostrarOperario(sc);
        }
        
    }
    public static void mostrarJefe (Scanner sc){
        Jefe j = new Jefe();
            System.out.println("Ingrese el legajo del nuevo empleado");
            j.setLegajo(sc.nextInt());
            System.out.println("Ingrese el nombre:");
            j.setNombre(sc.next());
            System.out.println("Ingrese el apellido:");
            j.setApellido(sc.next());
            System.out.println("Ingrese el valor de la hora:");
            j.setValorHora(sc.nextDouble());
            System.out.println("Ingrese las horas trabajadas:");
            j.setHsTrabajadas(sc.nextInt());
            
            System.out.println("El salario de "+j.getApellido()+", "+j.getNombre()+" es "+j.calcularSalario());
    }
    
    public static void mostrarOperario (Scanner sc){
        Operario o = new Operario();
            System.out.println("Ingrese el legajo del nuevo empleado");
            o.setLegajo(sc.nextInt());
            System.out.println("Ingrese el nombre:");
            o.setNombre(sc.next());
            System.out.println("Ingrese el apellido:");
            o.setApellido(sc.next());
            System.out.println("Ingrese el valor de la hora:");
            o.setValorHora(sc.nextDouble());
            System.out.println("Ingrese las horas trabajadas:");
            o.setHsTrabajadas(sc.nextInt());
            
            System.out.println("El salario de "+o.getApellido()+", "+o.getNombre()+" es "+o.calcularSalario());
    }
}
