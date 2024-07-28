package PracticePrograms_27072024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lab137_FrequencyOfWordsInString {
    public static void main(String[] args) {
        String s = "Hello World Hello you too World";
          String s1[] = s.split(" ");
        System.out.println(Arrays.toString(s1));
        Map<String, Integer> m = new HashMap();
        for(int i =0 ; i<s1.length;i++){
            m.put(s1[i],1);
        }
        for(Map.Entry<String, Integer> e : m.entrySet()){
            int count =0;
            for(int i = 0; i<s1.length;i++){
                if(e.getKey().equals(s1[i])){
                    count++;
                    m.put(s1[i],count);
                }
            }
        }
        for(Map.Entry<String, Integer> e : m.entrySet()){
            System.out.println(e.getKey()+"--"+e.getValue());
        }



    }
}
