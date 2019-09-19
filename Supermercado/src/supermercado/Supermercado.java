package supermercado;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Supermercado {

    public static void main(String[] args) {
        List<Producto> listaprod = new LinkedList <Producto>();
        //Producto [] listaprod = new Producto[4];
        
        listaprod.add(0, new Producto("Coca-Cola Zero",1.5, 20));
        listaprod.add(1, new Producto("Coca-Cola", 1.5, 18));
        listaprod.add(2, new Producto("Shapoo Sedal", 500, 19));
        listaprod.add(3, new Producto("Frutilla", 1, 64));
        
        
        for (Object prod : listaprod) {
            System.out.println(prod);
            
            }
        System.out.println("===================");
        
        System.out.println("el mayor es: "+Collections.max(listaprod, Collections.reverseOrder()));
        System.out.println("el menor es: "+Collections.min(listaprod));
    }  
    
      

    }
    
    class Producto implements Comparable <Producto>{
        
        private String nombre;
        private double cantidad;
        private int precio;

        public Producto(String nombre, double cantidad, int precio) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;
        }
        
        

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getCantidad() {
            return cantidad;
        }

        public void setCantidad(double camtidad) {
            this.cantidad = camtidad;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            this.precio = precio;
        }

       
        @Override
        public int compareTo(Producto p) {
            int mayor = 0 ;
            int menor = 0;
           while(getPrecio() > p.getPrecio()){
               mayor = getPrecio();
           }
           while (this.precio < p.getPrecio()){
               menor = getPrecio();
           }
            if ( getPrecio()==p.getPrecio()){
                System.out.println("son iguales estos productos");
            }
            System.out.println("el mayor es: "+mayor);
            System.out.println("el menor es: "+menor);
            return 0;
        }
        
        
        @Override
        public String toString (){
            return  "Nombre: "+nombre +" // "+ "Contenido :"+ cantidad +" // "+ "Precio: "+ precio ;
            
        }
        
        
    }

    
    

