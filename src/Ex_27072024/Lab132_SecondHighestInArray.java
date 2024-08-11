package Ex_27072024;

import java.util.*;

public class Lab132_SecondHighestInArray {
    public static void main(String[] args) {
        int a[] = {20, 10, 40, 30, 20};
        Set<Integer>s = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        int i =0;
        int a1[] = new int[5];
        for(int i1:s){
            a1[i]=i1;
            i++;
        }
        System.out.println(a1[1]);
    }
}
