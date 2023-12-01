
public class Principal {
    public static void main(String[] args) {

        Banco b = new Banco(); // porque queremos apenas um objeto banco

        int opcao = 0;
        int agencia = 0;
        int numero = 0;
        Conta conta;

        do {

            opcao = EntradaSaida.escolherOpcaoMenu();

            switch (opcao) {
                case 1:

                    // Método construtor é utilizado na criação (instância) de um objeto, nesse caso
                    // o new "Conta()"
                    Conta c = new Conta(); // sempre precisamos criar um objeto conta
                    c.setAgencia(EntradaSaida.solicitarDadoConta("a agência"));
                    c.setNumero(EntradaSaida.solicitarDadoConta("o número")); 
                    // Passos para criar um objeto.
                    Pessoa p = new Pessoa();
                    p.setCpf(EntradaSaida.solicitarCpf());
                    p.setDataNascimento(EntradaSaida.solicitarDadoTitular("data de nascimento"));
                    p.setNome(EntradaSaida.solicitarDadoTitular("nome completo"));

                    c.setTitular(p); 

                    b.adicionarConta(c); // adicionando o objeto conta na lista de contas da classe Banco

                    break;
                case 2:
                    if (!b.listaDeContas.isEmpty()){
                        EntradaSaida.mostrarContas(b.listarContas());
                    }
                    else {
                        EntradaSaida.mostrarAlerta("Nenhuma conta foi cadastrada até o momento!");
                    }
                    break;

                case 3:
                    // Variáveis para armazenar o input do usuário acerca do depósito
                    agencia = EntradaSaida.solicitarDadoConta("a agência");
                    numero = EntradaSaida.solicitarDadoConta("o número");
                    conta = b.encontrarConta(agencia, numero);

                    if (conta != null) {
                        conta.depositar(EntradaSaida.solicitarValorOperacao("depósito"));
                    } else {
                        EntradaSaida.mostrarAlerta("A agência e número digitados não correspondem a nenhuma conta!");
                    }
                    break;

                case 4:
                    // Variáveis para armazenar o input do usuário acerca do depósito
                    agencia = EntradaSaida.solicitarDadoConta("a agência");
                    numero = EntradaSaida.solicitarDadoConta("o número");
                    conta = b.encontrarConta(agencia, numero);

                    if (conta != null) {
                        conta.sacar(EntradaSaida.solicitarValorOperacao("saque"));
                    } else {
                        EntradaSaida.mostrarAlerta("A agência e número digitados não correspondem a nenhuma conta!");
                    }
                    break;

                default:

            }
        } while (opcao != 5);
    }
}
