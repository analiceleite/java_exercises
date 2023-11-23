import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        

        DecimalFormat df = new DecimalFormat("#,###.0");

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota: "));

        double pesonota1 = nota1 * 0.40;
        double pesonota2 = nota2 * 0.60;
        double media = pesonota1 + pesonota2;
       
   
        JOptionPane.showMessageDialog(null, "A média do aluno é de " +media+ " sendo que o peso da primeira nota é de "+df.format(pesonota1)+ " e o peso da segunda é de " +df.format(pesonota2));


    }
}
