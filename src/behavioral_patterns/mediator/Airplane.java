package behavioral_patterns.mediator;

interface Airplane {
    void requestTakeoff();

    void requestLanding();

    void notifyAirTrafficControl(String message);
}