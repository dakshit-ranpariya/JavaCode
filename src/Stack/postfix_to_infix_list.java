package Stack;

import java.util.Stack;

public class postfix_to_infix_list {
    public static void main(String[] args) {
        String str = "AB*CD/E-+";
        Stack<String> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(isOperator(str.charAt(i))){
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = "(" + op2 + str.charAt(i) + op1 + ")";
                stack.push(temp);
            }
            else {
                stack.push(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
    static boolean isOperator(char c){
        switch (c){
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
                return true;
        }
        return false;
    }
}
