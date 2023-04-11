package LinkedList;

public class Node {
    Patient p;
    Node next;

    Node(Patient p) {
        this.p = p;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
