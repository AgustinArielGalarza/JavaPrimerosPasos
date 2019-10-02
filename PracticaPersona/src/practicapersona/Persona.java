package practicapersona;

public class Persona {
private final static char SEXO_DEF = 'H';
public final static int INFRAPESO = -1;
public final static int PESOIDEAL = 0;
public final static int SOBREPESO = 1;
private String nombre;
private int edad;
private String dni;
private char sexo;
private Double altura;
private Double peso;

public Persona (){
}

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String dni, char sexo, Double altura, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

  
private void compareSEXO (){
    if (sexo != 'H' && sexo != 'M'){
        this.sexo = SEXO_DEF;
    }
}
private void generarDni(){
    int Divisor =23;
    int numDni= ((int)Math.floor(Math.random()*(100000000-100000000)+100000000));
    int res = numDni -(numDni / Divisor * Divisor);
    
    char letraDni = generarLetraDni (res);
    dni = Integer.toString(numDni)+letraDni;
}

    private char generarLetraDni(int res) {
char Letra [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

return Letra [res];
    }
}
