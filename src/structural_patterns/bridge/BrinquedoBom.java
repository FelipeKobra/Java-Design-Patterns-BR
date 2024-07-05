package structural_patterns.bridge;

public class BrinquedoBom extends Brinquedo {
    int quantidadeDeMordidas = 0;

    @Override
    public void foiMordido() {
        quantidadeDeMordidas++;
        limpeza = BrinquedoLimpezaEnum.SUJO;
        if (quantidadeDeMordidas > 3) {
            status = BrinquedoStatusEnum.ESTRAGADO;
        }
    }

}
