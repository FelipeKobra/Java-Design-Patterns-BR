package behavioral_patterns.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class FuncionarioIterator implements CustomIterator<Funcionario> {
    private int currentIndex = 0;
    private List<Funcionario> funcionarios;

    public FuncionarioIterator(List<Funcionario> newFuncionarios) {
        this.funcionarios = newFuncionarios;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < funcionarios.size();
    }

    @Override
    public double next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return funcionarios.get(currentIndex++).getSalary();
    }
}
