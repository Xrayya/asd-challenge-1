public class LinkList<T> implements ILinkList<T>, IStack<T>, IQueue<T> {
    Node<T> head;
    Node<T> tail;

    @Override
    public boolean enqueue(T data) {
        // TODO: Auto-generated method stub
        return false;
    }

    @Override
    public Node<T> dequeue() {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public void listAllElements() {
        // TODO: Auto-generated method stub

    }

    @Override
    public boolean push(T data) {
        // TODO: Auto-generated method stub
        return false;
    }

    @Override
    public Node<T> pop() {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public Node<T> peek() {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO: Auto-generated method stub
        return false;
    }

    @Override
    public Node<T> addLast(T data) {
        Node<T> node = new Node<T>(data);
        if (this.head == null && this.tail == null) {
            this.head = node;
            this.tail = node;
            return node;
        }
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = node;
        return node;
    }

    @Override
    public Node<T> addFirst(T data) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public Node<T> addAfter(T data) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public Node<T> addBefore(T data) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public void forwardTraverse() {
        // TODO: Auto-generated method stub

    }

    @Override
    public void reverseTraverse() {
        // TODO: Auto-generated method stub

    }

    @Override
    public Node<T> find(T data) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public Node<T> removeFirst() {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public Node<T> removeLast() {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public Node<T> remove(T data) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public Node<T> removeAfter(T data) {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override
    public Node<T> removeBefore(T data) {
        // TODO: Auto-generated method stub
        return null;
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
}
