/*
 * Objetivo
 * ------------
 * Esse padrão é recomendado quando uma classe tem muitos parâmetro em seu construtor, e que deixar a construção da instância
 * mais fácil e intuitiva
 * 
 * Tutorial
 * ------------
 * 1. Criar a classe base (Pessoa)
 * 2. Dentro da classe base, adicionar uma classe estática (Builder)
 * 3. Crie os mesmos campos da classe base na classe Builder, com acesso `private`
 * 4. Para atributos obrigatórios, coloque-os no construtor do Builder e os declarem como `final`
 * 5. Para cada alteração, retorne o Builder alterado
 * 6. finalize construindo um método `build()` que:
 *  - Pode utilizar o construtor padrão da classe base com as caracteristicas do Builder (Builder.build())
 *  - Utiliza um construtor que recebe um Builder e atribui as características do Builder na nova instância da classe base (Builder.buildStrict())
 * 
 */

package creational_patterns.fluent_builder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.Builder("João")
                .setCpf(981212121)
                .setDataDeNascimento(LocalDate.of(1990, 10, 1))
                .setRaca("pardo").build();

        System.out.println(pessoa.toString());
    }
}
