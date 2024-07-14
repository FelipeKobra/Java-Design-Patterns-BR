package behavioral_patterns.strategy;

public class PayCreditCard implements PayStrategy{

    @Override
    public void pay(int value) {
        System.out.println("Paying " + value + " with credit card");
    }

}
