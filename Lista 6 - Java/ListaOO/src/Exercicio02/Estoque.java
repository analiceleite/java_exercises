package Exercicio02;
import java.util.ArrayList;

public class Estoque {

      public ArrayList<Peca> listaDePecas = new ArrayList<Peca>();
      int proxId;

       public void adicionarPeca(Peca p) {
            proxId++;
        this.listaDePecas.add(p);
    }

      public void excluirPeca(int id) {
        this.listaDePecas.remove(id);
    }
    

    public String listarPecas() {
        String pecas = "";

        for (Peca p : this.listaDePecas) {
            pecas += "Informações sobre a "+proxId+"º peça:\n"+"Descrição: " + p.descricao + "\n" +
                    "Preço: R$" + p.preco + "\n" +
                    "Cor: " + p.cor + "\n" +
                    "Altura: " + p.altura + "\n" +
                    "Largura: " + p.largura;
        }
        return pecas;
    }

     public Peca encontrarPeca(String descricao) {
        for(Peca p : this.listaDePecas){
            if (p.descricao == descricao) {
                return p;
            }
        }
        return null;
    }
}