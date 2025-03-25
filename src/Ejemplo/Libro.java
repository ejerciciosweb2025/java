package Ejemplo;
/**Clase: Descripción de las características de un conjunto de elemento similares */
public class Libro {
    /**Datos con los que tratará mi programa -- atributos ( variables)*/
    protected String titulo;
    protected String editorial;
    protected int numPaginas;
    protected Boolean estado;

    /** Constructor - inicializa o da valores iniciales a al objeto
     *  que se construirá de la clase sino se especifica nada**/
    protected Libro(){
        this.titulo="";
        this.editorial="";
        this.numPaginas=0;
    }
    Libro( String titulo){
        this.titulo = titulo;
        this.editorial="";
        this.numPaginas=0;
    }
    Libro(String titulo, String editorial){
        this.titulo=titulo;
        this.editorial=editorial;
        this.numPaginas=0;
    }
    Libro( String titulo, String editorial, int numPaginas){
        this.titulo=titulo;
        this.editorial=editorial;
        this.numPaginas=numPaginas;
    }



    /** métodos (funciones) **/
    public void mostrarInfo(){
        System.out.println("Titulo: "+ this.titulo + "Editorial: "+ this.editorial + "Numero de paginas: "+this.numPaginas );
    }
    public int siguientePagina(){
        return this.numPaginas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
