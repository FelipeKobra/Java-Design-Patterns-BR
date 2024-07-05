package structural_patterns.bridge;

public class Cachorro extends Animal {

    Cachorro(Brinquedo newBrinquedo) {
        super(newBrinquedo);
    }

    @Override
    void morder() {
        super.morder();
        System.out.println("O cachorro ficou feliz");
    }
}
