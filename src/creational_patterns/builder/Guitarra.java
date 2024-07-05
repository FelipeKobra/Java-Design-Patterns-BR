package creational_patterns.builder;

public class Guitarra {
    String material;
    String tipo;
    int quantidadeDeCordas;
    boolean eletrico;

    public Guitarra(String material, int quantidadeDeCordas, String tipo, boolean eletrico) {
        this.material = material;
        this.quantidadeDeCordas = quantidadeDeCordas;
        this.tipo = tipo;
        this.eletrico = eletrico;
    }

    @Override
    public String toString() {
        return "Guitarra [material=" + material + ", tipo=" + tipo + ", quantidadeDeCordas=" + quantidadeDeCordas
                + ", eletrico=" + eletrico + "]";
    }
}
