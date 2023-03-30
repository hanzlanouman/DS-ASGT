package LinkedList;

public class Person {
    static Patient head;

    Person() {
        head = null;
    }

    public static void insertAtEnd(int data) {
        Patient n = new Patient(data);
        if (head == null) {
            head = n;
        } else {
            Patient p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = n;
        }
    }

    public static void display() {
        Patient p = head;
        while (p != null) {
            System.out.println(" " + p.data);
            p = p.next;
        }
    }

    public static void insertAtStart(int data) {
        Patient n = new Patient(data);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;

        }
    }

    public static void insertAfter(int data, int key) {
        Patient p = head;
        Patient n = new Patient(data);
        while (p.data != key && p.next != null) {
            p = p.next;
        }
        n.next = p.next;
        p.next = n;
    }
}
