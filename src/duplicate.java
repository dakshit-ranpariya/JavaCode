public class duplicate {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 20, 40, 50, 40, 40};
        boolean flag = false;
        int value = 20;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == value) {
                if (flag == false) {
                    flag = true;
                } else {
                    System.out.println("Duplicate");
                    return;
                }
            }
        }
        System.out.println("Not Duplicate");


        // PRINT ALL DUPLICATES
//        int n=arr.length;
//        for(int i=0; i<n-1; i++){
//
//            for(int j=i+1; j<n; j++) {
//                if(arr[i]==arr[j]) {
//                    System.out.print(arr[i] + " ");
//                    for (int k = j + 1; k < n; k++) {
//                        if (arr[j] == arr[k]) {
//                            arr[k] = -1;
//                        }
//                    }
//                    if (arr[i] == -1) {
//                        continue;
//                    }
//                }
//            }
//
//        }



//        int value = 10;
//        int value1 = 40;
//
//        boolean flag = false;
//        boolean flag1 = false;
//        boolean isDuplicate = false;
//
//        for (int i=0; i<arr.length; i++){
//            if(arr[i] == value){
//                if(flag==false){
//                    flag=true;
//                }else{
//                    isDuplicate = true;
//                }
//            }
//        }
//        if(isDuplicate == true){
//            System.out.println(value + " is Duplicate");
//        }else {
//            System.out.println("Not Duplicate");
//        }
//



//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == value1){
//                if (flag1==false){
//                    flag1 = true;
//                }else{
//                    System.out.println(value1 + " is Duplicate");
//                    return;
//                }
//            }
//        }
//        System.out.println(value1 + " Not duplicate");


//
//        int count = 0;
//
//        for (int i=0; i<arr.length; i++){
//
//            if(arr[i]==value){
//                count++;
//            }
//        }
//        if(count>1){
//            System.out.println("Duplicate");
//        }else{
//            System.out.println("Not Duplicate");
//        }


    }
}
