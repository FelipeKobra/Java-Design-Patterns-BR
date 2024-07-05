/*
 * Objetivo
 * ------------
 * Esse padrão deve ser utilizado quando você quiser processar/fazer algo com uma interface e quem a implementa, mas depende
 * de alguma condição para você saber qual implementação da interface será processada
 * 
 * Explicação
 * ------------
 * Nesse caso estarei utilizando Frutas por ser uma lógica mais fácil de entender. Os objetos nesse caso serão as Frutas
 * (Uva e Abacaxi) e a lógica será moer essas frutas (MoedorDeUva e Moedor de Abacaxi). Nesse caso, só saberemos em tempo
 * de execução qual fruta iremos moer, portanto, será criado uma classe abstrata para moer qualquer tipo de Fruta(MoedorDeFruta).
 * Essa classe abstrata já possui sua lógica interna principal criada e já depende da criação de uma fruta em sua implementação
 * interna, porém, o método de qual fruta será utilizada é abstrato e dependerá de qual classe filha implementar essa classe
 * para especificar sua própria fruta.
 * 
 * Tutorial
 * ------------
 * 1. Criar a interface dos objetos selecionáveis possíveis (Fruta), ou seja, o moedor só poderá utilizar classes que
 * implementam essa interface, podendo escolher somente frutas. É como uma lista, que você só pode escolher Frutas.
 * 2. Criar objetos concretos a partir dessa interface (Uva e Abacaxi).
 * 3. Criar o Utilizador dos objetos como uma classe abstrata e adicionar sua lógica principal (MoedorDeFruta)
 * 4. Criar um método abstrato para criar um objeto selecionável (MoedorDeFruta.criarFruta())
 * 5. Utilizar esse método de criar objetos dentro da implementação interna da lógica principal do utilizador de objetos
 * 6. Criar classes concretas que herdem desse utilizador, diferenciando apenas a implementação do criador de objetos,
 * para saber qual objeto será criado (MoedordeUva e Moedor de Abacaxi)
 * 7. Usar um dos utilizadores de objetos criados, já que possui a lógica principal herdada e cria um tipo específico de
 * objeto
 * 
 */

package creational_patterns.factory;

public class App {

    public static void main(String[] args) {
        String frutaSelecionada = "uva";
        MoedorDeFruta moedorDeFruta;

        if (frutaSelecionada.equals("uva")) {
            moedorDeFruta = new MoedorDeUva();
        } else {
            moedorDeFruta = new MoedorDeAbacaxi();
        }

        moedorDeFruta.moerFruta();
    }
}
