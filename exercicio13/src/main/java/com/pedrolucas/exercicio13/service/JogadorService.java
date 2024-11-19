package com.pedrolucas.exercicio13.service;

import com.pedrolucas.exercicio13.model.Jogador;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JogadorService {
    private final List<Jogador> jogadores = new ArrayList<>();

    public Jogador salvar(Jogador jogador) {
        jogadores.add(jogador);
        return jogador;
    }

    public List<Jogador> listar() {
        return jogadores;
    }
}
