/*
 * Objetivo
 * ------------
 * Criar uma interface central que define a ordem e quais eventos serão executados nas subclasses, diferenciando apenas a 
 * implementação desses eventos
 * 
 * Explicação
 * ------------
 * Apesar do objetivo parecer meio complexo, é bem simples. Basicamente você tem uma classe abstrata que servirá como interface,
 * nesse classe você terá um método central que não poderá ser mudado pelas subclasses e será o principal objetivo dessa classe,
 * assim como das subclasses. Na classe abstrata você criará outros métodos que definem como a ação central será executada e em
 * qual ordem, que será seguida pela subclasse e esses métodos podem ter que ser sobrescritos pelas subclasses (abstract) ou 
 * sobrescritos opcionalmente caso você já adicione uma implementação na classe abstrata. Depois disso, basta você criar subclasses
 * que extendam dessa classe e implementem os métodos obrigatórios e opcionais, caso necessários, depois, será executado o método
 * criado na classe abstrata que definiu toda a ordem de execução desses métodos que você implementou
 * 
 * Tutorial
 * ------------
 * 1. Criar a classe abstrata (Character)
 * 2. Criar o método principal dessa classe, definindo ele como `final` (Character.takeTurn())
 * 3. Criar os outros métodos, podendo eles ser de sobrescrição obrigatória (Character.startTurn() e Character.performAction())
 * ou não (Character,endTurn())
 * 4. Adicionar esses métodos com toda a lógica necessária dentro do método principal
 * 5. Criar subclasses que implementem os métodos obrigatórios e os opcionais, caso desejem (Warrior e Mage)
 * 
 * Observação
 * ------------
 * Nesse exemplo não implementei o método endTurn() na classe Mage para mostrar que podem ser criados métodos opcionais
 * 
 */

package behavioral_patterns.template;

public class App {
    public static void main(String[] args) {

        Character warrior = new Warrior();
        Character mage = new Mage();

        System.out.println("Warrior's Turn:");
        warrior.takeTurn();

        System.out.println("\nMage's Turn:");
        mage.takeTurn();
    }
}
