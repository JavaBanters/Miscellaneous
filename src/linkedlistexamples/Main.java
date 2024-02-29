package linkedlistexamples;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


//        CustomSinglyLinkedList list1 = new CustomSinglyLinkedList(5);
//        list1.display();

//        CustomSinglyLinkedList list2 = new CustomSinglyLinkedList();
//        list2.display();

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.addFirst(3);
        list.addLast(5);
        list.add(1, 6);
        System.out.println(list);

    }
}
