package junit5;

import java.util.HashMap;

public class UsuarioServicio {
    private final HashMap<Long, UsuarioDTO> usuarios = new HashMap<>();

    public UsuarioDTO crearUsuario(Long id, String nombre){
        usuarios.put(id, new UsuarioDTO(id, nombre));
        return usuarios.get(id);
    }

    public UsuarioDTO obtenerUsuario(Long id){
        return usuarios.get(id);
    }

    public UsuarioDTO actualizarUsuario(Long id, String nombre){
        return usuarios.put(id, new UsuarioDTO(id, nombre));
    }
}
