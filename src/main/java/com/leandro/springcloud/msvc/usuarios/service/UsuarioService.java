package com.leandro.springcloud.msvc.usuarios.service;

import com.leandro.springcloud.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> porId(Long id);
    Usuario gurardar(Usuario usuario);
    void eliminar(Long id);
}
