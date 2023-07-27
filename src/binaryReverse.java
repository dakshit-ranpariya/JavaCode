public class binaryReverse {
    public static void main(String[] args){
        int[] arr = {0, 1, 1, 0, 1, 0};

        int left = 0, right = arr.length-1;
        int temp;

        while(left<right){
            if(arr[left] == 0){
                left++;
            }else if(arr[right] == 1){
                right--;
            }else{
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
