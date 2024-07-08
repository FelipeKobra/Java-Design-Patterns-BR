package structural_patterns.decorator;

import java.util.HashMap;
import java.util.Map;

public class Botao implements BotaoInterface {
    private String cor = "Branco";
    private String conteudo = "Botao";
    private Map<String, String> config = new HashMap<>();

    public Botao() {
        config.put("cor", cor);
        config.put("conteudo", conteudo);
    }

    @Override
    public Map<String, String> show() {
        return config;
    }

}
