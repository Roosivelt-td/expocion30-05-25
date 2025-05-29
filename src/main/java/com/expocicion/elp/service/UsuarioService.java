package com.expocicion.elp.service;


import com.expocicion.elp.dto.request.UsuarioRequest;
import com.expocicion.elp.dto.response.UsuarioResponse;

import java.util.Collection;

public interface UsuarioService {

    Collection<UsuarioResponse> obtenerTodosLosUsuarios();
    UsuarioResponse obtenerUsuarioPorId(Long id);
    void crearUsuario(UsuarioRequest request);
    void actualizarUsuario(Long id, UsuarioRequest request);
    void eliminarUsuario(Long id);
}