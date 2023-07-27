public class Arr1 {
    public static void main(String[] args){
        int arr[] = {10, 50, 60, 30, 70};
        int n = arr.length;

        int diff = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(Math.abs((arr[i] - arr[j])) < diff){
                    diff=Math.abs((arr[i] - arr[j]));
                }
            }
        }
        System.out.println(diff);
    }
}
