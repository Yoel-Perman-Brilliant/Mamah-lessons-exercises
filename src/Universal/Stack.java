package Universal;

public class Stack<T> {

    public static class StackUnderflowException extends Exception{
        public StackUnderflowException(){
            super("StackUnderflowException");
        }
    }

    private Node<T> head;

    public Stack() {
        this.head = null;
    }

    public T top(){
        return this.head.getValue();
    }

    public void push(T x) {
        Node<T> temp = new Node<T>(x);
        temp.setNext(head);
        head = temp;
    }

    public T pop() {
        if (!isEmpty()) {
            T x = head.getValue();
            head = head.getNext();
            return x;
        }
        System.out.println("Util.Stack Underflow");
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        if (this.isEmpty()) return "[]";
        Stack<T> temp = new Stack<T>();
        while (!this.isEmpty()) {
            temp.push(this.pop());
        }
        String s = "[";
        while (!temp.isEmpty()) {
            T x = temp.pop();
            s = s + x + ',';
            this.push(x);

        }
        s = s.substring(0, s.length() - 1) + "]";
        return s;

    }

}
