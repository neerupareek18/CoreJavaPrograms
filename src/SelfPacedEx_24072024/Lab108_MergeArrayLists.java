package SelfPacedEx_24072024;

import java.util.ArrayList;
import java.util.List;

public class Lab108_MergeArrayLists {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        List l2 = new ArrayList();
        l1.add(100);
        l2.add("String");
        List mergelist = new ArrayList(l1);
        mergelist.addAll(l2);
        System.out.println(mergelist);

        //or if we want to change the original list itself:
        l1.addAll(l2);
        System.out.println(l1);

        //when no data type constarint is given, it takes 'Object', that is why we can addAll l2 objection elements

    }
}
