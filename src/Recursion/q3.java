package Recursion;
// Que.: Print the array elements using without loop
public class q3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 10, 5};
        int n = arr.length;
        print(arr, n-1);


    }
    public static void print(int[] arr, int n){
        if(n == -1) return;

        print(arr, n-1);
        System.out.print(arr[n]+" ");
    }

}
