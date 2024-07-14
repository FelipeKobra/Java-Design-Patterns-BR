/*
 * Objetivo
 * ------------
 * Criar um histórico de um objeto
 * 
 * Explicação
 * ------------
 * Nesse caso teremos 3 principais atores:
 * 1. Originador - A classe principal que terá um histórico e a única que pode ver seu próprio histórico
 * 2. Memento - A classe que terá as mesmas propriedades do Originador e será o "save", ou seja, quem guardará as informações
 * 3. Caretaker - É quem guardará os Mementos, mas não terá acesso a seu conteúdo
 * 
 * Tutorial
 * ------------
 * 1. Criar o Originador (Document)
 * 2. Criar o Memento (DocumentMemento) com as mesmas propriedades do Originador e um método para recuperar as informações salvas
 * 3. Adicionar métodos no Originador para criar um Memento (Document.createMemento()) e para restaurar as configurações a partir
 * de um Memento (Document.restoreFromMemento())
 * 4. Criar o Caretaker (History) que terá uma lista de Mementos de uma classe específica e métodos de retornar algum Memento
 * para a classe Originadora
 * 
 */

package behavioral_patterns.memento;

public class App {
    public static void main(String[] args) {
        Document document = new Document("Initial content\n");
        History history = new History();

        // Escrevendo no Documento
        document.write("Additional content\n");
        history.addMemento(document.createMemento());

        // Escrevendo mais no Documento
        document.write("More content\n");
        history.addMemento(document.createMemento());

        // Mostrando o documento
        System.out.println(document.getContent());

        // Restaurando para o Documento anterior
        document.restoreFromMemento(history.getLastMemento());

        // Mostrando no Documento
        System.out.println(document.getContent());
    }
}
