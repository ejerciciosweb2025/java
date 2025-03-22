import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AprenderJava {
    public static void main ( String [] args ){
        //Tipos básico números
        byte numeroMaspequeno   = 1; //-128 a 127
        short numeroPequeno     = 2; // -32768 a 32767
        int   numero            = 4; // aprox 2 millones
        long numeroGrande       = 8; // -9xe16 a 9xe16

        float numeroReal        = 2.5f;
        double numberoDoble     = 3.6;


        boolean valorLogicoVerdadero     = true;
        boolean valorLogicoFalso         = false;

        //cadena

        char caracter='a';
        String palabra = "palabra";
        int longitud   = palabra.length();
        String palabra2 = new String("Mi palabra");

        System.out.println("Mostrar números sin decimales");
        System.out.println("Número byte "+numeroMaspequeno);
        System.out.println("Número short "+numeroPequeno);
        System.out.println("Número int "+numero);
        System.out.println("Número long "+numeroGrande);

        System.out.println("Número numero Real "+numeroReal);
        System.out.println("Número numero Doble "+numberoDoble);

        System.out.println("Valor lógico "+valorLogicoVerdadero);
        System.out.println("Valor lógico "+valorLogicoFalso);

        System.out.println("Letra: " +caracter);
        System.out.println("Cadena 1: "+ palabra);
        System.out.println("Cadena 2: "+ palabra2);

        System.out.println("Texto \ncomo\t estás , \\Pepe \'?");

        System.out.println("Cadenas-------------");
        System.out.println("Longitud: "+ longitud);

        String palabraReemplazada = palabra.replace("palabra","palabraReemplazada");
        System.out.println("PalabraReemplazada"+ palabraReemplazada);

        System.out.println(palabraReemplazada.endsWith("da"));
        System.out.println(palabraReemplazada.startsWith("pa"));
        System.out.println(palabraReemplazada.contains("palabra"));
        System.out.println(palabraReemplazada.indexOf("da"));
        System.out.println(palabraReemplazada.toLowerCase());
        System.out.println(palabraReemplazada.toUpperCase());


        String palabraconEspaciosRaros = "                  mi palabra                   ";
        System.out.println(palabraconEspaciosRaros.trim());

        int []  numeros = new int[5];


        numeros[0] = 5;
        System.out.println(numeros.length);

        System.out.println("Valor array"+numeros[0]);

        /* numeros[6] = 7;
        System.out.println("Valor array"+numeros[6]);
        */

        char [] cadena5 = palabra.toCharArray();
        String cadena6 = palabra.toString();

        String [] separaCadena = cadena6.split(" ");

        System.out.println(cadena5);
        System.out.println(cadena5);
        System.out.println(separaCadena);


        int [][] numeritos = {{0,1},{2,3}};

        System.out.println(Arrays.deepToString(numeritos));



        int operadores = 2 + 3 + 5  * 6 + 4;

       //paréntesis
        //potencia
        //multiplicacion
        //division
        //suma
        // resta

        double valorAleatorio = Math.random();
        String valor= "5" ;
        //System.out.println(Math.ceil( valor) );

        System.out.println(Byte.parseByte(valor));
        System.out.println(Integer.parseInt(valor));
        System.out.println(Long.parseLong(valor));
        System.out.println(Float.parseFloat(valor));
        System.out.println(Double.parseDouble(valor));

        int numero78 = 5;
        System.out.println(String.valueOf(numero78));

        //Como leer en Java
        //Scanner scanner = new Scanner(System.in);
        // String leerFrase = scanner.nextLine();
        //operadores comparación y lógicos

        int a =17;
        int b =12;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a<b);

        boolean x = true;
        boolean y = false;

        boolean resultado = x && y;
        System.out.println("El resultado de la operación es: "+resultado);
        resultado= x || y;
        System.out.println("El resultado de la operación es: "+resultado);
        resultado = !x;
        System.out.println("El resultado de la operación es: "+resultado);
        resultado = !y;
        System.out.println("El resultado de la operación es: "+resultado);


        //condicionales

        int edad = 18;
        if( edad >18){
            System.out.println("Es mayor de edad");
        } else if (edad == 18) {
            System.out.println("Tiene 18");

        }
        else{
            System.out.println("Es menor de edad");
        }

        //java
        edad =17;
        String mensaje = (edad>18)?"Es mayor":"Es menor";
        System.out.println(mensaje);

        String leerOpcion ="1";
        switch (leerOpcion){
            case "1":
                //bloque del caso 1
                System.out.println("Has entrado en 1");
                break;
            case "2":
                //bloque del caso 2
                System.out.println("Has entrado en 2");
                break;
            case "3":
                //bloque del caso 1
                System.out.println("Has entrado en 3");
                break;
            default:
                System.out.println("Opción por defecto");
        }

        //Estructuras de control bucles

        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        System.out.println("WHILE");
        int z=0;
        while(z<5){
            System.out.println(z);
            z++;
        }
        System.out.println("DO WHILE");
        int r=0;
        do{
            System.out.println(r);
            r++;
        }while(r<5);


        boolean esta = true;
        while (esta){
            if( true ){
                System.out.println("Entra");
                esta =false;
            }
            else{
                System.out.println("Sale");
            }
        }

        String dias [] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        for ( String dia:dias){
            System.out.println(dia);
        }

        ArrayList <String> lista = new ArrayList<>();
        lista.add("Lunes");
        lista.add("Martes");
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.get(1));



        var variable = "Hola";
        //((Object)myInteger).getClass().getSimpleName());
        System.out.println((( Object)variable).getClass().getSimpleName());
        double numerit = 3.56;
        System.out.println("Introduce un valor: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double leerFrase = scanner.nextDouble();

        System.out.println("Valor"+leerFrase);

        Persona persona = new Persona("Pepe",64,"111111111");
        System.out.println(persona);
    }
}
