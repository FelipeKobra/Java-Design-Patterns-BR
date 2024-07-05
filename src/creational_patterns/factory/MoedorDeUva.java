package creational_patterns.factory;

public class MoedorDeUva extends MoedorDeFruta {

    @Override
    Fruta criarFruta() {
        Fruta uva = new Uva();
        return uva;
    }

}
