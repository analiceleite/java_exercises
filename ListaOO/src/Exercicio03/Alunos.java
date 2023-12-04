package Exercicio03;

import java.util.ArrayList;

public class Alunos {
    public String nomeAluno;
    public int matricula;
    public String cpf;

    public ArrayList<Notas> listaDeNotas = new ArrayList<Notas>();

    public void adicionarNota(Notas Notas) {
        this.listaDeNotas.add(Notas);
    }

    
}