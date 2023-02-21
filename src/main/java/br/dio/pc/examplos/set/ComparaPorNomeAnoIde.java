package br.dio.pc.examplos.set;

import java.util.Comparator;

public class ComparaPorNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        int ano = Integer.compare(o1.getAnoDeCriacao(),o2.getAnoDeCriacao());
        int ide = o1.getIde().compareToIgnoreCase(o2.getIde());
        if (nome != 0) return nome;
        if (ano != 0) return ano;
        return ide;
    }
}
