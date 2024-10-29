package com.pedrolucas.exercicio10.service;


import com.pedrolucas.exercicio10.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static Long contadorId = 1L;

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Optional<Usuario> obterUsuarioPorId(Long id) {
        return usuarios.stream().filter(u -> u.getId().equals(id)).findFirst();
    }

    public Usuario adicionarUsuario(Usuario usuario) {
        usuario.setId(contadorId++);
        usuarios.add(usuario);
        return usuario;
    }

    public Optional<Usuario> atualizarUsuario(Long id, Usuario usuarioAtualizado) {
        return obterUsuarioPorId(id).map(usuario -> {
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setEmail(usuarioAtualizado.getEmail());
            return usuario;
        });
    }

    public boolean removerUsuario(Long id) {
        return usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }
}