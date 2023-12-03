package Exercicio04;

import java.util.ArrayList;

public class CRUD {

  public static ArrayList<Tarefas> listaDeTarefas = new ArrayList<>();

  public void adicionarTarefas(Tarefas Tarefas) {
    listaDeTarefas.add(Tarefas);
  }

  public static String listarTarefas() {
    String mensagem = "";
    for (Tarefas t : listaDeTarefas) {
      mensagem += "\n\nAs informações das tarefas são: \n ";
      mensagem +=
        "\n ID: " +
        t.id +
        "\n Descrição: " +
        t.descricao +
        "\n Tipo: " +
        t.tipo +
        "\n Prazo: " +
        t.prazo +
        "\n Status: " +
        t.status;
    }
    return mensagem;
  }

  public String mostrarTarefasEmAberto() {
    String mensagem = "";
    for (Tarefas t : listaDeTarefas) {
      if (t.status.equals("Aberto")) {
        mensagem += "\nAs informações das tarefas em aberto são: \n ";
        mensagem +=
          "\n ID: " +
          t.id +
          "\n Descrição: " +
          t.descricao +
          "\n Tipo: " +
          t.tipo +
          "\n Prazo: " +
          t.prazo +
          "\n Status: " +
          t.status;
      }
    }
    return mensagem;
  }

  public String mostrarTarefasEmAndamento() {
    String mensagem = "";
    for (Tarefas t : listaDeTarefas) {
      if (t.status.equals("Em andamento")) {
        mensagem += "\nAs informações das tarefas em andamento são: \n ";
        mensagem +=
          "\n ID: " +
          t.id +
          "\n Descrição: " +
          t.descricao +
          "\n Tipo: " +
          t.tipo +
          "\n Prazo: " +
          t.prazo +
          "\n Status: " +
          t.status;
      }
    }
    return mensagem;
  }

  public String mostrarTarefasConcluidas() {
    String mensagem = "";
    for (Tarefas t : listaDeTarefas) {
      if (t.status.equals("Concluído")) {
        mensagem += "\nAs informações das tarefas concluídas são: \n ";
        mensagem +=
          "\n ID: " +
          t.id +
          "\n Descrição: " +
          t.descricao +
          "\n Tipo: " +
          t.tipo +
          "\n Prazo: " +
          t.prazo +
          "\n Status: " +
          t.status;
      }
    }
    return mensagem;
  }
}
