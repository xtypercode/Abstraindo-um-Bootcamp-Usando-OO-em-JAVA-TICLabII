package ao.com.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate dataLancamento;

    public Mentoria() {

    }

    public Mentoria(String titulo, String descricao, LocalDate dataLancamento) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.dataLancamento = dataLancamento;
    }

    @Override
    public double calcularXP() {
        return XP + 20;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "\nMentoria: {\n" +
                "Título: " + getTitulo() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Data: " + dataLancamento + "\n}\n";
    }
}
