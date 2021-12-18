package Exs13_12_21;

import Universal.*;

public class Ex9 {
    private static Stack<Integer> generateReverse(Stack<Integer> stack) {
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();
        Integer x;
        while (!stack.isEmpty()) {
            x = stack.pop();
            temp1.push(x);
            temp2.push(x);
        }
        while (!temp2.isEmpty()) {
            stack.push(temp2.pop());
        }
        return temp1;

    }

    public static boolean palindrome(Stack<Integer> stack) {
        Stack<Integer> temp1 = generateReverse(stack);
        while (!stack.isEmpty()) {
            if (stack.pop() != temp1.pop())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(9);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(palindrome(stack));
    }
}
