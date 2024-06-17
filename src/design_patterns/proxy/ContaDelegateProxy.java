package design_patterns.proxy;

import java.math.BigDecimal;

public class ContaDelegateProxy {
    private ContaDelegate conta;

    ContaDelegateProxy(BigDecimal dinheiroInicial) {
        ContaDelegate conta = ContaDelegate.criarConta(dinheiroInicial);
        this.conta = conta;
    }

    public BigDecimal getDinheiroEmConta() {
        return conta.getDinheiroEmConta();
    }

    void sacar(BigDecimal valor) {
        if (validarSaldo(valor)) {
            conta.sacar(valor);
        } else {
            System.out.println("Valor de saque maior do que a quantidade de dinheiro na conta");
        }
    }

    void depositar(BigDecimal valor) {
        conta.depositar(valor);
    }

    private boolean validarSaldo(BigDecimal valor) {
        return (valor.compareTo(conta.getDinheiroEmConta()) <= 0);

    }
}