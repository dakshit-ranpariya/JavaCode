package Recursion;

public class Striver1 {
    public static void print(int N){
        if(N < 1) {
            return;
        }
        if(N > 1) {
            print(N-1);
        }
        System.out.print(N + " ");
    }
    public static void main(String[] args){
        print(10);
    }
}
