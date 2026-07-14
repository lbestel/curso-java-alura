public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal(int valor) {
        sacar(valor);
        System.out.println("O saldo atualizado é R$" + getSaldo());
    }

}
