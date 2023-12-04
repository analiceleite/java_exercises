package Exercicio04;

import javax.swing.JOptionPane;

public class Principal {

  public static void main(String[] args) {
    //Construtor para criar a lista de tarefas apenas uma vez
    CRUD c = new CRUD();
    int opcao = 0;
    

    do {
      opcao = EntradaSaida.escolherOpcaoMenu();

      switch (opcao) {
        case 1:
        // Solicitar dados tarefa
        Tarefas t = new Tarefas();
        t.id = Integer.parseInt(EntradaSaida.solicitarInfosTarefas("Insira o ID: "));
        t.descricao = EntradaSaida.solicitarInfosTarefas("Descreva a tarefa: ");
        t.tipo = EntradaSaida.solicitarInfosTarefas("Tipo de tarefa: ");
        t.prazo = EntradaSaida.solicitarInfosTarefas("Insira o prazo para finalização da tarefa: ");
        t.status = EntradaSaida.solicitarInfosTarefas("Status atual: ");
        // Adicionar tarefa criada ao Array 
        c.adicionarTarefas(t);
        break;

        case 2:
        // Visualizar todas as tarefas
        EntradaSaida.mostrarTarefas(c.listarTarefas());
        break;

        case 3:
        // Visualizar tarefas em aberto
        EntradaSaida.mostrarTarefas(c.mostrarTarefasEmAberto());
        break;

        case 4:
        // Visualizar tarefas concluídas
        EntradaSaida.mostrarTarefas(c.mostrarTarefasConcluidas());
        break;

        case 5:
        // Alterar status de alguma tarefa
        int id = EntradaSaida.solicitarId("ID");
        JOptionPane.showMessageDialog(null, c.alterarStatusTarefa(id));
        break;

        case 6:
        // Excluir tarefa
        id = EntradaSaida.solicitarId("ID");
        JOptionPane.showMessageDialog(null, c.deletarTarefa(id));
        break;
        
        case 7:
        // Mostrar todos os tipos de tarefas
        EntradaSaida.mostrarTarefas(c.mostrarTiposTarefas());
        break;
        default:
        System.exit(0);
        break;

      }
    } while (opcao != 0);
  }

}



