package src.br.com.dio.desafio.domain;

public class Curso {
    private String title;
    private String description;
    private int timeStamp;

    public Curso(String title, String description, int timeStamp) {
        this.title = title;
        this.description = description;
        this.timeStamp = timeStamp;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public int getTimeStamp() {
        return timeStamp;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
