package designpatterns.factory;

public class App {

    public static void main(String[] args) {
        Fabrica fabricaDeChocolate = FabricaFactory.createInstance(TipoFabricaEnum.ALIMENTICIA);
        Fabrica fabricaDePecas = FabricaFactory.createInstance(TipoFabricaEnum.AUTOMOBILISTICA);

        System.out.println(fabricaDeChocolate.toString());
        System.out.println(fabricaDePecas.toString());
    }
}
