public class pointer {
    public static void main(String[] args){
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 40;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum2 = arr[left] + arr[right];
            if(sum2 == sum){
                System.out.println(arr[left] + " + " + arr[right] + " = " + sum);
                return;
            }else if(sum2 < sum){
                left++;
            }else {
                right--;
            }
        }
        System.out.println("false");

    }
}
