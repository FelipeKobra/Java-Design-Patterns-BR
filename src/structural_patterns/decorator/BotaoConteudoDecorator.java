package structural_patterns.decorator;

import java.util.Map;

public class BotaoConteudoDecorator extends BotaoDecorator {
    private String conteudo = "Botao";

    public BotaoConteudoDecorator(BotaoInterface botaoEnvolvido, String novoConteudo) {
        super(botaoEnvolvido);
        this.conteudo = novoConteudo;
    }

    @Override
    public Map<String, String> show() {
        Map<String, String> mainConfig = super.show();
        mainConfig.put("conteudo", conteudo);
        return mainConfig;
    }

}
