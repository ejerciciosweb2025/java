public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto(3.4,-7.9);
        Punto p3 = new Punto(p2);

        p1.mostrarPuntos();
        p2.mostrarPuntos();
        p3.mostrarPuntos();
    }
    Circulo circulo = new Circulo(2.5,0,0);
}
