package creational_patterns.factory;

public abstract class MoedorDeFruta {

    void moerFruta() {
        Fruta fruta = criarFruta();
        fruta.serMoida();
    }

    abstract Fruta criarFruta();
}
