//Check if two arrays are equal or not

package Hashing;

import java.util.HashMap;
import java.util.Map;

public class q5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {5, 2, 1, 3, 6, 6};

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();

        if(arr.length != arr2.length){
            System.out.println("Not Same");
            return;
        }

        for(int i=0; i< arr.length; i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }else{
                hashMap.put(arr[i], 1);
            }

            if(hashMap2.containsKey(arr2[i])){
                hashMap2.put(arr2[i], hashMap2.get(arr2[i]) + 1);
            }else{
                hashMap2.put(arr2[i], 1);
            }
        }

        for(Map.Entry me : hashMap.entrySet()){
            if(me.getValue() != hashMap2.get(me.getKey())){
                System.out.println("Not Same");
                return;
            }
        }
        System.out.println("Same");
    }
}
