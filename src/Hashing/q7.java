//Print all unique numbers in array

package Hashing;

import java.util.HashMap;
import java.util.Map;

public class q7 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 2, 3, 4, 1, 7};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i:arr){
            if(hashMap.containsKey(i)){
                hashMap.put(i, hashMap.get(i)+1);
            }else{
                hashMap.put(i, 1);
            }
        }

        for(Map.Entry me : hashMap.entrySet()){
            if((int)me.getValue() < 2){
                System.out.print(me.getKey() + " ");
            }
//        }
    }
}
