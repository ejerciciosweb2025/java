public class MainUtilidad {
    public static void main(String[] args) {
        Integer[] a = {0,1,2,3,4};
        Integer[] b = {0,1,2,3,4,5};
        Double[] c = {0.8,1.9,-2.4,3.3,-4.1,5.6};
        Double[] d = {0.8,1.9,-2.4,3.3,-4.1,5.6};

        if (Utilidad.<Integer>sonIdenticos(a,b)){
            System.out.println("Los arrays a y b son idénticos");
        }
        else{
            System.out.println("Los arrays a y b son distintos");
        }

        if (Utilidad.<Double>sonIdenticos(c,d)){
            System.out.println("Los arrays c y d son idénticos");
        }
        else{
            System.out.println("Los arrays a y b son distintos");
        }
    }
}
