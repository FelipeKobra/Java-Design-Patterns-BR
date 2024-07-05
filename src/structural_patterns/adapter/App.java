/*
 * Objetivo
 * ------------
 * Adaptar valores/métodos/classes para atuar em outra classe.
 * 
 * Explicação
 * ------------
 * Normalmente um adapter extende da classe que ele quer modificar os parâmetros e sobrescreve os métodos para retornar
 * a informação adaptada, porém, nesse caso, o BancoDeDados retorna uma List<String>, sendo que cada valor deveria ter um
 * tipo diferente, como Integer ou Double, então nesse Adapter não consegui sobrescrever o método, pois não tem o mesmo tipo
 * de retorno, então só alterei de "getInfo" para "getInfoAdapted"
 * 
 * Tutorial
 * ------------
 * 1. Verificar quais informações precisam ser adaptadas de uma classe para outra
 * 2. Criar um Adapter com o nome da Classe que terá as informações modificadas + "Adapter" (Boa Prática)
 * 3. Fazer com que o Adapter extenda da classe que ele está alterando os valores
 * 4. Sobrescrever os métodos modificando o necessário para que a informação se adapte à outra classe
 * 5. Utilizar o Adapter
 */

package structural_patterns.adapter;

public class App {
    public static void main(String[] args) {
        BancoDeDadosAdapter bancoDeDados = new BancoDeDadosAdapter();
        BancoDeDadosAdaptedData info = bancoDeDados.getInfoAdapted();

        Api.sendInfo(info.id, info.size, info.nome);
    }
}
