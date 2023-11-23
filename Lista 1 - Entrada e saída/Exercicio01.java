import javax.swing.JOptionPane;

/**
 * Exercicio01
 */
public class Exercicio01 {
    public static void main(String[] args) {
        
        String nome=JOptionPane.showInputDialog("Informe seu nome: ");
        String sobrenome=JOptionPane.showInputDialog("Informe seu sobrenome: ");
        String dataNascimento=JOptionPane.showInputDialog("Informe sua data de nascimento: ");
        Double pretensaoSalarial= Double.parseDouble(JOptionPane.showInputDialog("Informe sua pretensão salarial: "));
        String grauEnsino=JOptionPane.showInputDialog("Informe seu grau de ensino: ");
        String cargoPretendido=JOptionPane.showInputDialog("Informe o cargo pretendido: ");
        String cnh=JOptionPane.showInputDialog("Você possui CNH tipo B? Digite sim ou não.");



        JOptionPane.showMessageDialog(null, "Cadastro confirmado!"+"\n" +nome +"\n"+sobrenome +"\n"+dataNascimento+"\n"+pretensaoSalarial+"\n"+grauEnsino+"\n"+cargoPretendido+"\n"+cnh);

    }
    
}