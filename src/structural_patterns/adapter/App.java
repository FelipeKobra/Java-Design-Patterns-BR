/*
 * Objetivo
 * ------------
 * Adaptar valores/métodos/classes para atuar em outra classe.
 * 
 * Explicação
 * ------------
 * A principal função do Adapter é fazer com que uma classe atue como outra, possuindo os mesmos métodos e muitas vezes até
 * os mesmos parâmetros, para que isso ocorra é utilizada a composição, extendendo da classe objetivo e guardando a classe
 * que precisa ser adaptada, substituindo todos os métodos necessários da classe objetivo e utilizando a classe guardada para
 * atuar como tal. Algumas vezes, também temos a necessidade de simplesmente fazer com que o método de uma classe se adapte
 * para atuar com outra, sem precisar se passar por outra classe, nesse caso utilize a subpasta "sem_interface", pois o Adapter
 * não extenderá nenhuma classe. 
 * 
 * Há dois tipos principais de Adapter
 * - Object Adapter (Recomendado)
 * - Class Adapter
 * 
 * 1. Object Adapter
 * Esse padrão utiliza da composição para mudar um objeto que deve ser adaptado. Então, sempre que criarmos o Adapter, precisamos
 * passar o objeto que será adaptado
 * 
 * 2. Class Adapter
 * Esse padrão cria uma adaptação da classe, ao invés do objeto. Porém, apesar de parecer melhor, muitas vezes precisa de 
 * herança múltipla para ser um Adapter, o que não é possível com Java e, ficar implementando muitas interfaces em uma classe
 * não é uma boa prática, por isso não terá nesse tutorial.
 * 
 * Tutorial
 * ------------
 * 1. Verificar qual a classe a ser adaptada (BancoDeDados) e qual será a classe a se tornar (BancoDeDadosDaApi)
 * 2. Criar um Adapter com o nome da classe a ser adaptada que extende a classe a se tornar/objetivo (BancoDeDadosAdapter)
 * 3. Utilizar a composição para ter o objeto a ser adaptado (BancoDeDadosAdapter.bancoDeDados)
 * 4. Sobrepor os métodos da classe extendida para atuar com a classe a ser adaptada
 */

package structural_patterns.adapter;

public class App {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();
        BancoDeDadosAdapter bancoDeDadosAdapter = new BancoDeDadosAdapter(bancoDeDados);

        Api.sendInfo(bancoDeDadosAdapter);

        //Gerará erro
        //Api.sendInfo(bancoDeDados);
    }
}
