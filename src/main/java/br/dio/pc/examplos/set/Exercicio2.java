package br.dio.pc.examplos.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {

    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagem = new HashSet<>();

        linguagem.add(new LinguagemFavorita("Python", 1989, "Pycharm"));
        linguagem.add(new LinguagemFavorita("C#", 2000, "Visual Studio"));
        linguagem.add(new LinguagemFavorita("Java", 1991, "NetBeans" ));

        System.out.println("A. Ordem de Inserção");

        linguagem.forEach(System.out::println);

        System.out.println("-->>----------------------<<--");
        System.out.println("B. Ordem Natural (nome)");

        Set<LinguagemFavorita> ordenada = new HashSet<>();
        ordenada.addAll(linguagem);
        ordenada.forEach(System.out::println);

        System.out.println("-->>----------------------<<--");
        System.out.println("C. IDE");

        linguagem.stream()
                .sorted(new ComparaPorIde())
                .forEach(System.out::println);


        System.out.println("-->>----------------------<<--");
        System.out.println("D. Ano de criação e nome");

        linguagem.stream()
                .sorted(new ComparaPorAnoNome())
                .forEach(System.out::println);

        System.out.println("-->>----------------------<<--");
        System.out.println("E. Nome, ano de criacao e IDE");

        linguagem.stream()
                .sorted(new ComparaPorNomeAnoIde())
                .forEach(System.out::println);


    }


}
