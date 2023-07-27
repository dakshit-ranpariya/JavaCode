

public class unique {
    public static void main(String[] args){
        int[] arr = {10, 10, 20, 20, 30, 40};
        int value = 10;
        boolean flag = true;

        for (int i=0; i<arr.length; i++){
            if(arr[i] == value){
                if(flag==true){
                    flag=false;
                }else{
                    System.out.println("Not unique");
                    return;
                }
            }

        }
        System.out.println("Unique");






        //PRINT UNIQUE NUMBERS
//        for(int i=0; i<arr.length; i++){
//            boolean flag = true;
//            for(int j=0; j<arr.length; j++){
//                if((i != j) && arr[i] == arr[j]){
//                    flag = false;
//                }
//            }
//            if (flag == true){
//                System.out.print(arr[i] + " ");
//            }
//        }



    }
}
