package Exercicio02;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        Estoque e = new Estoque();
        int opcao;

        do {
            opcao = EntradaSaida.escolherOpcaoMenu();

            switch (opcao) {
                case 1:
                    Peca p = new Peca(); // sempre precisamos criar um novo objeto peca
                    p.descricao = EntradaSaida.solicitarDescricao("descrição");
                    p.preco = EntradaSaida.solicitarPreco("da peça:");
                    p.cor = EntradaSaida.solicitarCor("a cor");
                    p.altura = EntradaSaida.solicitarAltura("a altura");
                    p.largura = EntradaSaida.solicitarLargura("a largura");
                  
                    e.adicionarPeca(p);

                    break;

                case 2:
                    int id = EntradaSaida.solicitarId("Id");
                    Peca peca = e.encontrarPeca(id);
                    if (peca != null) {
                     e.excluirPeca(id - 1);
                     JOptionPane.showMessageDialog(null,"A peça com o Id "+id+" foi excluida com sucesso.");
                    } else {
                        EntradaSaida.mostrarAlerta("A de5scrição informada não corresponde a nenhuma peça!");
                    }
                    break;

                case 3:
                    if (e.listaDePecas.isEmpty()) {
                        EntradaSaida.mostrarAlerta("Não existe nenhuma peça em estoque!");
                    } else {
                        EntradaSaida.mostrarPecas(e.listarPecas());
                    }

                    break;

                case 4:
                    System.exit(0);
                    break;

            }
        } while (opcao != 5);

    }
}