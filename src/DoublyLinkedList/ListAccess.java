package DoublyLinkedList;

public class ListAccess {
    public static void main(String[] args) {

//        Access the Doubly Linked List

        DoublyLinkedList.insertAtStart(1);
        DoublyLinkedList.insertAtStart(2);
        DoublyLinkedList.insertAtLast(3);
        DoublyLinkedList.insertAtLast(4);
        DoublyLinkedList.deleteKey(1);
        DoublyLinkedList.insertAfter(4, 2);
        DoublyLinkedList.insertAtLast(9);

//        DoublyLinkedList.add(5, 2);
        DoublyLinkedList.printList();


    }
}
