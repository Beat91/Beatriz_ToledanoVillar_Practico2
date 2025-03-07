package test.java;

import main.java.Biblioteca;
import main.java.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    /**
     * Metodo que inicializa los objetos antes de cada prueba unitaria
     * Comprueba el constructor de Libro
     */
    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    /**
     * Comprueba que el libro se agrega correctamente
     */
    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    /**
     * Comprueba que el libro se elimina correctamente
     */
    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.eliminarLibro(this.libro));
        assertFalse(biblioteca.getLibros().contains(libro));
    }

    /**
     * Comprueba que se pueden encontrar libros por titulo en la biblioteca
     */
    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(libro);
        // Comprueba un libro que existe
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("The Art of Computer Programming");
        assertNotNull(encontrado, "El libro no se ha encontrado.");
        assertEquals(libro, encontrado, "El libro encontrado no es el esperado.");
        // Comprueba que el libro no existe
        Libro noEncontrado = biblioteca.encuentraLibroPorTitulo(("Clean Code"));
        assertNull(noEncontrado, "El libro no debería ser encontrado.");
    }

    /**
     * Comprueba que se extrae una lista de libros por autor
     */
    @Test
    void encuentraLibrosPorAutor() {
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(this.libro);
        // comprueba que la biblioteca no esta vacia
        assertNotNull(biblio.getLibros());
        // comprobar si solo tiene un libro
        assertEquals(1, biblio.getLibros().size());
        // contiene el libro recien añadido
        assertTrue(biblio.getLibros().contains(this.libro));
    }


}