package Recursion;
// Que.: check if a number is a prime number or not using recursion
public class q9 {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;

        if(n%2==0) return false;
        isPrime((int)Math.sqrt(n));
        return true;
    }
}
