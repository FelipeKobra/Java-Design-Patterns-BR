package structural_patterns.proxy;

import java.math.BigDecimal;

class ContaSubclass {
    private BigDecimal dinheiroEmConta;

    ContaSubclass(BigDecimal dinheiroInicial) {
        this.dinheiroEmConta = dinheiroInicial;
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
