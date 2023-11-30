package Exercicio03;

import java.util.ArrayList;

public class Notas {

    public String descricao;
    public String pontuacao;

    public ArrayList<Notas> listaDeNotas = new ArrayList<Notas>();

    public void adicionarNota(Notas Notas) {
        this.listaDeNotas.add(Notas);
    }


}
