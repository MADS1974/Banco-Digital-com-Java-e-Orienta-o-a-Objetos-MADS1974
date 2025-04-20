# Criando um Banco Digital com Java e Orientação a Objetos

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.

## Novas Funcionalidades (o que eu implementei)

### Classe `Gerente`
- Gerencia clientes associados ao banco.
- Métodos:
  - `adicionarCliente(Cliente cliente)`
  - `removerCliente(Cliente cliente)`
  - `listarClientes()`

### Classe `Transacao`
- Representa operações realizadas no banco.
- Atributos:
  - `tipo` (depósito, saque, transferência)
  - `valor`
  - `data`
  - `contaOrigem`
  - `contaDestino`
- Método:
  - `registrarTransacao()`

### Extensão da Classe `ContaCorrente`
- Adicionado atributo `limite` para crédito.
- Sobrescrito o método `sacar` para considerar o limite.

### Relatório no Banco
- Método `gerarRelatorio()` para exibir todas as contas e seus saldos.

### Menu Interativo
- Adicionado um menu no terminal para facilitar a interação com o sistema.
- Funcionalidades disponíveis no menu:
  - Depósitos, saques e transferências.
  - Aplicação de juros na conta poupança.
  - Exibição de extratos e histórico de transações.

### Inclusão do Lombok
- O projeto utiliza a biblioteca **Lombok** para reduzir a verbosidade do código.
- Lombok é usado para gerar automaticamente métodos como `getters`, `setters`, `toString`, entre outros.


### Toda implementação deste código foi seguindo as orientações do Expert www.dio.me

* [Venilton FalvoJr Tech Lead, DIO](https://www.linkedin.com/in/falvojr)

### Follow me

* [MARCIO ADRIANO DA SILVA | LinkedIn](https://www.linkedin.com/in/mads1974/)
