/*
 * Objetivo
 * ------------
 * Ter estratégias diferentes para como métodos serão executados
 * 
 * Explicação
 * ------------
 * Enquanto no State a forma de um método ser executado era guardada como propriedade da classe, ou seja, foi feita composição
 * com a estratégia na classe, na Strategy você tem que passar a estratégia como argumento do método, isso facilita caso você
 * não utilize muito esses métodos, porém, caso essa mudança seja constante e tiver muitos métodos que dependam de uma estratégia
 * é melhor utilizar o método State.
 * 
 * Tutorial
 * ------------
 * 1. Criar a classe principal que dependa de diferentes estratégias (Formulario)
 * 2. Criar a interface das estratégias com os métodos necessários pela classe principal (PayStrategy)
 * 3. Criar diferentes implementações dessa interface (PayCreditCard e PayDebitCard)
 * 4. Passar essas implementações como argumentos ao utilizar um método da classe principal
 * 
 */

package behavioral_patterns.strategy;

public class App {
    public static void main(String[] args) {
        Formulario formulario = new Formulario();

        formulario.payProduct(100, new PayDebitCard());

        formulario.payProduct(200, new PayCreditCard());
    }
}
