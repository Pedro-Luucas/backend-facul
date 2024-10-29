package exercicio12.src.main.java.com.pedrolucas.exercicio12.service;

import com.pedrolucas.exercicio12.dto.ContaDTO;
import com.pedrolucas.exercicio12.dto.TransacaoRequestDTO;
import com.pedrolucas.exercicio12.dto.TransacaoResponseDTO;
import com.pedrolucas.exercicio12.mapper.ContaMapper;
import com.pedrolucas.exercicio12.model.Conta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacoesService {
    private final List<Conta> contas;

    public TransacoesService() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaDTO contaDTO) {
        Conta novaConta = new Conta(contaDTO.codigo(), contaDTO.cliente());
        contas.add(novaConta);
    }

    public TransacaoResponseDTO gerarTransacao(TransacaoRequestDTO requestDTO) {
        Conta contaOrigem = encontrarConta(requestDTO.origem());
        Conta contaDestino = encontrarConta(requestDTO.destino());

        if (contaOrigem == null || contaDestino == null) {
            throw new RuntimeException("Conta não encontrada");
        }

        return new TransacaoResponseDTO(
                ContaMapper.toDTO(contaOrigem),
                ContaMapper.toDTO(contaDestino),
                requestDTO.valor()
        );
    }

    private Conta encontrarConta(String codigo) {
        return contas.stream()
                .filter(conta -> conta.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
}
