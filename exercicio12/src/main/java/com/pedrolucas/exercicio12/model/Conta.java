package exercicio12.src.main.java.com.pedrolucas.exercicio12.model;

public class Conta {
    private String codigo;
    private String cliente;

    public Conta(String codigo, String cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }
}
