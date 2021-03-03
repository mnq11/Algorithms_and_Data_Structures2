package task2;


public class MyLinkedList<T> {


    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = new Node<T>(null);
        size = 0;
    }


    public void clear() {
        Node<T> node = head;
        while (node != null) {
            node.next = null;
            node = null;
        }
    }

    public T get(int index) {

        T data;
        Node<T> currentNode = head;
        if (index == 0) {
            data = head.data;
        } else if (index == size - 1) {
            data = tail.data;
        } else {

            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            data = currentNode.data;
        }

        return data;
    }

    public int size() {
        return size;
    }







    public void add(int index, T item) {

        // scenario 1: out of bounds
        if (index < 0 || index < size) {
            throw new IndexOutOfBoundsException("overflow or underflow");
        }
        Node<T> temp = new Node<>(item);

        if (size == 0) {
            head = temp;
            tail = temp;
            tail.next = head;
            size++;
        }

        // scenario 2: adding head
        else if (index == 0) {
            temp.next = head;
            head = temp;
            tail.next = head;
            size++;
        }
        // scenario 3: adding to the tail
        else if (index == size) {
            temp.next = head;
            tail.next = temp;
            tail = temp;
            size++;
        } else {
            Node<T> before = getNode(index - 1);
            temp.next = before.next;
            before.next = temp;
            size++;
        }


    }

    public void remove(int index) {
        // scenario 1 : out of bonds
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("cant remove that!");
        }
        if (index == 0) {
            head = head.next;
            tail.next = head;
        } else if (index == size) {
            Node<T> before = getNode(index - 1);
            before.next = head;
            tail = before;
            //size --;
        } else {
            Node<T> before = getNode(index - 1);
            before.next = before.next.next;
        }
        size--;
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Not a valid index :(");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }





    public String toString() {
        Node<T> current = head;
        StringBuilder result = new StringBuilder();
        if (size == 0) {
            return "";
        }
        if (size == 1) {
            return head.data.toString();

        } else {
            do {
                result.append(current.data);
                result.append("   ---   ");
                current = current.next;
            } while (current != head);
        }
        return result.toString();
    }



    private static class Node<T> {
        Node<T> next;
        T data;

        public Node(T myData) {
            next = null;
            data = myData;
        }


        public Node<T> getNext() {
            return next;
        }


    }


}