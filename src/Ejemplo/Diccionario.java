package Ejemplo;

public class Diccionario extends Libro {
    private String idioma;
    Diccionario(){
        super();
        this.idioma="ES";
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println(this.idioma);
    }
}
