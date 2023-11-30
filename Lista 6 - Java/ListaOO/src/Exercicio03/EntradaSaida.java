package Exercicio03;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static String solicitarDadoAluno(String msg) {
        return JOptionPane.showInputDialog("Informe o  " + msg + "do aluno: ");
    }

     public static int pedirQuantidadeNotas() {
        return Integer.parseInt(JOptionPane.showInputDialog("Quantas notas gostaria de inserir para este aluno? "));
    }

    public static String solicitarNotas(String msg) {
        return JOptionPane.showInputDialog("Informe a " + msg + "do aluno");
    }

   
    public static int escolherOpcaoMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção: \n" +
                "1 - Cadastrar aluno e suas notas \n" +
                "2 - Ver os dados de todos os alunos e suas notas \n" +
                "3 - Ver dados de um aluno específico e suas notas \n" +
                "4 - Alterar o nome de um aluno específico \n" +
                "5 - Calcular a média de um aluno específico \n" +
                "6 - Sair do programa"));
    }

    public static void mostrarAlunos(String listarAlunos) {
        JOptionPane.showMessageDialog(null, listarAlunos);
    }

    public static void mostrarNotas(Notas n) {
        JOptionPane.showMessageDialog(null, n);
    }

    public static void mostrarAlerta(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}
