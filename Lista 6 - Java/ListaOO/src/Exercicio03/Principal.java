package Exercicio03;


public class Principal {
    public static void main(String[] args) {

        Escola e = new Escola();
        Notas n = new Notas();

        int i = 0;
        int opcao = 0;
        int quantnotas = 0;

        do {

            opcao = EntradaSaida.escolherOpcaoMenu();

            switch (opcao) {
                case 1:
                    Alunos a = new Alunos();
                    // Solicitar dados do aluno
                    a.nomeAluno = EntradaSaida.solicitarDadoAluno("nome ");
                    a.matrícula = EntradaSaida.solicitarDadoAluno("número da matrícula ");
                    a.cpf = EntradaSaida.solicitarDadoAluno("CPF ");
                    // Adicionar o objeto aluno na lista de alunos da classe escola
                    e.adicionarAlunos(a);

                    // Solicitar notas do aluno
                    quantnotas = EntradaSaida.pedirQuantidadeNotas();

                    for ( i = 0; i < quantnotas; i ++) {
                    n.descricao = EntradaSaida.solicitarNotas("matéria correspondente ");
                    n.pontuacao = EntradaSaida.solicitarNotas("nota ");
                    // Adicionar objeto nota na lista da classe Notas
                    n.adicionarNota(n);
                    }
                   
                    break;
                case 2:
                    if (!e.listadeAlunos.isEmpty()) {
                        EntradaSaida.mostrarAlunos(e.listarAlunos());
                    } else {
                        EntradaSaida.mostrarAlerta("Nenhum aluno foi matriculado até o momento!");
                    }

                    if (!n.listaDeNotas.isEmpty()) {
                        EntradaSaida.mostrarNotas();
                    } else {
                        EntradaSaida.mostrarAlerta("Nenhuma nota foi inserida pra este aluno até o momento.");
                    }
                    break;
                case 3:
                    break;
                default:
                    break;
            }

        } while (opcao != 7);
    }
}
