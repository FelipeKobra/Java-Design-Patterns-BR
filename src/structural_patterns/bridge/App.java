/*
 * Objetivo
 * ------------
 * Esse pattern serve para quando você tem duas classes que suas respectivas abstrações interagem entre si, e você quer
 * interligar elas de forma concreta. Parece complexo, mas, por exemplo, você sabe que um controle remoto interage com
 * televisões, então uma interface controle remoto interage com a interface televisão, assim como, nesse caso, um cachorro
 * interage com um brinquedo.
 * 
 * Explicação
 * ------------
 * Para que isso funcione precisamos utilizar da composição, sendo que, a classe que "possui" ou "utiliza" a outra,
 * terá ela como propriedade em sua classe, ou seja, fará a composição. No nosso caso, o Animal possui o Brinquedo,
 * então o Brinquedo possui estados e funções próprias e a classe Animal altera esses estados, podendo modificar essa interação.
 * 
 * Tutorial
 * ------------
 * 1. Criar interfaces ou classes abstratas(Recomendado) das abstrações (Brinquedo e Animal) 
 * 2. Criar classes concretas dessas interfaces (Cachorro e BrinquedoBom)
 * 3. Nas classes possuídas(Brinquedo e BrinquedoBom), criar uma classe normal que realiza sua função
 * 4. Nas classes que possuem(Animal e Cachorro) utilizar da composição para ter um objeto possuído próprio, sempre
 * referenciando o tipo da Interface, para poder utilizar qualquer extensão dela
 * 5. Nas classes que possuem(Animal e Cachorro) criar métodos para alterar essa instância privada da classe possuída, agora
 * tendo uma instância própria e podendo utilizar qualquer instancia que herde dessa interface da mesma forma.
 * 6. Agora qualquer Animal poderá interagir com qualquer Brinquedo
 * 
 */

package structural_patterns.bridge;

public class App {

    public static void main(String[] args) {
        Brinquedo brinquedo = new BrinquedoBom();
        Animal cachorro = new Cachorro(brinquedo);

        System.out.println(brinquedo.limpeza);
        cachorro.morder();
        System.out.println(brinquedo.limpeza);
    }
}
