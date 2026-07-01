import java.util.Scanner;

public class Loop {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Quantas estrelas você dá para esse filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de estrelas:" + mediaAvaliacao/3);
    }
}
