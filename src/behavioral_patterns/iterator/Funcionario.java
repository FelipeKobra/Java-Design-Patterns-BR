package behavioral_patterns.iterator;

public class Funcionario {
    String name;
    private double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
