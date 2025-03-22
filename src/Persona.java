public class Persona {
    private String nombre;
    private String dni;
    private int edad;

    public Persona( String nombre, int edad, String dni ){
        if(nombre.equals("")){
            throw new IllegalArgumentException("Error. El nombre no puede estar vacío");
        }
        if(edad<0){
            throw new IllegalArgumentException("Error. La edad no puede ser negativa");
        }
        if(dni.length()!=9){
            throw new IllegalArgumentException("Error. El DNI debe tener 9 caracteres");
        }

        this.nombre = nombre;
        this.edad   = edad;
        this.dni    = dni;

    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad( int edad ){
        this.edad = edad;
    }
    public String getDni(){
        return this.dni;
    }
    public void setDni( String dni ){
        this.dni = dni;
    }

    //resto de métodos get y set
    @Override
    public String toString(){
        return this.nombre+" con dni: "+this.dni+" tiene: "+this.edad+" años";
    }
}
