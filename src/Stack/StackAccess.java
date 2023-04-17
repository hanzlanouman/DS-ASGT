package Stack;

public class StackAccess {
    public static void main(String[] args) {
        Stack stack1 = new Stack(10);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.display();
        stack1.pop();
        stack1.display();
    }
}
