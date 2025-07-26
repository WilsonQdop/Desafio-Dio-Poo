package src;

import src.br.com.dio.desafio.domain.Bootcamp;
import src.br.com.dio.desafio.domain.Curso;
import src.br.com.dio.desafio.domain.Dev;
import src.br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDateTime;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Bootcamp bootcamp = new Bootcamp("GFT Java", "Bootcamp em foco em Java, Spring e AWS"
                , Set.of(
                new Curso("Java básico", "Sintaxe", 2),
                new Curso("JavaScript", "Array", 4),
                new Mentoria("Mentoria Inicial", "Falando sobre o bootcamp", LocalDateTime.now())
        )
        );

        Dev dev1 = new Dev("Wilson");
        dev1.subscribedBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev1.getContentSubscribed());
        dev1.progress();
        dev1.progress();
        dev1.progress();
        dev1.progress();
        System.out.println("--------");
        System.out.println("Conteúdos inscritos: " + dev1.getContentSubscribed());
        System.out.println("Conteúdos concluidos: " + dev1.getContentCompleted());
        System.out.println("XP: " + dev1.calculateTotalXP());

        System.out.println("============");

        Dev dev2 = new Dev("Vicente");
        dev2.subscribedBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev2.getContentSubscribed());
        dev2.progress();
        System.out.println("--------");
        System.out.println("Conteúdos inscritos: " + dev2.getContentSubscribed());
        System.out.println("Conteúdos concluidos: " + dev2.getContentCompleted());
        System.out.println("XP: " + dev2.calculateTotalXP());

    }
}
