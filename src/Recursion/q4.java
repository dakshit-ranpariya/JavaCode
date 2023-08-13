package Recursion;
//Que.: Count the digits of a given number using recursion
public class q4 {
    static int c = 0;
    public static void main(String[] args) {
        count(1);
        System.out.println(c);
    }

    public static void count(int n){
        if(n==0) return;
        c++;
        count(n / 10);
    }
}
