package Recursion;
//Que.: reverse an integer number using recursion
public class q5 {
    static int r = 0;
    public static void main(String[] args) {
        rev(12345);
        System.out.println(r);
    }
    public static void rev(int n){
        if(n==0) return;
        int rem = n%10;
        n = n/10;
        r = r*10+rem;
        rev(n);
    }
}
