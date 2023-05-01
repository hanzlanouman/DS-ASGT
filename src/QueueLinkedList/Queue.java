package QueueLinkedList;

public class Queue {
    private Person first;
    private Person last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public void insert(Person person) {
        if (first == null) {
            first = person;
        } else {
            last.setNext(person);
        }
        last = person;
    }

    public Person remove() {
        Person temp = first;
        if (first.getNext() == null) {
            last = null;
        }
        first = first.getNext();
        return temp;
    }

    public Person peekFront() {
        return first;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Person current = first;
        while (current != null) {
            System.out.print(current + " ");
            current = current.getNext();
        }
    }
}
