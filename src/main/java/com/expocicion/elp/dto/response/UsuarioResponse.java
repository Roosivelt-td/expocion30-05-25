package com.expocicion.elp.dto.response;

import lombok.Data;

@Data
public class UsuarioResponse {

    private Long identificador ;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String rol;
    private Boolean estado;


}