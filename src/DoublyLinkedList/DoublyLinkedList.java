package DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtStart(int data) {
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

    public void insertAtLast(int data) {
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

    public void add(int data, int index) {
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
            current.getNext().setPrevious(newNode);
            current.setNext(newNode);
            newNode.setPrevious(current);
            size++;
        }
    }

    public void deleteFirst() {
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

    public void deleteAtLast() {
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

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            deleteFirst();
        } else if (index == size - 1) {
            deleteAtLast();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            current.getNext().setPrevious(current);
            size--;
        }

    }

    public void deleteKey(int key) {
        Node current = head;
        while (current != null) {
            if (current.getData() == key) {
                if (current == head) {
                    deleteFirst();
                } else if (current == tail) {
                    deleteAtLast();
                } else {
                    current.getPrevious().setNext(current.getNext());
                    current.getNext().setPrevious(current.getPrevious());
                    size--;
                }
            }
            current = current.getNext();
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void insertAfter(int data, int key) {
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
