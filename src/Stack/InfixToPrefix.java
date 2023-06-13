package Stack;


public class InfixToPrefix {

    public static Stack stack = new Stack(20);

    public static String convert(String input) {
        String[] tokens = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (InfixToPostfix.isOperator(token)) {
                while (!stack.isEmpty() && !isPriorityHigh(token)) {
                    output.insert(0, stack.pop() + " ");
                }
                stack.push(token);
            } else {
                output.insert(0, token + " ");
            }
        }

        while (!stack.isEmpty()) {
            output.insert(0, stack.pop() + " ");
        }
        return output.toString().trim();
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
}
