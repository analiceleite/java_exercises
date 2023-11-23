import javax.swing.JOptionPane;

public class Exercicio02 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Double num1= Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: "));
        Double num2= Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));

        double soma= (num1+num2);
        double sub= (num1-num2);
        double mult= (num1*num2);

        String mensagemDiv = ("");        
        double div= 0;
        double restoDiv = 0;
        String mensagemResto = ("");

 
        if (num2 == 0) {
            mensagemDiv = ("Não é possível realizar a divisão pois um dos números é 0.");
            mensagemResto = ("Não é possível realizar a divisão pois um dos números é 0.");
        }else {     
            div = (num1/num2);
            // Espacinho vazio para que permaneça como String.
            mensagemDiv = div + "";
            restoDiv = (num1%num2);
            mensagemResto = restoDiv + "";
        }

  
        JOptionPane.showMessageDialog(null, "A soma dos dois números resulta em " +soma);
        JOptionPane.showMessageDialog(null, "A subtração dos dois números resulta em " +sub);
        JOptionPane.showMessageDialog(null, "A multiplicação dos dois números resulta em " +mult);
        JOptionPane.showMessageDialog(null,mensagemDiv);
        JOptionPane.showMessageDialog(null, mensagemResto);
        JOptionPane.showMessageDialog(null, "O primeiro número elevado ao segundo resulta em: "
        + Math.pow(num1, num2));


    }
}
