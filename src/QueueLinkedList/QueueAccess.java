package QueueLinkedList;

public class QueueAccess {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        queue1.insert(new Person("John", 22));
        queue1.insert(new Person("Mike", 33));
        queue1.insert(new Person("Sue", 44));
        queue1.display();
        System.out.println();
        queue1.remove();
        System.out.println(queue1.peekFront());
    }
}
