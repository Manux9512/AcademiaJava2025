package registroDeUsuario;

import java.util.ArrayList;
import java.util.List;

// Clase inmutable
public final class DatosPersonales {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String email;
    private final String telefono;
    private final List<String> puestosDeTrabajo;

    // Constructor
    public DatosPersonales(String nombre, String apellido, int edad, String email, String telefono, List<String> puestosDeTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.puestosDeTrabajo = new ArrayList<>(puestosDeTrabajo);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<String> getPuestosDeTrabajo() {
        return puestosDeTrabajo;
    }
    

    
}
