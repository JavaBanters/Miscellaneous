package linkedlistexamples.circularlinkedlist;

public class CircularLinkedList {

    Node head;
    Node tail;

    int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(int data){
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            node.next = head;
            head = node;
            tail.next = head;
        }
        this.size++;
    }




    public  void display(){
        Node temp = head;
         do {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.print(" HEAD");
        System.out.println();
    }

}