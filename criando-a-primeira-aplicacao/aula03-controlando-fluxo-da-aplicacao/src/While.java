import java.util.Scanner;

public class While {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a usa avaliação ou digite -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            } else {
                System.out.println("Não foram digitadas notas.");
            }
        }

        System.out.println("Média de notas:" + mediaAvaliacao / totalDeNotas);
    }
}
