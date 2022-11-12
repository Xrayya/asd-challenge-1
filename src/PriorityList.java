public class PriorityList<T> implements IPriorityQueue<T> {
    NodeArray<T> head;
    NodeArray<T> tail;

    public PriorityList(T data) {
        NodeArray<T> node = new NodeArray<T>(data);
        node.index = 0;
        this.head = node;
        this.tail = node;
    }

    @Override
    public String toString() {
        Node<T> cursor = this.head;
        String s = "[";
        while (cursor != null) {
            s += (cursor.next != null)
                    ? cursor.toString() + ", "
                    : cursor.toString();
            cursor = cursor.next;
        }
        return s + "]";
    }

    @Override
    public void listAllElements() {
        // TODO: Auto-generated method stub

    }

    @Override
    public boolean isEmpty() {
        // TODO: Auto-generated method stub
        return false;
    }

    @Override
    public boolean enqueue(T data) {
        NodeArray<T> node = new NodeArray<T>(data);
        node.index = tail.index + 1;

        // TODO: Heapify!

        return false;
    }

    @Override
    public NodeArray<T> dequeue() {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public NodeArray<T> peek() {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public NodeArray<T> getItemAt(int index) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public NodeArray<T> getParentOf(int index) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public NodeArray<T> getLeftChildOf(int index) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public NodeArray<T> getRightChildOf(int index) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public void heapify(int index) {
        // TODO: Auto-generated method stub

    }
}
