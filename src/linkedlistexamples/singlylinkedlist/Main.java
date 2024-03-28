package linkedlistexamples.singlylinkedlist;


import linkedlistexamples.doublylinkedlist.DoublyLinkedList;
import linkedlistexamples.singlylinkedlist.Node;
import linkedlistexamples.singlylinkedlist.CustomSinglyLinkedList;

import java.util.LinkedList;

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

            CustomSinglyLinkedList list = new CustomSinglyLinkedList(5);
            list.insertLast(3);
            list.insertLast(9);
            list.insertLast(10);
            list.insertLast(1);
            list.insertLast(6);
            list.display();
            Node result = list.findMidNode(list.head);
            System.out.println(result.data);
            //list.insertIndex(0,6);
            //list.display();




        Node first = new Node(5);
        Node second = new Node(3);
        Node third = new Node(9);
        Node fourth = new Node(10);
        Node fifth = new Node(1);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        System.out.println(list.detectLoop(first));


        LinkedList <Integer> list1 = new LinkedList<>();
        list1.addFirst(1);












    }
}
