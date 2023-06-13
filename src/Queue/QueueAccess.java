package Queue;

public class QueueAccess {
    public static void main(String[] args) {
        Queue queue1 = new Queue(10);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.enqueue(4);
//        queue1.display();
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        queue1.enqueue(5);
        queue1.enqueue(6);
        queue1.display();
        System.out.println();
        System.out.println(queue1.dequeue());
    }
}
