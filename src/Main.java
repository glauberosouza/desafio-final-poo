import br.com.glauber.desafio.dominio.Bootcamp;
import br.com.glauber.desafio.dominio.Curso;
import br.com.glauber.desafio.dominio.Dev;
import br.com.glauber.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desenvolvimento Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Desenvolvimento JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre o Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Curso Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGlauber = new Dev();
        devGlauber.setNome("Glauber");
        devGlauber.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devGlauber.getConteudosInscritos());
        devGlauber.progedir();
        devGlauber.progedir();
        System.out.println();
        System.out.println("Conteúdos Inscritos: " + devGlauber.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devGlauber.getConteudosConcluidos());
        System.out.println("XP: " + devGlauber.calcularTotalXp());

        System.out.println("------------------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devGabriel.getConteudosInscritos());
        devGabriel.progedir();
        devGabriel.progedir();
        devGabriel.progedir();
        System.out.println();
        System.out.println("Conteúdos Inscritos: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

    }
}