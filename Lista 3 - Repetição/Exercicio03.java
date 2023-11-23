import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###.00");
        DecimalFormat outroDf = new DecimalFormat("#,###");

        int otimoCount = 0;
        int bomCount = 0;
        int ruimCount = 0;
        int totalRespostas = 0;

        while (true) {
            String resposta = JOptionPane.showInputDialog(
                    "Opinião sobre o filme:\n" +
                            "1 - Ótimo\n" +
                            "2 - Bom\n" +
                            "3 - Ruim\n" +
                            "Digite 's' para sair");

            if (resposta == null || resposta.equals("s")) {
                break;
            }

            int opcao = Integer.parseInt(resposta);

            switch (opcao) {
                case 1:
                    otimoCount++;
                    break;
                case 2:
                    bomCount++;
                    break;
                case 3:
                    ruimCount++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

            totalRespostas++;
        }

        // Cálculo das porcentagens
        double percentOtimo = (double) otimoCount / totalRespostas * 100;
        double percentBom = (double) bomCount / totalRespostas * 100;
        double percentRuim = (double) ruimCount / totalRespostas * 100;
        double media = otimoCount + bomCount + ruimCount / totalRespostas;

        // Exibir resultados
        JOptionPane.showMessageDialog(null,
                "Respostas sobre o filme:\n" +
                        "Quantidade de respostas Ótimo: " + outroDf.format(otimoCount) + " (" + df.format(percentOtimo) + "%)\n" +
                        "Quantidade de respostas Bom: " + outroDf.format(bomCount) + " (" + df.format(percentBom) + "%)\n" +
                        "Quantidade de respostas Ruim: " + outroDf.format(ruimCount) + " (" + df.format(percentRuim) + "%)\n" +
                        "Total de respostas: " + totalRespostas + "\n" +
                        "Nota média do filme:  " + df.format(media));
    }
}
