import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Integer num1= Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        Integer sucessor = (num1 + 1);
        Integer antecessor = (num1 - 1);

        JOptionPane.showMessageDialog(null, "O antercessor do número " +num1+ " é o " +antecessor+ "\n E o sucessor é o "+ sucessor );
        
    }
}
