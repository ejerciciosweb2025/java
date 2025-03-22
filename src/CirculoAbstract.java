public class CirculoAbstract extends Figura {
    private double radio;
    private Punto centro;

    @Override
    public double area() {
        return Math.PI * this.radio*this.radio;
    }
}
