import javax.swing.JOptionPane;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[10];

        // Laço para pedir os 10 números ao usuário
        for (int i = 0; i < 10; i++) {
            int inputNumeros = Integer.parseInt(JOptionPane.showInputDialog("Insira 10 números inteiros para preencher o vetor: "));
            numeros[i] = inputNumeros;
        }

        // Variável que vai concatenar todos os valores
        StringBuilder resultado = new StringBuilder("Os valores do vetor são: "); 

        int soma = 0;
        double media;

        // Laço para percorrer o vetor, calcular a soma e concatenar os valores
        for (int i = 0; i < 10; i++) {
            soma += numeros[i];
            resultado.append(numeros[i]);
            if (i < 9) {
                resultado.append(", ");
            } else {
                resultado.append(".");
            }
        }

        // Calculando a média
        media = (double) soma / 10;

        // Montando a mensagem final
        resultado.append("\nA soma dos valores é: ").append(soma)
                 .append("\nA média dos valores é: ").append(media);

        // Mostrando o resultado ao usuário
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
