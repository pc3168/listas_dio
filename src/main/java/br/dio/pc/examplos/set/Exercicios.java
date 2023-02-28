package br.dio.pc.examplos.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercicios {



    public static void main(String[] args) {
        //A. Exiba todas as cores uma abaixo da outra
        System.out.println("Crie um conjunto contendo as cores do arco-íris e:");
        System.out.println("A: Exiba todas as cores uma abaixo da outra");
        Set<String> sets = new HashSet();
        sets.add("Vermelho");
        sets.add("Laranja");
        sets.add("Amarelo");
        sets.add("Verde");
        sets.add("Azul");
        sets.add("Anil");
        sets.add("Violeta");
        for (String a : sets) {
            System.out.println(a);
        }
        System.out.println("-->>----------------------<<--");

        sets.forEach(a -> System.out.println(a));


        System.out.println("B. A quantidade de cores que o arco-íris tem");

        System.out.println("-->>----------------------<<--");
        System.out.println("Total de cores "+sets.size());

        System.out.println("-->>----------------------<<--");
        System.out.println("C. Exiba as cores em ordem alfabética");
        sets.stream()
                .sorted()
                .forEach(a -> System.out.println(a));

        System.out.println("-->>----------------------<<--");
        System.out.println("D. Exiba as cores na ordem inversa da que foi informada");
        sets.stream()
                .sorted(Collections.reverseOrder())
                .forEach(a -> System.out.println(a));


        System.out.println("-->>----------------------<<--");
        System.out.println("E. Exiba todas as cores que começam com a letra ”v”");
        sets.stream()
                .filter(e -> e.contains("V"))
                .forEach(a -> System.out.println(a));


        System.out.println("-->>----------------------<<--");
        System.out.println("F. Remova todas as cores que não começam com a letra “v”");
        List<String> novoSet = sets.stream()
                .filter(e -> !e.contains("V"))
                .collect(Collectors.toList());

        novoSet.forEach(System.out::println);

        System.out.println("-->>----------------------<<--");
        System.out.println("G. Limpe o conjunto");
        sets.clear();

        System.out.println("-->>----------------------<<--");
        System.out.println("H. Confira se o conjunto está vazio");

        System.out.println(sets.isEmpty());


    }
}
