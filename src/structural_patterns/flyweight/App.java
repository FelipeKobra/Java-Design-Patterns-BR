/*
 * Objetivo
 * ------------
 * Criar muitos objetos iguais que realizam a mesma função gastando menos memória RAM em menos tempo
 * 
 * Explicação
 * ------------
 * A ideia do Flyweight é que, quando você precisa gerar muitos objetos iguais e está sempre criando objetos novas instâncias
 * para cada um deles, está demandando força desnecessária de processamento. Então, você vê quais parâmetros das instâncias
 * que normalmente não mudam (Intrísecos) e as colocam em uma nova classe, deixando as que são alteradas com frequência
 * (Extrínsecas) na classe normalmente. Depois, você cria uma Factory que guarda instâncias da classe que possui as
 * propriedades intrínsecas e as pega para utilizar na classe padrão, sendo que, caso a classe não exista, você cria ela
 * e adiciona na Factory, como se fosse uma Factory de Singletons. 
 * 
 * 
 * Tutorial
 * ------------
 * 1. Criar a classe a qual muitas das propriedades se repetem (Block)
 * 2. Verificar quais propriedades se repetem muito e adicioná-las em uma nova classe (BlockType)
 * 3. Adicionar, por composição, uma referência a essa nova classe dentro da classe principal (Block.blockType)
 * 4. Criar uma Factory que guarde instâncias da nova classe (BlockTypeFactory)
 * 5. Criar um método na Factory para sempre pegar as instâncias dos tipos já existentes e, caso não existam, cria-los
 * 6. Sempre que for pegar um tipo utilizar a Factory
 * 
 * 
 */

package structural_patterns.flyweight;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        // ================================================
        // Sem o Flyweight
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            new SlowBlock(randInt(), randInt(), "white", 10f, "Default White");
            new SlowBlock(randInt(), randInt(), "black", 10f, "Default Black");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Padrão: " + (endTime - startTime) + " ms");

        // ================================================
        // Com o Flyweight
        long startTimeFly = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            BlockType type1 = BlockTypeFactory.getBlockType("Big Blue", 20.7f, "blue");
            new Block(type1, randInt(), randInt());

            BlockType type2 = BlockTypeFactory.getBlockType("Small Green", 1.9f, "green");
            new Block(type2, randInt(), randInt());

        }
        long endTimeFly = System.currentTimeMillis();

        System.out.println("Flyweight: " + (endTimeFly - startTimeFly) + " ms");
        // ================================================
    }

    static int randInt() {
        Random rand = new Random();
        return rand.nextInt(10000);
    }
}
