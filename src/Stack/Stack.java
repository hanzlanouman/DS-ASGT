package Stack;

public class Stack {
    private String[] stack;
    private int top;

    public Stack(int size) {
        stack = new String[size];
        top = -1;
    }

    public void push(String data) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack[top--];
        }
    }

    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
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
