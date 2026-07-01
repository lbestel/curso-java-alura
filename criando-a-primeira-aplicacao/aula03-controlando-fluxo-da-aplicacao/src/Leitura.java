import java.sql.SQLOutput;
import java.util.Scanner;

public class Leitura {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Qual é o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Quantas estrelas você dá para esse filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
