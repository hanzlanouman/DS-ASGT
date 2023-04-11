package CircularLinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.setNext(head);
        } else {
            newNode.setNext(head);
            head = newNode;
            tail.setNext(head);
        }
        size++;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
        size++;
    }

    public void insert(int data, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            insertAtStart(data);
        } else if (index == size) {
            insertAtLast(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    public void deleteAtStart() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        } else {
            head = head.getNext();
            tail.setNext(head);
            size--;
        }
    }

    public void deleteAtLast() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        } else {
            Node current = head;
            for (int i = 0; i < size - 2; i++) {
                current = current.getNext();
            }
            current.setNext(head);
            tail = current;
            size--;
        }
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            deleteAtStart();
        } else if
        (index == size - 1) {
            deleteAtLast();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            size--;
        }

    }
}
