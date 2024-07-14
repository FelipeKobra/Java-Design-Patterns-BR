package behavioral_patterns.state;

class ReadyState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Ready state: Please select a product.");
    }
}
