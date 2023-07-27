public class searching {
    public static void main(String[] args){
        //SORTED ARRAY BUT ROTATED VALUES
        int[] arr={40, 50, 60, 10, 20, 30};
        int value = 20;
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid = (left+right) / 2;

            if(arr[mid] == value){
                System.out.println(mid + " is Present");
                return;
            }

            if(arr[left] <= arr[mid]){
                if(arr[left] <= value && value <= arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(arr[mid] <= value && value <= arr[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        System.out.println("Not Present");



        //SORTED ARRAY
//        int[] arr = {10, 15, 25, 36, 54, 60, 70, 85};
//        int value = 10;
//        int left = 0, right = arr.length-1;
//
//        while(left<=right){
//            int mid = (left+right) / 2;
//            if(arr[mid] == value){
//                System.out.println("Present");
//                return;
//            } else if (arr[mid] < value) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        System.out.println("Not Present");
    }
}
