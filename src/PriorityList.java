import java.util.Iterator;

public class PriorityList<T extends Comparable<T>> implements IPriorityQueue<T>, Iterable<T> {
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

        if (this.head == null && this.tail == null) {
            node.index = 0;

            this.head = node;
            this.tail = node;
            return true;
        }

        node.index = tail.index + 1;

        tail.next = node;
        node.prev = tail;
        tail = node;

        this.heapify(tail.index);

        return true;
    }

    @Override
    public NodeArray<T> dequeue() {
        if (this.head == this.tail) {
            NodeArray<T> tmp = this.head;
            this.head = this.tail = null;
            return tmp;
        }

        this.swapData(this.head, this.tail);

        NodeArray<T> node = this.tail;
        this.tail = (NodeArray<T>) node.prev;
        this.tail.next = null;
        node.prev = null;

        this.heapify(this.head.index);

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

        while (tmp != null) {

            if (tmp.index == index) {
                return tmp;
            }
            tmp = (NodeArray<T>) tmp.next;
        }

        return null;
    }

    public NodeArray<T> getFirst() {
        return this.head;
    }

    public NodeArray<T> getLast() {
        return this.tail;
    }

    @Override
    public NodeArray<T> getParentOf(int index) {
        return (index - 1) / 2 == index ? null : getItemAt((index - 1) / 2);
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

        if (parentNode == null) {
            return;
        }

        if (currentNode.data.compareTo(parentNode.data) < 0) {
            swapData(currentNode, parentNode);
            this.shiftUp(parentNode.index);
        }
    }

    private void shiftDown(int index) {
        NodeArray<T> currentNode = this.getItemAt(index);
        NodeArray<T> leftChild = this.getLeftChildOf(index);
        NodeArray<T> rightChild = this.getRightChildOf(index);

        if (leftChild != null) {
            if (currentNode.data.compareTo(leftChild.data) > 0) {
                swapData(currentNode, leftChild);
            }
            this.shiftDown(leftChild.index);
        }

        if (rightChild != null) {
            if (currentNode.data.compareTo(rightChild.data) > 0) {
                swapData(currentNode, rightChild);
            }
            this.shiftDown(rightChild.index);
        }
    }

    private void swapData(NodeArray<T> node1, NodeArray<T> node2) {
        T tmp = node1.data;
        node1.data = node2.data;
        node2.data = tmp;
    }

    private class CustomIterator<E extends Comparable<E>> implements Iterator<E> {
        private NodeArray<E> currentNode;

        CustomIterator(PriorityList<E> list) {
            currentNode = list.getFirst();
        }

        @Override
        public boolean hasNext() {
            return this.currentNode != null;
        }

        @Override
        public E next() {
            NodeArray<E> output = this.currentNode;
            this.currentNode = (NodeArray<E>) this.currentNode.next;
            return output.data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>(this);
    }
}
