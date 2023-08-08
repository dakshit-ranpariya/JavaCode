package Hashing;

import java.util.HashMap;

public class q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 12;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i : arr){
            if(hashMap.containsKey(i)){
                int oldV = hashMap.get(i);
                hashMap.put(i, oldV+1);
            }else{
                hashMap.put(i, 1);
            }
        }

        for(int i : arr){
            if(i*2 == sum){
                if(hashMap.get(i) >= 2){
                    System.out.println("Present");
                    return;
                }
            }else{
                int rem = sum - i;
                if(hashMap.containsKey(rem)){
                    System.out.println("Present");
                    return;
                }
            }
        }
        System.out.println("Not Present");
    }
}
