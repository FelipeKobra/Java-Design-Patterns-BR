package creational_patterns.abstract_factory;

public class FordFactory implements VeiculosFactory {

    @Override
    public Carro criarCarro() {
        return new CarroFord();
    }

    @Override
    public Moto criarMoto() {
        return new MotoFord();
    }

}
