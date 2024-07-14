package behavioral_patterns.state;

class ProductSelectedState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Product selected state: Processing payment.");
    }
}
