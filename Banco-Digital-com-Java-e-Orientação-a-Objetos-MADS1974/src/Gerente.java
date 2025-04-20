import java.util.ArrayList;
import java.util.List;

public class Gerente {
    private String nome;
    private int id;
    private List<Cliente> listaDeClientes;

    public Gerente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.listaDeClientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void adicionarCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        listaDeClientes.remove(cliente);
    }

    public void listarClientes() {
        System.out.println("Clientes do Gerente " + nome + ":");
        for (Cliente cliente : listaDeClientes) {
            System.out.println("- " + cliente.getNome());
        }
    }
}