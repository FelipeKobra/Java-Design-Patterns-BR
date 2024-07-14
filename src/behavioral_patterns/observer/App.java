/*
 * Objetivo
 * ------------
 * Sempre que um objeto atualizar, outras classes também atualizam
 * 
 * Explicação
 * ------------
 * Basicamente temos:
 * 1. Subject/Publisher - Objeto que, ao ser alterado, notifica os outros objetos de sua alteração
 * 2. Observer/Subscriber - Objeto que é alterado com a alteração do Publisher
 * 
 * Tutorial
 * ------------
 * 1. Criar o Publisher (WeatherStation), que terá:
 *  - Uma lista de Observers
 *  - Métodos de adição/remoção de Observers
 *  - Método de notificar os Observers
 *  - Métodos principais, em que alguns podem notificar os Observers
 * 2. Criar uma interface comum para os Observers (Observer), que possui um método principal que é acionado ao ser notificado
 * 3. Criar implementações concretas da interface Observer, implementando o método da interface
 * 4. Adicionar os Observers no Publisher com o método do Publisher
 * 
 */

package behavioral_patterns.observer;

public class App {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherStation.addObserver(currentConditionsDisplay);
        weatherStation.addObserver(statisticsDisplay);

        weatherStation.setTemperature(25.5f);
        System.out.println("===========================");
        weatherStation.setTemperature(30.0f);
        System.out.println("===========================");

        // Remoção de um Observer
        weatherStation.removeObserver(currentConditionsDisplay);

        weatherStation.setTemperature(28.0f);
    }
}
