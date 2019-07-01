package niuke;

import java.util.Stack;

public class Five {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        Stack<Integer> temp = new Stack<>();
        while(!stack1.empty()){
            while(!stack2.empty()){
                temp.push(stack2.pop());
            }
            stack2.push(stack1.pop());
        }
        stack1.push(node);
        while(!temp.empty()){
            stack2.push(temp.pop());
        }
    }

    public int pop() {
        if(stack2.empty()){
            return stack1.pop();
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Five five = new Five();
        five.push(1);
        five.push(2);
        five.push(3);
        five.push(4);
        five.push(5);
        five.push(6);

        System.out.println(five.pop());
        System.out.println(five.pop());
        System.out.println(five.pop());
        System.out.println(five.pop());
        System.out.println(five.pop());
        System.out.println(five.pop());
    }
}
