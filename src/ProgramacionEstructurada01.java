//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProgramacionEstructurada01 {
    public static void main(String[] args) {
        String []alumnos    = {"Juan","Jose","Jesus"};
        double [][] notas   = {{3.8,4.7,7.3},{6.5,7.1,8.4},{1.9,9.5,6.3}};
        double media        = mediaAlumno( notas[0] );
        System.out.printf(" La media de "+alumnos[0]+"es:"+media);
    }

    static  double mediaAlumno( double[] notas ){
        double suma=0;
        for(int i=0;i<notas.length;i++){
            suma+=notas[i];
        }
        return suma/notas.length;
    }
}