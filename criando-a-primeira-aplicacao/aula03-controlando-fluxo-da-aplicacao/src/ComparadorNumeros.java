import java.util.Scanner;
/*Peça ao usuário para inserir dois números inteiros.
Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior
*/

public class ComparadorNumeros {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int contador = 1;

        while (contador < 2) {
            System.out.print("Digite o " + contador + "º número: ");
            num1 = leitor.nextInt();
            contador++;
            System.out.print("Digite o " + contador + "º número: ");
            num2 = leitor.nextInt();

            if (num1 == num2) {
                System.out.println("Os números digitados são iguais");
            } else if (num1 > num2) {
                System.out.println("O número " + num1 + " é maior que o número " + num2);
            } else {
                System.out.println("O número " + num2 + " é maior que o número " + num1);
            }
        }
    }
}
