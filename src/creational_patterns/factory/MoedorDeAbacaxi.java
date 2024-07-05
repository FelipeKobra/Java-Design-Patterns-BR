package creational_patterns.factory;

public class MoedorDeAbacaxi extends MoedorDeFruta {

    @Override
    Fruta criarFruta() {
        Fruta abacaxi = new Abacaxi();
        return abacaxi;
    }

}
