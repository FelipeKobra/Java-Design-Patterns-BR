package structural_patterns.bridge;

public abstract class Brinquedo {
    BrinquedoStatusEnum status = BrinquedoStatusEnum.NORMAL;
    BrinquedoLimpezaEnum limpeza = BrinquedoLimpezaEnum.LIMPO;

    public void foiMordido() {
        status = BrinquedoStatusEnum.ESTRAGADO;
        limpeza = BrinquedoLimpezaEnum.SUJO;
    }

    public void foiConsertado() {
        status = BrinquedoStatusEnum.NORMAL;
    }

    public void foiLimpado() {
        limpeza = BrinquedoLimpezaEnum.LIMPO;
    }

}
