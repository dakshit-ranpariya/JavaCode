package Recursion;
// Que.: get the largest element of an array using recursion
public class q8 {
    static int max = 0;
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 10};
        findMax(arr, arr.length-1);
        System.out.println(max);
    }
    public static void findMax(int[] arr, int n){

        if(n==-1) return;

        findMax(arr, n-1);
        max = Math.max(max, arr[n]);

    }
}
