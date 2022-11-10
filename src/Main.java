import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDouglas = new Dev();
        devDouglas.setNome("Douglas");
        devDouglas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Douglas:" + devDouglas.getCounteudosInscritos());

        devDouglas.progredir();
        devDouglas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Douglas:" + devDouglas.getCounteudosInscritos());
        System.out.println("Conteúdos Concluidos Douglas:" + devDouglas.getCounteudosConcluidos());
        System.out.println("XP:" + devDouglas.calcularTotalXp());

        System.out.println("--------");

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe:" + devFelipe.getCounteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe:" + devDouglas.getCounteudosInscritos());
        System.out.println("Conteúdos Concluidos Felipe:" + devDouglas.getCounteudosConcluidos());
        System.out.println("XP:" + devFelipe.calcularTotalXp());
    }
}