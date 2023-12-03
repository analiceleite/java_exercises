package Exercicio04;

import java.util.ArrayList;

public class CRUD {

  public static ArrayList<Tarefas> listaDeTarefas = new ArrayList<>();

  public void adicionarTarefas( Tarefas Tarefas) {
    listaDeTarefas.add(Tarefas);
  }

  public static String listarTarefas() {
    String mensagem = "";
    for(Tarefas t : listaDeTarefas){
        mensagem += "\nAs informações da tarefa " + "são: \n ";
        mensagem += "\n ID: "+ t.id + "\n Descrição: "+ t.descricao+ "\n Tipo: "+ t.tipo + "\n Prazo: "+ t.prazo +"\n Status: "+ t.status;
    }
    return mensagem;
  
  }
}