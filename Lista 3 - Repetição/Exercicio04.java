import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {
        // Solicitar o número e o incremento
        String numeroInput = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(numeroInput);

        String incrementoInput = JOptionPane.showInputDialog("Digite o incremento:");
        int incremento = Integer.parseInt(incrementoInput);

        // Exibir os números conforme o incremento
        for (int i = 0; i <= numero; i += incremento) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
}
