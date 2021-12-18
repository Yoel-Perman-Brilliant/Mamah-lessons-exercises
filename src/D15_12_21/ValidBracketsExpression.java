package D15_12_21;

import Universal.*;

import java.util.Scanner;

public class ValidBracketsExpression {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean validExpression() {
        Stack<Character> stack = new Stack<>();
        Character ch = scanner.next().charAt(0);
        while (ch != '*') {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (ch == ']' && stack.pop() != '[') {
                    return false;
                }
                if (ch == '}' && stack.pop() != '{') {
                    return false;
                }
                if (ch == ')' && stack.pop() != '(') {
                    return false;
                }
            }
            ch = scanner.next().charAt(0);
        }
        if (!stack.isEmpty() && (stack.top() == '(' || stack.top() == '[' || stack.top() == '{')) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validExpression());
    }
}
