package Ejemplo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.mostrarInfo();

        Usuario usuario = new Usuario();
        usuario.mostrarUsuario();

        usuario.setNombre("Pepe");
        System.out.println(usuario.getNombre());;
        usuario.mostrarUsuario();


        Diccionario diccionario = new Diccionario();
        diccionario.mostrarInfo();

    }
}
