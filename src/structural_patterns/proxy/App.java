/*
 * Objetivo
 * ------------
 * Deverá ser utilizado quando não é possível ou não é recomendado alterar uma classe, e você precisa modificar/adicionar
 * operações nela.
 *
 * 
 * Explicação
 * ------------
 * Esse Design será dividido em duas Partes:
 * 1. Subclass
 * 2. Delegate
 * 
 * OBS: Quando eu escrever "classe pai", estou me referindo à classe que queremos alterar
 * 
 * #Subclass
 * Subclass foi só um nome bonito que coloquei para dizer que a classe pai do Proxy tem um construtor acessível à ele.
 * Isso faz com que ele consiga atuar como um Proxy padrão em projetos, no qual todas as propriedades alteradas são da
 * classe pai, portanto, sempre que ele vai alterar alguma coisa, será utilizando o `super`. Isso faz com que ele realmente
 * atue como um Proxy, já que nada será alterado dentro de sua Classe, ocorrerão apenas adições/modificações antes de serem
 * enviadas à classe pai.
 * 
 * #Delegate
 * Esse Proxy deve ser utilizado quando a classe pai só consegue ser criada por meio de métodos, como um createInstance()
 * estático, e não seria possível utilizar um `super` para alterar a classe pai, já que os construtores da super classe
 * serão privados. Nesse caso, o Proxy não deve extender da classe pai, mas sim, ter ela comouma propriedade privada sua,
 * ou seja, fazer composição e, ao invés de utilizar `super` utilizar essa propriedade para realizar as operações da classe pai.
 * 
 * 
 * Tutorial
 * ------------
 * 
 * #SubClass
 * 1. Verificar se a classe pai tem um contrutor acessível (ContaSubclass)
 * 2. Criar um Proxy que extende a classe a ser alterada (ContaSubclassProxy)
 * 3. Alterar/modificar os métodos no Proxy, porém, sempre que for modificar algo, utilizar o `super` para
 * alterar na classe pai
 * 4. Utilizar a instância do Proxy ao invés da classe original
 * 
 * #Delegate
 * 1. Criar um Proxy que possui uma instância da classe a ser alterada como propriedade, ou seja,
 * fazer composição (ContaDelegateProxy)
 * 2. Alterar/modificar os métodos no Proxy, porém, sempre que for modificar algo, utilizar a composição (instância
 * dentro do Proxy) para modificar a instância da classe a ser alterada
 * 3. Utilizar a instância do Proxy ao invés da classe original
 * 
 */

package structural_patterns.proxy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

        // Subclass
        ContaSubclassProxy contaSubContaSubclassProxy = new ContaSubclassProxy(new BigDecimal(1000));

        contaSubContaSubclassProxy.depositar(new BigDecimal(1000));

        System.out.println(contaSubContaSubclassProxy.getDinheiroEmConta());

        contaSubContaSubclassProxy.sacar(new BigDecimal(3000));
        contaSubContaSubclassProxy.sacar(new BigDecimal(2000));

        System.out.println(contaSubContaSubclassProxy.getDinheiroEmConta());

        //-------------------------------------------

        // Delegate
        ContaDelegateProxy contaDelegateProxy = new ContaDelegateProxy(new BigDecimal(1000));

        contaDelegateProxy.depositar(new BigDecimal(1000));

        System.out.println(contaDelegateProxy.getDinheiroEmConta());

        contaDelegateProxy.sacar(new BigDecimal(3000));
        contaDelegateProxy.sacar(new BigDecimal(2000));

        System.out.println(contaDelegateProxy.getDinheiroEmConta());

    }
}
