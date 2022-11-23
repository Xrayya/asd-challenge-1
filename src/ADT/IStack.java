package ADT;

public interface IStack<T> {
    void listAllElements();

    boolean isEmpty();

    boolean push(T data);

    Node<T> pop();

    Node<T> peek();
}
