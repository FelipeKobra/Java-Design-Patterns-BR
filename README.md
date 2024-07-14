# Java Design Patterns em Português

## Observações
- Estarei utilizando como base os padrões GoF, portanto, em muitos casos, como no Factory Method, poderá diferenciar do senso comum do que é um padrão em específico, já que muitos acham que o Factory Method do GoF é utilizar um método em uma classe que cria um novo objeto, criar uma Simple Factory e [outros casos](https://refactoring.guru/pt-br/design-patterns/factory-comparison).

- Nesse README estará apenas algumas observações e os objetivos principais de cada padrão, porém, dentro de cada subpasta de `src` há a classe `App`, que explica:
    - O objetivo de cada padrão
    - A explicação, caso necessário, sobre como funciona o padrão de forma mais detalhada
    - Tutorial de como fazer o padrão você mesmo
 
- Como é bem conhecido, esses padrões não são leis que devem sem seguidas de forma rígida e nunca serem alteradas, pelo contrário, é incentivado que se altere dependendo de cada caso, então, em cada explicação que farei, é apenas a base para entender como funciona a lógica central por trás de cada pattern.

# Lista de Conteúdos
#TODO

# Padrões Criacionais

## Factory Method
Padrão feito para quando se tem uma lógica principal em uma classe, porém é necessária a criação de diferente classes dentro dessa lógica/método principal


### Simple Factory
Esse não é um padrão GoF, mas resolvi adicionar para mostrar que existe, já que também é muito confundido com o Factory Method padrão. O objetivo desse pattern é ter uma classe que gera instâncias de outras classes com uma configuração pré-definida, porém, não recomendo utilizá-la, já que fere o Open Closed Principle de forma grave, pois sempre terá que moficar o método de criação quando quiser adicionar uma nova configuração.

Caso seu objetivo seja criar instâncias pré-configuradas, utilize o Builder com Diretor, já que você cria um método para cada configuração, não tendo que modificar métodos já existentes, mas criar novos.


## Abstract Factory
Padrão feito para criar itens baseados em alguma divisão de categorias, sem ter uma lógica adicional, como no Factory Method.


## Builder
Esse padrão pode ser utilizado com ou sem Diretor:
  - Com Diretor: Ele se torna um método para criar objetos com configurações pré-definidas e com a ordem de sua criação também especificada, esse será o padrão utilizado em `builder`
  - Sem Diretor: Ele se torna um método para você criar um objeto passo a passo, sendo mais fácil de instanciar um objeto que tem muitos parâmetros em seu construtor, esse será o padrão utilizado em `fluent_builder`


## Prototype
Padrão feito para `clonar` instâncias, não tendo que copiar cada propriedade de forma verbosa para a nova instância, além de ser utilizada para evitar a uma instanciação pesada ou demorada, pois, ao invés de criar uma nova classe e chamar um método para puxar propriedades de um banco de dados, você pode clonar uma instância já existente que possui essas propriedades


### Prototype Register
Esse padrão possui a mesma função que o Simple Factory, a única diferença é que, ao invés de criar novas instâncias em tempo de execução, você as cria quando o programa inicia e depois só clona delas, mas, ainda assim, não recomendo a menos que muito necessário.


## Singleton
Esse padrão é utilizado quando você deseja somente uma instância de uma classe para todo a aplicação

