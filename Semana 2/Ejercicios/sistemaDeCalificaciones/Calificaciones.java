package sistemaDeCalificaciones;

import java.util.Scanner;

public class Calificaciones {

    //Obtiene las calificaciones del usuario
    public static Integer[] obtenerCalificaciones(){
        Scanner scanner = new Scanner(System.in);
        Integer[] calificaciones = new Integer[3];

        System.out.println("Introduce 3 calificaciones:");
        for (int i = 0; i < 3; i++){
            calificaciones[i] = scanner.nextInt();
        }
        scanner.close();
        return calificaciones;
    }

    //Muestra la calificacion
    public static void mostrarCalificacion(int calificacion){
        System.out.println("Calificacion: " + calificacion);
    }

    //Sobrecarga del método de mostrarCalificación para usar arreglos
    public static void mostrarCalificacion(Integer[] calificaciones){
        System.out.println("Calificaciones: ");
        for (int calificacion : calificaciones) {
            System.out.println("Calificacion: " + calificacion);
        }
    }

    //Muestra el promedio de las calificaciones del arreglo
    public static void promedioCalificaciones(Integer[] calificaciones){
        float suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / calificaciones.length;
        System.out.println("Promedio: " + promedio);
    }

}
