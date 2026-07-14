import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    static void main(String[] args) {
        Filme meufilme = new Filme();
        meufilme.setNome("O Poderoso chefão");
        meufilme.setAnoDeLancamento(1976);
        meufilme.setDuracaoEmMinutos(180);
        meufilme.setIncluidoNoPlano(true);

        Filme novoFilme = new Filme();
        novoFilme.setNome("Avatar");
        novoFilme.setAnoDeLancamento(2023);
        novoFilme.setDuracaoEmMinutos(200);
        novoFilme.setIncluidoNoPlano(true);

        meufilme.exibeFichaTecnica();
        meufilme.avalia(8);
        meufilme.avalia(5);
        meufilme.avalia(10);
        System.out.println("Média das avaliações: " + meufilme.pegaMedia());
        System.out.println("Total de avaliações: " + meufilme.getTotalDeAvaliacoes());

        System.out.println("-----------------------------------");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meufilme);
        calculadora.inclui(novoFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meufilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}
