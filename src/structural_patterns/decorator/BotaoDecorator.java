package structural_patterns.decorator;

import java.util.Map;

public abstract class BotaoDecorator implements BotaoInterface {
    private BotaoInterface botaoEnvolvido;

    public BotaoDecorator(BotaoInterface botaoEnvolvido) {
        this.botaoEnvolvido = botaoEnvolvido;
    }

    @Override
    public Map<String, String> show() {

        return botaoEnvolvido.show();
    }

}
