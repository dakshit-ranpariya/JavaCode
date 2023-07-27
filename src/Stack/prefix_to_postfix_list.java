package Stack;

import java.util.Stack;

public class prefix_to_postfix_list {
    public static void main(String[] args) {
        String str = "*-A/BC-/AKL";
        Stack<String> stack = new Stack<>();

        for(int i=str.length()-1; i>=0; i--){
            if(isOperator(str.charAt(i))){
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = op1+ op2 + str.charAt(i);
                stack.push(temp);
            }
            else {
                stack.push(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
    static boolean isOperator(char c) {
        switch (c) {
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
