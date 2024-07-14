package behavioral_patterns.strategy;

public class PayDebitCard implements PayStrategy {

    @Override
    public void pay(int value) {
        System.out.println("Paying " + value + " with debit card");
    }

}
