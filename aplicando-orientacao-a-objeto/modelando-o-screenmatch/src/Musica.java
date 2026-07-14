public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título da Música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double pegarMedia() {
        return avaliacao / numAvaliacoes;
    }
}
