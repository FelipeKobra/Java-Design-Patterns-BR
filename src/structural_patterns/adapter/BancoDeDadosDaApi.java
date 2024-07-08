package structural_patterns.adapter;

public class BancoDeDadosDaApi {
    int id;
    float size;
    String nome;

    void getInfo() {
        this.id = 12;
        this.size = 14.5f;
        this.nome = "NomeAleatorio";
    }

    void sendInfo() {
        System.out.println("Informação enviada com sucesso");
    }
}
