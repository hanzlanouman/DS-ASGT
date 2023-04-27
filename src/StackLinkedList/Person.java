package StackLinkedList;

public class Person {
    //    Make it a Linked List Node
    private String name;
    private int age;
    private Person next;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }
//    Write set Get methods

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }
//    Write toString method

    @Override
    public String toString() {
        return "Person{ " +
                "name='" + name + '\'' +
                ", age=" + age + " }";
    }
}
