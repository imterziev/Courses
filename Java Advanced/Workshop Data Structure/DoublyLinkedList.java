package JavaAdvanced.WorkshopDataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int element;
        private Node next;
        private Node previous;

        private Node(int element) {
            this.element = element;
        }
    }

    public void addFirst(int element) {
        Node node = new Node(element);

        if (this.size <= 0) {
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.previous = node;
        }

        this.head = node;

        size++;
    }

    public void addLast(int element) {
        if (this.size <= 0) {
            addFirst(element);
            return;
        }

        Node node = new Node(element);

        this.tail.next = node;
        node.previous = this.tail;
        this.tail = node;

        size++;
    }

    public int get(int index) {
        checkIndex(index);

        int getElement = 0;

        if (index <= this.size / 2) {
            Node current = this.head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            getElement = current.element;
        } else {
            Node current = this.tail;

            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }

            getElement = current.element;
        }

        return getElement;
    }

    public int removeFirst() {
        isEmpty();

        int removed = this.head.element;

        this.head = this.head.next;

        if (this.size > 1) {
            this.head.previous = null;
        }

        this.size--;

        if (this.size <= 0) {
            this.head = this.tail = null;
        }

        return removed;
    }

    public int removeLast() {
        if (this.size < 2) {
            return removeFirst();
        }

        int removed = this.tail.element;

        this.tail = tail.previous;
        this.tail.next = null;

        this.size--;

        return removed;
    }

    public int[] toArray() {
        List<Integer> list = new ArrayList<>();

        forEach(list::add);

        return list.stream().mapToInt(e -> e).toArray();
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