package com.pedrolucas.exercicio13.mapper;

import com.pedrolucas.exercicio13.dto.JogadorDTO;
import com.pedrolucas.exercicio13.model.Jogador;
import org.springframework.stereotype.Component;

@Component
public class JogadorMapper {
    public Jogador toModel(JogadorDTO dto) {
        Jogador jogador = new Jogador();
        jogador.setNome(dto.getNome());
        jogador.setApelido(dto.getApelido());
        jogador.setHabilidade(100); // Habilidade fixa
        return jogador;
    }
}
