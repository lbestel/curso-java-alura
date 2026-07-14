public class Aluno {
    private String nome;
    private int idade;
    private double somaNotas;
    private double totalNotas;

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

    public void avaliarAluno(double nota) {
        somaNotas += nota;
        totalNotas++;
    }

    public double pegarMedia() {
        return somaNotas / totalNotas;
    }

    public void exibeDadosAluno() {
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}
