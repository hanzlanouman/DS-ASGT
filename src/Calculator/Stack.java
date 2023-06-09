package Calculator;

public class Stack {
    private Double[] stack;
    private int top;

    public Stack(int size) {
        stack = new Double[size];
        top = -1;
    }

    public void push(Double data) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }

    public Double pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1.0;
        } else {
            return stack[top--];
        }
    }

    public Double peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1.0;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
