/*
 * 
 * Objetivo
 * ------------
 * Quando você precisa criar objetos complexos, normalmente com muitos parâmetros, de forma ordenada e seguindo uma ordem.
 * 
 * 
 * Observação
 * ------------
 * Esse método é o Builder padrão do Gof, que possui um Diretor, caso queria ver o sem Diretor deixei uma pasta para isso, mas
 * não recomendo usar sem diretor, é melhor usar o `fluent_builder` se for só pra facilitar a criação de um objeto.
 * 
 * 
 * Explicação
 * ------------
 * Esse padrão é bom caso você precise criar configurações pré-definidas em um objeto que possui sua criação muito complexa
 * que siga os princípios SOLID, já que o "Simple Factory" e o "Prototype Registry" são modificados e não extendidos como manda
 * o Open-Closed Principle.
 * 
 * 
 * Tutorial
 * ------------
 * 1. Criar as classes principais (Guitarra e Violao)
 * 2. Criar a interface Builder (InstrumentoDeCordaBuilder) que possua "Setters" para todas as propriedades das classes
 * principais
 * 3. Criar implementações da interface Builder para cada classe principal (ViolaoBuilder e GuitarraBuilder)
 * 4. Em cada implementação, adicionar os Setters herdados da interface e as propriedades privadas respectivas a cada "Setter"
 * 5. Em cada implementação, adicionar um método que retorne o objeto referente ao Builder, por exemplo, no ViolaoBuilder ele
 * pega todas as propriedades internas e retorna um Violao com essas propriedades.
 * 6. Criar um Diretor (InstrumentoDeCordaDiretor). A função do diretor é justamente criar as pré-definições e a ordem delas,
 * utilizando métodos que recebem um Builder e aplicando suas configurações.
 * 7. Agora é só criar um Diretor, um Builder e aplicar uma pré-configuração nele, depois usar o método do Builder para pegar
 * o objeto em questão com essa configuração que estava no Builder
 * 
 * Então a ideia é basicamente que o Builder tem as mesmas configurações do objeto a que faz referência, e o Diretor define
 * essas configurações no Builder, depois ele só gera um objeto com as mesmas configurações que possui.
 *  
 */

package creational_patterns.builder;

public class App {
    public static void main(String[] args) {
        InstrumentoDeCordaDiretor diretor = new InstrumentoDeCordaDiretor();

        ViolaoBuilder violaoBuilder = new ViolaoBuilder();
        GuitarraBuilder guitarraBuilder = new GuitarraBuilder();

        diretor.buildViolaoComum(violaoBuilder);
        diretor.buildGuitarraPesada(guitarraBuilder);

        Violao violaoComum = violaoBuilder.getResult();
        Guitarra guitarraPesada = guitarraBuilder.getResult();

        System.out.println(violaoComum);
        System.out.println(guitarraPesada);
    }
}
