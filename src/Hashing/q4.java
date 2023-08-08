//Most frequent element in an array

package Hashing;

import java.util.HashMap;
import java.util.Map;

public class q4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 5, 2, 6, 2};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else {
                map.put(i, 1);
            }
        }
        int max = Integer.MIN_VALUE, ans = -1;

        for(Map.Entry me : map.entrySet()){

            if((int)me.getValue() > max){
                max = (int)me.getValue();
                ans = (int)me.getKey();
            }
        }
        System.out.println(ans);
    }
}
