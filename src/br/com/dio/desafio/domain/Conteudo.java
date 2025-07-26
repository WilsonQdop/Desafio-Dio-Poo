package src.br.com.dio.desafio.domain;

public abstract class Conteudo {
    private String title;
    private String description;
    protected static final double XP_PADRAO = 10;

    public Conteudo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }

    public abstract double calcularXP();

    @Override
    public String toString() {
        return "Conteudo{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
