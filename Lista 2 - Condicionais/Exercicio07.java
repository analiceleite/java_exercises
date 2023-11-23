import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main (String[]args){
        int escolha=Integer.parseInt(JOptionPane.showInputDialog("    -- Perguntinhas sobre volei --\n Deseja reponder a 1º ou 2º pergunta?"));
        String questao1 ="";
        switch (escolha) {
            case 1:
               questao1=(JOptionPane.showInputDialog("Qual foi o ano em que a seleção feminina de volei ganhou a última medalha olímpica? \n A)2021\n B)2018\n C)2016")); 
              questao1 = questao1.toLowerCase();
                 switch (questao1) {
                     case "a":
                         JOptionPane.showMessageDialog(null,"Certo!");    
                    break;
                      case "b":
                         JOptionPane.showMessageDialog(null,"Errado!");
                        break;
                     case "c":
                        JOptionPane.showMessageDialog(null,"Errado!");
                        break;
               }
                break;
            case 2:
               String questao2=(JOptionPane.showInputDialog("Qual foi o time campeão da Copa do Brasil de volei feminino em 2023?\n A)Praia Clube\nB)Osasco\nC)Minas Tênis Clube")); 
               questao2 = questao2.toLowerCase();
                    switch (questao2) {
                        case "a":
                            JOptionPane.showMessageDialog(null,"Errado!");    
                            break;
                        case "b":
                            JOptionPane.showMessageDialog(null,"Errado!");
                        case "c":
                            JOptionPane.showMessageDialog(null,"Certo!");
                            break;
                        default:
                            break;
                    }
                break;
            
        }
}
}          