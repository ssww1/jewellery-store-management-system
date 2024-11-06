import java.util.Iterator;

public class GenericLinkedList<E> implements Iterable<E> {

    // Node class definition
    private class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    // Fields and methods for GenericLinkedList
    Node head;
    int size = 0;

    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteNthNode(int n) {
        if (n < 1 || n > size) {
            System.out.println("Invalid position");
            return;
        }

        if (n == 1) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 1; i < n - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        size--;
    }


    public void display() {
        Node temp = head;
        StringBuilder details = new StringBuilder();
        while (temp != null) {
            details.append(temp.data);
            temp = temp.next;
            if (temp != null) {
                details.append("->");
            }
        }
        System.out.println(details.toString());
    }


    // Iterable interface implementation
    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E data = current.data;
            current = current.next;
            return data;
        }
    }
}