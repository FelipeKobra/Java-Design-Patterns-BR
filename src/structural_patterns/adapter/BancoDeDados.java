package structural_patterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BancoDeDados {
    List<String> getInfo() {
        return new ArrayList<>(Arrays.asList("19097", "nomeDaInformação", "20MB"));
    }

}
