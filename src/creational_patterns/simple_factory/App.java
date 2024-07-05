/*
 * Objetivo
 * ------------
 * Ter configurações pré-definidas de instâncias de classes que implementam a mesma interface
 * 
 * Tutorial
 * ------------
 * 1. Criar a interface/classe que será implementada (Fabrica)
 * 2. Criar classes concretas que herdem dessa interface (FabricaDeChocolate e FabricaDePecas)
 * 3. Criar uma Factory da interface principal, que possua um método static para criar as configurações das instâncias
 * 4. Dentro desse método deverá ter um "switch" ou "if/else" em que, cada opção retornará uma configuração diferente, lembrando
 * que o tipo de retorno desse método deverá ser a interface
 * 
 */

package creational_patterns.simple_factory;

public class App {
    static TipoFabricaEnum tipoFabrica = TipoFabricaEnum.ALIMENTICIA;
    static Fabrica fabrica;

    public static void main(String[] args) {
        fabrica = FabricaFactory.createInstance(tipoFabrica);

        System.out.println(fabrica);
    }
}
