package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Colecciones {

    public static void main(String[] args) {
        /*//List unaLista = new ArrayList();
        List <Integer> unaLista = new ArrayList<Integer>();
        unaLista.add(1);
        //unaLista.add("hola");
        
        Set unSet = new HashSet();
        
        unSet.add(3);
        unSet.add(true);
        unSet.add(3);
        
        //
        
        unaLista.add(1);
        unaLista.add(2);
        unaLista.add(3);
        unaLista.add(4);
        unaLista.add(5);
        
        Integer suma = 0;
        for (int i = 0; i < unaLista.size(); i++) {
            suma+= unaLista.get(i);
        }
        System.out.println("La suma es "+suma);
        
        //
        suma = 0;
        for (Integer elElemento : unaLista) {
            suma+=elElemento;
        }
        
        List <unaClase> list = new ArrayList<unaClase>();
        
        unaClase clase1 = new unaClase("Hola", 25, true);
        unaClase clase2 = new unaClase();
        clase2.setUnAtributoBoolean(false);
        clase2.setUnAtributoEntero(33);
        clase2.setUnAtributoString("Chau");
        
        list.add(clase1);
        list.add(clase2);
        
        list.add(new unaClase("Directo",50,true));
        
        for (unaClase item : list) {
            if(item.getUnAtributoBoolean()){
                System.out.println("TRUE");
                System.out.println(item.getUnAtributoString()+" - "+item.getUnAtributoEntero());
        }else{
                System.out.println("FALSE");
                System.out.println(item.getUnAtributoString()+" - "+item.getUnAtributoEntero());
            }
     }*/
        
        Set <Jugadores> equipo = new HashSet<Jugadores>();
        equipo.add(new Jugadores("Abdon", "Arquero"));
        equipo.add(new Jugadores("Agustin", "Delantero"));
        equipo.add(new Jugadores("Hugo", "Volante"));
        equipo.add(new Jugadores("Hector", "Defensor"));
        equipo.add(new Jugadores("Matías", "Volante"));
        
        for (Jugadores alineacion : equipo) {
            System.out.println(alineacion.getNombre()+" juega de "+alineacion.getPosicion());
        }
        System.out.println(" ");
        List <Jugadores> equipoLista = new ArrayList<Jugadores>();
        equipoLista.add(new Jugadores("Abdon", "Arquero"));
        equipoLista.add(new Jugadores("Agustin", "Delantero"));
        equipoLista.add(new Jugadores("Hugo", "Volante"));
        equipoLista.add(new Jugadores("Hector", "Defensor"));
        equipoLista.add(new Jugadores("Matías", "Volante"));
        
        for (Jugadores alineacion : equipoLista) {
            System.out.println(alineacion.getNombre()+" juega de "+alineacion.getPosicion());
        }
        
    }
}
