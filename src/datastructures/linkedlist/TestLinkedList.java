package datastructures.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.prepend("This");
        list.prepend("Hello!");
        list.append("is");
        list.append("crazy!");

        LinkedList<String> list2 = new LinkedList<>();
        list2.append("is");
        list2.append("crazy!");
        list2.prepend("This");
        list2.prepend("Hello!");

        printList(list);
        printList(list2);

        System.out.println("get first: " + list.getFirst());
        printList(list);

        System.out.println("get last: " + list.getLast());
        printList(list);

        System.out.println("remove This: ");
        list.delete("This");
        printList(list);

        System.out.println("remove is: " + list.getLast());
        list.delete("is");
        printList(list);
    }


    public static void printList(LinkedList<String> list){
        System.out.println("Printing List:");
        Iterator<String> it = list.getIterator();
        while (it.hasNext()){
            System.out.print(" " + it.getNext());
        }
        System.out.println("");
    }
}
