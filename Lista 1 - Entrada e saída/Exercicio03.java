import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        
        double valorCompra= Double.parseDouble(JOptionPane.showInputDialog("informe o valor de comprado produto: "));

        double valorRepresentante= valorCompra * 0.2;
        double valorImpostos= valorCompra * 0.3;
        double valorVenda= valorCompra + valorRepresentante + valorImpostos;

        JOptionPane.showMessageDialog(null, "O valor de venda dessa mercadoria será de: " +valorVenda+ " sendo que o valor de " +valorRepresentante+ " é destinado ao representante e "+valorImpostos+ " aos impostos.");


    }
}
