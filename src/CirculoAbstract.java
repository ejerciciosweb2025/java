public class CirculoAbstract extends Figura {
    double radio;
    Punto centro;

    @Override
    public double area() {
        return Math.PI * this.radio*this.radio;
    }
}
