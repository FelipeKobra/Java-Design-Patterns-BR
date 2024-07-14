package behavioral_patterns.observer;

class CurrentConditionsDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("Current Conditions Display: Temperature =" + temperature);
    }
}
