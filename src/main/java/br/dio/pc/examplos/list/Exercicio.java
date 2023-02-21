package br.dio.pc.examplos.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        List<String> carros = new ArrayList<>();

        carros.add("Fusca");
        carros.add("Uno");
        carros.add("Palio");
        carros.add("Saveiro");
        carros.add("Doblo");

        carros.forEach(System.out::println);
    }
}
