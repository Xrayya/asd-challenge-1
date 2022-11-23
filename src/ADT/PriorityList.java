package ADT;

public class PriorityList<T extends Comparable<T>> implements IPriorityQueue<T> {
    NodeArray<T> head;
    NodeArray<T> tail;

    public PriorityList() {
    }

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
        NodeArray<T> node = this.head;
        while (node != null) {
            System.out.printf("index %d : %s\n", node.index, node.data);
            node = (NodeArray<T>) node.next;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public boolean enqueue(T data) {
        NodeArray<T> node = new NodeArray<T>(data);
        node.index = tail.index + 1;

        if (this.head == null && this.tail == null) {
            this.head = node;
            this.tail = node;
            return true;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;

        this.heapify(tail.index);

        return true;
    }

    @Override
    public NodeArray<T> dequeue() {
        this.swap(this.head, this.tail);

        NodeArray<T> node = this.tail;
        this.tail = (NodeArray<T>) node.prev;
        this.tail.next = null;
        node.prev = null;

        this.heapify(this.head.index);

        return node;
    }

    public NodeArray<T> removeAt(int index) {
        this.swap(this.getItemAt(index), this.tail);

        NodeArray<T> node = this.tail;
        this.tail = (NodeArray<T>) node.prev;
        this.tail.next = null;
        node.prev = null;

        this.heapify(index);

        return node;
    }

    @Override
    public NodeArray<T> peek() {
        return this.head;
    }

    @Override
    public NodeArray<T> getItemAt(int index) {
        // if (index > tail.index) {
        // return null;
        // }

        NodeArray<T> tmp = this.head;

        while (tmp.next != null) {
            if (tmp.index == index) {
                return tmp;
            }
            tmp = (NodeArray<T>) tmp.next;
        }

        return null;
    }

    @Override
    public NodeArray<T> getParentOf(int index) {
        return getItemAt((index - 1) / 2);
    }

    @Override
    public NodeArray<T> getLeftChildOf(int index) {
        return getItemAt(2 * index + 1);
    }

    @Override
    public NodeArray<T> getRightChildOf(int index) {
        return getItemAt(2 * index + 2);

    }

    @Override
    public void heapify(int index) {
        if (index == tail.index) {
            this.shiftUp(index);
            return;
        }

        shiftDown(index);
    }

    private void shiftUp(int index) {
        NodeArray<T> currentNode = this.getItemAt(index);
        NodeArray<T> parentNode = this.getParentOf(index);

        if (currentNode.data.compareTo(parentNode.data) < 0) {
            swap(currentNode, parentNode);
        }

        this.shiftUp(parentNode.index);
    }

    private void shiftDown(int index) {
        NodeArray<T> currentNode = this.getItemAt(index);
        NodeArray<T> leftChild = this.getLeftChildOf(index);
        NodeArray<T> rightChild = this.getRightChildOf(index);

        if (currentNode.data.compareTo(leftChild.data) > 0) {
            swap(currentNode, leftChild);
        }

        if (currentNode.data.compareTo(leftChild.data) > 0) {
            swap(currentNode, leftChild);
        }

        this.shiftDown(rightChild.index);
        this.shiftDown(leftChild.index);
    }

    private void swap(NodeArray<T> node1, NodeArray<T> node2) {
        T tmp = node1.data;
        node1.data = node2.data;
        node2.data = tmp;
    }
}
