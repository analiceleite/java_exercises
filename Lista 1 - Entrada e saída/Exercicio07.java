import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Exercicio07 {


public static void main(String[] args) {


DecimalFormat df = new DecimalFormat("#,###.00");

        String nome=JOptionPane.showInputDialog("Nome do vendedor: ");
        String mes=JOptionPane.showInputDialog("Mês correspondente: ");
        int carrosVendidos =Integer.parseInt(JOptionPane.showInputDialog("Qual foi o número de carros vendidos? "));
        double valorTotalVendas = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total das vendas: "));

        double salario = 1500;
        // Comissão por carro vendido.
        double comissao = carrosVendidos * 350;
        double comissaoSobreValorTotal = valorTotalVendas * 0.001;
        double salarioVendedor = salario + comissao + comissaoSobreValorTotal; 

        

        JOptionPane.showMessageDialog(null, " O consultor de vendas "+nome+ " ,no mês de "+mes+ ", vendeu um total de "+carrosVendidos+" carros. " +"\n Totalizando, em dinheiro "+valorTotalVendas+ "." + "\n Recebendo como salário " +salarioVendedor+ "." + " \n Tendo em vista que foi calculado, além do salário fixo, 350 reais de comissão por cada carro vendido e 0.001% sobre o valor da venda de totos os carros.");
    }
}

