package Exercicio04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarefa {
    public int id;
    public String descricao;
    public LocalDate prazo;
    public String status;
    public String tipo;

      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String valorFormatado = prazo.format(formatador);
        // System.out.println(valorFormatado);
}
