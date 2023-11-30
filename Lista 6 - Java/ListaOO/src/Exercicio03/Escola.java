package Exercicio03;

import java.util.ArrayList;

public class Escola {
    
    public ArrayList<Alunos> listadeAlunos = new ArrayList<Alunos>();

    public void adicionarAlunos(Alunos alunos) {
        this.listadeAlunos.add(alunos);
    }

    public String listarAlunos() {
        String alunos = "Os alunos matriculados são \n";

        for (Alunos a : this.listadeAlunos) {
            alunos += "\nAluno: " + a.nomeAluno + "\n" +
                    "Matrícula: " + a.matrícula + "\n" +
                    "Cpf:" + a.cpf + "\n";
        }

        return alunos;
    }
}
