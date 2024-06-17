/*
 * Deverá ser utilizado quando não é possível ou não é recomendado alterar a classe, e você necessita adicionar/alterar
 * funções antes de chegar a ela.
 */

package design_patterns.proxy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        /*
         * Esse Design será dividido em duas Partes:
         * 1. Subclass
         * 2. Delegate
         * 
         * #Subclass
         * Subclass foi só um nome bonito que coloquei para dizer que a classe pai do
         * Proxy tem um construtor acessível à ele.
         * Isso faz com que ele consiga atuar como um Proxy padrão em projetos, no qual
         * todas as propriedades alteradas são da
         * classe pai, portanto, sempre que ele vai alterar alguma coisa, será
         * utilizando o `super`. Isso faz com que ele realmente
         * atue como um Proxy, já que nada será alterado dentro de sua Classe, ocorrerão
         * apenas adições/modificações antes de serem
         * enviadas à classe pai.
         * 
         * #Delegate
         * Esse Proxy deve ser utilizado quando a classe pai só consegue ser criada por
         * meio de métodos, como um createClass() estático,
         * e não seria possível utilizar um `super` para alterar a classe pai, já que os
         * construtores da super classe serão privados.
         * Nesse caso, o Proxy não deve extender da classe pai, mas sim, ter ela como
         * uma propriedade privada sua e, ao invés de utilizar `super` utilizar essa
         * propriedade para se comunicar com a classe pai.
         * 
         * OBS: Você não poderá se comunicar com classe pai no Delegate pois todo
         * construtor de uma subclasse invoca o `super()` ou
         * algum construtor da classe pai com parâmetros, como um `super(int valor1, int
         * valor2)`, portanto, se os construtores da
         * classe pai são privados ou não for possível utilizar um construtor em
         * específico para atuar de forma correta na subclasse,
         * é necessário usar esse método de criação de Proxy.
         * 
         * =============================================================================
         * 
         * #Resumindo
         * Quando a classe pai permite que você à crie utilizando um construtor, você
         * utilizará o método padrão(Subclass), pois você
         * conseguirá invocar o `super()` no construtor da classe filha e alterar a
         * classe pai por meio de outras invocações ao `super`.
         * 
         * Quando a classe pai somente pode ser criada por meio de métodos, por exemplo,
         * quando os construtores são privados ou você
         * não consegue invocar o `super()` com os parâmetros corretos na subclasse,
         * deverá utilizar o método Delegate, pois você
         * consegue:
         * 1. Criar a classe pai como uma propriedade privada da classe filha
         * 2. Invocar o método de criação da classe pai, dentro do construtor da classe
         * filha, depois à alocando para a propriedade criada
         * 
         */

        // Subclass
        ContaSubclassProxy contaSubContaSubclassProxy = new ContaSubclassProxy(new BigDecimal(1000));

        contaSubContaSubclassProxy.depositar(new BigDecimal(1000));

        System.out.println(contaSubContaSubclassProxy.getDinheiroEmConta());

        contaSubContaSubclassProxy.sacar(new BigDecimal(3000));
        contaSubContaSubclassProxy.sacar(new BigDecimal(2000));

        System.out.println(contaSubContaSubclassProxy.getDinheiroEmConta());

        // Delegate
        ContaDelegateProxy contaDelegateProxy = new ContaDelegateProxy(new BigDecimal(1000));

        contaDelegateProxy.depositar(new BigDecimal(1000));

        System.out.println(contaDelegateProxy.getDinheiroEmConta());

        contaDelegateProxy.sacar(new BigDecimal(3000));
        contaDelegateProxy.sacar(new BigDecimal(2000));

        System.out.println(contaDelegateProxy.getDinheiroEmConta());

    }
}
