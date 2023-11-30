package Exercicio02;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int escolherOpcaoMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n" +
                "1- Cadastrar peças\n" +
                "2- Remover uma peça\n" +
                "3- Ver todas as peças\n" +
                "4- Sair do sistema"));
    }

     public static String solicitarDescricao(String msg) {
        return JOptionPane.showInputDialog("Informe a " + msg + " da peça:");
    }

    public static double solicitarPreco (String msg){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor "+ msg));
    }

    public static String solicitarCor(String msg) {
        return JOptionPane.showInputDialog("Informe " + msg + " da peça:");
    }

     public static double solicitarAltura (String msg){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe " + msg + " da peça:"));
    }

     public static double solicitarLargura (String msg){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe " + msg + " da peça:"));
    }

    public static void mostrarAlerta(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostrarPecas(String listarPecas) {
        JOptionPane.showMessageDialog(null,listarPecas);
    }

    public static int solicitarId(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog("Informe " + msg +
                " da peça:"));
    }

}