import java.util.Scanner;

public class DesafioContaBancaria {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Lucas Bestel";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("***************************************");
        System.out.println("Nome do CLiente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        String menu = """
                ***************************************
                ** Menu de opções **
                [1] Consultar saldo
                [2] Transferir valor
                [3] Receber valor
                [4] Sair
                
                Digite sua opção: 
                """;

        while (opcao != 4) {
            System.out.print(menu);
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual é o valor que deseja transferir?");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para a transação.");
                } else {
                    saldo -= valor;
                    System.out.println("O saldo atualizado é R$" + saldo);
                }
            } else if ( opcao == 3) {
                System.out.println("Valor recebido R$");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("O saldo atualizado é R$" + saldo);
            } else if (opcao != 4 ){
                System.out.println("Opção inválida.");
            }
        }
    }
}
