package com.pedrolucas.exercicio10.service;


import com.pedrolucas.exercicio10.model.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    private static List<Livro> livros = new ArrayList<>();
    private static Long contadorId = 1L;

    public List<Livro> listarLivros() {
        return livros;
    }

    public Optional<Livro> obterLivroPorId(Long id) {
        return livros.stream().filter(l -> l.getId().equals(id)).findFirst();
    }

    public Livro adicionarLivro(Livro livro) {
        livro.setId(contadorId++);
        livros.add(livro);
        return livro;
    }

    public Optional<Livro> atualizarLivro(Long id, Livro livroAtualizado) {
        return obterLivroPorId(id).map(livro -> {
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
            return livro;
        });
    }

    public boolean removerLivro(Long id) {
        return livros.removeIf(livro -> livro.getId().equals(id));
    }
}