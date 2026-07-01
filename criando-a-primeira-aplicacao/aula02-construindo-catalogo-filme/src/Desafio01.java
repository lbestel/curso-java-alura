public class Desafio01 {

    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 8.9;
        double nota2 = 7.4;

        double media = (nota1 + nota2) / 2;
        System.out.println("Exercício 1 - A média entre " + nota1 + " e " + nota2 + " é: " + media);

        /*Declare uma variável do tipo double e uma variável do tipo int.
        Faça o casting da variável double para int e imprima o resultado.
        */
        double num1 = 8.7;
        int num2 = (int) num1;
        System.out.println("Exercício 2 - O valor da variável inteira é: " + num2);

        /*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        Atribua valores a essas variáveis e concatene-as em uma mensagem
        */
        char letra = 'A';
        String palavra;
        palavra = "Cadeira";
        System.out.println("Exercício 3 - A letra é " + letra + " e a palavra é " + palavra);

        /*
        Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
         */
        double precoProduto = 5.50;
        int quantidade = 2;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Exercício 4 - O valor total da compra é: " + valorTotal);

        /*
        Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
         */
        double valorEmDolares = 127.45;
        double taxaCambio = 4.94;
        double valorReais = valorEmDolares * taxaCambio;
        System.out.println("Exercício 5 - A conversão de US$" + valorEmDolares + " para reais é de R$:" + valorReais);

        /*
        Declare uma variável do tipo double precoOriginal.
        Atribua um valor em reais a essa variável, representando o preço original de um produto.
        Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        */
        double precoOriginal = 599.99;
        double percentualDesconto = 10;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        String mensagem = """
                Exercício 6 - Calculando desconto
                Preço Original: R$ %.2f
                Valor do desconto: R$ %.2f
                Novo Preço: R$ %.2f
                """.formatted(precoOriginal, valorDesconto, novoPreco);

        System.out.println(mensagem);
    }
}
