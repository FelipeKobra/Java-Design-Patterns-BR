package behavioral_patterns.iterator;

import java.util.List;

public class Empresa implements hasIterator<Funcionario> {
    private List<Funcionario> funcionarios;

    public Empresa(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public CustomIterator<Funcionario> createIterator() {
        return new FuncionarioIterator(funcionarios);
    }

}
