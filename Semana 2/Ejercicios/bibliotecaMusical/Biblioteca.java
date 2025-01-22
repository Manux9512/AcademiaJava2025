package bibliotecaMusical;

import java.util.ArrayList;

public class Biblioteca {
    //ArrayList que guardara la informacion de las canciones
    private ArrayList<Cancion> canciones;

    //Constructor y creacion del ArrayList
    public Biblioteca(){
        canciones = new ArrayList<>();
    }

    //Método para añadir canciones
    public void añadirCancion(Cancion cancion){
        canciones.add(cancion);
    }

    //Método para eliminar canciones
    public void eliminarCancion(Cancion cancion){
        canciones.remove(cancion);
    }

    //Método para mostrar canciones
    public void mostrarCanciones(){
        for(Cancion cancion : canciones){
            System.out.println(cancion.datosCancion());
        }
    }
}
