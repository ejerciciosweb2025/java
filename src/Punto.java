public class Punto {
    private double x;
    private double y;
    //Constructor por defecto
    Punto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    Punto( double x, double y){
        this.x = x;
        this.y = y;
    }
    //Constructor copia
    Punto( Punto p ){
        this.x = p.x;
        this.y = p.y;
    }
}
