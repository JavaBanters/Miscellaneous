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
        Node newNode = new Node(data);
        if(tail == null) {
            insertFirst(data);
        } else {
            tail.next = newNode;
            tail = newNode;
            this.size++;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty . you cannot delete anything");
        } else {
                if(head.next == null) {
                    head = null;
                    tail = null;
                } else {
                    Node temp = head.next;
                    head = temp;
                }
                this.size--;
        }
    }

    public void deleteLast() {
        if (tail == null) {
            System.out.println("The list is empty . you cannot delete anything");
        } else {
            if(head == tail) {
                head = null;
                tail = null;
            } else {
                Node temp = head;
                for (int i = 1; i < size - 1; i++) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
            this.size--;
        }
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
