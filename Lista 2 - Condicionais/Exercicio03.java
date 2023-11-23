import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main (String[]args){
      Integer golsA = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de gols do time A? "));
      Integer golsB = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de gols do time B? "));
    if (golsA > golsB){
        JOptionPane.showMessageDialog(null, "O time A venceu a partida!");
    }
    else {
        JOptionPane.showMessageDialog(null, "O time B venceu a partida!");
    }
    /**Usar else-if e tratar o empate */
}
}
