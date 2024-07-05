package creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

class MotoRegistry {
    private static Map<MotoTiposEnum, Moto> tipos = new HashMap<>();

    static {
        Moto vermelha = new Moto();
        vermelha.aceitaAlcool = true;
        vermelha.cor = "vermelha";
        vermelha.quantidadeGalao = 10;
        tipos.put(MotoTiposEnum.VERMELHA, vermelha);

        Moto preta = new Moto();
        preta.aceitaAlcool = false;
        preta.cor = "preta";
        preta.quantidadeGalao = 30;
        tipos.put(MotoTiposEnum.PRETA, preta);

        Moto azul = new Moto();
        azul.aceitaAlcool = true;
        azul.cor = "azul";
        azul.quantidadeGalao = 15;
        tipos.put(MotoTiposEnum.AZUL, azul);

    }

    static Automovel getMoto(MotoTiposEnum tipoDeMoto) {
        return tipos.get(tipoDeMoto).clone();
    }

    static Moto setTipoMoto(MotoTiposEnum tipoDeMoto, Moto novaMoto) {
        tipos.put(tipoDeMoto, novaMoto);
        return novaMoto;
    }

}
