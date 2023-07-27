package Stack;

import java.util.Stack;

public class balanced_parentheses {
    public static void main(String[] args) {
        String str = "}]";
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    System.out.println("not balanced");
                    return;
                }
                char c1 = stack.peek();
                if(c == ']' && c1 != '[' || c == ')' && c1 != '(' || c == '}' && c1 != '{'){
                    System.out.println("not balanced");
                    return;
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            System.out.println("not balanced");
            return;
        }
        System.out.println("balanced");
    }
}
