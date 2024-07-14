package behavioral_patterns.template;

class Mage extends Character {

    @Override
    protected void startTurn() {
        System.out.println("Mage está focando sua energia para o início do turno.");
    }

    @Override
    protected void performAction() {
        System.out.println("Mage está conjurando sua magia.");
    }

}
