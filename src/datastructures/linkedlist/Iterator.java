package datastructures.linkedlist;

public class Iterator <T> {
    private Node<T> head;

    public Iterator(Node head){
        this.head = head;
    }

    public boolean hasNext() {
        return head != null;
    }

    public T getNext() {
        Node<T> next = head;
        head = head.getNext();
        return next.getData();
    }
}
