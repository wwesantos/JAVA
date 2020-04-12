package datastructures.doublylinkedlist;


public class Node <T> {
    private T data;
    private Node<T> next;
    private Node<T> previous;

    public Node(T data, Node<T> next, Node<T> previous){
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
