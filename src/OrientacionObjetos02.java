public class OrientacionObjetos02 {
    public static void main ( String [] args ){
        Alumno a1 = new Alumno("Juan");
        a1.anadirNota(3.8);
        a1.anadirNota(4.7);
        a1.anadirNota(7.3);
        a1.anadirNota(-3.5); //Se intenta guardar un valor inválido
        System.out.println("La media de"+a1.getNombre()+a1.calcularMedia() );
    }
}
