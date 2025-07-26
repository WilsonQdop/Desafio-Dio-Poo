package src.br.com.dio.desafio.domain;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    private LocalDateTime data;

    public Mentoria(String title, String description, LocalDateTime data) {
        super(title, description);
        this.data = data;
    }


    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
             "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                " data=" + data +
                '}';
    }
}
