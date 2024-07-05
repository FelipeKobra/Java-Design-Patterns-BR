package structural_patterns.proxy;

import java.math.BigDecimal;

public class ContaSubclassProxy extends ContaSubclass {

    ContaSubclassProxy(BigDecimal dinheiroInicial) {
        super(dinheiroInicial);
    }

    @Override
    public BigDecimal getDinheiroEmConta() {
        return super.getDinheiroEmConta();
    }

    @Override
    void sacar(BigDecimal valor) {
        if (validarSaldo(valor)) {
            super.sacar(valor);
        } else {
            System.out.println("Valor de saque maior do que a quantidade de dinheiro na conta");
        }
    }

    @Override
    void depositar(BigDecimal valor) {
        super.depositar(valor);
    }

    private boolean validarSaldo(BigDecimal valor) {
        return (valor.compareTo(super.getDinheiroEmConta()) <= 0);
    }
}
