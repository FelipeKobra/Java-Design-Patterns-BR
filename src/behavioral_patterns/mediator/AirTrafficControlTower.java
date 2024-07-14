package behavioral_patterns.mediator;

interface AirTrafficControlTower {
    void requestTakeoff(Airplane airplane);

    void requestLanding(Airplane airplane);
}