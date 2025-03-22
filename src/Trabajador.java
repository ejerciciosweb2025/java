public class Trabajador extends Persona {
    private int horas;
    private double sueldo;

    public Trabajador( String nombre, int edad, String dni,int horas, double sueldo){
        super(nombre,edad,dni);

        if(horas<0){
            
        }
    }
}
