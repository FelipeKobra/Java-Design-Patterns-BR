package behavioral_patterns.command;

public class Light implements LightsInterface{
    boolean on;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }
}
