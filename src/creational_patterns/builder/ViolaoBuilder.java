package creational_patterns.builder;

public class ViolaoBuilder implements InstrumentoDeCordaBuilder {

    private String material;
    private String tipo;
    private int quantidadeDeCordas;
    private boolean eletrico;

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

    public Violao getResult() {
        return new Violao(material, quantidadeDeCordas, tipo, eletrico);
    }

}
