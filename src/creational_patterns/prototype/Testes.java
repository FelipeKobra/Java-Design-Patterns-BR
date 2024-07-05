package creational_patterns.prototype;

import java.util.List;

public class Testes {

    static void provarIgualdade(List<Automovel> automoveis) {
        System.out.println("\nProvando que são instâncias diferentes:");
        for (int i = 0; i < automoveis.size(); i++) {
            for (int j = i + 1; j < automoveis.size(); j++) {
                System.out.printf("Veículo%d == Veículo%d = " + (automoveis.get(i) == automoveis.get(j)) + "%n", i + 1,
                        j + 1);
            }
        }
    }

    static void provarClone(List<Automovel> automoveis) {
        System.out.println("\nProvando que possuem as mesmas propriedades, ou seja, foram clonados:");
        int i = 0;
        for (Automovel automovel : automoveis) {
            System.out.printf("Veículo%d = " + automovel.toString() + "%n", i);
            i++;
        }
    }

    static void provarRegistry(List<Automovel> automoveis) {
        System.out.println("\nProvando o funcionamento do uso do Prototype Register como método de criação:");
        for (Automovel automovel : automoveis) {
            System.out.printf("Veículo %s = " + automovel.toString() + "%n", automovel.cor);
        }
    }
}
