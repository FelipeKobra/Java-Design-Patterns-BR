/*
 * Objetivo
 * ------------
 * Separar algoritmos dos objetos nos quais eles operam.
 * 
 * Explicação
 * ------------
 * Imagine que você tem várias formas geométricas e cada forma é uma classe. Você até pode adicionar métodos em cada classe para
 * calcular a sua própria área, mas muitas vezes ela não estará realizando o objetivo de sua própria classe, que é simplesmente
 * ser uma forma geométrica, portanto, separaremos o método de calcular área de cada forma em outra classe. Isso é basicamente o
 * Visitor, porém, as formas tem um método que aceitam esse Visitor, para poder ter certeza de que se trata da classe correta.
 * 
 * Essa última observação é baseada no Double Dispatch: https://refactoring.guru/pt-br/design-patterns/visitor-double-dispatch
 * 
 * Tutorial
 * ------------
 * 1. Criar a interface das classes que aceitarão o Visitor para executar sua função (Shape)
 * 2. Criar implementações dessa interface, possuindo o método para aceitar o Visitor (Circle, Square e Triangle)
 * 3. Criar a interface do Visitor (ShapeVisitor), que possui métodos com o mesmo nome, mas assinaturas diferentes para cada
 * tipo de classe que aceitará visitar
 * 4. Criar implementações dessa interface (AreaCalculator)
 * 5. Sempre que quiser realizar a função do Visitor em sua classe, utilizar o método de aceitar o Visitor, passando um Visitor
 * como argumento
 * 
 */

package behavioral_patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("Total area: " + areaCalculator.getTotalArea());
    }
}
