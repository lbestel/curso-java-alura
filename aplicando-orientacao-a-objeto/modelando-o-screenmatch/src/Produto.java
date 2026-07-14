public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double aplicarDesconto(int percentualDesconto) {
        double valorDesconto = preco * ((double) percentualDesconto / 100);

        return preco - valorDesconto;
    }

    public void exibirFichaProduto () {
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preço do produto: " + getPreco());
    }
}
