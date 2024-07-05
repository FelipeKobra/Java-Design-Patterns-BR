package creational_patterns.factory;

public class Uva extends Fruta {

    @Override
    Fruta serMoida() {
        this.estado = "Moida";
        System.out.println("A Uva foi moída");
        return this;

    }

}
