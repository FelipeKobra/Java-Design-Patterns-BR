package behavioral_patterns.strategy;

public class Formulario {

    void payProduct(int value, PayStrategy paymentStrategy) {
        paymentStrategy.pay(value);
    }
}
