package Stack;

import Stack.Stack;

public class InfixToPostfix {

    public static Stack stack = new Stack(20);

    public static String convert(String input) {
        String[] tokens = input.split(" ");
        String output = "";

        for (String token : tokens) {
            if (isOperator(token)) {
                while (!stack.isEmpty() && !isPriorityHigh(token)) {
                    output += stack.pop() + " ";
                }
                stack.push(token);
            } else {
                output += token + " ";
            }
        }

        while (!stack.isEmpty()) {
            output += stack.pop() + " ";
        }
        return output.trim();
    }

    public static boolean isPriorityHigh(String operator) {
        if (stack.isEmpty()) return true;
        String top = stack.peek();
        return getPriority(operator) > getPriority(top);
    }

    public static int getPriority(String operator) {
        return switch (operator) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            case "^" -> 3;
            default -> -1;
        };
    }

    public static boolean isOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^");
    }
}
