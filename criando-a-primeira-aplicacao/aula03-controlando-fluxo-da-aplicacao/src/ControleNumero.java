import java.util.Scanner;
/*
Crie um programa que solicite ao usuário digitar um número.
Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
 */
public class ControleNumero {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num = 0;

        System.out.print("Digite um número: ");
        num = leitor.nextInt();
        if (num < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
    }
}
