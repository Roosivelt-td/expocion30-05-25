package com.expocicion.elp.service.mapper;

import com.expocicion.elp.dto.response.UsuarioResponse;
import com.expocicion.elp.model.Usuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Component
public class UsuarioMapper {

    public Collection<UsuarioResponse> toListUsuarioToUsuarioResponse(Collection<Usuario> listarUsuario) {
        Collection<UsuarioResponse> listarUsuarioResponse = new ArrayList<UsuarioResponse>();

        if (listarUsuario != null && !listarUsuario.isEmpty()) {
            for (Usuario usuario : listarUsuario) {
                UsuarioResponse usuarioResponse = new UsuarioResponse();
                usuarioResponse.setIdentificador(usuario.getId());
                usuarioResponse.setNombre(usuario.getNombre());
                usuarioResponse.setApellido(usuario.getApellido());
                usuarioResponse.setCorreo(usuario.getCorreo());
                usuarioResponse.setContrasena(usuario.getContrasena());
                usuarioResponse.setRol(usuario.getRol());
                usuarioResponse.setEstado(usuario.getEstado());
                listarUsuarioResponse.add(usuarioResponse);
            }
        }
        return listarUsuarioResponse;
    }

    public UsuarioResponse toUsuarioToUsuarioResponse(Usuario usuario) {
        UsuarioResponse usuarioResponse = new UsuarioResponse();
        if (usuario != null) {
            usuarioResponse.setNombre(usuario.getNombre());
            usuarioResponse.setApellido(usuario.getApellido());
            usuarioResponse.setCorreo(usuario.getCorreo());
            usuarioResponse.setContrasena(usuario.getContrasena());
            usuarioResponse.setRol(usuario.getRol());
            usuarioResponse.setEstado(usuario.getEstado());
        }
        return usuarioResponse;
    }

}