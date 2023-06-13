package Calculator;

import java.util.Scanner;

import Stack.InfixToPostfix;
import Stack.InfixToPrefix;

public class CalculatorAccess {
    public static void main(String[] args) {
        System.out.println("Enter an expression (values 0-9): ");
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();
        String postfix = InfixToPostfix.convert(expression);
        String prefix = InfixToPrefix.convert(expression);
        System.out.println(postfix);
        System.out.println(prefix);
        Calculator.calculate(postfix);
    }
}
