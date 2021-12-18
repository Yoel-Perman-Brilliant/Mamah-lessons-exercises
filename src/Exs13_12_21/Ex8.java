package Exs13_12_21;
import Universal.*;

public class Ex8 {
    public static String remove(String input){
        Stack<Character> stack1 = new Stack<>();
        for(int i=0; i<input.length(); i++){
            stack1.push(input.charAt(i));
        }
        int counter=1;
        Stack<Character> stack2 = new Stack<>();
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        Stack<Character> stack3 = new Stack<>();
        Character ch;
        while (!stack2.isEmpty()){
            ch = stack2.pop();
            if(counter%5!=0)
                stack3.push(ch);
        counter++;
        }
        Stack<Character> stack4 = new Stack<>();
        while (!stack3.isEmpty()){
            stack4.push(stack3.pop());
        }
        String output ="";
        while (!stack4.isEmpty()){
            output+=stack4.pop();
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(remove("12345678901234567"));
    }

}
