package design_patterns.proxy;

import java.math.BigDecimal;

class ContaDelegate {
    private BigDecimal dinheiroEmConta;

    private ContaDelegate(BigDecimal dinheiroInicial) {
        this.dinheiroEmConta = dinheiroInicial;
    }

    static ContaDelegate criarConta(BigDecimal dinheiroInicial) {
        ContaDelegate conta = new ContaDelegate(dinheiroInicial);
        return conta;
    }

    public BigDecimal getDinheiroEmConta() {
        return dinheiroEmConta;
    }

    void sacar(BigDecimal valor) {
        dinheiroEmConta = dinheiroEmConta.subtract(valor);
        System.out.println("Saque realizado com sucesso");
    }

    void depositar(BigDecimal valor) {
        dinheiroEmConta = dinheiroEmConta.add(valor);
        System.out.println("Depósito realizado com sucesso");
    }

}
