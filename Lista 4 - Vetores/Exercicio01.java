import java.util.Random;

import javax.swing.JOptionPane;

/**
 * 
 * Adicionar variável booleana para verificação da existência do número inserido
 * pelo usuário, dentro do vetor.
 * 
 * Fazer um if que verificar se é true or false.
 * 
 */
public class Exercicio01 {

    public static void main(String[] args) {

        boolean naoEstanoVetor = true;
        int posicao = 0;

        Random rand = new Random();

        int i = 0;

        int[] vetor = new int[10];

        for (i = 0; i < 10; i++) {

            vetor[i] = rand.nextInt(99) + 1;
        }
        for (i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }

        // Solicitando entrada de dados de um número inteiro de 1 até 100

        int entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de 1 até 100: "));

        for (i = 0; i < 10; i++) {
            if (entrada == vetor[i]) {
                naoEstanoVetor = false;

                posicao = i;

            }
        }

        if (naoEstanoVetor == false) {
            JOptionPane.showMessageDialog(null,
                    "Este número está dentro do vetor! " + "Na posição " + (posicao + 1) + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Este número não está no vetor! ");
        }
    }
}
