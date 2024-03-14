package linkedlistexamples.doublylinkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;

    int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        this.size++;
    }

    public void display () {
        Node first = head;
        Node last = tail;

        while(first != null) {
            System.out.print(first.data+ " -> ");
            first = first.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println("------------------------");
        while(last != null) {
            System.out.print(last.data+ " -> ");
            last = last.previous;
        }
        System.out.print("START");

    }

}
