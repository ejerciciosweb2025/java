public class MainPersona {
    public static void main(String[] args) {
        Persona juan        = new Persona("Juan García Pérez",23,"12345678R");
        Trabajador alberto  = new Trabajador("Alberto González López",41,"87654321M",40,1050);
        //se muestran los objetos por pantalla
        System.out.println(juan);
        System.out.println(alberto);
    }
}
