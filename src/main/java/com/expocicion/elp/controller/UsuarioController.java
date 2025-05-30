package com.expocicion.elp.controller;

import com.expocicion.elp.dto.request.UsuarioRequest;
import com.expocicion.elp.dto.response.UsuarioResponse;
import com.expocicion.elp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping ("/create")// crear un usuario
    public void crearUsuario(@RequestBody UsuarioRequest request) { usuarioService.crearUsuario(request);
    }

    @GetMapping("/{id}") // obtener un usuario por su id
    public ResponseEntity<UsuarioResponse> obtenerUsuarioPorId(@PathVariable Long id) {
       return ResponseEntity.ok(usuarioService.obtenerUsuarioPorId(id));
    }

    @GetMapping("/todos")// obtener todos los usuarios
    public ResponseEntity<Collection<UsuarioResponse>> obtenerTodosLosUsuarios() {
       return ResponseEntity.ok(usuarioService.obtenerTodosLosUsuarios());
    }

    @PutMapping("/update/{id}")// actualizar un usuario por id
    public void actualizarUsuarioId(@PathVariable Long id, @RequestBody UsuarioRequest request) {
        if (usuarioService.obtenerUsuarioPorId(id) != null) {
            usuarioService.actualizarUsuario(id, request);
        } else {
            throw new RuntimeException("No existe un usuario con el id: " + id);
        }
    }

    @DeleteMapping("/delete/{id}") // eliminar un usuario  por id
    public void eliminarUsuarioId(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
    }


//    @GetMapping("/activos")
//    public ResponseEntity<Collection<UsuarioResponse>> obtenerUsuariosActivos(@RequestParam(required = false) Boolean activo) {
//        // Equivalente a ngIf: filtrar usuarios según condición
//        Collection<UsuarioResponse> todos = usuarioService.obtenerTodosLosUsuarios();
//
//        if (activo != null) {
//            Collection<UsuarioResponse> filtrados = todos.stream()
//                    .filter(u -> u.getEstado().equals(activo))
//                    .collect(Collectors.toList());
//            return ResponseEntity.ok(filtrados);
//        }
//        return ResponseEntity.ok(todos);
//    }
}