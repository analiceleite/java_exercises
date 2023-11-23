import javax.swing.JOptionPane;

/*
 Fazer um programa que solicite a idade, peso e altura de 10 pessoas, depois mostrar quantos tem altura acima de 160, peso abaixo de 80kg e idade acima de 50 anos.
 */
public class Exercicio02 {

    public static void main(String[] args) {
    // Criar variáveis de idade, peso e altura

    int acima50 = 0;
    int acima160 = 0;
    int abaixo80kg = 0;

    for (int i = 1; i <= 10; i++) {
         // Solicitar dados da pessoa
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + i + ":"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa " + i + ":"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa " + i + ":"));

        // Contar com base nos critérios

        /**Usar else if */
        if (idade > 50) {
            acima50++;
        }

        if (altura > 1.60) {
            acima160++;
        }

        if (peso < 80) {
            abaixo80kg++;
        }
    }
       
    // Exibit resultado na tela

    JOptionPane.showMessageDialog(null, "Pessoas com idade acima de 50 anos: " + acima50 + "\nPessoas com altura acima de 1.60m: " + acima160 +"\nPessoas com peso abaixo de 80kg: " + abaixo80kg);
    }
}