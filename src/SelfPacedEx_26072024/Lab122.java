package SelfPacedEx_26072024;

import java.util.HashSet;
import java.util.Set;

public class Lab122 {
    Set uniqueelemts(int a[]){
        Set s = new HashSet();
        for (int i1=0; i1<a.length;i1++){
            s.add(a[i1]);
        }
        return s;

    }
    public static void main(String[] args) {
        //Given an array of integers, return an array of unique elements
        int i[]={1,2,4,1,3,90,3,4,5,2,3,1};
        Set s = new HashSet();

        Lab122 l = new Lab122();
        s=l.uniqueelemts(i);

        System.out.println(s);
    }
}
