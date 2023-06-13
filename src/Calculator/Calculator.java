package Calculator;

import Stack.InfixToPostfix;

public class Calculator {

    public static void calculate(String expression) {
        Stack stack = new Stack(20);
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (!InfixToPostfix.isOperator(token)) {
                stack.push(Double.valueOf(token));
            } else {
                double num2 = stack.pop();
                double num1 = stack.pop();
                switch (token) {
                    case "+" -> stack.push(num1 + num2);
                    case "-" -> stack.push(num1 - num2);
                    case "*" -> stack.push(num1 * num2);
                    case "/" -> stack.push(num1 / num2);
                    case "^" -> stack.push(Math.pow(num1, num2));
                }
            }
        }
        System.out.println(stack.pop());
    }
}
