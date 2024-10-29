package exercicio12.src.main.java.com.pedrolucas.exercicio12.mapper;

import com.pedrolucas.exercicio12.dto.ContaDTO;
import com.pedrolucas.exercicio12.model.Conta;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }
}
