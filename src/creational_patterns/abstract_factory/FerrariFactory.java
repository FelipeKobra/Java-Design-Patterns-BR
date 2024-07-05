package creational_patterns.abstract_factory;

public class FerrariFactory implements VeiculosFactory {

    @Override
    public Carro criarCarro() {
        return new CarroFerrari();
    }

    @Override
    public Moto criarMoto() {
        return new MotoFerrari();
    }

}
