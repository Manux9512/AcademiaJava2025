package registroDeUsuario;

import java.util.ArrayList;
import java.util.List;

public class TestRegistroDeUsuario {
    public static void main(String[] args) {

        // Crear lista de puestos de trabajo
        List<String> puestosDeTrabajo = new ArrayList<>();
        puestosDeTrabajo.add("Desarrollador");
        puestosDeTrabajo.add("Analista");
        puestosDeTrabajo.add("Tester");

        // Crear objeto de la clase DatosPersonales
        DatosPersonales usuario = new DatosPersonales("Juan", "Perez", 25, "juan@gmail.com", "1234567890", puestosDeTrabajo);
        
        // Imprimir datos del usuario
        System.out.println("Nombre: " + usuario.getNombre() + " Apellido: " + usuario.getApellido() + " Edad: " + usuario.getEdad() + " Email: " + usuario.getEmail() + " Telefono: " + usuario.getTelefono());
        System.out.println("Puestos de trabajo: " + usuario.getPuestosDeTrabajo());
    }
}
