package JavaAdvanced.WorkshopDataStructure;

import java.util.function.Consumer;

public class LinkedList {
    private Node head;
    private int size;

    private class Node {
        private int element;
        private Node next;

        public Node(int element) {
            this.element = element;
        }
    }

    public void addFirst(int element) {
        Node node = new Node(element);

        node.next = this.head;
        this.head = node;

        size++;
    }

    public void addLast(int element) {
        if (this.size <= 0) {
            addFirst(element);
            return;
        }

        Node node = new Node(element);

        Node current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;

        size++;
    }

    public int get(int index) {
        checkIndex(index);

        int counter = index;
        int getElement = 0;

        Node current = this.head;

        while (counter-- >= 0) {
            getElement = current.element;
            current = current.next;
        }

        return getElement;
    }

    public int removeFirst() {
        isEmpty();

        int removed = this.head.element;

        this.head = this.head.next;

        size--;

        return removed;
    }

    public int removeLast() {
        if (this.size < 2) {
            return removeFirst();
        }

        int removed = 0;

        Node current = this.head;

        while (current.next.next != null) {
            current = current.next;
        }

        removed = current.next.element;
        current.next = null;

        this.size--;

        return removed;
    }

    public int[] toArray() {
        int[] elements = new int[this.size];

        Node current = this.head;

        for (int i = 0; i < elements.length; i++) {
            elements[i] = current.element;
            current = current.next;
        }

        return elements;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node current = this.head;

        while (current != null) {
            consumer.accept(current.element);
            current = current.next;
        }
    }

    public int size() {
        return this.size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + this.size);
        }
    }

    private void isEmpty() {
        if (this.size <= 0) {
            throw new IllegalStateException("Can't remove from empty list");
        }
    }
}