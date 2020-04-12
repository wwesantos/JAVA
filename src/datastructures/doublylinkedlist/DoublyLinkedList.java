package datastructures.doublylinkedlist;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public void append(T data){
        Node newHead = new Node(data, head, null);
        if(head != null){
            head.setPrevious(newHead);
        }
        head = newHead;
        if (tail == null){
            tail = newHead;
        }
    }

    public void prepend(T data){
        Node newTail = new Node(data, null, tail);
        if(tail != null){
            tail.setNext(newTail);
        }
        tail = newTail;
        if (head == null){
            head = newTail;
        }
    }

    public T getFirst(){
        if (head != null){
            return head.getData();
        }
        return null;
    }

    public T getLast(){
        if (tail != null){
            return tail.getData();
        }
        return null;
    }

    public void delete(T data){
        if (head == null) return;
        if(data.equals(head.getData())){
            head = head.getNext();
            return;
        }

        Node<T> current = head;
        while(current.getNext() != null){
            if(data.equals(current.getNext().getData())){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public Iterator <T> getIterator(){
        return new Iterator<T>(head);
    }
}
