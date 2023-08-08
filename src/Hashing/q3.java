package Hashing;

import java.util.HashMap;
import java.util.Map;

public class q3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 3};
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: arr){
            if(hashMap.containsKey(i)){
                int oldV = hashMap.get(i);
                hashMap.put(i, oldV+1);
            }else{
                hashMap.put(i, 1);
            }
        }
//        System.out.println(hashMap);
        for(Map.Entry e : hashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
