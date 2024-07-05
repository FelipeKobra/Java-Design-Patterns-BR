package creational_patterns.simple_factory;

class FabricaFactory {

    private FabricaFactory() {
    };

    static Fabrica createInstance(TipoFabricaEnum TipoDeFabrica) {
        return switch (TipoDeFabrica) {
            case TipoFabricaEnum.ALIMENTICIA -> {
                FabricaDeChocolate fabricaDeChocolate = new FabricaDeChocolate();
                fabricaDeChocolate.setTipo(TipoFabricaEnum.ALIMENTICIA);
                yield fabricaDeChocolate;
            }
            case TipoFabricaEnum.ALIMENTICIA_SUPORTE -> {
                FabricaDeChocolate fabricaDeChocolate = new FabricaDeChocolate();
                fabricaDeChocolate.setTipo(TipoFabricaEnum.ALIMENTICIA_SUPORTE);
                yield fabricaDeChocolate;
            }
            case TipoFabricaEnum.AUTOMOBILISTICA -> {
                FabricaDePecas fabricaDePecas = new FabricaDePecas();
                fabricaDePecas.setTipo(TipoFabricaEnum.AUTOMOBILISTICA);
                yield fabricaDePecas;
            }
            case TipoFabricaEnum.AUTOMOBILISTICA_MARKETING -> {
                FabricaDePecas fabricaDePecas = new FabricaDePecas();
                fabricaDePecas.setTipo(TipoFabricaEnum.AUTOMOBILISTICA_MARKETING);
                yield fabricaDePecas;
            }
            default -> throw new IllegalArgumentException("Escolha um tipo de fábrica válido");
        };

    }
}
