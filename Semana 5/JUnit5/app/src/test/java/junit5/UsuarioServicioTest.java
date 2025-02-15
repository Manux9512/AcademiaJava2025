package junit5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UsuarioServicioTest {
    @DisplayName("Test para crear un usuario")
    @Test
    public void test1(){
        UsuarioDTO esperado = new UsuarioDTO(1L, "Juan");
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        final UsuarioDTO resultado = usuarioServicio.crearUsuario(1L, "Juan");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertEquals(esperado.nombre, resultado.nombre);
        Assertions.assertEquals(esperado, resultado);

    }

    @Test
    public void test2(){
        UsuarioDTO esperado = new UsuarioDTO(1L, "Nombre");
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        final UsuarioDTO resultado = usuarioServicio.crearUsuario(1L, "Juan");
        Assertions.assertEquals(esperado.id, resultado.id);
        Assertions.assertNotEquals(esperado.nombre, resultado.nombre, "El nombre no es igual");
        Assertions.assertNotEquals(esperado, resultado);
    }
}