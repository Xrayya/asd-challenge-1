public interface IPriorityQueue<T> {
    void listAllElements();

    void heapify(int index);

    boolean isEmpty();

    boolean enqueue(T data);

    NodeArray<T> dequeue();

    NodeArray<T> peek();

    NodeArray<T> getItemAt(int index);

    NodeArray<T> getParentOf(int index);

    NodeArray<T> getLeftChildOf(int index);

    NodeArray<T> getRightChildOf(int index);
}
