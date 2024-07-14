/*
 * Objetivo
 * ------------
 * Criar uma forma de iterar sobre uma classe
 * 
 * Explicação
 * ------------
 * Essa parte é simples, você tem que criar uma classe principal e um Iterador dela. A classe principal não é de suma importância
 * para o padrão, o que importa mesmo é o Iterador. Nele você tem que adicionar dois métodos importantes, o hasNext() e o next(),
 * para verificar se há um próximo na lista e para pegar o próximo da lista respectivamente. Após isso, você cria a iteração da
 * forma que quiser, podendo iterar sobre sobre propriedades da classe ou até mesmo sobre a própria classe
 * 
 * Tutorial
 * ------------
 * 1. Criar a classe principal (Funcionario)
 * 2. Criar uma interface para o Iterador padrão (CustomIterator)
 * 3. Criar a implementação do Iterador para a classe principal (FuncionarioIterator), nesse caso eu utilizei o salário para
 * iterar sobre, mas você pode retornar o próprio item da lista, mas acho inútil, já que se você loopar sobre uma lista ela já
 * irá retornar cada item dela, então a intenção é justamente ir retornando alguma propriedade de cada item ou ir adicionando
 * alguma lógica.
 * 4. Agora você pode:
 *  - Criar um FuncionarioIterator com uma lista de funcionarios e já iterar sobre ela
 *  - Criar uma classe adicional que segure a lista de funcionarios e crie esse iterador
 * 
 * Depende do caso, nesse eu fiz a segunda opção adicionando a Empresa, que basicamente guarda uma lista de funcionarios e cria
 * um iterador com essa lista, também adicionei uma interface hasIterator para futuro polimorfismo
 * 
 * 
 */

package behavioral_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Alice", 50000));
        funcionarios.add(new Funcionario("Bob", 60000));
        funcionarios.add(new Funcionario("Charlie", 70000));

        Empresa empresa = new Empresa(funcionarios);
        CustomIterator<Funcionario> iterator = empresa.createIterator();

        double totalSalary = 0;
        while (iterator.hasNext()) {
            totalSalary += iterator.next();
        }

        System.out.println("Total salary: " + totalSalary);
    }
}
