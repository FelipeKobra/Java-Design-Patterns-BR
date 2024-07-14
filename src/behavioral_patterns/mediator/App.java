/*
 * Objetivo
 * ------------
 * Utilizar uma classe central para comunicação entre objetos
 * 
 * Explicação
 * ------------
 * Nesse caso replicaremos um sistema de tráfego aéreo, em que os aviões, perto da pista, normalmente se comunicam com a torre
 * e não com os outros aviões na área, nesse caso a torre fará o papel de Mediator, ou seja, quem está mediando, controlando
 * a situação, uma classe que o principal papel é gerenciar a comunicação entre as outras classes e os aviões fazem o papel
 * de Colleagues, que são as classes que utilizam de um Memento em comum
 * 
 * Tutorial
 * ------------
 * 1. Criar a interface Mediator (AirTrafficControlTower) com todos os métodos centrais necessários
 * 2. Criar a implementação da interface (AirportControlTower), com os respectivos métodos centrais
 * 3. Criar as principais interfaces (Airplane) e suas implementações (CommercialAirplane)
 * 4. Dentro da classe principal (CommercialAirplane) adicionar um Mediator por composição (CommercialAirplane.mediator) e
 * criar métodos que utilizem desse Mediator
 * 5. Agora sempre que precisar de um método que comunique com outro objeto da relação, basta adicionar no Mediator
 * 
 */

package behavioral_patterns.mediator;

public class App {
    public static void main(String[] args) {
        // Instanciando o Mediator (Airport Control Tower)
        AirTrafficControlTower controlTower = new AirportControlTower();

        // Instanciando Colleagues concretos (Commercial Airplanes)
        Airplane airplane1 = new CommercialAirplane(controlTower);
        Airplane airplane2 = new CommercialAirplane(controlTower);

        airplane1.requestTakeoff();
        airplane2.requestLanding();

    }
}
