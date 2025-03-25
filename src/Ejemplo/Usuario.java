package Ejemplo;

import java.util.ArrayList;

public class Usuario {
    //atributos
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;

    Usuario(){
        this.nombre="";
        this.apellidos="";
        this.telefono="666666666";
        this.email="noemail@email.com";
    }


    //metodos
    public Boolean reservarLibro( String titulo){
        System.out.println("Libro reservado"+titulo);
        return true;
    }

    public Boolean devolverLibro( String titulo ){
        System.out.println("Libro reservado"+titulo);

        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarUsuario(){
        System.out.println("El usuario "+ this.nombre+ " "+this.apellidos+" "+this.telefono+" "+this.email);
    }
}
