package PracticePrograms_27072024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab139_RemovingDuplicatesFromArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,1,4,3,5,6,7,8};
        Set s = new LinkedHashSet();
        for(int i =0; i<a.length;i++){
            s.add(a[i]);
        }
        Iterator i = s.iterator();
        int i1=0;
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
