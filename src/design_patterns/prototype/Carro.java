package design_patterns.prototype;

class Carro extends Automovel {
    final int quantidadeRodas = 4;
    int quantidadeAssentos;

    Carro(int quantidadeGalao, int quantidadeAssentos, boolean aceitaAlcool) {
        this.quantidadeGalao = quantidadeGalao;
        this.quantidadeAssentos = quantidadeAssentos;
        this.aceitaAlcool = aceitaAlcool;
    }

    Carro(Carro alvo) {
        super(alvo);
        this.quantidadeAssentos = alvo.quantidadeAssentos;
    }

    @Override
    protected Automovel clone() {
        return new Carro(this);
    }

    @Override
    public String toString() {
        return "[quantidadeRodas=" + quantidadeRodas + ", quantidadeAssentos=" + quantidadeAssentos
                + ", quantidadeGalao=" + quantidadeGalao + ", aceitaAlcool=" + aceitaAlcool + "]";
    }
}
