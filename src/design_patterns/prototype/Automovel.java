package design_patterns.prototype;

abstract class Automovel {
    int quantidadeRodas;
    int quantidadeGalao;
    boolean aceitaAlcool;
    String cor;

    Automovel() {
    }

    Automovel(Automovel automovel) {
        this.quantidadeGalao = automovel.quantidadeGalao;
        this.quantidadeRodas = automovel.quantidadeRodas;
        this.aceitaAlcool = automovel.aceitaAlcool;
    }

    protected abstract Automovel clone();
}
