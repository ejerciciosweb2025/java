public class Utilidad {
    public static <T> int comparar(T[] a, T[]b){
        return a.length - b.length;
    }
    public static <T> boolean sonIdenticos(T[] a,T[] b){
        boolean iguales = true;
        if(Utilidad.<T>comparar(a,b)==0){
            int contador=0;
            while (contador<a.length && iguales){
                if(!a[contador].equals(b[contador])){
                    iguales=false;
                }
                contador++;
            }
        }
        else {
            iguales = false;
        }
        return iguales;
    }
}
