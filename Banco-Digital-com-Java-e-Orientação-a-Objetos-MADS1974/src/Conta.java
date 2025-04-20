import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected int numero;
    private Cliente cliente;
    private double saldo;
    private List<String> historico; // Histórico de transações

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        historico.add(String.format("Deposito: +%.2f | Saldo: %.2f", valor, saldo));
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            historico.add(String.format("Saque: -%.2f | Saldo: %.2f", valor, saldo));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            historico.add(String.format("Transferencia: -%.2f para Conta %d | Saldo: %.2f", valor, contaDestino.getNumero(), saldo));
        } else {
            System.out.println("Saldo insuficiente para transferencia.");
        }
    }

    public void imprimirHistorico() {
        System.out.println("=== Historico de Transacoes ===");
        for (String transacao : historico) {
            System.out.println(transacao);
        }
    }

    public abstract void imprimirExtrato();

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}