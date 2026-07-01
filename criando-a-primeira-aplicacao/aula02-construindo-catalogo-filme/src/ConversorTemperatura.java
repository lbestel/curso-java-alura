public class ConversorTemperatura {

    public static void main(String[] args) {
        String inicio;
        inicio = """
                Esse é o conversor de temperatura
                ---------------------------------
                """;

        System.out.println(inicio);

        double celsius = 27.2;

        int fahrenheit = (int) (celsius * 1.8) + 32;

        String conversao;
        conversao = """
                Celsius: %.1f
                Fahrenheit: %d
                ---------------------------------
                """.formatted(celsius, fahrenheit);

        System.out.println(conversao);
    }
}
