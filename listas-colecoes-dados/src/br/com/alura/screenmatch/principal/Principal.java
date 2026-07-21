package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Filme meufilme = new Filme("O Poderoso chefão", 1976);
        meufilme.setDuracaoEmMinutos(180);
        meufilme.setIncluidoNoPlano(true);

        Filme novoFilme = new Filme("Avatar", 2023);
        novoFilme.setDuracaoEmMinutos(200);
        novoFilme.setIncluidoNoPlano(true);

        meufilme.exibeFichaTecnica();
        meufilme.avalia(8);
        meufilme.avalia(5);
        meufilme.avalia(10);

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        var filmeDoPaulo = new Filme("Dog Ville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meufilme);
        listaDeFilmes.add(novoFilme);

        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);




    }
}
