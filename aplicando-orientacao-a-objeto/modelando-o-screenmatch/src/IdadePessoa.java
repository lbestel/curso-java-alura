public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificarIdade(int idade) {
        this.idade = idade;
        if (idade <= 17) {
            System.out.println(this.nome + " é MENOR de idade");
        } else {
            System.out.println(this.nome + " é MAIOR de idade");
        }
    }
}
