package creational_patterns.builder;

public class GuitarraBuilder implements InstrumentoDeCordaBuilder {

    String material;
    String tipo;
    int quantidadeDeCordas;
    boolean eletrico;

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setEletrico(boolean instrumentoEletrico) {
        this.eletrico = instrumentoEletrico;
    }

    public void setQuantidadeDeCordas(int quantidadeDeCordas) {
        this.quantidadeDeCordas = quantidadeDeCordas;
    }

    public Guitarra getResult() {
        return new Guitarra(material, quantidadeDeCordas, tipo, eletrico);
    }

}
