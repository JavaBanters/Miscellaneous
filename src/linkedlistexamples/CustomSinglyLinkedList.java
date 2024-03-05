package linkedlistexamples;

public class CustomSinglyLinkedList {

    Node head;
    Node tail;
    int size;

    public CustomSinglyLinkedList() {
        this.size = 0;
    }

    public CustomSinglyLinkedList(int data) {
        Node newNode = new Node(data); //Node newNode = new Node(1);
        if(head == null) {
            head = newNode;
            tail = head;
        }
        this.size++;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.next = head ;
            head = newNode;
        }
        this.size++;
    }

    public void insertLast(int data) {

    }

    public void display() {
        Node temp = head; //i = 0
        while (temp != null ) { //i < length
            System.out.print(temp.data + " ->");
            temp = temp.next; // i++
        }
        System.out.print("null");
        System.out.println();
    }





}
