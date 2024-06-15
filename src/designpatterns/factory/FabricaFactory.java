package designpatterns.factory;

class FabricaFactory {
    static Fabrica createInstance(TipoFabricaEnum TipoDeFabrica) {
        switch (TipoDeFabrica) {
            case TipoFabricaEnum.ALIMENTICIA:
                FabricaDeChocolate fabricaDeChocolate = new FabricaDeChocolate();
                fabricaDeChocolate.setTipo(TipoFabricaEnum.ALIMENTICIA);
                return fabricaDeChocolate;

            case TipoFabricaEnum.AUTOMOBILISTICA:
                FabricaDePecas fabricaDePecas = new FabricaDePecas();
                fabricaDePecas.setTipo(TipoFabricaEnum.AUTOMOBILISTICA);
                return fabricaDePecas;

            default:
                throw new IllegalArgumentException("Escolha um tipo de fábrica válido");
        }

    }
}
