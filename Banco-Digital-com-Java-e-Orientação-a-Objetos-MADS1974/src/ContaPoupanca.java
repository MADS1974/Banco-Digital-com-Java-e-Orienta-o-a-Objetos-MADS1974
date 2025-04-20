public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();
    }

    public void aplicarJuros(double taxa) {
        double juros = this.getSaldo() * (taxa / 100);
        this.depositar(juros);
        System.out.println(String.format("Juros de %.2f%% aplicados. Saldo atualizado: %.2f", taxa, this.getSaldo()));
    }
}