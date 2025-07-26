package src.br.com.dio.desafio.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = LocalDate.now().plusDays(45);
    private Set<Dev> devsSubscribed = new HashSet<>();;
    private Set<Conteudo> content = new LinkedHashSet<>();

    public Bootcamp(String name, String description, Set<Conteudo> content) {
        this.name = name;
        this.description = description;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsSubscribed() {
        return devsSubscribed;
    }


    public Set<Conteudo> getContent() {
        return content;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(dataInicial, bootcamp.dataInicial)
                && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsSubscribed, bootcamp.devsSubscribed)
                && Objects.equals(content, bootcamp.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dataInicial, dataFinal, devsSubscribed, content);
    }
}
