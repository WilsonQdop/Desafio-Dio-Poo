package src.br.com.dio.desafio.domain;

public class Curso extends Conteudo {

    private int timeStamp;

    public Curso(String title, String description, int timeStamp) {
        super(title, description);

        this.timeStamp = timeStamp;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * getTimeStamp();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                " data=" + timeStamp +
                '}';
    }

}
