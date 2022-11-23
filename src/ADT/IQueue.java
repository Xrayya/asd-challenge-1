package ADT;

public interface IQueue<T> {
    void listAllElements();

    boolean isEmpty();

    boolean enqueue(T data);

    Node<T> dequeue();

    Node<T> peek();
}
