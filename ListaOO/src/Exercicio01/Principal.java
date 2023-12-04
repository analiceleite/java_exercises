package Exercicio01;

public class Principal {

    public static void main(String[] args) {

        Marca m = new Marca();
        m.nomedaMarca = EntradaSaida.solicitaDadosProduto("Insira o nome da Marca do produto: ");

        Produto p = new Produto();

        p.nomeProduto = EntradaSaida.solicitaDadosProduto("Insira o nome do produto: ");
        p.codigoProduto = EntradaSaida.solicitaDadosProduto("Insira o código do produto: ");
        p.descricaoProduto = EntradaSaida.solicitaDadosProduto("Insira a descrição do produto: ");
        p.tempoGarantia = EntradaSaida.solicitaDadosProduto("Insira o tempo de garantia do produto: ");
        EntradaSaida.mostrarInput(m, p);
    }
    // Mostrar dados inputados

}
