package creational_patterns.prototype;

class Moto extends Automovel {

    final int quantidadeRodas = 2;

    Moto() {
    }

    Moto(Moto alvo) {
        super(alvo);
        this.cor = alvo.cor;
    }

    @Override
    protected Automovel clone() {
        return new Moto(this);
    }

    @Override
    public String toString() {
        return "[quantidadeRodas=" + quantidadeRodas + ", quantidadeGalao=" + quantidadeGalao + ", cor=" + cor
                + ", aceitaAlcool=" + aceitaAlcool + "]";
    }

}