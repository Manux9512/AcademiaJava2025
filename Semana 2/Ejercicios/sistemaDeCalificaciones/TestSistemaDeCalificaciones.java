package sistemaDeCalificaciones;


public class TestSistemaDeCalificaciones {
    public static void main(String[] args) {
        //Obtiene y guarda las calificaciones 
        Integer[] calificaciones = Calificaciones.obtenerCalificaciones();

        // Muestra las calificaciones
        for (int calificacion : calificaciones) {
            Calificaciones.mostrarCalificacion(calificacion);
        }
        //Muestra el promedio de las calificaciones
        Calificaciones.promedioCalificaciones(calificaciones);
        
        //Overloading del método mostrarCalificaciones para recibir un arreglo
        Integer[] arregloCalificaciones = {8, 8, 7};
        Calificaciones.mostrarCalificacion(arregloCalificaciones);
        Calificaciones.promedioCalificaciones(arregloCalificaciones);
    }
}
