import javax.swing.JOptionPane;

public class Exercicio07 {

    public static void main(String[] args) {
        String nomeMaisAlta = "";
        double alturaMaisAlta = 0;

        String nomeMaisPesada = "";
        double pesoMaisPesada = 0;

        for (int i = 0; i < 6; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (em metros) de " + nome + ":"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso (em kg) de " + nome + ":"));

            // Verifica a pessoa mais alta
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlta = nome;
            }

            // Verifica a pessoa mais pesada
            if (peso > pesoMaisPesada) {
                pesoMaisPesada = peso;
                nomeMaisPesada = nome;
            }
        }

        // Exibe resultados
        JOptionPane.showMessageDialog(null,
                "Pessoa mais alta: " + nomeMaisAlta + ", altura: " + alturaMaisAlta + " metros\n" +
                        "Pessoa mais pesada: " + nomeMaisPesada + ", peso: " + pesoMaisPesada + " kg");
    }
}
