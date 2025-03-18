import java.util.ArrayList;

public class Alumno {
    private  String nombre;
    private ArrayList <Double> notas;
    private static int numAlumnos = 0;
    Alumno( String nombre ){
        this.nombre = nombre;
        this.notas = new ArrayList<>();
        Alumno.numAlumnos++;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void anadirNota( double nota ){
        if( nota<0 || nota>10){
            return;
        }
        this.notas.add(nota);
    }
    public double calcularMedia(){
        double suma=0;
        for(double nota: this.notas){
            suma+=nota;
        }
        System.out.println(this.notas.size());
        return suma/this.notas.size();
    }
}
