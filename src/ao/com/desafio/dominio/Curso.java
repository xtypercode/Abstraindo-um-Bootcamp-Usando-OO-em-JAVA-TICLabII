package ao.com.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {

    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso: {\n" +
                "Título: " + getTitulo() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Carga Horária: " + cargaHoraria + "\n}\n";

    }

}
