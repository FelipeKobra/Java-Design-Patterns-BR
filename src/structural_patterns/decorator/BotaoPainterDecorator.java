package structural_patterns.decorator;

import java.util.Map;

public class BotaoPainterDecorator extends BotaoDecorator {
    private String cor = "Branco";

    public BotaoPainterDecorator(BotaoInterface botaoEnvolvido, String novaCor) {
        super(botaoEnvolvido);
        this.cor = novaCor;
    }

    @Override
    public Map<String, String> show() {
        Map<String, String> mainConfig = super.show();
        mainConfig.put("cor", cor);
        return mainConfig;
    }

}
