/*
 * Objetivo
 * ------------
 * Alterar/Adicionar funcionalidades/propriedades de uma classe em tempo de execução, podendo sobrepor várias funções ao
 * mesmo tempo
 * 
 * Explicação
 * ------------
 * O uso do Decorator é para problemas bem específicos, que necessitam que você adicione funcionalidades a uma classe em tempo
 * de execução. Você pode adicionar novos métodos e propriedades nos Decorators, mas esse não é o foco. O foco é você alterar
 * métodos já existentes na classe principal, e utilizar esses métodos/propriedades adicionais somente para facilitar essas
 * modificações. Portanto, é como se fosse um sistema de upgrades, em que um Botao tem uma função, depois dele ser envolvido
 * por um upgrade ele chama a mesma função, porém ela realizará mais funcionalidades ou será feita de forma diferente.
 * 
 * Tutorial
 * ------------
 * 1. Criar a interface principal (BotaoInterface)
 * 2. Criar a implementação (Botao)
 * 3. Criar a classe abstrata Decorator que implementa a interface principal (BotaoDecorator)
 * 4. Dentro do Decorator fazer uma composição com a interface principal (BotaoDecorator.botaoEnvolvido)
 * 5. Dentro do Decorator sobrescrever os métodos da interface e utilizar da composição para realizá-los (BotaoDecorator.show())
 * 6. Criar implementações do Decorator o extendendo (BotaoPainterDecorator e BotaoConteudoDecorator)
 * 7. Dentro das implementações, ter um construtor no mesmo padrão do Decorator original, podendo adicionar alguns parâmetros
 * mas nunca remover o original
 * 8. Dentro das implementações sobrescrever os métodos para adicionar novas funcionalidades
 * 9. Agora sempre que quiser alterar/adicionar uma funcionalidade é só fazer um wrap na classe com a nova configuração
 * 
 * OBS: Nesse caso eu adicionei parâmetros nos construtores das duas implementações do Decorator (cor e conteúdo), caso
 * contrário não seria possível alterar a configuração em tempo real, mas, o padrão, é não adicionar novos parâmetros,
 * e sim manter o construtor somente recebendo a interface padrão como parâmetro, porém não fere o pattern.
 */

package structural_patterns.decorator;

public class App {
    public static void main(String[] args) {
        Botao botaoSimples = new Botao();
        System.out.println(botaoSimples.show());

        BotaoDecorator botaoCustomizado = new BotaoConteudoDecorator(new BotaoPainterDecorator(new Botao(), "Azul"),
                "Botao Customizado");

        System.out.println(botaoCustomizado.show());
    }
}
