package ejerciciofactura;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class EjercicioFactura {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de factura a emitir ('A' si es con IVA u 'B' si es Consumidor Final):");
        String tipoFactura = sc.nextLine();
        if (tipoFactura.equalsIgnoreCase("A")) {
            emitirFacturaA(sc);
        }else if(tipoFactura.equalsIgnoreCase("B")){
            emitirFacturaB(sc);
        }
        
    }
    public static void emitirFacturaA (Scanner sc){
        FacturaA fa = new FacturaA();
            System.out.println("Ingrese el numero de factura");
            fa.setNroFactura(sc.nextInt());
            System.out.println("Ingrese el cliente:");
            fa.setCliente(sc.next());
            System.out.println("Ingrese la cantidad:");
            fa.setCantProducto(sc.nextInt());
            System.out.println("Ingrese la descripción del producto:");
            fa.setDescProducto(sc.next());
            System.out.println("Ingrese el precio:");
            fa.setPrecioProducto(sc.nextDouble());
            
            System.out.println("La factura Nº"+fa.getNroFactura()+" del cliente "+fa.getCliente()+" por "+fa.getCantProducto()+" "+fa.getDescProducto()+" tiene un monto total de "+fa.calcularMonto());
    }
    
    public static void emitirFacturaB (Scanner sc){
        FacturaB fb = new FacturaB();
            System.out.println("Ingrese el numero de factura");
            fb.setNroFactura(sc.nextInt());
            System.out.println("Ingrese el cliente:");
            fb.setCliente(sc.next());
            System.out.println("Ingrese la cantidad:");
            fb.setCantProducto(sc.nextInt());
            System.out.println("Ingrese la descripción del producto:");
            fb.setDescProducto(sc.next());
            System.out.println("Ingrese el precio:");
            fb.setPrecioProducto(sc.nextDouble());
            
            System.out.println("La factura Nº"+fb.getNroFactura()+" del cliente "+fb.getCliente()+" por "+fb.getCantProducto()+" "+fb.getDescProducto()+" tiene un monto total de "+fb.calcularMonto());
            } 
    }
