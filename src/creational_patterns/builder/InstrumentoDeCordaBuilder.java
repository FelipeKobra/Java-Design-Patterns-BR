package creational_patterns.builder;

public interface InstrumentoDeCordaBuilder {
    void setTipo(String tipo);

    void setMaterial(String material);

    void setEletrico(boolean instrumentoEletrico);

    void setQuantidadeDeCordas(int quantidadeDeCordas);
}
