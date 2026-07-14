public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está miando!");
    }

    public void arranharMoveis() {
        System.out.println(getNome() + " está arranhando o móvel!");
    }
}
