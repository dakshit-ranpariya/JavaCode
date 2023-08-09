package Recursion;
// Que.: Calculate the factorial of a number
public class q1 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static int fact(int n){
        if(n==1) return 1;

        n = n * fact(n-1);

        return n;
    }
}
