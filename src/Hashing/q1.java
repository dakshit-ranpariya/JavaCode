package Hashing;
// Find whether an array is a subset of another array


import java.util.HashSet;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 5};

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            hashSet.add(arr[i]);
        }
        for(int j=0; j<arr2.length; j++){
            if(!hashSet.contains(arr2[j])){
                System.out.println("Not Subset");
                return;
            }
        }
        System.out.println("Subset");
    }
}
