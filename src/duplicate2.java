public class duplicate2 {
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 3, 5};
        int n=5;
        int sum = (n * (n+1)) / 2;
        int sum2=0;
        int value=0;

        for (int i=0; i<arr.length; i++){
            sum2 = sum2+arr[i];
            value = sum2 - sum;
        }
        System.out.println(value);




//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] == arr[j]){
//                    System.out.println("Duplicate: " + arr[j]);
//                }
//            }
//        }
    }
}
