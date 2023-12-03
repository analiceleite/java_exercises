package Exercicio04;
import javax.swing.JOptionPane;
public class EntradaSaida{

    public static int escolherOpcaoMenu() {

        return Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n" +
        "1 - Cadastrar tarefas \n" +
        "2 - Visualizar tarefas \n" +
        "3 - Visualizar tarefas em aberto \n" +
        "4 - Visualizar tarefas em andamento" +
        "5 - Visualizar tarefas concluídas \n" +
        "6 - Alterar status de alguma tarefa \n" +
        "7 - Excluir tarefa \n" +
        "8 - Ver todos os tipos de tarefas \n" +
        "0 - Sair do programa"));
    }

    public static String solicitarInfosTarefas(String msg) {
        return JOptionPane.showInputDialog(null, msg);
    }

    public static void mostrarTarefas (String listarTarefas) {
        JOptionPane.showMessageDialog(null, listarTarefas);
    }

    public static void mostrarAlerta(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}