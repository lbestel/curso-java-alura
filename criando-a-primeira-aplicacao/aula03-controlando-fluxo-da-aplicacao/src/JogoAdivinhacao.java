import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numSorteado = new Random().nextInt(1,10);
        int palpite = 0;
        int tentativa = 1;

        while (tentativa < 6){
            System.out.print("Digite o " + tentativa + "º palpite entre 1 e 5: ");
            palpite = leitura.nextInt();
            tentativa++;

            if (palpite == numSorteado) {
                System.out.println("Parabéns! Você acertou o número sorteado");
                break;
            } else if (palpite < numSorteado && tentativa < 6) {
                System.out.println("O número sorteado é maior que " + palpite);
            } else if (palpite > numSorteado && tentativa < 6) {
                System.out.println("O número sorteado é menor que " + palpite);
            } else {
                System.out.println("Acabaram os seus palpites, o número sorteado foi " + numSorteado);
            }
        }
    }
}
