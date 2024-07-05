package creational_patterns.factory;

public class Abacaxi extends Fruta {

    @Override
    Fruta serMoida() {
        this.estado = "Moida";
        System.out.println("O Abacaxi foi moído");
        return this;
    }

}
