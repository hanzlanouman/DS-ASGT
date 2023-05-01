package Queue;

public class QueueAccess {
    public static void main(String[] args) {
        Queue queue1 = new Queue(10);
        queue1.insert(2);
        queue1.insert(3);
        queue1.insert(4);
        queue1.display();
        System.out.println();
        queue1.remove();
        System.out.println(queue1.peekFront());
    }
}
