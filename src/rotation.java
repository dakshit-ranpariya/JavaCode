public class rotation {
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 3 % n;

        for (int i=1; i<=d; i++){
            int temp = arr[0];
            for (int j=0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
