import javax.swing.JOptionPane;
 
public class Exercicio4 {
   
    public static void main(String[] args) {
       /**Acho que a resolução desse seria a da 7 */
 
        int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Você gostaria de responder a pergunta 1 ou 2?"));
 
        if (pergunta == 1) {
 
        String respostaUm = JOptionPane.showInputDialog("Quem é o irmão do Jorel? \n 1 - A vovó Juju \n 2 - Ana Catarina \n 3 - O jogador de basquete com cabelo cedoso");
 
 
        switch (respostaUm) {
 
            case "1":
                JOptionPane.showMessageDialog(null, "Errou! E come abacate!");
            break;
 
            case "2":
                JOptionPane.showMessageDialog(null, "Errou! Ana Catarina, que nome feio.");
            break;
 
            case "3":
                JOptionPane.showMessageDialog(null, "Acertou!");
            break;
 
            default:
            respostaUm = "Opção inválida!";
           
        }
 
 
            if (pergunta == 2) {
               
            String respostaDois = JOptionPane.showInputDialog("Quem criou o irmão do Jorel \n 1 - Juliano um Gênio \n 2 - Pedro Alvarez Cabral \n 3 - Napoleão Bonaparte");
 
 
            switch (respostaDois) {
 
                case "1":
                    JOptionPane.showMessageDialog(null, "Arrasou demais! Acertou.");
                break;
 
                case "2":
                    JOptionPane.showMessageDialog(null, "Errou!");
                break;
 
                case "3":
                    JOptionPane.showMessageDialog(null, "Errou!");
                break;
 
                default:
                respostaDois = "Opção inválida!";
               
                }
            }
        }
 
 
    }
}
 