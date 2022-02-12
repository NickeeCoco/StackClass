import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        stack.push(7);
        stack.push(9);
        System.out.println(stack);
        System.out.println(stack.top());
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        stack.push(6);
        stack.push(8);
        System.out.println(stack.pop());
    }
}
