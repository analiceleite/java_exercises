import javax.swing.JOptionPane;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        // Declarando variável de menor e maior valor dentro do vetor

        int menorValor = 0 ;
        int posicaoMenor = 0;
        int maiorValor = 0;
        int posicaoMaior = 0;
        int i = 0;


        // Criando um vetor de 5 posições
        int[] vetor = new int[5];

        // Solicitando a inserção dos valores
        for (i = 0; i < 5; i ++) {
             vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " valor"));
        }

        // Mostrando os valores do vetor inseridos pelo usuário
        //for (int i: vetor) {
        //   System.out.print(i);
        //}

        // Mostrando o maior e menor número informando suas posições

        for (i = 0; i < 5; i ++) {

        if (vetor[i] >= maiorValor) {
            maiorValor = vetor[i];
            posicaoMaior = i;
        }

        if (vetor[i] <= menorValor) {
            menorValor = vetor[i];
            posicaoMenor = i;
        } 
    }

        JOptionPane.showMessageDialog(null, "O maior valor do vetor é: " + maiorValor + " e sua posição é " + posicaoMaior + "\n O menor valor do vetor é: " + menorValor + " e sua posição é " + posicaoMenor);
    }
}
