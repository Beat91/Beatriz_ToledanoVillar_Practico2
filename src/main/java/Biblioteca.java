package main.java;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca con una coleccion de libros
 * Permite agregar, eliminar y buscar libros por titulo y por autor
 *
 * @author Beatriz Toledano Villar
 * @version 2.0
 * @see Libro
 * @since 1.0
 */

public class Biblioteca {
    // TODO: Documentar estos atributos
    /**
     * Lista de libros disponibles en la biblioteca
     */
    private final List<Libro> libros;
    // TODO: Documentar este método
    /**
     * Constructor por defecto de la Biblioteca sin libros
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }
    // TODO: Documentar este método.
    /**
     * Constructor con parametros
     *
     * @param libros Lista de libros con la que inicializamos la Biblioteca
     */
// Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }
    // TODO: Testear este metodo.
// Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }
    // TODO: Testear este metodo.
// Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }
    // TODO: Documentar este método
    /**
     * Devuelve la lista de libros de la biblioteca
     *
     * @return lista de libros disponibles en la bilioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }
    // TODO: Documentar este método.
    /**
     * Busca un libro por su titilo dentro de la biblioteca
     *
     * @param titulo El titulo del libro a buscar
     * @return el libro encontrado o {code null} si no se encuentra en biblioteca
     */
// Test 01: buscar libro existente y comprobar que lo localiza.
// Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
    // TODO: Documentar este metodo.
    /**
     * Busca un libro por el nombre de autor
     *
     * @param autor Nombre del autor a buscar
     * @return el libro encontrado por autor o {@code null} si no encuentra el libro por autor
     * @deprecated este metodo ha quedado obsoleto
     * Se recomienda usar{@link #encuentraLibrosPorAutor(String)} en su lugar
     */
// No testearlo
// Este metodo está obsoleto. Hay que documentarlo como tal.
// Recuerda: las anotaciones @deprecated y @link a la nueva
// versión mejorada encuentraLibrosPorAutor(...)
// En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }
    // TODO: Documentar este metodo
    /**
     * Busca todos los libros de un autor determinado
     *
     * @param autor nombre del autor cuyos libros se buscan
     * @return lista de libros del autor, o {@code null} si no se encuentran libros
     * @see #encuentraLibroPorTitulo(String)
     * @since V2.0
     */
// Este metodo sustituye al metodo anterior. Está disponible desde la
// versión 2.0. Hay que documentarlo teniéndolo en cuenta.
// TODO: Testear este metodo.
// Test: Comprobar la lista de libros que devuelve para un autor existentes.
// Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}