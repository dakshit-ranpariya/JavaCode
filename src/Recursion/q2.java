package Recursion;
// Que.: Sum of 1 to n numbers
public class q2 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n){
        if(n == 1) return 1;

        n = n + sum(n-1);
        return n;
    }
}
