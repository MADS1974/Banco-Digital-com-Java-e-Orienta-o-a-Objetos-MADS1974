import java.time.LocalDateTime;

public class Transacao {
    private String tipo; // "DEPÓSITO", "SAQUE", "TRANSFERÊNCIA"
    private double valor;
    private LocalDateTime data;
    private Conta contaOrigem;
    private Conta contaDestino;

    public Transacao(String tipo, double valor, Conta contaOrigem, Conta contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void registrarTransacao() {
        System.out.println(String.format("Transacao: %s | Valor: %.2f | Data: %s", tipo, valor, data));
        if (contaOrigem != null) {
            System.out.println("Conta Origem: " + contaOrigem.getNumero());
        }
        if (contaDestino != null) {
            System.out.println("Conta Destino: " + contaDestino.getNumero());
        }
    }
}