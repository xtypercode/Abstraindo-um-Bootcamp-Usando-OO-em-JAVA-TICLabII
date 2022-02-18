package ao.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataTermino = dataInicio.plusDays(45);

    private String nome;
    private String descricao;
    private Set<Dev> devs = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public BootCamp(){

    }

    public BootCamp(String nome, String descricao, Set<Conteudo> conteudo){
        this.nome = nome;
        this.descricao = descricao;
        this.conteudos.addAll(conteudo);
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }


    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(dataInicio, bootCamp.dataInicio) && Objects.equals(dataTermino, bootCamp.dataTermino) && Objects.equals(nome, bootCamp.nome) && Objects.equals(devs, bootCamp.devs) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataInicio, dataTermino, nome, devs, conteudos);
    }
}
