package Exs13_12_21;
import Universal.*;

public class Ex5 {
    public static Stack<Integer> lengths(Stack<String> stack){
        Stack<String> temp = new Stack<String>();
        Stack<Integer> output = new Stack<Integer>();
        String x;
        //reverse stack
        while(!stack.isEmpty()){
            x = stack.pop();
            temp.push(x);
        }
        while (!temp.isEmpty()){
            x= temp.pop();
            System.out.println(x);
            stack.push(x);
            output.push(x.length());
        }
        return output;

    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("0");
        stack.push("000");
        stack.push("00");
        System.out.println(stack);
        System.out.println(lengths(stack));
    }
}
