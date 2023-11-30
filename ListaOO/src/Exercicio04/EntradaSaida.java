package Exercicio04;
import javax.swing.JOptionPane;
public class EntradaSaida{
    public static int solicitarId(int id) {
        return Integer.parseInt(JOptionPane.showInputDialog("Informe " + id +
                " da tarefa:"));
    }
}