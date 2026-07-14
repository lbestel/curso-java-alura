public class Animal {
    private String cor;
    private String nome;
    private String raca;
    private int idade;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {

    }

    public void exibirDados() {
        System.out.println("O nome do animal é: " + getNome());
        System.out.println("O tipo do animal é: " + getTipo());
        System.out.println("A raça do animal é: " + getRaca());
        System.out.println("A idade do animal é: " + getIdade() + " anos");
        System.out.println("A cor do animal é: " + getCor());
    }
}
