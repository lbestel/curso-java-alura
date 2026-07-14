public class ConversorMoeda implements ConversaoFinanceira {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double converterDolarParaReal() {
        return valor * 5.09;
    }
}
