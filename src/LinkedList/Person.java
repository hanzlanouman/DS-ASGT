package LinkedList;

public class Person {
    static Patient head;

    Person() {
        head = null;
    }

//

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
            Patient p = head;
            while (p.next.next != null) {
                p = p.next;
            }
            p.next = null;
        }
    }

    public static void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Patient p = head;
            Patient x = head;
            while (p.data != key) {
                x = p;
                p = p.next;

            }
            x.next = p.next;
        }
    }

    public static void insertAfter(int data, int key) {
        Patient n = new Patient(data);
        if (head == null) {
            head = n;
        } else {
            Patient p = head;
            while (p.data != key) {
                p = p.next;
            }
            n.next = p.next;
            p.next = n;
        }
    }
}
