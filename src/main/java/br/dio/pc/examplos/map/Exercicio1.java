package br.dio.pc.examplos.map;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Dada a população estimada de alguns estados do NE brasileiro, faça");

        System.out.println("1 - Crie um dicionário e relacione os estados e suas populações");
        Map<String, Integer> populacao = new HashMap<>();
        populacao.put("PE",9616621);
        populacao.put("AL",3351543);
        populacao.put("CE",9187103);
        populacao.put("RN",3534265);

        populacao.entrySet().forEach(e -> System.out.println(e));

        System.out.println("-->>----------------------<<--");
        System.out.println("2 - Substitua a população do estado do RN por 3.534.165");

        populacao.put("RN",3534165);

        populacao.entrySet().forEach(e -> System.out.println(e));

        System.out.println("-->>----------------------<<--");
        System.out.println("3 - Confira se o estado PB está no dicionário, caso não adicione: PB 4.039.277");

        if (!populacao.containsKey("PB")) populacao.put("PB", 4039277);

        populacao.entrySet().forEach(e -> System.out.println(e));

        System.out.println("-->>----------------------<<--");
        System.out.println("4 - Exiba a população PE");

        System.out.println(String.format("A população de %s é %s .", "PE", populacao.get("PE")));

        System.out.println("-->>----------------------<<--");
        System.out.println("5 - Exiba todos os estados e suas populações na ordem que foi informado");

        Map<String, Integer> mapasDeArvore = new TreeMap<>(populacao);
        System.out.println(mapasDeArvore);

        System.out.println("-->>----------------------<<--");
        System.out.println("6 - Exiba os estados e suas populações em ordem alfabética");

        populacao.entrySet().stream()
                .sorted(
                        new Comparator<Map.Entry<String, Integer>>() {
                            @Override
                            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                                return o1.getKey().compareToIgnoreCase(o2.getKey());
                            }
                        }
                ).
                forEach(System.out::println);

        System.out.println("-->>----------------------<<--");
        System.out.println("7 - Exiba o estado com o menor população e sua quantidade");

        populacao.entrySet()
                .stream()
                .filter(e -> {
                    return e.getValue() == Collections.min(populacao.values());
                })
                .forEach(e -> System.out.println(e.getKey()));

        System.out.println("-->>----------------------<<--");
        System.out.println("8 - Exiba o estado com a maior população e sua quantidade");

        populacao.entrySet()
                .stream()
                .filter(e -> {
                    return e.getValue() == Collections.max(populacao.values());
                })
                .forEach(e -> System.out.println(e.getKey()));

        System.out.println("-->>----------------------<<--");
        System.out.println("9 - Exiba a soma da população desses estados");

        Integer somaColecao = populacao.entrySet()
                .stream()
                .collect(Collectors.summingInt(n -> n.getValue()));

        System.out.printf("A soma da população é %s \n",somaColecao);

        System.out.println("-->>----------------------<<--");
        System.out.println("10 - Exiba a média da população deste dicionário de estados");

        Double media = populacao.entrySet()
                .stream()
                .collect(Collectors.averagingInt(n -> n.getValue()));

        System.out.printf("A média é %f \n",media);

        System.out.println("-->>----------------------<<--");
        System.out.println("11 - Exiba os estados com a população menor que 4.000.000");

        populacao.entrySet()
                .stream()
                .filter(e -> {
                    return e.getValue() < 4000000;
                })
                .forEach(e -> System.out.println(e.getKey()));

        System.out.println("-->>----------------------<<--");
        System.out.println("12 - Apague o dicionário de estados");

        populacao.clear();

        System.out.println("-->>----------------------<<--");
        System.out.println("13 - Confira se o dicionário está vazio " + populacao.isEmpty());

    }
}
