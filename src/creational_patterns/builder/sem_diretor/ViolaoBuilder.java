package creational_patterns.builder.sem_diretor;

public class ViolaoBuilder implements InstrumentoDeCordaBuilder {

    String material;
    String tipo;
    int quantidadeDeCordas;
    boolean eletrico;

    @Override
    public InstrumentoDeCordaBuilder setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public InstrumentoDeCordaBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    @Override
    public InstrumentoDeCordaBuilder setEletrico(boolean instrumentoEletrico) {
        this.eletrico = instrumentoEletrico;
        return this;
    }

    public InstrumentoDeCordaBuilder setQuantidadeDeCordas(int quantidadeDeCordas) {
        this.quantidadeDeCordas = quantidadeDeCordas;
        return this;
    }

    public Violao build() {
        return new Violao(material, quantidadeDeCordas, tipo, eletrico);
    }

}
