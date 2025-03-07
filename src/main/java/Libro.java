package main.java;
/**
 * Muestra libros con su titulo, autor y año de publicacion
 * Permite aceder y modificar la informacion de un libro
 *
 * @author Beatriz Toledano Villar
 * @version 1.0
 * @since 1.0
 */
public class Libro {
    // TODO: Documentar estos atributos
    /**
     * Titulo del libro
     * Autor del libro
     * Año de publicacion del libro
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;
    // TODO: Documentar este método
    /**
     * Constructor con parametros para inicializar un libro con su titulo, autor y año de publicacion
     *
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
// TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    // TODO: Documentar este método
    /**
     * Obtiene el autor del libro
     *
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    // TODO: Documentar este método
    /**
     * Obtiene el año de publicacion del libro
     *
     * @return el año de publicacion del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
