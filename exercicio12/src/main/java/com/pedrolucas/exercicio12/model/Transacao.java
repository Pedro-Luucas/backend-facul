package exercicio12.src.main.java.com.pedrolucas.exercicio12.model;

public class Transacao {
    private Conta origem;
    private Conta destino;
    private Double valor;

    public Transacao(Conta origem, Conta destino, Double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    public Conta getOrigem() {
        return origem;
    }

    public Conta getDestino() {
        return destino;
    }

    public Double getValor() {
        return valor;
    }
}
