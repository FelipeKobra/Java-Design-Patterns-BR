package structural_patterns.adapter.sem_interface;

import java.util.List;

public class BancoDeDadosAdapter {
    BancoDeDados bancoDeDados;

    BancoDeDadosAdapter(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    void sendApiInfo() {
        List<String> info = bancoDeDados.getInfo();
        int idAdaptado = adaptarId(info.get(0));
        float sizeAdaptado = adaptarSize(info.get(2));

        Api.sendInfo(idAdaptado, sizeAdaptado, info.get(1));
    }

    static private int adaptarId(String id) {
        return Integer.parseInt(id);
    }

    static private float adaptarSize(String size) {
        String sizeSemLetra = size.replaceAll("[^0-9]", "");
        return Float.parseFloat(sizeSemLetra);
    }

}
