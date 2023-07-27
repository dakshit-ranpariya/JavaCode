package Stack;

import java.util.Stack;

public class Min_element {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();
    public static void main(String[] args) {
        push(8);
        push(3);
        push(5);
        push(4);
        pop();



        System.out.println(getMin());
    }
    static void push(int a){
        stack.push(a);
        int value = a;
        if(minStack.isEmpty() || value < minStack.peek()){
            minStack.push(value);
        }
    }
    static void pop(){
        int value = stack.peek();
        stack.pop();
        if(value == minStack.peek()){
            minStack.pop();
        }
    }
    static int getMin(){
        return minStack.peek();
    }
}
