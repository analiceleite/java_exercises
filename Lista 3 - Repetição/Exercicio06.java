import javax.swing.JOptionPane;

public class Exercicio06 {

    public static void main(String[] args) {
        String numeroInput = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(numeroInput);

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i <= 10; i++) {
            int multiplicacao = numero * i;
            resultado.append(numero).append(" x ").append(i).append(" = ").append(multiplicacao).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}