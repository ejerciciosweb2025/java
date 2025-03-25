public class PuntoImplementsComparable implements Comparable <Punto>{
    private double x;

    @Override
    public int compareTo(Punto o) {
        return Double.compare(this.x,o.x);
    }
}
