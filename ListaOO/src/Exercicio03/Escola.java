package Exercicio03;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Escola {

  public ArrayList<Alunos> listadeAlunos = new ArrayList<Alunos>();

  public void adicionarAlunos(Alunos alunos) {
    this.listadeAlunos.add(alunos);
  }

  public String listarAlunos() {
    String alunos = "Os alunos matriculados são: \n";

    for (Alunos a : this.listadeAlunos) {
      alunos +=
        "\nAluno: " +
        a.nomeAluno +
        "\n" +
        "Matrícula: " +
        a.matricula +
        "\n" +
        "Cpf: \n" + 
        a.cpf;

      for (Notas n : a.listaDeNotas) {
        alunos += "\nDescrição: " + n.descricao + "\nNota:" + n.pontuacao;
      }
    }

    return alunos;
  }

  public String listarNotas(int matricula) {
    boolean alunoEncontrado = false;
    String aluno = "Os dados do aluno são: ";

    for (Alunos a : this.listadeAlunos) {
      if (a.matricula == matricula) {
        alunoEncontrado = true;
        aluno +=
          "\n\nAluno: " +
          a.nomeAluno +
          "\n" +
          "Matrícula: " +
          a.matricula +
          "\n" +
          "Cpf:" +
          a.cpf;
        for (Notas n : a.listaDeNotas) {
          aluno += "\nDescrição: " + n.descricao + "\nNota:" + n.pontuacao;
        }
      }
    }

    if (alunoEncontrado) {
      return aluno;
    } else {
      return "Aluno não encontrado!";
    }
  }

  public void alterarNomeAluno(int matricula) {
    boolean encontrado = false;

    for (Alunos a : this.listadeAlunos) {
      encontrado = true;
      if (a.matricula == matricula) {
        a.nomeAluno =
          JOptionPane.showInputDialog("Digite o novo nome do aluno: ");
        a.nomeAluno = a.nomeAluno.toLowerCase();
      }
    }
    if (encontrado == false) {
      JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
    }
  }

  public void adicionarNotaAluno(int matricula) {
    boolean alunoEncontrado = false;

    for (Alunos a : this.listadeAlunos) {
      if (matricula == a.matricula) {
        alunoEncontrado = true;
        int quantnotas = EntradaSaida.pedirQuantidadeNotas();
        for (int i = 0; i < quantnotas; i++) {
          Notas n = new Notas();
          n.descricao = EntradaSaida.solicitarNotas(" matéria correspondente");
          n.pontuacao = EntradaSaida.solicitarNotas(" nota ");
          // Adicionar objeto nota na lista da classe Notas
          a.adicionarNota(n);
        }
      }
    }
    if (alunoEncontrado == false) {
        JOptionPane.showMessageDialog(null, "Aluno não encontrado no sistema! ");
    }
}


  public double calcularMedia(int matricula) {
    double media = 0;

    for (Alunos a : this.listadeAlunos) {
      if (matricula == a.matricula) {
        for (Notas n : a.listaDeNotas) {
          double aDouble = Double.parseDouble(n.pontuacao);
          media += aDouble;
        }
        media = media / a.listaDeNotas.size();
      }
    }
    return media;
  }
}

