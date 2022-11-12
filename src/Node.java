public class Node<T> {
    Node<T> next;
    Node<T> prev;
    T data;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
