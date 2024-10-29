package exercicio12.src.main.java.com.pedrolucas.exercicio12.controller;

import com.pedrolucas.exercicio12.dto.ContaDTO;
import com.pedrolucas.exercicio12.dto.TransacaoRequestDTO;
import com.pedrolucas.exercicio12.dto.TransacaoResponseDTO;
import com.pedrolucas.exercicio12.service.TransacoesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    private final TransacoesService transacoesService;

    public TransacaoController(TransacoesService transacoesService) {
        this.transacoesService = transacoesService;
    }

    @PostMapping
    public ResponseEntity<TransacaoResponseDTO> gerarTransacao(@RequestBody TransacaoRequestDTO requestDTO) {
        TransacaoResponseDTO transacao = transacoesService.gerarTransacao(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(transacao);
    }

    @PostMapping("/contas")
    public ResponseEntity<Void> adicionarConta(@RequestBody ContaDTO contaDTO) {
        transacoesService.adicionarConta(contaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
