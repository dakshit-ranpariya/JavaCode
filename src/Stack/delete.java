package Stack;

import java.util.Stack;

public class delete {
    public static void main(String[] args) {
        int n = 12345;
        int count = -1, res = 0;
        Stack<Integer> stack = new Stack<>();

        while(n!=0){
            int d = n%10;
            n = n/10;
            count++;
            stack.push(d);
        }
        int mid = stack.size()/2;
        while(!stack.isEmpty()){
            if(count!=mid){
                int digit = stack.peek();
                res = res * 10 + digit;
            }
            stack.pop();
            count--;
        }
        System.out.println(res);
    }
}
