package CircularLinkedList;

public class ListAccess {
    public static void main(String[] args) {
        CircularLinkedList.insertAtStart(1);
        CircularLinkedList.insertAtStart(2);
        CircularLinkedList.insertAtLast(3);
        CircularLinkedList.insertAtLast(4);
//        CircularLinkedList.deleteKey(3);
        CircularLinkedList.deleteAtLast();
        CircularLinkedList.deleteAtStart();
        CircularLinkedList.insert(5, 2);
        CircularLinkedList.insertAfter(4, 1);
        CircularLinkedList.printList();

    }
}
