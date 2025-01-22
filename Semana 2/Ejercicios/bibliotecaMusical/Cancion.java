package bibliotecaMusical;

public class Cancion {
    //Datos de la canción que se guardaran en la biblioteca
    private String nombreCancion;
    private String nombreArtista;
    private String año;

    //Constructor
    public Cancion(String nombreCancion, String nombreArtista, String año){
        this.nombreCancion = nombreCancion;
        this.nombreArtista = nombreArtista;
        this.año = año;
    }

    //String con los datos completos de la canción añadida
    public String datosCancion(){
        return "Canción: " + nombreCancion + ", Artista: " + nombreArtista + ", Año: " + año; 
    }
}
