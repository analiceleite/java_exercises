package Exercicio04;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CRUD {

  public ArrayList<Tarefas> listaDeTarefas = new ArrayList<>();

  public void adicionarTarefas(Tarefas Tarefas) {
    this.listaDeTarefas.add(Tarefas);
  }

  public String listarTarefas() {
    String mensagem = "";
    for (Tarefas t : this.listaDeTarefas) {
      mensagem += "\n\nAs informações das tarefas são: \n ";
      mensagem += "\n ID: " +
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
    for (Tarefas t : this.listaDeTarefas) {
      t.status = t.status.toLowerCase();

      if (t.status.equals("aberto")) {
        mensagem += "\nAs informações das tarefas em aberto são: \n ";
        mensagem += "\n ID: " +
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
    for (Tarefas t : this.listaDeTarefas) {
      t.status = t.status.toLowerCase();
      if (t.status.equals("concluído")) {
        mensagem += "\nAs informações das tarefas concluídas são: \n ";
        mensagem += "\n ID: " +
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

  public String alterarStatusTarefa(int id) {
    boolean encontrado = false;

    for (Tarefas t : this.listaDeTarefas) {
      encontrado = true;
      if (t.id == id) {
        t.status = JOptionPane.showInputDialog("Digite o novo status da tarefa: ");
      }
    }
    if (encontrado == true) {
      return ("Status alterado com sucesso! ");
    } else {
      return ("Tarefa não encontrada! ");
    }

  }

  public String deletarTarefa(int id) {

    this.listaDeTarefas.remove(id);
    return "Tarefa removida com sucesso!";
  }

  public String mostrarTiposTarefas() {
    int i = 0;

    String mensagem = "Categoria da tarefa: \n";
    for (Tarefas t : this.listaDeTarefas) {
      if (!mensagem.contains(t.tipo)) {
        i ++;
        mensagem += i + " - " + t.tipo + "\n";
      }
    }
    return mensagem;

}
}
