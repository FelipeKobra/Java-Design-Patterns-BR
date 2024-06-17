/*
 * Esse método é bom para:
 * - Ser possível copiar instâncias ao invés de classes
 * - Ao conseguir copiar as instâncias, pode-se melhorar o desempenho caso alguma propriedade dependa de comunicação externa, como com um Banco de dados, já que você copiará de outra instância, e não precisará comunicar-se com o Banco de dados novamente
 * - Criar uma Factory dinâmica, em que se pode adicionar elementos em outras partes do código, que não seja a Factory
 */

package design_patterns.prototype;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class App {
    public static void main(String[] args) {
        // Carros
        Carro primeiroCarro = new Carro(50, 4, true);
        Carro segundoCarro = new Carro(primeiroCarro);
        Carro terceiroCarro = (Carro) segundoCarro.clone();

        List<Automovel> carros = new LinkedList<Automovel>(Arrays.asList(primeiroCarro, segundoCarro, terceiroCarro));

        Testes.provarIgualdade(carros);
        Testes.provarClone(carros);

        // Motos
        Moto motoVermelha = MotoFactory.getMoto(MotoTiposEnum.VERMELHA);
        Moto motoPreta = MotoFactory.getMoto(MotoTiposEnum.PRETA);
        Moto motoAzul = MotoFactory.getMoto(MotoTiposEnum.AZUL);

        List<Automovel> motos = new LinkedList<Automovel>(Arrays.asList(motoVermelha, motoPreta, motoAzul));

        Testes.provarRegistry(motos);

        Moto motoVermelha2 = (Moto) motoVermelha.clone();
        Moto motoPreta2 = new Moto(motoPreta);
        Moto motoAzul2 = new Moto(motoAzul);

        motos.addAll(Arrays.asList(motoVermelha2, motoPreta2, motoAzul2));

        Testes.provarIgualdade(motos);

    }
}
