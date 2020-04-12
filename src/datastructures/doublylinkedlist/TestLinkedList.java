package datastructures.doublylinkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.append("This");
        list.append("Hello!");
        list.prepend("is");
        list.prepend("crazy!");


        DoublyLinkedList<String> list2 = new DoublyLinkedList<>();
        list2.prepend("is");
        list2.prepend("crazy!");
        list2.append("This");
        list2.append("Hello!");

        printList(list);
        printList(list2);

        System.out.println("get first: " + list.getFirst());
        printList(list);

        System.out.println("get last: " + list.getLast());
        printList(list);



        System.out.println("remove This: ");
        list.delete("This");
        printList(list);

        System.out.println("remove is: ");
        list.delete("is");
        printList(list);
    }


    public static void printList(DoublyLinkedList<String> list){
        System.out.println("Printing List:");
        Iterator<String> it = list.getIterator();
        while (it.hasNext()){
            System.out.print(" " + it.getNext());
        }
        System.out.println("");
    }
}
