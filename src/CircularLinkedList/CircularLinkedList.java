package CircularLinkedList;

public class CircularLinkedList {
    private static Node head;
    private static Node tail;
    private static int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void printList() {
        Node current = head;
        for (int i = 0; i < size; i++) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public static void delete(int index) {
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

    public static void insertAtStart(int data) {
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

    public static void insertAtLast(int data) {
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

    public static void insertAfter(int data, int key) {
        Node newNode = new Node(data);
        Node current = head;
        while (current != null) {
            if (current.getData() == key) {
                if (current == tail) {
                    insertAtLast(data);
                } else {
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                    size++;
                }
            }
            current = current.getNext();
        }
    }

    public static void insert(int data, int index) {
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

    public static void deleteAtLast() {
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

    public static void deleteAtStart() {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        } else {
            head = head.getNext();
            tail.setNext(head);
            size--;
        }
    }

    public static void deleteKey(int key) {
        Node current = head;
        while (current != null) {
            if (current.getData() == key) {
                if (current == head) {
                    if (head == null) {
                        throw new NullPointerException("List is empty");
                    }
                    if (head == tail) {
                        head = null;
                        tail = null;
                    } else {
                        head = head.getNext();
                        tail.setNext(head);
                    }
                    size--;
                } else if (current == tail) {
                    deleteAtLast();
                } else {
                    Node temp = head;
                    while (temp.getNext() != current) {
                        temp = temp.getNext();
                    }
                    temp.setNext(current.getNext());
                    size--;
                }
            }
            current = current.getNext();
        }
    }
}
