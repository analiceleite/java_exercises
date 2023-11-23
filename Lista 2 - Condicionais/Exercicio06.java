import java.util.Random;

import javax.swing.JOptionPane;
 
public class Exercicio6 {
   
    public static void main(String[] args) {
         // criar um objeto da classe Random
        Random random = new Random();
        // gerar um número aleatório de 0 a 3
        int number = random.nextInt(101);
        System.out.println(number);
 
        int acertaNumero = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da sorte? "));
 
        if (acertaNumero == number) {
            JOptionPane.showMessageDialog(null, "Acertou!");
        }
 
        else {
            JOptionPane.showMessageDialog(null, "Errou!");
        }
 
    }
}
 