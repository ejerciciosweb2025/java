public class PuntoGettersAndSetters {
    private double x;
    private double y;
    //Constructor por defecto
    PuntoGettersAndSetters(){
        this.x = 0.0;
        this.y = 0.0;
    }
    PuntoGettersAndSetters(double x, double y){
        this.x = x;
        this.y = y;
    }
    //Constructor copia
    PuntoGettersAndSetters(PuntoGettersAndSetters p ){
        this.x = p.x;
        this.y = p.y;
    }
    public  double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX( double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    void mostrarPuntos(){
        System.out.println("Punto x: "+this.x +" " +"\nPunto y: "+this.y);
    }
}
