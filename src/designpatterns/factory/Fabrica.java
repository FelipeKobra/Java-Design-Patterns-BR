package designpatterns.factory;

class Fabrica {

    String nome;
    String endereco;
    TipoFabricaEnum tipo;

    void setTipo(TipoFabricaEnum tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Fabrica [nome=" + nome + ", endereco=" + endereco + ", tipo=" + tipo + "]";
    }

}
