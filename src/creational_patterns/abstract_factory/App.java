/*
 * Objetivo
 * ------------
 * Criar itens baseados em alguma divisão de categorias, sem ter uma lógica adicional.
 * 
 * Explicação
 * ------------
 * No Factory Pattern temos uma lógica central e devemos escolher qual das opções das classes que implementam uma interface
 * queremos usar. Nesse caso é bastante diferente, não temos uma lógica adicional, apenas queremos criar itens baseados em
 * alguma categoria. Por exemplo, nesse caso, temos as interfaces (Carro e Moto) e suas implementações dividas por categoria
 * (CarroFord, CarroFerrari, MotoFord e MotoFerrari), porém, se em algum caso quisermos utilizar produtos apenas de uma dessas
 * categorias (Ford ou Ferrari) baseadas em uma condição, esse é o pattern ideal.
 * 
 * Tutorial
 * ------------ 
 * 1. Criar as interfaces básicas (Carro e Moto)
 * 2. Criar as implementações concretas dessas interfaces, baseadas em uma divisão/categoria/marca (CarroFord, CarroFerrari,
 * MotoFord e MotoFerrari)
 * 3. Criar uma interface que servirá de base para a criação desses itens baseados em uma categoria (VeiculosFactory),
 * implementando métodos de criação para cada interface básica criada anteriormente (VeiculosFactory.criarCarro() e
 * VeiculosFactory.criarMoto())
 * 4. Criar implementações concretas dessa interface (FordFactory e FerrariFactory) que implementem os métodos da interface
 * de acordo com sua categoria, por exemplo, a interface VeiculosFactory tem o método criarCarro(), então na sua implementação
 * na FordFactory o criarCarro() criará um CarroFord
 * 5. Utilizar a condição para saber qual Factory utilizar. 
 * 
 */


package creational_patterns.abstract_factory;

public class App {
    static String local = "Italia";
    static VeiculosFactory factory;

    public static void main(String[] args) {

        if (local.equals("Italia")) {
            factory = new FerrariFactory();
        } else {
            factory = new FordFactory();
        }

        factory.criarCarro().dirigir();
        factory.criarMoto().dirigir();
    }
}
