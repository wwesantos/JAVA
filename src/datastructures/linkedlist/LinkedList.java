package datastructures.linkedlist;


public class LinkedList <T> {
    private Node<T> head;

    public void append(T data){
        if (head == null){
            head = new Node<>(data);
            return;
        }

        Node<T> current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new Node<>(data));
    }

    public void prepend(T data){
        if (head == null){
            head = new Node<>(data);
            return;
        }

        Node<T> newHead = new Node<>(data);
        newHead.setNext(head);
        head = newHead;
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


    public T getFirst(){
        if (head != null){
            return head.getData();
        }
        return null;
    }

    public T getLast(){
        if (head != null){
            Node<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            return current.getData();
        }
        return null;
    }

    public Iterator<T> getIterator(){
        return new Iterator<T>(head);
    }
}
