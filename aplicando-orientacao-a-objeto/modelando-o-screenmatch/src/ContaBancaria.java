public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("O saldo atualizado é R$" + getSaldo());
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else if (valor == 0) {
            System.out.println("Valor dn'ao pode ser R$0,00");
        } else {
            saldo -= valor;
            System.out.println("O saldo atualizado é R$" + getSaldo());
        }
    }

    public void consultarSaldo() {
        System.out.println("O saldo é de R$" + getSaldo());
    }
}
