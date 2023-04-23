package JavaAdvanced.WorkshopDataStructure;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Stack {
    private Node top;
    private int size;

    private static class Node {
        private int element;
        private Node previous;

        private Node(int element) {
            this.element = element;
        }
    }

    public void push(int element) {
        Node node = new Node(element);

        if (top != null) {
            node.previous = this.top;
        }

        this.top = node;
        this.size++;
    }

    public int pop() {
        isEmpty();

        int poppedElement = this.top.element;
        this.top = this.top.previous;

        this.size--;

        return poppedElement;
    }

    public int peek() {
        isEmpty();

        return this.top.element;
    }

    public int size() {
        return this.size;
    }

    private void isEmpty() {
        if (this.top == null) {
            throw new NoSuchElementException("Empty Stack");
        }
    }

    public void forEach(Consumer<Integer> consumer) {
        Node current = this.top;

        while (current != null) {
            consumer.accept(current.element);
            current = current.previous;
        }
    }
}