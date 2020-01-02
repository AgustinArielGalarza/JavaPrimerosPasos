package integrador2;

import java.util.Scanner;
public class Integrador2 {

    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
    
    Empleado4 emp1 = new Empleado4 ("Soledad","Alvares",39666676,"Ituzaingo",34,45578377,20000.0);
        System.out.println("Nombre:"+emp1.getNombre()+
                "\nApellido:"+emp1.getApellido()+
                "\nDni:"+emp1.getDNI()+
                "\nLocalidad:"+emp1.getLocalidad()+
                "\nAños de antiguedad:"+emp1.getAñosAntigüedad()+
                "\nTelefono:"+emp1.getTelefono()+
                "\nSalario:"+emp1.getSalario());
    System.out.println("Marque E. para ver supervisor por defecto, o S. para cambiarlo");
    String Letra = sc.nextLine();
    if(Letra.equalsIgnoreCase("E")){
        Empleado4 suprv1 = new Supervisor("Ana","Martinez",37987902,"Moron",30,44567865,20000.0);
        System.out.println("Datos del Supervisor:\n------\n"
                + "Nombre:"+suprv1.getNombre()+"\nApellido:"+suprv1.getApellido()+"\nDni:"+suprv1.getDNI()+"\nLocalidad:"+suprv1.getLocalidad()+"\nAños de antigüedad:"+suprv1.getAñosAntigüedad()+"\nTelefono:"+suprv1.getTelefono()+"\nSalario:"+suprv1.getSalario());
    }else if(Letra.equalsIgnoreCase("S")){
        System.out.println("...");
        
    }
    
   
    
        System.out.println("Indique que tipo de empleado es:\n----------\n"
                + "\\tMarque S si usted es Secretario\n"
                + "\\tMarque V si usted es vendedor\n"
                + "\\tMarque J si usted es Jefe de zona\n---------\n");
       String Opcion = sc.nextLine();
        switch (Opcion){
            case "S":
                MetodoSecretaria(emp1,sc);break;
            case"V":
                MetodoVendedor(sc);break;
            case"J":
                MetodoJefeDeZona(sc);break;
            default:
                System.out.println("intentelo de nuevo");break;
        }
    }
   
    private static void MetodoSecretaria(Empleado4 emp1, Scanner sc) {
        
    }

    private static void MetodoVendedor(Scanner sc) {
    }

    private static void MetodoJefeDeZona(Scanner sc) {
    }
}