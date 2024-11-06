import java.util.Iterator;

public class GenericLinkedList<E> implements Iterable<E> {

    // Node class definition
    private class Node<E> {
        public E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }

    // Fields and methods for GenericLinkedList
    public Node<E> head;
    int size = 0;

    public E getHeadData(){
        return head.data;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<E>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<E>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public boolean contains(E element) {
        Node<E> temp = head;
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
            Node<E> temp = head;
            for (int i = 1; i < n - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        size--;
    }


    public void display() {
        Node<E> temp = head;
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

