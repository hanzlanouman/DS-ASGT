package Stack;

public class InfixToPostfix {

    public static Stack stack = new Stack(10);

    public static void main(String[] args) {
        String input = "A^B*C-D+E/F";
        String output = infixToPostfix(input);
        System.out.println(output);

    }

    public static String infixToPostfix(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            String character = input.substring(i, i + 1);
            if (isOperator(character)) {
                if (stack.isEmpty()) {
                    stack.push(character);
                } else {
                    if (isPriorityLow(character)) {
                        stack.push(character);
                    } else {
                        while (!stack.isEmpty()) {
                            output += stack.pop();
                        }
                        stack.push(character);
                    }
                }
            } else {
                output += character;
            }
        }
        while (!stack.isEmpty()) {
            output += stack.pop();
        }
        return output;
    }

    public static boolean isPriorityLow(String operator) {
        String top = stack.peek();
        if (operator.equals("^")) {
            return !top.equals("^");
        } else if (operator.equals("*") || operator.equals("/")) {
            return top.equals("+") || top.equals("-");
        } else if (operator.equals("+") || operator.equals("-")) {
            return false;
        }
        return true;
    }


    public static boolean isOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("^");
    }

    public static boolean isOperand(String operand) {
        return !isOperator(operand);
    }
}
