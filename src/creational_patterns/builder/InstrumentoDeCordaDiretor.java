package creational_patterns.builder;

public class InstrumentoDeCordaDiretor {

    public void buildViolaoComum(InstrumentoDeCordaBuilder builder) {
        builder.setEletrico(false);
        builder.setMaterial("Madeira");
        builder.setQuantidadeDeCordas(6);
        builder.setTipo("Aço");
    }

    public void buildViolaoEletrico(InstrumentoDeCordaBuilder builder) {
        builder.setEletrico(true);
        builder.setMaterial("Madeira");
        builder.setQuantidadeDeCordas(12);
        builder.setTipo("Aço");
    }

    public void buildGuitarraComum(InstrumentoDeCordaBuilder builder) {
        builder.setEletrico(true);
        builder.setMaterial("Plastico");
        builder.setQuantidadeDeCordas(6);
        builder.setTipo("Aço");
    }

    public void buildGuitarraPesada(InstrumentoDeCordaBuilder builder) {
        builder.setEletrico(true);
        builder.setMaterial("Aço");
        builder.setQuantidadeDeCordas(6);
        builder.setTipo("Aço");
    }
}
