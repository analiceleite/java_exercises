package Exercicio02;
import java.util.ArrayList;

public class Estoque {
    int proxId;
      public ArrayList<Peca> listaDePecas = new ArrayList<Peca>();
      
      public void adicionarPeca(Peca p) {
          proxId = p.id ++;
          this.listaDePecas.add(p);
    }

      public void excluirPeca(int id) {
        this.listaDePecas.remove(id);
    }
    

    public String listarPecas() {
        String pecas = "";
        int i = 0;
        for (Peca p : this.listaDePecas) {
            i++;
            p.id = i;
            pecas += "\nInformações sobre a "+i+"º peça:\n"+"Id: " + p.id +"\nDescrição: " + p.descricao + "\n" +
                    "Preço: R$" + p.preco + "\n" +
                    "Cor: " + p.cor + "\n" +
                    "Altura: " + p.altura + "cm\n" +
                    "Largura: " + p.largura+ "cm\n";
        }
        return pecas;
    }

     public Peca encontrarPeca(int id) {
        for(Peca p : this.listaDePecas){
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

}