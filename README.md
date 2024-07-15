# Java Design Patterns em Português

## Observações
- Estarei utilizando como base os padrões GoF, portanto, em muitos casos, como no Factory Method, poderá diferenciar do senso comum do que é um padrão em específico, já que muitos acham que o Factory Method do GoF é utilizar um método em uma classe que cria um novo objeto, criar uma Simple Factory e [outros casos](https://refactoring.guru/pt-br/design-patterns/factory-comparison).

- Nesse README estará apenas algumas observações e os objetivos principais de cada padrão, porém, dentro de cada subpasta de `src` há a classe `App`, que explica:
    - O objetivo de cada padrão
    - A explicação, caso necessário, sobre como funciona o padrão de forma mais detalhada
    - Tutorial de como fazer o padrão você mesmo
 
- Como é bem conhecido, esses padrões não são leis que devem sem seguidas de forma rígida e nunca serem alteradas, pelo contrário, é incentivado que se altere dependendo de cada caso, então, em cada explicação que farei, é apenas a base para entender como funciona a lógica central por trás de cada pattern.

# Lista de Conteúdos
- [Introdução](#java-design-patterns-em-português)
  - [Observações](#observações)
- [Lista de Conteúdos](#lista-de-conteúdos)
- [Padrões Criacionais](#padrões-criacionais)
  - [Factory Method](#factory-method)
    - [Simple Factory](#simple-factory)
  - [Abstract Factory](#abstract-factory)
  - [Builder](#builder)
  - [Prototype](#prototype)
    - [Prototype Register](#prototype-register)
  - [Singleton](#singleton)
- [Padrões Estruturais](#padrões-estruturais)
  - [Adapter](#adapter)
  - [Bridge](#bridge)
  - [Composite](#composite)
  - [Decorator](#decorator)
  - [Facade](#facade)
  - [Flyweight](#flyweight)
  - [Proxy](#proxy)
- [Padrões Comportamentais](#padrões-comportamentais)
  - [Chain Of Responsibility](#chain-of-responsibility)
  - [Command](#command)
  - [Iterator](#iterator)
  - [Mediator](#mediator)
  - [Memento](#memento)
  - [Observer](#observer)
  - [State](#state)
  - [Strategy](#strategy)
  - [Template Method](#template-method)
  - [Visitor](#visitor)

---

# Padrões Criacionais
Padrões os quais o foco é a criação de objetos

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

---

# Padrões Estruturais
Padrões os quais o foco é montar objetos e classes em estruturas maiores

## Adapter
- Fazer uma classe interagir como outra
- Adaptar a interface de uma classe para atuar com outra

## Bridge
Dividir abstração da implementação. Mas, para mim, essa é uma boa classe para quando você sabe que uma abstração "possui" ou "utiliza" a outra, por exemplo, uma `pessoa` possui um `dispositivo`, e essas duas abstrações podem ter diferentes implementações, como a `pessoa` pode ser `João` ou `Maria` e o `dispositivo` pode ser uma `televisão` ou um `celular`.

## Composite
Criar uma estrutura de árvore ou diretório para classes e objetos.

## Decorator
Adicionar/Remover funcionalidades de uma classe em tempo de execução

## Facade
Criar uma interface simples para interagir com algoritimos complexos

## Flyweight
- Diminuir o uso da memória RAM da aplicação
- Geralmente, fazer a aplicação executar mais eficientemente

**OBS:** Ela diminui do uso da memória RAM, mas aumenta o uso da CPU, então pense bem antes de adicionar esse pattern

## Proxy
Fornece um substituto para o objeto original, podendo adicionar funcionalidades/controle antes de chegar ao objeto.

---

# Padrões Comportamentais
Padrões os quais o foco é a designação de responsabilidades entre objetos

## Chain of Responsibility
Fazer uma cadeia de algoritimos que passem por uma ordem específica.

## Command
Transforma a mensagem/ação em um objeto, podendo serializar essa mensagem ou adicionar funcionalidades, como o `Undo`.

## Iterator
Forma de você iterar sobre um conjunto de objetos da forma desejada.

## Mediator
Adicionar um intermediário entre as classes, para diminuir o acoplamento.

## Memento
Permite que você salve o estado de um objeto e o restaure em um objeto já existente.

## Observer
Sempre que uma ação é executada em uma classe, todas as outras que estão inscritas à essa ação serão notificadas.

## State
Permite alterar o comportamento interno de uma classe totalmente dependendo de seu estado

## Strategy
Parecido com o State, porém, enquanto no `State` ele salva o estado como uma propriedade, para ser usado em vários métodos da classe, no `Strategy` a estratégia de execução de um método é passada como um argumento.

## Template Method
Cria uma superclasse que possui um método principal, dentro desse método são adicionados outros métodos em uma ordem específica que não pode ser alterada pelas subclasses, portanto, o papel das subclasses é somente implementar os outros métodos dentro do método principal.

## Visitor
Esse é um pouco mais complexo de explicar, mas, pense o seguinte, enquanto no `Command` um método de uma classe é transformado em uma nova classe, no `Visitor` nós temos várias classes que querem executar uma mesma função, então, por exemplo, digamos que temos frutas e queremos cortá-las, é a mesma ação(cortar) em classes diferentes(frutas), e para isso serve o `Visitor`, separar um algoritimo que executa a mesma função, ou parecida, para classes diferentes, mesmo que implementem a mesma interface
