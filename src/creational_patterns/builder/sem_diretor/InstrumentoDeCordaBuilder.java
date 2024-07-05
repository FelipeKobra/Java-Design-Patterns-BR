package creational_patterns.builder.sem_diretor;

public interface InstrumentoDeCordaBuilder {
    InstrumentoDeCordaBuilder setTipo(String tipo);

    InstrumentoDeCordaBuilder setMaterial(String material);

    InstrumentoDeCordaBuilder setEletrico(boolean instrumentoEletrico);

    InstrumentoDeCordaBuilder setQuantidadeDeCordas(int quantidadeDeCordas);

    InstrumentoDeCorda build();
}
