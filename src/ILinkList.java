public interface ILinkList<T> {
    boolean isEmpty();

    void forwardTraverse();

    void reverseTraverse();

    Node<T> addLast(T data);

    Node<T> addFirst(T data);

    Node<T> addAfter(Node<T> node, T data);

    Node<T> addBefore(Node<T> node, T data);

    Node<T> find(T data);

    Node<T> removeFirst();

    Node<T> removeLast();

    Node<T> remove(T data);

    Node<T> removeAfter(T data);

    Node<T> removeBefore(T data);
}
