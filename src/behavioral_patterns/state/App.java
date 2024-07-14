/*
 * Objetivo
 * ------------
 * Criar estados para uma classe, ou seja, dependendo do estado ela age de forma diferente
 * 
 * Tutorial
 * ------------
 * 1. Criar a interface dos estados (VendingMachineState)
 * 2. Criar as implementações dessa interface, implementando o respectivo método (OutOfStockState, PaymentPendingState,
 * ProductSelectedState e ReadyState)
 * 3. Criar a classe que depende desses estados e seus métodos (VendingMachineContext), adicionando método para trocar o estado
 * da classe
 * 
 */

package behavioral_patterns.state;

public class App {
    public static void main(String[] args) {
        // Create context
        VendingMachineContext vendingMachine = new VendingMachineContext();

        // Set initial state
        vendingMachine.setState(new ReadyState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new ProductSelectedState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new PaymentPendingState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new OutOfStockState());

        // Request state change
        vendingMachine.request();
    }
}
