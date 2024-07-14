package behavioral_patterns.template;

abstract class Character {

    // Método Principal
    public final void takeTurn() {
        startTurn();
        performAction();
        endTurn();
    }

    // Métodos que tem que ser sobrescritos
    protected abstract void startTurn();

    protected abstract void performAction();

    // Método de sobrescrição opcional
    protected void endTurn() {
        System.out.println("Terminando turno");
    }
}
