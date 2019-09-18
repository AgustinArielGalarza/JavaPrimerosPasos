package poofigura;

import java.util.Scanner;

public class PooFigura {

    
    public static void main(String[] args) { 
      /*
      Double base = 10D;
      Double altura = new Double (5); */
      
      Scanner sc = new Scanner (System.in);
      System.out.println("ingrese la base de la figura: ");
      Double base = sc.nextDouble();
      
      System.out.println("ingresar altura de una figuta: ");
      Double altura = sc.nextDouble();
      
      
      figura f = new figura (base,altura);
      
      System.out.println("la base es : "+f.getBase());
      System.out.println("la altura es : "+f.getAltura());
      
      System.out.println("El area es : "+f.CalcularArea());
      
      cuadrado c = new cuadrado ();
     c.setAltura(altura);
     c.setBase(base);
      System.out.println("el area del cuadrado es "+c.CalcularArea());
      
      triangulo t = new triangulo ();
      System.out.println("el area de un triangulo "+t.CalcularArea());
      
      
       
    }
    
}
