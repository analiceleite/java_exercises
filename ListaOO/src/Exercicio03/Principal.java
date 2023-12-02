package Exercicio03;

public class Principal {
    public static void main(String[] args) {

        Escola e = new Escola();

        int i = 0;
        int opcao = 0;
        int quantnotas = 0;
        int matricula = 0;

        do {

            opcao = EntradaSaida.escolherOpcaoMenu();

            switch (opcao) {
                case 1:
                    Alunos a = new Alunos();
                    // Solicitar dados do aluno
                    a.nomeAluno = EntradaSaida.solicitarDadoAluno("nome");
                    a.matricula = Integer.parseInt(EntradaSaida.solicitarDadoAluno("número da matrícula "));
                    a.cpf = EntradaSaida.solicitarDadoAluno("CPF ");
                    // Adicionar o objeto aluno na lista de alunos da classe escola
                    e.adicionarAlunos(a);

                    // Solicitar notas do aluno
                    quantnotas = EntradaSaida.pedirQuantidadeNotas();

                    for (i = 0; i < quantnotas; i++) {
                        Notas n = new Notas();
                        n.descricao = EntradaSaida.solicitarNotas("matéria correspondente ");
                        n.pontuacao = EntradaSaida.solicitarNotas("nota ");
                        // Adicionar objeto nota na lista da classe Notas
                        a.adicionarNota(n);
                    }

                    break;
                case 2:
                    if (!e.listadeAlunos.isEmpty()) {
                        EntradaSaida.mostrarAlunos(e.listarAlunos());
                    } else {
                        EntradaSaida.mostrarAlerta("Nenhum aluno foi matriculado até o momento!");
                    }
                    break;
                case 3:
                    // Consultar dados de um aluno específico
                    matricula = Integer.parseInt(EntradaSaida.solicitarDadoAluno("número da matrícula do"));
                    EntradaSaida.mostrarNotasAluno(e.listarNotas(matricula));
                    break;

                case 4:
                    // Alterar o nome de um aluno específico
                    matricula = Integer.parseInt(EntradaSaida.solicitarDadoAluno("número da matrícula do"));
                    e.alterarNomeAluno(matricula);
                    break;
                case 5:
                    // Adicionar uma nota ao aluno
                     matricula = Integer.parseInt(EntradaSaida.solicitarDadoAluno("número da matrícula do"));
                     e.adicionarNotaAluno(matricula);

                break;

                case 6:
                    // Calcular a média de notas do aluno  
                     matricula = Integer.parseInt(EntradaSaida.solicitarDadoAluno("número da matrícula do"));
                     EntradaSaida.mostrarMedia(e.calcularMedia(matricula));

                     break;

                case 7:
                    // Sair do sistema
                    System.exit(0);

            }

        } while (opcao != 7);
    }
}