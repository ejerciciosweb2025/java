public class TrianguloAbstract extends Figura{
    private double base;
    private double altura;
    public TrianguloAbstract(double base, double altura){
        if(base<0 || altura<0){
            throw new IllegalArgumentException("Error: La base o la altura no pueden ser negativos");
        }
        this.base=base;
        this.altura=altura;
    }
    @Override
    public double area() {
        return (this.base * this.altura)/2;
    }
}
