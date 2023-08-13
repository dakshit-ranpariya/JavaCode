package Recursion;
//Que.: calculate the product of two numbers using recursion
public class q6 {
    public static void main(String[] args) {
        System.out.println(prod(4, 5));
    }
    public static int prod(int x, int y){
        if(y==0) return 0;

        x += prod(x, y-1);
        return x;
    }
}
