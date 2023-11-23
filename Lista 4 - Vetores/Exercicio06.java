import javax.swing.JOptionPane;

/*
 * Faça um programa em java que realize a soma dos valores de 2 vetores de 10 posições e armazene em um terceiro vetor, ao final mostre os valores de dois vetores e os valores do vetor de soma resultante.22
 */

public class Exercicio06 {

  public static void main(String[] args) {
    // Declarar vetores
    int[] vetor1 = new int[10];
    int[] vetor2 = new int[10];
    int[] vetorResultado = new int[10];

    // Solicitar o preenchimento dos dois vetores
    for (int i = 0; i < 10; i++) {
      int inputVetor1 = Integer.parseInt(
        JOptionPane.showInputDialog(
          "Digite 10 números inteiros para preencher o primeiro vetor: "
        )
      );

      vetor1[i] = inputVetor1;

      int inputVetor2 = Integer.parseInt(
        JOptionPane.showInputDialog(
          "Digite 10 números inteiros para preencher o segundo vetor: "
        )
      );

      vetor2[i] = inputVetor2;
    }

    // Armazenar ambos os vetores, e somar no terceiro vetor
    for (int i = 0; i < 10; i++) {
      vetorResultado[i] = vetor1[i] + vetor2[i];
      System.out.println(vetorResultado[i]);
    }
  }
}
