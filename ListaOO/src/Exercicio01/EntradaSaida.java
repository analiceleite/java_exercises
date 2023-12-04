package Exercicio01;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static String solicitaDadosProduto(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public static void mostrarInput(Marca m, Produto p) {

        String produto = "As especificidades do produto são: " + "\n";

        JOptionPane.showMessageDialog(null, produto + m.nomedaMarca + "\n" + p.nomeProduto + "\n" 
        + p.codigoProduto + "\n" + p.descricaoProduto + "\n" + p.tempoGarantia );
    }
}
