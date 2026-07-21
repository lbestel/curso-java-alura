public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, int quantidade, double preco, String dataValidade) {
        super(nome, quantidade, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto Perecível: " + getNome() + " Qtd: " + getQuantidade() + " Preço: " + getPreco() + " Data Validade: " + dataValidade;
    }
}
