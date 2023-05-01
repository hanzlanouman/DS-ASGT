package Queue;

public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int data) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = data;
        nItems++;
    }

    public int remove() {
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public int peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void display() {
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
    }
}
