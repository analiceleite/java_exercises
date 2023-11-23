import javax.swing.JOptionPane;
 
public class Exercicio5 {
   
    public static void main(String[] args) {
 
    int quantAtual = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade atual em estoque?"));
 
    int quantMax = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade máxima em estoque"));
 
    int quantMinima = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade mínima em estoque? "));
 
    int quantMedia = ((quantMax + quantMinima) / 2);

    if (quantAtual >= quantMinima ){
        System.out.println(quantMedia);
         JOptionPane.showMessageDialog(null,"Não efetuar compra" ); 
    }

    else
        System.out.println(quantMedia);
        JOptionPane.showMessageDialog(null,"Efetuar compra" );
    }

}
  