package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalListas {
    static void main(String[] args) {
        Filme meufilme = new Filme("O Poderoso chefão", 1976);
        meufilme.setDuracaoEmMinutos(180);
        meufilme.setIncluidoNoPlano(true);

        Filme novoFilme = new Filme("Avatar", 2023);
        novoFilme.setDuracaoEmMinutos(200);
        novoFilme.setIncluidoNoPlano(true);

        meufilme.exibeFichaTecnica();
        meufilme.avalia(9);
        novoFilme.avalia(6);


        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        var filmeDoPaulo = new Filme("Dog Ville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeDoPaulo);
        lista.add(meufilme);
        lista.add(novoFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Lucas");
        buscaPorArtista.add("Jacqueline");
        buscaPorArtista.add("Paulo");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println(buscaPorArtista);

        System.out.println(lista);
        System.out.println("Lista de Titulos Ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
