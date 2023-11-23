import javax.swing.JOptionPane;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        String[] disciplinas = new String[4];
        String[] cargaHoraria = new String[4];
        String[] nomeProfessor = new String[4];

        // Preencher os vetores com as informações fornecidas pelo usuário
        for (int i = 0; i < 4; i++) {
            String inputDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina " + (i + 1) + ": ");
            disciplinas[i] = inputDisciplina;

            String inputCargaHoraria = JOptionPane.showInputDialog("Digite a carga horária da disciplina " + disciplinas[i] + ": ");
            cargaHoraria[i] = inputCargaHoraria;

            String inputProfessor = JOptionPane.showInputDialog("Digite o nome do professor da disciplina " + disciplinas[i] + ": ");
            nomeProfessor[i] = inputProfessor;
        }

        // Pesquisa pela disciplina
        String disciplinaPesquisada = JOptionPane.showInputDialog("Digite o nome da disciplina para pesquisar: ");

        boolean disciplinaEncontrada = false;
        for (int i = 0; i < 4; i++) {
            if (disciplinas[i].equalsIgnoreCase(disciplinaPesquisada)) {
                disciplinaEncontrada = true;
                JOptionPane.showMessageDialog(null, 
                        "Disciplina: " + disciplinas[i] + 
                        "\nCarga Horária: " + cargaHoraria[i] + 
                        "\nProfessor: " + nomeProfessor[i]);
                break;
            }
        }

        if (!disciplinaEncontrada) {
            JOptionPane.showMessageDialog(null, "Disciplina não encontrada.");
        }
    }
}
