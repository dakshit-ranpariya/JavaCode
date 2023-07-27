import java.util.Arrays;

public class sorting {
    public static void main(String[] args){

       int[] arr = {5, 1, 6, 3, 8};
       int n=arr.length;

//       for(int i=0; i<n-1; i++){
//           for(int j=0; j<n-i-1; j++){
//               if(arr[j] > arr[j+1]){
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//               }
//           }
//       }





//        for (int i=0; i<n; i++){
//            int min=i;
//
//            for (int j=i+1; j<n; j++){
//                if(arr[min] > arr[j]){
//                    min = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//        }



        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

       for (int i=0; i<n; i++){
           System.out.print(arr[i] + " ");
       }





    }
}
