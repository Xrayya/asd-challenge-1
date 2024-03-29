package ADT;

import java.util.Iterator;

public class LinkList<T> implements ILinkList<T>, IStack<T>, IQueue<T>, Iterable<T> {
    Node<T> head;
    Node<T> tail;

    public Integer size = 0;

    @Override
    public boolean enqueue(T data) {
        this.addFirst(data);

        return true;
    }

    @Override
    public Node<T> dequeue() {
        return removeLast();
    }

    @Override
    public void listAllElements() {
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.toString());
            currentNode = currentNode.next;
        }

    }

    public Node<T> getFirst() {
        return this.head;
    }

    public Node<T> getLast() {
        return this.tail;
    }

    @Override
    public boolean push(T data) {
        this.addLast(data);
        return true;
    }

    @Override
    public Node<T> pop() {
        return removeLast();
    }

    @Override
    public Node<T> peek() {
        return this.tail;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
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

        this.size++;

        return node;
    }

    @Override
    public Node<T> addFirst(T data) {
        Node<T> node = new Node<T>(data);
        if (this.head == null && this.tail == null) {
            this.head = node;
            this.tail = node;
            return node;
        }
        this.head.prev = node;
        node.next = this.head;
        this.head = node;

        this.size++;

        return node;
    }

    @Override
    public Node<T> addAfter(Node<T> node, T data) {
        Node<T> newNode = new Node<>(data);

        node.next.prev = newNode;
        newNode.next = node.next;
        newNode.prev = node;
        node.next = newNode;

        this.size++;

        return newNode;
    }

    @Override
    public Node<T> addBefore(Node<T> node, T data) {
        Node<T> newNode = new Node<>(data);

        node.prev.next = newNode;
        newNode.prev = node.prev;
        newNode.next = node;
        node.prev = newNode;

        this.size++;

        return null;
    }

    @Override
    public void forwardTraverse() {
        Node<T> currentNode = this.head;
        String s = "";

        while (currentNode != null) {
            s += (currentNode.next != null)
                    ? currentNode.toString() + " - "
                    : currentNode.toString();
            currentNode = currentNode.next;
        }

        System.out.println(s);
    }

    @Override
    public void reverseTraverse() {
        Node<T> currentNode = this.tail;

        String s = "";

        while (currentNode != null) {
            s += (currentNode.prev != null)
                    ? currentNode.toString() + " - "
                    : currentNode.toString();
            currentNode = currentNode.prev;
        }

        System.out.println(s);
    }

    @Override
    public Node<T> find(T data) {
        Node<T> currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }

        return null;
    }

    @Override
    public Node<T> removeFirst() {
        Node<T> tmp = this.head;

        this.head = tmp.next;
        this.head.prev.next = null;
        this.head.prev = null;

        this.size--;

        return tmp;
    }

    @Override
    public Node<T> removeLast() {
        Node<T> tmp = this.tail;

        this.tail = tmp.prev;
        this.tail.next.prev = null;
        this.tail.next = null;

        this.size--;

        return tmp;
    }

    @Override
    public Node<T> remove(T data) {
        Node<T> tmp = this.find(data);

        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;

        tmp.next = tmp.prev = null;

        this.size--;

        return tmp;
    }

    @Override
    public Node<T> removeAfter(T data) {
        Node<T> tmp = find(data).next;

        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;

        tmp.next = tmp.prev = null;

        this.size--;

        return tmp;
    }

    @Override
    public Node<T> removeBefore(T data) {
        Node<T> tmp = find(data).prev;

        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;

        tmp.next = tmp.prev = null;

        this.size--;

        return tmp;
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

    private class CustomIterator<E> implements Iterator<E> {
        private Node<E> currentNode;

        CustomIterator(LinkList<E> list) {
            currentNode = list.getFirst();
        }

        @Override
        public boolean hasNext() {
            return this.currentNode != null;
        }

        @Override
        public E next() {
            this.currentNode = this.currentNode.next;
            return this.currentNode.data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>(this);
    }
}
