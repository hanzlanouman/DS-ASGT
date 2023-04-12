package DoublyLinkedList;

public class DoublyLinkedList {
    private static Node head;
    private static Node tail;
    private static int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public static void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    public static void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        size++;
    }

    public static void deleteFirst() {
        if (head == null) {
            throw new NullPointerException("List is empty");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrevious(null);
        }
        size--;
    }

    public static void deleteLast() {
        if (head == null) {
            throw new NullPointerException("List is empty");
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
        size--;
    }


    public static void deleteKey(int key) {
        Node current = head;
        while (current != null) {
            if (current.getData() == key) {
                if (current == head) {
                    if (head == tail) {
                        head = null;
                        tail = null;
                    } else {
                        head = head.getNext();
                        head.setPrevious(null);
                    }
                    size--;
                } else if (current == tail) {
                    deleteLast();
                } else {
                    current.getPrevious().setNext(current.getNext());
                    current.getNext().setPrevious(current.getPrevious());
                    size--;
                }
            }
            current = current.getNext();
        }
    }

    public static void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println("List Size: " + size);
    }

    public static void insertAfter(int data, int key) {
        Node current = head;
        while (current != null) {
            if (current.getData() == key) {
                Node newNode = new Node(data);
                newNode.setNext(current.getNext());
                current.getNext().setPrevious(newNode);
                current.setNext(newNode);
                newNode.setPrevious(current);
                size++;
            }
            current = current.getNext();
        }
    }


}
