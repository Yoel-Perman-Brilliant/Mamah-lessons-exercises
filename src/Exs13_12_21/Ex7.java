package Exs13_12_21;

import Universal.*;

public class Ex7 {
    public static Stack<Integer> add(Stack<Integer> stack, int num) {
        if (num < stack.top()) {
            stack.push(num);
            return stack;
        } else {
            Stack<Integer> temp = new Stack<Integer>();
            Integer current = stack.pop();
            while (!stack.isEmpty() && current < num) {
                temp.push(current);
                current = stack.pop();
            }
            stack.push(current);
            stack.push(num);
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(6);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(add(stack, 5));
    }
}
