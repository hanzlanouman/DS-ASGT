package StackLinkedList;

public class Stack {
    private Person top;

    public Stack() {
        top = null;
    }

    public void push(String name, int age) {
        Person newPerson = new Person(name, age);
        if (top == null) {
            top = newPerson;
        } else {
            newPerson.setNext(top);
            top = newPerson;
        }
    }

    public Person pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            Person poppedPerson = top;
            top = top.getNext();
            return poppedPerson;
        }
    }

    public String peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return top.toString();
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Person current = top;
            while (current != null) {
                System.out.println(current.getName() + " " + current.getAge());
                current = current.getNext();
            }
        }
    }
}
