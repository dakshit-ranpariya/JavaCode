package Recursion;
// Que. find the sum of digits of a number using recursion
public class q7 {
    static int ans = 0;
    public static void main(String[] args) {
        sum(103);
        System.out.println(ans);
    }
    public static void sum(int n){
        if(n==0) return;

        int rem = n%10;
        n = n/10;
        ans = ans + rem;
        sum(n);
    }
}
