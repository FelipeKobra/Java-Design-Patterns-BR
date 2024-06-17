/*
 * Se você tem valores pré-definidos para atributos/métodos de uma ou mais classes
 */

package design_patterns.factory;

public class App {

    public static void main(String[] args) {
        Fabrica fabricaDeChocolate = FabricaFactory.createInstance(TipoFabricaEnum.ALIMENTICIA);
        Fabrica fabricaDeChocolateSuporte = FabricaFactory.createInstance(TipoFabricaEnum.ALIMENTICIA_SUPORTE);
        Fabrica fabricaDePecas = FabricaFactory.createInstance(TipoFabricaEnum.AUTOMOBILISTICA);
        Fabrica fabricaDePecasMarketing = FabricaFactory.createInstance(TipoFabricaEnum.AUTOMOBILISTICA_MARKETING);

        System.out.println(fabricaDeChocolate.toString());
        System.out.println(fabricaDeChocolateSuporte.toString());
        System.out.println(fabricaDePecas.toString());
        System.out.println(fabricaDePecasMarketing);
    }
}
