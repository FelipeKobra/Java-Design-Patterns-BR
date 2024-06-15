package designpatterns.builder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.Builder().setCpf(981212121).setDataDeNascimento(LocalDate.of(1990, 10, 1))
                .setNome("Joao").setRaca("pardo").build();

        System.out.println(pessoa.toString());
    }
}
