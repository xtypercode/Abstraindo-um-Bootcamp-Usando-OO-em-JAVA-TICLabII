import ao.com.desafio.dominio.BootCamp;
import ao.com.desafio.dominio.Conteudo;
import ao.com.desafio.dominio.Curso;
import ao.com.desafio.dominio.Mentoria;
import ao.com.desafio.dominio.Dev;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Curso c1 = new Curso("Aprenda o que são estruturas de dados e algoritmo",
                "Aprenda o que são estruturas de dados de um sistema, qual a importância" +
                        "dela e como trabalhar com o armazenamento dessas informações de forma ágil e otimizada",
                2);
        Mentoria m1 = new Mentoria("Como resolver desafios de código",
                "Esta mentoria está destinada ao esclarecimento de " +
                        "dúvida sobre a plataforma e de como resolver os desafios de código",
                        LocalDate.now());

        Set<Conteudo> conteudos1 = new LinkedHashSet<>();
        conteudos1.add(c1);
        conteudos1.add(m1);

        BootCamp bc1 = new BootCamp("GFT Start #4 JAVA", "...", conteudos1);

        Curso c2 = new Curso("Introdução ao HTML",
                "Aprenda sobre as principais tags HTML",
                2);
        Mentoria m2 = new Mentoria("Entendendo mais sobre responsividade",
                "Esta mentoria está destinada ao esclarecimento de " +
                        "dúvida sobre sites responsivos",
                         LocalDate.now().plusDays(-10));

        Set<Conteudo> conteudos2 = new LinkedHashSet<>();
        conteudos2.add(c2);
        conteudos2.add(m2);

        BootCamp bc2 = new BootCamp("EDUZZ Fullstack Developer #3", "...", conteudos2);

        Dev dev1 = new Dev("Luís Catlos Baptista");
        System.out.println("Dev Luís Carlos Baptista: ");
        dev1.inscreverBootcamp(bc1);
        dev1.inscreverBootcamp(bc2);
        System.out.println("Conteúdos Inscritos: "+dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ dev1.getConteudosConcluidos());
        System.out.println("XP: "+ dev1.calcularXps());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("---(Pós-Progresso)---");
        System.out.println("Conteúdos Inscritos: "+dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ dev1.getConteudosConcluidos());
        System.out.println("XP: "+ dev1.calcularXps());

        System.out.println("\n\n---------");
        Dev dev2 = new Dev("Jonathan Armando");
        System.out.println("Dev Jonathan Armando: ");
        dev2.inscreverBootcamp(bc1);
        System.out.println("Conteúdos Inscritos: "+dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularXps());
        dev2.progredir();
        dev2.progredir();
        System.out.println("---(Pós-Progresso)---");
        System.out.println("Conteúdos Inscritos: "+dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+ dev2.calcularXps());


        System.out.println("\n\n---------");
        Dev dev3 = new Dev("Milicrisney dos Santos");
        System.out.println("Dev Milicrisney dos Santos: ");
        dev3.inscreverBootcamp(bc1);
        System.out.println("Conteúdos Inscritos: "+dev3.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ dev3.getConteudosConcluidos());
        System.out.println("XP: "+ dev3.calcularXps());
        dev3.progredir();
        System.out.println("---(Pós-Progresso)---");
        System.out.println("Conteúdos Inscritos: "+dev3.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ dev3.getConteudosConcluidos());
        System.out.println("XP: "+ dev3.calcularXps());

        System.out.println("\n\n---------");
        Dev dev4 = new Dev("Filipe Crezley");
        System.out.println("Dev Filipe Crezley: ");
        dev4.inscreverBootcamp(bc1);
        System.out.println("Conteúdos Inscritos: "+dev4.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ dev4.getConteudosConcluidos());
        System.out.println("XP: "+ dev4.calcularXps());

        System.out.println("\n\n---------");
        Dev dev5 = new Dev("Fábio Miranda");
        System.out.println("Dev Fábio Miranda: ");
        dev5.inscreverBootcamp(bc2);
        System.out.println("Conteúdos Inscritos: "+dev5.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ dev5.getConteudosConcluidos());
        System.out.println("XP: "+ dev5.calcularXps());
        dev5.progredir();
        dev5.progredir();
        System.out.println("---(Pós-Progresso)---");
        System.out.println("Conteúdos Inscritos: "+dev5.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: "+ dev5.getConteudosConcluidos());
        System.out.println("XP: "+ dev5.calcularXps());
    }
}
