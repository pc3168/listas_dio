package br.dio.pc.examplos.set;

import java.util.Comparator;

public class ComparaPorAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {

        int anoCriacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
