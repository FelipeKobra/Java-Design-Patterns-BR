package behavioral_patterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

class History {
    private Deque<DocumentMemento> mementos = new ArrayDeque<>();

    public void addMemento(DocumentMemento memento) {
        this.mementos.add(memento);
    }

    public DocumentMemento getLastMemento() {
        return this.mementos.peek();
    }
}
