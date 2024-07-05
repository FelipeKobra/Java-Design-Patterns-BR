package structural_patterns.bridge;

public abstract class Animal {
    protected Brinquedo brinquedo;

    Animal(Brinquedo newBrinquedo) {
        this.brinquedo = newBrinquedo;
    }

    void morder() {
        brinquedo.foiMordido();
    }
}
