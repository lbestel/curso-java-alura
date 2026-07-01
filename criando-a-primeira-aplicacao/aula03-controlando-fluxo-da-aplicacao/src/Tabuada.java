/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
 */

import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numEscolhido = 0;

        System.out.print("Digite um número: ");
        numEscolhido = leitor.nextInt();

        System.out.println("------------------------");
        System.out.println("Tabuada do " + numEscolhido);
        System.out.println("------------------------");

        for (int i = 1; i <= 10; i++) {
            int resultado  = numEscolhido * i;
            System.out.println(numEscolhido + " x " + i + " = " + resultado );
        }
    }
}
