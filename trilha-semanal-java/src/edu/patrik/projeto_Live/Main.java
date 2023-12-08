package edu.patrik.projeto_Live;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import edu.patrik.projeto_Live.dominio.bootcamp;
import edu.patrik.projeto_Live.dominio.conteudoEducacional;
import edu.patrik.projeto_Live.dominio.curso;
import edu.patrik.projeto_Live.dominio.dev;
import edu.patrik.projeto_Live.dominio.mentoria;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        curso cursoJava = new curso();
        cursoJava.setTitulo("Java Básico");
        cursoJava.setDescricao("Aprenda os conceitos básicos sobre Java.");
        cursoJava.setCargaHoraria(8);

        curso cursoDotNet = new curso();
        cursoDotNet.setTitulo("Java .NET");
        cursoDotNet.setDescricao("Aprenda os conceitos básicos sobre C#");
        cursoDotNet.setCargaHoraria(10);

        curso cursoJavaAvancado = new curso();
        cursoJavaAvancado.setTitulo("Java Avançado");
        cursoJavaAvancado.setDescricao("Aprenda os conceitos avançados sobre Java.");
        cursoJavaAvancado.setCargaHoraria(20);

        mentoria mentoria = new mentoria();
        mentoria.setTitulo("Aprendendo Orientação a Objetos com Java");
        mentoria.setDescricao("Imersão sobre os pilares da Orientação a Objetos.");
        mentoria.setData(LocalDateTime.now());
        //Adicionar um dia na data de hoje é plusDays(1) conforme abaixo
        //mentoria.setData(LocalDateTime.now().plusDays(1));

        bootcamp bootcamp = new bootcamp();
        bootcamp.setNome("GFT START #2 JAVA");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(45));
        List<conteudoEducacional> conteudos = Arrays.asList(cursoJava, cursoDotNet, cursoJavaAvancado, mentoria);
        bootcamp.setConteudos(conteudos);

        dev Bressan = new dev();
        Bressan.setNome("Bressan");

        dev Teodoro = new dev();
        Teodoro.setNome("Teodoro");

        Bressan.inscrever(cursoDotNet);
        Bressan.inscrever(bootcamp);
        Bressan.progredir();
        Bressan.progredir();

        Teodoro.inscrever(bootcamp);
        Teodoro.progredir();
        Teodoro.progredir();
        Teodoro.progredir();

        System.out.println(String.format("XP Bressan: %.2f", Bressan.calcularTotalXp()));
        System.out.println(String.format("XP Teodoro: %.2f", Teodoro.calcularTotalXp()));

        List<dev> ranking = Arrays.asList(Bressan, Teodoro).stream()
                            .sorted((dev1, dev2) -> Double.compare(dev1.calcularTotalXp(), dev2.calcularTotalXp()))
                            .collect(Collectors.toList());
        
        for (dev dev : ranking) {
            System.out.println(dev.getNome());
        }
    }
}
