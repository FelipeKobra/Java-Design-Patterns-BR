/*
 * Objetivo
 * ------------
 * Caso você deseje apenas uma instância universal para uma classe
 * 
 * Explicação
 * ------------
 * Tem três principais tipos de Singleton:
 * - Eager
 * - Lazy
 * - Enum (Eager mais fácil)
 * 
 * #Eager
 * Eager ou "Ansioso/Apressado" é quando você cria a instância assim que o programa inicia
 * 
 * #Lazy
 * Lazy ou "Preguiçoso" é quando você só cria a instância quando chama ela pela primeira vez
 * 
 * #Enum
 * Enum utiliza, obviamente, Enums e é um método Eager de Singleton, mas é mais simples de criar e com as vantagens de Enums,
 * como ser thread-safe
 * 
 * Tutorial
 * ------------
 * 
 * #Eager
 * 1. Criar uma classe com construtor privado
 * 2. Criar uma instância static final da própria classe como uma propriedade
 * 3. Utilizar essa instância para usar a classe
 * 
 * #Lazy
 * 1. Criar uma classe com construtor privado
 * 2. Criar uma propriedade static em que o tipo é a própria classe, mas o valor inicial é null
 * 3. Criar um método para:
 * - Na primeira vez que o método for chamado:
 *  - Criar uma nova instância da própria classe
 *  - Adicioná-la na propriedade da classe no lugar de null
 *  - retornar a instância
 * - Se ja foi criado alguma vez:
 *  - Apenas retornar a classe
 * 
 * #Enum
 * 1. Criar um Enum com um valor
 * 2. Adicionar as propriedades da classe
 * 3. Utilizar esse valor para utilizar a classe
 * 
 * OBS: Caso você adicione mais valores no Enum, cada valor será sua própria instância da classe
 * 
 */

package creational_patterns.singleton;

public class App {
    public static void main(String[] args) {

        // Primeira Configuração
        DatabaseConnectionEAGER dbEager = DatabaseConnectionEAGER.INSTANCE;
        dbEager.setConnectionString("192.168.0.0");
        dbEager.setPort(4310);
        dbEager.setUser("mysql");

        DatabaseConnectionLAZY dbLazy = DatabaseConnectionLAZY.getInstance();
        dbLazy.setConnectionString("192.168.0.0");
        dbLazy.setPort(4310);
        dbLazy.setUser("mysql");

        DatabaseConnectionENUM dbEnum = DatabaseConnectionENUM.INSTANCE;
        dbEnum.setConnectionString("192.168.0.0");
        dbEnum.setPort(4310);
        dbEnum.setUser("mysql");

        // Segunda configuração
        DatabaseConnectionEAGER dbEager1 = DatabaseConnectionEAGER.INSTANCE;
        dbEager1.setConnectionString("192.168.10.20");
        dbEager1.setPort(210);
        dbEager1.setUser("postgres");

        DatabaseConnectionLAZY dbLazy1 = DatabaseConnectionLAZY.getInstance();
        dbLazy1.setConnectionString("192.168.10.20");
        dbLazy1.setPort(210);
        dbLazy1.setUser("postgres");

        DatabaseConnectionENUM dbEnum1 = DatabaseConnectionENUM.INSTANCE;
        dbEnum1.setConnectionString("192.168.10.20");
        dbEnum1.setPort(210);
        dbEnum1.setUser("postgres");

        // Comprovação
        System.out.println("Singleton EAGER: " + dbEager.toString() + dbEager1.toString());
        System.out.println("Singleton LAZY: " + dbLazy.toString() + dbLazy1.toString());
        System.out.println("Singleton ENUM: " + dbLazy.toString() + dbLazy1.toString());
        System.out.println("Mesma configuração no final ^^^^");

    }
}
