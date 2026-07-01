/*
Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
*/

import java.util.Scanner;

public class CalculadoraArea {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int escolha = 0;
        String menu = """
                -------------------------------------
                CALCULADORA DE ÁREA
                -------------------------------------
                Escolha abaixo qual tipo de área
                deseja calcular:
                [1] Área do quadrado
                [2] Área do círculo
                -------------------------------------
                """;
        System.out.print(menu);

        System.out.print("Digite sua escolha: ");
        escolha = leitor.nextInt();

        if (escolha == 1) {
            double lado = 0;
            double areaQuadrado = 0;
            System.out.println("-------------------------------------");
            System.out.print("Quantos centímetros tem o lado do quadrado? ");
            lado = leitor.nextInt();

            areaQuadrado = Math.pow(lado, 2);
            System.out.println("-------------------------------------");
            System.out.println("A área do quadrado é de " + areaQuadrado + " centímetros.");
            System.out.println("-------------------------------------");
        } else if (escolha == 2) {
            double raio = 0;
            double pi = 3.1416;
            double areaCirculo = 0;
            System.out.println("-------------------------------------");
            System.out.print("Quantos centímetros tem o raio do círculo? ");
            raio = leitor.nextInt();

            areaCirculo = Math.PI * Math.pow(raio, 2);
            System.out.println("-------------------------------------");
            System.out.println("A área do círculo é de " + areaCirculo + " centímetros.");
            System.out.println("-------------------------------------");
        } else {
            System.out.println("Opção inválida. Escolha entre as opções 1 e 2.");
        }
    }
}
