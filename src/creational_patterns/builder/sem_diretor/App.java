package creational_patterns.builder.sem_diretor;

public class App {
    public static void main(String[] args) {
        ViolaoBuilder violaoBuilder = new ViolaoBuilder();
        GuitarraBuilder guitarraBuilder = new GuitarraBuilder();

        Violao violaoComum = (Violao) violaoBuilder
                .setEletrico(false)
                .setMaterial("madeira")
                .setQuantidadeDeCordas(6)
                .setTipo("nylon").build();

        Guitarra guitarraComum = (Guitarra) guitarraBuilder
                .setEletrico(true)
                .setMaterial("aço")
                .setQuantidadeDeCordas(6)
                .setTipo("aço").build();

        System.out.println(violaoComum);
        System.out.println(guitarraComum);
    }
}
