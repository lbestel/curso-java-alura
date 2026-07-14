public class Execicios {
    static void main(String[] args) {
        System.out.println("****************************");
        System.out.println("Exercício 1 - Exibir Olá Mundo!");
        System.out.println();
        Pessoa minhaSaudacao = new Pessoa();
        minhaSaudacao.saudacao = "Olá,";
        minhaSaudacao.palavra = "mundo!";

        minhaSaudacao.imprimeOlaMundo();

        System.out.println("****************************");
        System.out.println("Exercício 2 - Calculador do dobro");
        System.out.println();
        Calculadora numero = new Calculadora();
        numero.valor = 2;
        System.out.println("O dobro de " + numero.valor + " é " + numero.retornaDobro());

        System.out.println("****************************");
        System.out.println("Exercício 3 - Exibir Ficha técnica da música");
        System.out.println();
        Musica novaMusica = new Musica();
        novaMusica.titulo = "Numb";
        novaMusica.artista = "Linking Park";
        novaMusica.anoLancamento = 2003;

        novaMusica.avalia(4.5);
        novaMusica.avalia(7);
        novaMusica.avalia(9);
        novaMusica.avalia(10);

        novaMusica.exibeFichaTecnica();
        System.out.println("O numero de avaliações é: " + novaMusica.numAvaliacoes);
        System.out.println("A média das avaliações é: " + novaMusica.pegarMedia());

//        System.out.println("****************************");
//        System.out.println("Exercício 4 - Exibir Ficha técnica do carro");
//        System.out.println();
//        Carro novoCarro = new Carro();
//        novoCarro.modelo = "Fusca";
//        novoCarro.ano = 1970;
//        novoCarro.cor = "Azul";
//
//        novoCarro.exibeFichaTecnica();
//        System.out.println("A idade do carro é de " + novoCarro.retornaIdadeCarro() + " anos.");

        System.out.println("****************************");
        System.out.println("Exercício 5 - Exibir Ficha técnica do Aluno");
        System.out.println();

        Aluno novoAluno = new Aluno();
        novoAluno.setNome("Maria");
        novoAluno.setIdade(12);

        novoAluno.exibeDadosAluno();

        System.out.println("****************************");
        System.out.println("Exercício 6 - Conta Bancária");
        System.out.println();

        ContaBancaria novaConta = new ContaBancaria();
        novaConta.setTitular("Lucas");
        novaConta.setNumeroConta(1234);
        novaConta.setSaldo(345.23);

        System.out.println("O titular da conta é: " + novaConta.getTitular());
        System.out.println("O número da conta é: " + novaConta.getNumeroConta());
        System.out.println("O saldo da conta é: " + novaConta.getSaldo());

        System.out.println("****************************");
        System.out.println("Exercício 7 - Verificador de idade");
        System.out.println();

        IdadePessoa pessoaMenor = new IdadePessoa();
        pessoaMenor.setNome("Enzo");
        pessoaMenor.setIdade(17);

        System.out.println("Nome: " + pessoaMenor.getNome());
        System.out.println("Idade: " + pessoaMenor.getIdade());
        pessoaMenor.verificarIdade(pessoaMenor.getIdade());
        System.out.println();

        IdadePessoa pessoaMaior = new IdadePessoa();
        pessoaMaior.setNome("Sebastião");
        pessoaMaior.setIdade(87);

        System.out.println("Nome: " + pessoaMaior.getNome());
        System.out.println("Idade: " + pessoaMaior.getIdade());
        pessoaMaior.verificarIdade(pessoaMaior.getIdade());

        System.out.println("****************************");
        System.out.println("Exercício 8 - Aplicando desconto em um produto");
        System.out.println();

        Produto novoProduto = new Produto();
        novoProduto.setNome("Celular");
        novoProduto.setPreco(1000);

        novoProduto.exibirFichaProduto();
        System.out.println("O preço final do produto é: " + novoProduto.aplicarDesconto(10));

        System.out.println("****************************");
        System.out.println("Exercício 9 - Avaliação do aluno");
        System.out.println();

        Aluno outroAluno = new Aluno();
        outroAluno.setNome("Mauricio");

        outroAluno.avaliarAluno(7);
        outroAluno.avaliarAluno(8);
        outroAluno.avaliarAluno(9.5);
        outroAluno.avaliarAluno(6);

        System.out.println("Aluno: " + outroAluno.getNome());
        System.out.println("A média do aluno é: " + outroAluno.pegarMedia());

        System.out.println("****************************");
        System.out.println("Exercício 10 - Exibir detalhes do livro");
        System.out.println();

        Livro novoLivro = new Livro();
        novoLivro.setAutor("Jordan Peterson");
        novoLivro.setTitulo("12 Regras para a vida");

        novoLivro.exibirDetalhe();

        System.out.println("****************************");
        System.out.println("Exercício 11 - Exibir detalhes do carro");
        System.out.println();

        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();

        System.out.println("****************************");
        System.out.println("Exercício 12 - Polimorfismo com animais");
        System.out.println();

        Gato gato = new Gato();
        gato.setNome("Bixano");
        gato.setCor("Laranja");
        gato.setRaca("Siames");
        gato.setIdade(5);
        gato.setTipo("Gato");

        gato.exibirDados();
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println();

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Rex");
        cachorro.setCor("Preto");
        cachorro.setRaca("Labrador");
        cachorro.setIdade(3);
        cachorro.setTipo("Cachorro");

        cachorro.exibirDados();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("****************************");
        System.out.println("Exercício 13 - Conta Bancária Herança");
        System.out.println();

        ContaCorrente minhaConta = new ContaCorrente();
        minhaConta.depositar(1000);
        minhaConta.sacar(300);
        minhaConta.cobrarTarifaMensal(5);
        minhaConta.consultarSaldo();

        System.out.println("****************************");
        System.out.println("Exercício 14 - Conversor de moeda (Interface)");
        System.out.println();

        ConversorMoeda dolar = new ConversorMoeda();
        dolar.setValor(15);
        System.out.println("US$" + dolar.getValor() + " convertido para reais fica R$" + dolar.converterDolarParaReal());

        System.out.println("****************************");
        System.out.println("Exercício 15 - Calculadora de Área (Interface)");
        System.out.println();

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.setAltura(15);
        sala.setBase(30);

        System.out.println("A área da sala é " + sala.calcularArea() + " metros");
        System.out.println("O perimetro da sala é " + sala.calcularPerimetro() + " metros");

    }
}
