package LinkedList;

public class ListAccess {

    public static void main(String[] args) {
        Person.insertAtEnd(12);
        Person.insertAtEnd(13);
        Person.insertAtEnd(14);
        Person.insertAtStart(15);
        Person.insertAfter(19, 12);
        Person.display();
    }
}
