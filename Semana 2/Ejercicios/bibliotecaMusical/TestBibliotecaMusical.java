package bibliotecaMusical;

public class TestBibliotecaMusical {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear canciones
        Cancion cancion1 = new Cancion("Rosa Pastel", "Belanova", "2005");
        biblioteca.añadirCancion(cancion1);

        Cancion cancion2 = new Cancion("Titulo de prueba", "Artista de prueba", "2006");
        biblioteca.añadirCancion(cancion2);

        // Mostrar canciones
        System.out.println("Canciones en la biblioteca: ");
        biblioteca.mostrarCanciones();

        // Eliminar canción
        biblioteca.eliminarCancion(cancion1);

        System.out.println("Biblioteca actualizada: ");
        biblioteca.mostrarCanciones();
    }
}
