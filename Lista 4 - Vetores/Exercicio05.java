import java.util.Random;
import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        // Tamanho do vetor
        int tamanhoVetor = 10;
        
        // Criar o vetor
        int[] numeros = new int[tamanhoVetor];
        
        // Objeto Random para gerar números aleatórios
        Random random = new Random();
        
        // Preencher o vetor com números aleatórios
        for (int i = 0; i < tamanhoVetor; i++) {
            numeros[i] = random.nextInt(100); // Gera números aleatórios de 0 a 99
        }
        
        // Criar uma string com os números separados por vírgula
        StringBuilder numerosSeparados = new StringBuilder();
        for (int i = 0; i < tamanhoVetor; i++) {
            // O append adiciona vírgula e espaço na String sem precisar de concatenações
            numerosSeparados.append(numeros[i]);
            if (i < tamanhoVetor - 1) {
                numerosSeparados.append(", ");
            }
        }
        
        // Mostrar ao usuário os números separados por vírgula utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "Números aleatórios do vetor:\n" + numerosSeparados);
        
        // Inverter os números no vetor
        for (int i = 0; i < tamanhoVetor / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[tamanhoVetor - 1 - i];
            numeros[tamanhoVetor - 1 - i] = temp;
        }
        
        // Criar uma nova string com os números invertidos separados por vírgula
        StringBuilder numerosInvertidos = new StringBuilder();
        for (int i = 0; i < tamanhoVetor; i++) {
            numerosInvertidos.append(numeros[i]);
            if (i < tamanhoVetor - 1) {
                numerosInvertidos.append(", ");
            }
        }
        
        // Mostrar ao usuário os números invertidos separados por vírgula 
        JOptionPane.showMessageDialog(null, "Números invertidos do vetor:\n" + numerosInvertidos);
    }
}
