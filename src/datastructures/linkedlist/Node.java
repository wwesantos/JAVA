package datastructures.linkedlist;

public class Node <T> {
    private T data;
    private Node<T> next;

    Node(T data){
        this.data = data;
    }

    Node<T> getNext() {
        return next;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    T getData() {
        return data;
    }
}
