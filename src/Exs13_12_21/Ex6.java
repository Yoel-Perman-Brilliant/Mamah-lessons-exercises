package Exs13_12_21;
import Universal.*;

public class Ex6 {
    public static Integer kthValue(Stack<Integer> stack, Integer k){
        boolean indexExists;
        int i;
        Integer x = null;

        for (i=0; i<k && !stack.isEmpty(); i++){
            x = stack.pop();
        }
        if (!stack.isEmpty() || i>=k) return x;
        else return -1;
    }
    public static void main(String[] args){
        Stack<Integer> stack =  new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(kthValue(stack, 5));
    }
}
