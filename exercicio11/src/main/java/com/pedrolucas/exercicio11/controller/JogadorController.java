package com.pedrolucas.exercicio11.controller;

import com.pedrolucas.exercicio11.dto.JogadorRequestDTO;
import com.pedrolucas.exercicio11.dto.JogadorResponseDTO;
import com.pedrolucas.exercicio11.service.JogadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public ResponseEntity<JogadorResponseDTO> criarJogador(@RequestBody JogadorRequestDTO requestDTO) {
        JogadorResponseDTO jogadorCriado = jogadorService.criarJogador(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorCriado);
    }

    @GetMapping
    public ResponseEntity<List<JogadorResponseDTO>> listarJogadores() {
        List<JogadorResponseDTO> jogadores = jogadorService.listarJogadores();
        return ResponseEntity.ok(jogadores);
    }
}
