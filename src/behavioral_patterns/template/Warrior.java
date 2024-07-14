package behavioral_patterns.template;

class Warrior extends Character {

    @Override
    protected void startTurn() {
        System.out.println("Warrior está se preparando.");
    }

    @Override
    protected void performAction() {
        System.out.println("Warrior está atacando com sua espada.");
    }

    @Override
    protected void endTurn() {
        System.out.println("Warrior está descansando após o turno.");
    }
}
