/*
 * Objetivo
 * ------------
 * 1. Transformar métodos em classes
 * 2. Esconder implementação entre quem pede e quem executa o comando
 * 3. Quando trocar o nome de um método de uma classe só precisar trocar no comando e não em todas as classes que utilizariam
 * esse método diretamente
 * 4. Poder programar o Undo, já que poderá colocá-los numa pilha, diferente de um método.
 * 5. Poder serizalizar um método
 * 
 * Explicação
 * ------------
 * Esse é um pattern complexo e seu uso não é muito comum. A ideia dele é basicamente:
 * Client -> Invoker (RemoteControl) -> Command (LightOn e LightOff) -> Receiver (Light)
 * 
 * Portanto, o Client utiliza o Invoker que terá um Command e, dependendo do Command escolhido para o Invoker ele realizará
 * uma função diferente no Receiver. Então, basicamente, temos uma classe principal que é o Receiver, nela temos que executar
 * funções, como métodos, porém queremos desacoplar os métodos dessa classe em classes de Command, em que cada uma executa
 * somente uma função, assim como um método normal, mas quem chama esse método principal de um Command, geralmente
 * chamado execute() é o Invoker
 * 
 * Tutorial
 * ------------
 * 1. Criar a interface dos Receivers (LightsInterface)
 * 2. Criar a implementação da Interface (Light)
 * 3. Criar a interface dos Commands (Command)
 * 4. Criar a implementação dos Commands (LightOffCommand e LightOnCommand), que recebem um Receiver como propriedade e
 * executam um comando principal (LightOffCommand.execute())
 * 5. Criar o Invoker (RemoteControl), que recebe um Command como propriedade e executa o método principal do Command
 * (RemoteControl.pressButton())
 * 6. Sempre que for executar comandos nos Receivers utilizar os Commands com um Invoker
 * 
 */

package behavioral_patterns.command;

public class App {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        // Switch on
        control.setCommand(lightsOn);
        control.pressButton();

        // Switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
