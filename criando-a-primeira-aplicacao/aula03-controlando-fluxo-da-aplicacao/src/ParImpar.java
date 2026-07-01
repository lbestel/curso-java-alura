/*
Crie um programa que solicite ao usuário a entrada de um número inteiro.
Verifique se o número é par ou ímpar e exiba uma mensagem correspondente
 */
import java.util.Scanner;

public class ParImpar {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = 0;
        int restoDivisao = 0;

        System.out.print("Digite um número: ");
        num = leitor.nextInt();
        restoDivisao = num % 2;

        if (restoDivisao == 1) {
            System.out.println("O número " + num + " é impar");
        } else {
            System.out.println("O número " + num + " é par");
        }
    }
}
