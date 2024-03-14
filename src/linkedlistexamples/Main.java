package linkedlistexamples;


import linkedlistexamples.doublylinkedlist.DoublyLinkedList;
import linkedlistexamples.doublylinkedlist.Node;
import linkedlistexamples.singlylinkedlist.CustomSinglyLinkedList;

public class Main {

    public static void main(String[] args) {


//        CustomSinglyLinkedList list1 = new CustomSinglyLinkedList(5);
//        list1.display();

//        CustomSinglyLinkedList list2 = new CustomSinglyLinkedList();
//        list2.display();

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.addFirst(3);
//        list.addLast(5);
//        list.add(1, 6);
//        System.out.println(list);

//            CustomSinglyLinkedList list = new CustomSinglyLinkedList(1);
//            list.insertLast(2);
//            list.insertLast(3);
//            list.insertLast(4);
//            list.insertLast(5);
//            list.display();
//            list.insertIndex(0,6);
//            list.display();

        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.display();













    }
}
