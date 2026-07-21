import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicios {
    static void main(String[] args) {
        System.out.println("Exercício 1 - Criando Array List");
        Pessoa pessoa1 = new Pessoa("Pedro", 34);
        Pessoa pessoa2 = new Pessoa("Carlos", 23);
        Pessoa pessoa3 = new Pessoa("José", 78);

        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        listaPessoa.add(pessoa1);
        listaPessoa.add(pessoa2);
        listaPessoa.add(pessoa3);

        System.out.println("Tamanho da lista de pessoas: " + listaPessoa.size());
        System.out.println("A primeira pessoa da lista é: " + listaPessoa.getFirst());
        System.out.println("Lista de pessoas:");
        for (Pessoa pessoa: listaPessoa) {
            System.out.println(pessoa);
        }

        System.out.println("----------------------------------------");
        System.out.println("Exercício 2 - Trabalhando com Construtor");

        Produto produto1 = new Produto("Detergente", 10, 2.45);
        Produto produto2 = new Produto("Café", 1, 32.99);
        Produto produto3 = new Produto("Bolo", 2, 34.90);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("O tamanho da lista de produtos é: " + listaDeProdutos.size());
        for (Produto produto : listaDeProdutos) {
            System.out.println(produto.toString());
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 1, 8.99, "2026-09-30");
        System.out.println(produtoPerecivel.toString());

        System.out.println("----------------------------------------");
        System.out.println("Exercício 3 - Trabalhando com Listas");

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);
        numeros.add(5);
        numeros.add(3);
        numeros.add(0);

        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
