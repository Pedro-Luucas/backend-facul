package com.pedrolucas.exercicio11.service;

import com.pedrolucas.exercicio11.dto.JogadorRequestDTO;
import com.pedrolucas.exercicio11.dto.JogadorResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class JogadorService {
    private final List<JogadorResponseDTO> jogadores = new ArrayList<>();
    private final Random random = new Random();

    public JogadorResponseDTO criarJogador(JogadorRequestDTO requestDTO) {
        int habilidade = random.nextInt(101);
        String statusMessage = habilidade > 70 ? "Habilidade acima da média!" : "Habilidade média ou abaixo.";
        JogadorResponseDTO jogador = new JogadorResponseDTO(requestDTO.nome(), requestDTO.apelido(), habilidade, statusMessage);
        jogadores.add(jogador);
        return jogador;
    }

    public List<JogadorResponseDTO> listarJogadores() {
        return jogadores;
    }
}
