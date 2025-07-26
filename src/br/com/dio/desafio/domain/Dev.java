package src.br.com.dio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> contentSubscribed = new LinkedHashSet<>();
    private Set<Conteudo> contentCompleted = new LinkedHashSet<>();



    public Dev(String name) {
        this.name = name;
    }

    public void subscribedBootcamp(Bootcamp bootcamp) {
        this.contentSubscribed.addAll(bootcamp.getContent());
        bootcamp.getDevsSubscribed().add(this);
    }
    public void progress() {
        Optional<Conteudo> content = this.contentSubscribed.stream().findFirst();
        if(content.isPresent()) {
            this.contentCompleted.add(content.get());
            this.contentSubscribed.remove(content.get());
        } else {
            System.out.println("Você não está matrículado em nenhum conteúdo do curso");
        }
    }
    public double calculateTotalXP() {
       return this.contentCompleted.stream().findFirst()
                .stream().
                mapToDouble(Conteudo::calcularXP)
                    .sum();
    }

    public String getName() {
        return name;
    }



    public Set<Conteudo> getContentSubscribed() {
        return contentSubscribed;
    }

    public Set<Conteudo> getContentCompleted() {
        return contentCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentSubscribed, dev.contentSubscribed) && Objects.equals(contentCompleted, dev.contentCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentSubscribed, contentCompleted);
    }
}
