package PracticePrograms_27072024;

import java.util.HashMap;
import java.util.Map;

public class Lab138_TwoSum {
    public static void main(String[] args) {
        int a[] = {2,3,1,4,5,6,7,1};
        int target = 8;
        Map<Integer,Integer> m1 = new HashMap();
        for(int i =0; i<a.length;i++){
            int complementory = target-a[i];
            for(int j =0;j<a.length;j++){
                if(a[j]==complementory&&j!=i){
                    if(!m1.containsValue(a[i])){
                    m1.put(a[i],a[j]);
                    }
                }
            }
        }
        for(Map.Entry<Integer, Integer>e: m1.entrySet()){
            System.out.println(e.getKey()+","+e.getValue());
        }
    }
}
