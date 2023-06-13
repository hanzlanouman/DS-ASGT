public class SinglyLinkedList {
    public static Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public static void insertAtStart(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public static void insertAfter(int data, int key) {
        Node n = new Node(data);
        Node temp = head;
        while (temp.data != key && temp.next != null) {
            temp = temp.next;
        }
        if (temp.data == key) {
            n.next = temp.next;
            temp.next = n;
        } else {
            System.out.println("Key Not Found");
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList newList = new SinglyLinkedList();
        newList.insertAtStart(10);
        newList.insertAtStart(20);
        newList.insertAtStart(30);
        newList.insertAtStart(40);
        newList.insertAtStart(50);
        newList.insertAfter(25, 50);
    }

}
