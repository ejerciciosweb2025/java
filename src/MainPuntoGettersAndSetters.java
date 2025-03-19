public class MainPuntoGettersAndSetters {
    public static void main(String[] args) {
        PuntoGettersAndSetters p1 = new PuntoGettersAndSetters();
        PuntoGettersAndSetters p2 = new PuntoGettersAndSetters(3.4,-7.9);
        PuntoGettersAndSetters p3 = new PuntoGettersAndSetters(p2);

        //consulta de los atributos

        double coordenada = p2.getX();
        System.out.println("El valor de la coordenada y de p2 es: "+p2.getY());
        //modificación de los atributos
        p1.setX(-9.2);
        p2.setY(-4);
    }
}
