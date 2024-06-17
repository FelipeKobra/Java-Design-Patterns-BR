/*
 * Se você tem muitos parâmetros em uma classe e possivelmente adicionará mais no futuro
 */

package design_patterns.builder;

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
