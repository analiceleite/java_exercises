import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        Integer horas= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas: "));
        Integer minutos= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de minutos: "));
        //solicitar segundos 
        Integer converteHoras = (horas * 3600);
        Integer converteMinutos = (minutos * 60);
        Integer totalSegundos = converteHoras + converteMinutos;

        JOptionPane.showMessageDialog(null, "Esse horário em segundos corresponde a "+ totalSegundos);
    }
}
