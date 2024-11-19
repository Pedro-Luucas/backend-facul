package com.pedrolucas.exercicio13.controller;

import com.pedrolucas.exercicio13.dto.JogadorDTO;
import com.pedrolucas.exercicio13.mapper.JogadorMapper;
import com.pedrolucas.exercicio13.model.Jogador;
import com.pedrolucas.exercicio13.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private final JogadorService jogadorService;
    private final JogadorMapper jogadorMapper;

    public JogadorController(JogadorService jogadorService, JogadorMapper jogadorMapper) {
        this.jogadorService = jogadorService;
        this.jogadorMapper = jogadorMapper;
    }

    @PostMapping
    public ResponseEntity<Jogador> criarJogador(@Valid @RequestBody JogadorDTO jogadorDTO) {
        Jogador jogador = jogadorMapper.toModel(jogadorDTO);
        Jogador salvo = jogadorService.salvar(jogador);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @GetMapping
    public ResponseEntity<List<Jogador>> listarJogadores() {
        return ResponseEntity.ok(jogadorService.listar());
    }
}
