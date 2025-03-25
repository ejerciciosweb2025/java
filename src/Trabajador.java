public class Trabajador extends Persona {
    private int horas;
    private double sueldo;

    public Trabajador( String nombre, int edad, String dni,int horas, double sueldo){
        super(nombre,edad,dni);

        if(horas<0){
            throw new IllegalArgumentException("Error: horas negativas");
        }
        if(sueldo<0){
            throw new IllegalArgumentException("Error: sueldo negativo");
        }
        this.horas  = horas;
        this.sueldo = sueldo;
    }
    //métodos get y set
    @Override
    public String toString(){
        String s = super.toString();
        return s+"\n\tTrabaja "+this.horas+" a la semana y gana "+this.sueldo+"€ al mes";
    }
}
