package behavioral_patterns.chain_of_responsibility;

public abstract class Handler {
    private Handler next;

    /*
     * Aceita todos os Handlers da cadeia de responsabilidade e cria um link entre eles
     */
    public static Handler link(Handler first, Handler... chain) {
        Handler head = first;

        for (Handler nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;

        }
        return first;
    }

    /*
     * Fazer a implementação do check e passar para o próximo na cadeia, caso necessário.
     */
    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }

        return next.check(email, password);
    }
}
