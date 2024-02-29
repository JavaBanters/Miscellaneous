package linkedlistexamples;

public class CustomSinglyLinkedList {

    Node head;
    Node tail;
    int size;

    public CustomSinglyLinkedList() {
        this.size = 0;
    }

    public CustomSinglyLinkedList(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if(head == null) {
            head = newNode;
            tail = head;
        }
        this.size++;
    }

    public void display() {
        if(head == null) {
            System.out.println("The list is empty");
        } else {
            Node temp = head;
            while(temp != null) { // i= 0
                System.out.print(temp.data+" -> ");
                temp = temp.next; //i++
            }
            System.out.print("null");
            System.out.println();
        }



    }



}
