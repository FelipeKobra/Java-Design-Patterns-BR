package structural_patterns.adapter;

import java.util.List;

public class BancoDeDadosAdapter extends BancoDeDados {

    BancoDeDadosAdaptedData getInfoAdapted() {
        List<String> rawInfo = super.getInfo();

        String id = rawInfo.get(0);
        String nome = rawInfo.get(1);
        String size = rawInfo.get(2);

        int idAdaptado = adaptarId(id);
        float sizeAdaptado = adaptarSize(size);

        return new BancoDeDadosAdaptedData(idAdaptado, sizeAdaptado, nome);
    }

    static private int adaptarId(String id) {
        return Integer.parseInt(id);
    }

    static private float adaptarSize(String size) {
        String sizeSemLetra = size.replaceAll("[^0-9]", "");
        return Float.parseFloat(sizeSemLetra);
    }

}
