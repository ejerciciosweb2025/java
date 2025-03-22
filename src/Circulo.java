public class Circulo {
    private double radio;
    private Punto centro;
    public Circulo(){
        this.radio=0.0;
        this.centro= new Punto();
    }
    public Circulo( double radio, double x, double y){
       if (radio<0){
           throw new IllegalArgumentException("Error: valor de radio no permitido "+radio);
       }
        this.radio=radio;
        this.centro=new Punto(x,y);
    }
}
