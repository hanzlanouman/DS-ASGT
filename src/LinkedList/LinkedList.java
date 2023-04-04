package LinkedList;

public class LinkedList {
    static Node head;

    LinkedList() {
        head = null;
    }

    public static void insertAtStart(Patient p) {
        Node n = new Node(p);
        n.setNext(head);
        head = n;
    }

    public static void insertAtEnd(Patient p) {
        Node n = new Node(p);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public static void insertAfter(Patient p, int id) {
        Node n = new Node(p);
        Node temp = head;
        while (temp.p.getId() != id) {
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }

    public static void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    public static void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public static void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node currNode = head;
            Node prevNode = head;
            while (currNode.p.getId() != key) {
                prevNode = currNode;
                currNode = currNode.next;
            }
            prevNode.next = currNode.next;
        }
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.p);
            temp = temp.next;
        }
    }

}
