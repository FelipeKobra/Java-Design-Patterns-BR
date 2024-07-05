/*
 * Objetivo
 * ------------
 * Esse método é bom para:
 * - Ser possível copiar instâncias ao invés de classes
 * - Ao conseguir copiar as instâncias, pode-se melhorar o desempenho caso alguma propriedade dependa de comunicação externa,
 * como com um Banco de dados, já que você copiará de outra instância, e não precisará comunicar-se com o Banco de dados
 * novamente
 * - Criar uma Factory Eager, onde todas as classes são instanciadas e adicionadas em uma estrutura de dados em que se pode
 * clonar essas instâncias depois
 * 
 * Explicação
 * ------------
 * Antes de começar tenho que explicar as duas formas de utilizar o Prototype:
 * 1. Prototype Padrão - É o padrão ao se usar um Prototype, em que você permite uma instância gerar outra instância com
 * as mesmas configurações
 * 
 * 2. Prototype Registry - É uma Factory de Prototypes em que, todas as classes são instanciadas quando o programa inicia
 * e são guardadas em uma estrutura de dados, depois, para pegar uma das instancias, você cria um método para clonar a
 * instância desejada e retorna-la.
 * 
 * Tutorial
 * ------------
 * 
 * #Prototype Padrão
 * 1. Criar uma classe abstrata que possua o método "clone()" (Automovel)
 * 2. Adicionar um construtor que tenha como parâmetro a própria classe abstrata, para poder utilizar o construtor
 * como método de clonagem (Automovel)
 * 3. Nas classes que herdem dessa classe abstrata (Moto e Carro), adicione um construtor que receba como parâmetro uma
 * instância da própria classe, assim como na classe abstrata. Nesse construtor implemente-o chamando o construtor da
 * classe abstrata e adicionando as informações faltantes na nova instância.
 * 4. Implemente o método "clone()", que basicamente chamará o construtor anterior utilizando "this" como parâmetro
 * 
 * #Prototype Registry
 * 1. Criar o Prototype Padrão para a classe que deseja criar um registro (Moto)
 * 2. Criar uma nova classe de registro para a classe desejada (MotoRegistry)
 * 3. Nessa classe de registro crie uma estrutura de dados (HashMap é o ideal) que receba a classe inicial (Moto) como
 * valores internos
 * 4. Crie um bloco static e crie suas instâncias configuradas nele, lembrando de adicionar na estrutura de dados após sua
 * criação
 * 5. Adicionar um método que, para pegar uma dessas instâncias, clona ela e a retorna
 * 6. Opcionalmente você também pode criar um método para adicionar novas instâncias durante a execução do programa
 */

package creational_patterns.prototype;

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
        Moto motoVermelha = (Moto) MotoRegistry.getMoto(MotoTiposEnum.VERMELHA);
        Moto motoPreta = (Moto) MotoRegistry.getMoto(MotoTiposEnum.PRETA);
        Moto motoAzul = (Moto) MotoRegistry.getMoto(MotoTiposEnum.AZUL);
        Moto motoVermelha1 = (Moto) MotoRegistry.getMoto(MotoTiposEnum.VERMELHA);
        System.out.println(motoVermelha);
        System.out.println(motoVermelha1);

        List<Automovel> motos = new LinkedList<Automovel>(Arrays.asList(motoVermelha, motoPreta, motoAzul));

        Testes.provarRegistry(motos);

        Moto motoVermelha2 = (Moto) motoVermelha.clone();
        Moto motoPreta2 = new Moto(motoPreta);
        Moto motoAzul2 = new Moto(motoAzul);

        motos.addAll(Arrays.asList(motoVermelha2, motoPreta2, motoAzul2));

        Testes.provarIgualdade(motos);

    }
}
