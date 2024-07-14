package behavioral_patterns.iterator;

public interface hasIterator<T> {
    CustomIterator<T> createIterator();
}
