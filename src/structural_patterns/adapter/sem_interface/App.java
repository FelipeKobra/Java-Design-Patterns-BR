
package structural_patterns.adapter.sem_interface;

public class App {
    public static void main(String[] args) {
        BancoDeDados bancoDeDados = new BancoDeDados();
        BancoDeDadosAdapter bancoDeDadosAdapter = new BancoDeDadosAdapter(bancoDeDados);

        bancoDeDadosAdapter.sendApiInfo();

    }
}
