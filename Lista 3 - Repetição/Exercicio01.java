import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        // Solicitar os 10 números
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(input); //poderia fazer na mesma linha
        }

        while (true) {
            // Perguntar ao usuário o que ele deseja saber ou se quer sair

            String escolha = JOptionPane.showInputDialog(
                    "O que você deseja saber?\n" +
                    "a) Quantos números são pares?\n" +
                    "b) Quantos números são ímpares?\n" +
                    "c) Quantos números são negativos?\n" +
                    "d) Quantos números são positivos?\n" +
                    "Digite 's' para sair.");

            if (escolha == null || escolha.equals("s")) {
                JOptionPane.showMessageDialog(null, "Saindo do programa...");
                System.exit(0);
            }

            // Variável para contar a quantidade de números de acordo com a opção
            int contador = 0;

            // Verificar e contar de acordo com a opção escolhida usando switch case
            switch (escolha) {
                case "a":
                    for (int numero : numeros) {
                        if (numero % 2 == 0) {
                            contador++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Quantidade de números pares: " + contador);
                    break;
                case "b":
                    for (int numero : numeros) {
                        if (numero % 2 != 0) {
                            contador++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Quantidade de números ímpares: " + contador);
                    break;
                case "c":
                    for (int numero : numeros) {
                        if (numero < 0) {
                            contador++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Quantidade de números negativos: " + contador);
                    break;
                case "d":
                    for (int numero : numeros) {
                        if (numero > 0) {
                            contador++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Quantidade de números positivos: " + contador);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
