package Exercicio04;
 import java.util.ArrayList;
import java.util.List;

public class CRUD{
   


    private List<Tarefa> tarefas = new ArrayList<>();

  
    public Tarefa criarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        return tarefa;
    }

    public Tarefa atualizarTarefa(String id, Tarefa tarefa) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).solicitarId().equals(id)) {
                tarefas.set(i, tarefa);
                return tarefa;
            }
        }
        return null;
    }

    public void removerTarefa(int id) {
        tarefas.removeIf(tarefa -> EntradaSaida.solicitarId().equals(id));
}

}
