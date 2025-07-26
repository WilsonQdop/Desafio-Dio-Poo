package src;

import src.br.com.dio.desafio.domain.Curso;
import src.br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso java", "Abstraindo bootcamp", 8);
        Curso curso2 = new Curso("Curso javaScript", "Abstraindo bootcamp", 6);

        Mentoria mentoria1 = new Mentoria("Mentoria de java", "Descrição do bootcamp"
                , LocalDateTime.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
