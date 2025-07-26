package src.br.com.dio.desafio.domain;

import java.time.LocalDateTime;

public class Mentoria {
    private String title;
    private String description;
    private LocalDateTime data;

    public Mentoria(String title, String description, LocalDateTime data) {
        this.title = title;
        this.description = description;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", data=" + data +
                '}';
    }
}
